/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.NGOAdminWorkArea;

import Buisness.Patient.PatientDirectory;
import Buisness.Patient.Patinet;
import Business.Organization.NgoOrganization;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import static ui.NGOAdminWorkArea.AddpatinetJFrame.org;
import ui.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import ui.SystemAdminWorkArea.UpdateNetworkJFrame;
import java.util.logging.*;
import javax.swing.JOptionPane;

/**
 *
 * @author maneesh
 */
public class ManagePatientsJPanel extends javax.swing.JPanel {
    private final static Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    /**
     * Creates new form ManagePatientsJPanel
     */
    Organization org;
    JPanel container;
    public ManagePatientsJPanel(Organization org, JPanel container) {
        this.org = org;
        initComponents();
        logr.info("LoggingIn");
        this.container = container;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 200, 620, 150));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Patients");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1000, 60));

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setFont(jButton1.getFont().deriveFont(jButton1.getFont().getStyle() | java.awt.Font.BOLD, jButton1.getFont().getSize()+1));
        jButton1.setForeground(new java.awt.Color(0, 102, 153));
        jButton1.setText("Add Patient");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 270, 40));

        jButton3.setBackground(new java.awt.Color(51, 204, 255));
        jButton3.setFont(jButton3.getFont().deriveFont(jButton3.getFont().getStyle() | java.awt.Font.BOLD, jButton3.getFont().getSize()+1));
        jButton3.setForeground(new java.awt.Color(0, 102, 153));
        jButton3.setText("Delete");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 1, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 270, 40));

        jButton4.setBackground(new java.awt.Color(51, 204, 255));
        jButton4.setFont(jButton4.getFont().deriveFont(jButton4.getFont().getStyle() | java.awt.Font.BOLD, jButton4.getFont().getSize()+1));
        jButton4.setForeground(new java.awt.Color(0, 102, 153));
        jButton4.setText("Refresh");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 1, true));
        jButton4.setPreferredSize(new java.awt.Dimension(400, 40));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 270, -1));

        jButton5.setText("<<Back");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/NGOAdminWorkArea/patient_line.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1000, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        populateTable();
        logr.info("Refresh Button Clicked");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         container.remove(this);
         
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        logr.info("Back Button Clicked");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         AddpatinetJFrame addForm = new AddpatinetJFrame(org);
         addForm.setLocationRelativeTo(null);
         addForm.setVisible(true);
         logr.info("Add Button Clicked");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(this,
                "Please select one row and then press Delete");
        }
        else{
            Patinet p= (Patinet) jTable1.getValueAt(selectedRow, 0);
            org.getPatientDirectory().deletePatient(p);
            JOptionPane.showMessageDialog(this,
                "Patinet deleted");
            populateTable();
        }
        logr.info("Delete Button Clicked");
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
          // TODO add your handling code here:
        PatientDirectory pd = org.getPatientDirectory();
        pd.getPatientList();
        
        jTable1.getTableHeader().setDefaultRenderer(new TableColors());
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setRowCount(0);
        
        for (Patinet patient : pd.getPatientList()){
        {
//             if(organization instanceof NgoOrganization){
                Object[] row = new Object[4];
                row[0] = patient;
                row[1] = patient.getAge();
                row[2] = patient.getSymptoms();
                row[3] = patient.getDisease();
                model.addRow(row);
//             }
        }
            
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
