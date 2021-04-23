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
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Assign to hospital Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1000, 30));

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
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 660, 170));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("**Select a row before assigning to hospital");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 310, 40));

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 153));
        jButton1.setText("Assign to Hospital");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 310, 40));

        jButton2.setText("<<Back");
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
        jTable2.setRowHeight(30);
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 660, 188));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Assign to Hospital");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Assigned Patients");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 130, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/NGOAdminWorkArea/assign_to_hospital.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 800));
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
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    }
    
    
}
