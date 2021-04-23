/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Funds;

import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author maneesh
 */
public class FundsDirectory {
    ArrayList<FundsRaisingRequest> funds;
    
    public FundsDirectory(){
        funds = new ArrayList<>();
    }
    
    public FundsRaisingRequest createNewFundReq(double amount, String email, String ssn, String phone, String name){
        FundsRaisingRequest req = new FundsRaisingRequest();
        //req.setAmmount(amount);
        req.setEmail(email);
        req.setName(name);
        req.setSsn(ssn);
        req.setPhone(phone);
        funds.add(req);
        sendEmailToTheUser(email);
        return req;
    }

    public ArrayList<FundsRaisingRequest> getFunds() {
        return funds;
    }

    public void setFunds(ArrayList<FundsRaisingRequest> funds) {
        this.funds = funds;
    }
    
    public static void sendEmailToTheUser(String emailId) {
        // Recipient's email ID needs to be mentioned.
        String to = emailId;
        String from = "donotreplyhealthifyHomeless@gmail.com";
        String pass = "healthifyHomeless";
        // Assuming you are sending email from localhost
        // String host = "192.168.0.16";

        // Get system properties
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";

        properties.put("mail.smtp.starttls.enable", "true");

        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.user", from);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(properties);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("Funds Application Status");
            message.setText("Thank you for statring the Funds Application process with us. Your account will be activated within 24 hours.");
             message.setText("After account activation, your applicayion will be approved!!!");
            // Send message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Sent message successfully");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid email id");
        }
    }
}
