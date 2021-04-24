/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.HospitalWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.util.logging.*;

/**
 *
 * @author maneesh
 */
public class HospitalAdminJPanel extends javax.swing.JPanel {
    private final static Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    /**
     * Creates new form HospitalAdminJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Enterprise enterprise;
    EcoSystem business;
    
    public HospitalAdminJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        logr.info("LoggingIn");
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        adddoctor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        generateBills = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        assigntodoctor = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 453));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome Hospital Admin ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 40, 1000, 33));

        adddoctor.setBackground(new java.awt.Color(0, 102, 153));
        adddoctor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adddoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adddoctorMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADD DOCTOR");
        adddoctor.add(jLabel2);

        add(adddoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 180, 240));

        generateBills.setBackground(new java.awt.Color(0, 102, 153));
        generateBills.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        generateBills.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generateBillsMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GENERATE BILLS");
        generateBills.add(jLabel3);

        add(generateBills, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 180, 240));

        assigntodoctor.setBackground(new java.awt.Color(0, 102, 153));
        assigntodoctor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        assigntodoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assigntodoctorMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ASSIGN TO DOCTOR");
        assigntodoctor.add(jLabel5);

        add(assigntodoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 180, 240));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/HospitalWorkArea/wel_hosp_admin.jpg"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GenerateBillPanel genPanle = new GenerateBillPanel(userProcessContainer, organization);
        userProcessContainer.add("addOrganization",genPanle);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
        logr.info("GenerateBill Button Clicked");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void assigntodoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assigntodoctorMouseClicked
        // TODO add your handling code here:
        AssignDoctorPanel aDoc = new AssignDoctorPanel(userProcessContainer, organization);
        userProcessContainer.add("addOrganization",aDoc);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
        logr.info("Assign Doctor Button Clicked");
    }//GEN-LAST:event_assigntodoctorMouseClicked

    private void generateBillsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateBillsMouseClicked
        // TODO add your handling code here:
                GenerateBillPanel genPanle = new GenerateBillPanel(userProcessContainer, organization);
        userProcessContainer.add("addOrganization",genPanle);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
        logr.info("GenerateBill Button Clicked");
    }//GEN-LAST:event_generateBillsMouseClicked

    private void adddoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adddoctorMouseClicked
        // TODO add your handling code here:
                AddDoctorPanel addDoctor = new AddDoctorPanel(userProcessContainer,organization);
        userProcessContainer.add("addOrganization",addDoctor);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);   
        logr.info("Add Doctor Button Clicked");
    }//GEN-LAST:event_adddoctorMouseClicked

                                         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adddoctor;
    private javax.swing.JPanel assigntodoctor;
    private javax.swing.JPanel generateBills;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
