/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.NGOAdminWorkArea;

import Buisness.Patient.PatientDirectory;
import Buisness.Patient.Patinet;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.logging.*;

/**
 *
 * @author maneesh
 */
public class AssignToHospitalPanel extends javax.swing.JPanel {
    private final static Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    /**
     * Creates new form AssignToHospitalPanel
     */
    Organization org;
    Enterprise enterprise;
    JPanel container;
    Network network;
    public AssignToHospitalPanel(Organization org, Enterprise enterprise, JPanel container, Network network) {
        initComponents();
        logr.info("LoggingIn");
        this.org = org;
        this.enterprise = enterprise;
        this.network = network;
        this.container = container;
        populateTable();
        populateTable1();
        fillComboBox();
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
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Assign to hospital ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 160, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Symptoms", "Disease"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 375, 188));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Select a row before assigning to hospital");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 134, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Assign to Hospital");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jButton2.setText("Back");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Symptoms", "Disease", "Hospital"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 375, 188));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Assigned Patients");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 130, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/NGOAdminWorkArea/hospital.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 620, 340));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        logr.info("Back Button Clicked");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table first","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
                Organization orga = (Organization) jComboBox1.getSelectedItem();
                Patinet p = (Patinet)jTable1.getValueAt(selectedRow, 0);
                p.isHosAssigned = true;
                p.hospitalAssigned = orga;
                orga.getPatientDirectory().addPatient(p); 
                populateTable1();
        }
        logr.info("Assign to Hospital Button Clicked");
        //jTable1.getSele

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        PatientDirectory pd = org.getPatientDirectory();
        pd.getPatientList();
        
        jTable1.getTableHeader().setDefaultRenderer(new TableColors());
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setRowCount(0);
        
        for (Patinet patient : pd.getPatientList()){
        {
            if(patient.isHosAssigned == false){
                Object[] row = new Object[4];
                row[0] = patient;
                row[1] = patient.getAge();
                row[2] = patient.getSymptoms();
                row[3] = patient.getDisease();
                model.addRow(row);
            }

        }
            
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     private void populateTable1() {
        PatientDirectory pd = org.getPatientDirectory();
        pd.getPatientList();
        
        jTable2.getTableHeader().setDefaultRenderer(new TableColors());
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        
        model.setRowCount(0);
        
        for (Patinet patient : pd.getPatientList()){
        {
            if(patient.isHosAssigned == true){
                Object[] row = new Object[5];
                row[0] = patient;
                row[1] = patient.getAge();
                row[2] = patient.getSymptoms();
                row[3] = patient.getDisease();
                row[4] = patient.hospitalAssigned;
                model.addRow(row);
            }

        }
            
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void fillComboBox() {
        ArrayList<Enterprise> enterpriseList = network.getEnterpriseDirectory().getEnterpriseList();
        jComboBox1.removeAllItems();
        for(Enterprise ent:enterpriseList){
            if(ent.getEnterpriseType() == Enterprise.EnterpriseType.Hospital){
                
                for(Organization org: ent.getOrganizationDirectory().getOrganizationList()){
                    if(org instanceof HospitalOrganization){
                        jComboBox1.addItem(org);
                    }
                }
            }
            
            System.out.println(ent.getEnterpriseType());
            System.out.println(Enterprise.EnterpriseType.Hospital);

        }
        ArrayList<Organization> orgList = enterprise.getOrganizationDirectory().getOrganizationList();
        for(Organization org: orgList){
            System.out.println(org.getName());
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
