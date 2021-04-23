/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.AdminRole;
import Business.Role.HomelessProviderAdmin;
import Business.Role.HospitalAdminRole;
import Business.Role.NgoAdminRole;
import Business.Role.PharamcyAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        enterpriseJComboBox.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            enterpriseJComboBox.addItem(enterprise);
        }
        
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
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setMinimumSize(new java.awt.Dimension(800, 800));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseJTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        enterpriseJTable.setForeground(new java.awt.Color(102, 102, 102));
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enterpriseJTable.setRowHeight(30);
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 145, 580, 150));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 100, -1));

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        networkJComboBox.setPreferredSize(new java.awt.Dimension(150, 30));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 250, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Username");
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 30));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 180, -1));

        usernameJTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        usernameJTextField.setPreferredSize(new java.awt.Dimension(100, 30));
        add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 180, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Enterprise");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 110, -1));

        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        enterpriseJComboBox.setPreferredSize(new java.awt.Dimension(150, 30));
        add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 250, 30));

        submitJButton.setBackground(new java.awt.Color(51, 204, 255));
        submitJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(0, 102, 153));
        submitJButton.setText("Submit");
        submitJButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 1, true));
        submitJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        submitJButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        submitJButton.setOpaque(false);
        submitJButton.setPreferredSize(new java.awt.Dimension(100, 40));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 580, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Password");
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 30));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 180, -1));

        nameJTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        nameJTextField.setPreferredSize(new java.awt.Dimension(100, 30));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 180, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Name");
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 30));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 180, -1));

        passwordJPasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        passwordJPasswordField.setPreferredSize(new java.awt.Dimension(100, 30));
        add(passwordJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 180, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel6.setFont(jLabel6.getFont().deriveFont(jLabel6.getFont().getStyle() | java.awt.Font.BOLD, jLabel6.getFont().getSize()+13));
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MANAGE ENTERPRISE ADMIN");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1000, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/SystemAdminWorkArea/AdminBG2.jpg"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(1000, 800));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
        
        
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        
        String username = usernameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();
        if(username.isEmpty() || password.isEmpty() || name.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter all fields", "Warning", JOptionPane.WARNING_MESSAGE);
        } else{
            Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        
            if (system.checkIfUserIsUnique(username)) {
                UserAccount account;
                if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Hospital) {
                    account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new HospitalAdminRole());
                } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.HomelessDataProviders) {
                    account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new HomelessProviderAdmin());
                }
                else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.MedicineProviders) {
                    account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new PharamcyAdminRole());
                }
                
                
                
                usernameJTextField.setText("");
                passwordJPasswordField.setText("");
                nameJTextField.setText("");
                JOptionPane.showMessageDialog(null, "Account created sucessfully");
                populateTable();
            }else {
                JOptionPane.showMessageDialog(null, "Please enter unique username", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
