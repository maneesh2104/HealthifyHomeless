/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.NGOAdminWorkArea;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JPanel;
import ui.SystemAdminWorkArea.ManageNetworkJPanel;

/**
 *
 * @author maneesh
 */
public class NgoLoginPage extends javax.swing.JPanel {

    /**
     * Creates new form NgoLoginPage
     */
    JPanel container;
    Organization org;
    Enterprise enterprise;
    Network network;
    public NgoLoginPage(JPanel container, Organization org, Enterprise enterprise, Network network) {
        this.container = container;
        this.org = org;
        this.enterprise = enterprise;
        this.network = network;
        initComponents();
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
        managepatients = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("NGO Logged in");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 330, 59));

        managepatients.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        managepatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managepatientsMouseClicked(evt);
            }
        });

        jLabel2.setText("MANAGE PATIENTS");

        javax.swing.GroupLayout managepatientsLayout = new javax.swing.GroupLayout(managepatients);
        managepatients.setLayout(managepatientsLayout);
        managepatientsLayout.setHorizontalGroup(
            managepatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managepatientsLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        managepatientsLayout.setVerticalGroup(
            managepatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managepatientsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        add(managepatients, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 220, 240));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/NGOAdminWorkArea/hospitalimage.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 730));
    }// </editor-fold>//GEN-END:initComponents

    private void managepatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managepatientsMouseClicked
 // TODO add your handling code here:
        ManagePatientsJPanel manageNetworkJPanel=new ManagePatientsJPanel(org, container);
        container.add("manageNetworkJPanel",manageNetworkJPanel);
        CardLayout layout=(CardLayout)container.getLayout();
        layout.next(container);
                
    }//GEN-LAST:event_managepatientsMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AssignToHospitalPanel assignHospital=new AssignToHospitalPanel(org, enterprise, container, network);
        container.add("manageNetworkJPanel",assignHospital);
        CardLayout layout=(CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel managepatients;
    // End of variables declaration//GEN-END:variables
}
