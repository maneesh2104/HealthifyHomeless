/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.NGOAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.NgoOrganization;
import Business.Organization.Organization;
import Business.Role.HealthCampAdmin;
import Business.Role.NgoAdminRole;
import Business.Role.OverNightShelterAdmin;
import Business.Role.Role;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.logging.*;

/**
 *
 * @author maneesh
 */
public class AddOrganizationJpanel extends javax.swing.JPanel {
    private final static Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    /**
     * Creates new form AddOrganizationJpanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Network network;
    Enterprise enterprise;
    Organization org;
    public AddOrganizationJpanel(JPanel userProcessContainer,EcoSystem ecosystem, Enterprise enterprise) {
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.enterprise = enterprise;
        initComponents();
        logr.info("LoggingIn");
        fillComboBox();
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        typeCombo = new javax.swing.JComboBox();
        txtPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Organization Management");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Name", "Address"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 419, 220));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 40, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 171, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("Address");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 50, -1));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 171, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("User name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 171, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("Password");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 0));
        jButton1.setText("Create");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText("Type");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 40, -1));

        typeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboActionPerformed(evt);
            }
        });
        add(typeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 171, -1));

        txtPassword.setText("jPasswordField1");
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 160, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/NGOAdminWorkArea/woring lady.jpg"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 590, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 if(txtName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Name cannot be empty");
            return;
        }
       if(txtAddress.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Address cannot be empty");
            return;
       }
       if(txtUserName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "UserName cannot be empty");
            return;
       }
       if(txtPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Password cannot be empty");
            return;
       }
             // TODO add your handling code here:
        //Add organiztion
        //Prefill type from organization
        Organization.Type type = (Organization.Type) typeCombo.getSelectedItem();
        
        if("".equals(txtName.getText())) {
            JOptionPane.showMessageDialog(null, "Enter organization name!"); 
        }else if("".equals(txtAddress.getText())) {
            JOptionPane.showMessageDialog(null, "Please set a location"); 
        }else {
            org = enterprise.getOrganizationDirectory().createOrganization(type, txtName.getText(), txtAddress.getText());
            //Create User account
             String userName = txtUserName.getText();
             String password = txtPassword.getText();
             if(!userName.isEmpty() && !password.isEmpty()){
                     if(ecosystem.checkIfUserIsUnique(userName)){
                            Role role = null;
                            if(type.equals(Organization.Type.HealthCamp)){
                                role = new HealthCampAdmin();
                            }
                            else if(type.equals(Organization.Type.Shelter)){
                                role = new OverNightShelterAdmin();
                            }
                            else if(type.equals(Organization.Type.NGO)){
                                role = new NgoAdminRole();
                            }
                            org.getUserAccountDirectory().createUserAccount(userName, password, null, new NgoAdminRole());    
                            JOptionPane.showMessageDialog(null, "User account Created!"); 
                            txtName.setText("");
                            txtPassword.setText("");
            } else{
                JOptionPane.showMessageDialog(null, "Username already exists!"); 
            }
            
        } else{
            JOptionPane.showMessageDialog(null, "Enter all fields!"); 
        }
            populateTable();
            resetFields();
            JOptionPane.showMessageDialog(null, "Organization is created successfully");
        }
        logr.info("Create Button Clicked");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void typeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JComboBox typeCombo;
    // End of variables declaration//GEN-END:variables

    private void fillComboBox() {
        typeCombo.addItem(Organization.Type.NGO);
        typeCombo.addItem(Organization.Type.HealthCamp);
        typeCombo.addItem(Organization.Type.Shelter);
        
    }

    private void populateTable() {
        jTable1.getTableHeader().setDefaultRenderer(new TableColors());
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
        {
             if(organization instanceof NgoOrganization){
                Object[] row = new Object[3];
                row[0] = organization.getOrganizationID();
                row[1] = organization.getName();
                row[2] = organization.getAddress();
                model.addRow(row);
             }
        }
            
        }
    }

    private void resetFields() {
        txtAddress.setText("");
        txtUserName.setText("");
    }
}
