/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.MedicineProviderWorkArea;
import java.util.logging.*;

/**
 *
 * @author maneesh
 */
public class MedicineProviderAdminPanle extends javax.swing.JPanel {
    private final static Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    /**
     * Creates new form MedicineProviderAdminPanle
     */
    public MedicineProviderAdminPanle() {
        logr.info("LoggingIn");
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
        vieworder = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("Welcome Pharmacy Admin ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 500, -1));

        vieworder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        vieworder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vieworderMouseClicked(evt);
            }
        });

        jLabel2.setText("VIEW ORDER");
        vieworder.add(jLabel2);

        add(vieworder, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 270, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void vieworderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vieworderMouseClicked
        // TODO add your handling code here:
        logr.info("View Order Button Clicked");
    }//GEN-LAST:event_vieworderMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel vieworder;
    // End of variables declaration//GEN-END:variables
}
