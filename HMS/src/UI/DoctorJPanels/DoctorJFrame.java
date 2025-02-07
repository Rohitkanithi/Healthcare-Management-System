/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.DoctorJPanels;

import Business.Business;
import UI.MainJFrame;
import UI.SystemAdminJPanels.StaffJPanel;
import UserAccount.UserAccount;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rohit
 */
public class DoctorJFrame extends javax.swing.JFrame {

    /**
     * Creates new form DoctorJFrame
     */
    Business business;
    UserAccount useraccount;
    public DoctorJFrame() {
        initComponents();
    }
     public DoctorJFrame(Business business, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.business = business;
       

        this.useraccount = useraccount;
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        docApptsBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        docVitalsBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        docLogoutBtn = new javax.swing.JButton();
        docPresciptionsBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSplitPane1.setBackground(new java.awt.Color(153, 153, 255));
        jSplitPane1.setDividerLocation(200);
        jSplitPane1.setDividerSize(10);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        docApptsBtn.setText("Appointments");
        docApptsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docApptsBtnActionPerformed(evt);
            }
        });

        jButton2.setText("Patients");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        docVitalsBtn.setText("Vitals");
        docVitalsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docVitalsBtnActionPerformed(evt);
            }
        });

        jButton4.setText("Lab Tests");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        docLogoutBtn.setText("Logout");
        docLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docLogoutBtnActionPerformed(evt);
            }
        });

        docPresciptionsBtn.setText("Prescriptions");
        docPresciptionsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docPresciptionsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(docApptsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(docVitalsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(docLogoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(docPresciptionsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(docApptsBtn)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(docVitalsBtn)
                .addGap(28, 28, 28)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(docPresciptionsBtn)
                .addGap(143, 143, 143)
                .addComponent(docLogoutBtn)
                .addContainerGap(261, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 636, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, -1, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void docApptsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docApptsBtnActionPerformed
        jSplitPane1.setRightComponent(new DoctorAppointmentsJPanel(this.business, this.useraccount));
    }//GEN-LAST:event_docApptsBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void docVitalsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docVitalsBtnActionPerformed
        jSplitPane1.setRightComponent(new DoctorVitalsJPanel(this.business, this.useraccount));
    }//GEN-LAST:event_docVitalsBtnActionPerformed

    private void docLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docLogoutBtnActionPerformed
        this.setVisible(false);
        new MainJFrame(business);
    }//GEN-LAST:event_docLogoutBtnActionPerformed

    private void docPresciptionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docPresciptionsBtnActionPerformed
        jSplitPane1.setRightComponent(new DoctorPrescriptionsJPanel(this.business, this.useraccount));
    }//GEN-LAST:event_docPresciptionsBtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         jSplitPane1.setRightComponent(new DoctorLabTestsJPanel(this.business, this.useraccount));
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DoctorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton docApptsBtn;
    private javax.swing.JButton docLogoutBtn;
    private javax.swing.JButton docPresciptionsBtn;
    private javax.swing.JButton docVitalsBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
