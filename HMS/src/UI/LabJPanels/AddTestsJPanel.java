/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.LabJPanels;

import Business.Business;
import Lab.LabTests;
import UserAccount.UserAccount;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rohit
 */
public class AddTestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddTestsJPanel
     */
     public Business business;
    public UserAccount userAccount;
    DefaultTableModel testsTableModel;
    public AddTestsJPanel() {
        initComponents();
    }
    public AddTestsJPanel(Business business, UserAccount userAccount) {
        initComponents();
        this.business = business;
        this.userAccount = userAccount;
        this.testsTableModel = (DefaultTableModel) TestsTable.getModel();
        
        displayTests();
    }
    public void displayTests()
    {
        ArrayList<LabTests> tests = this.business.getLabTestsList().getLabTests();
        
        if(tests.size() >= 0) {
            testsTableModel.setRowCount(0);
            for(LabTests t: tests) {
                Object row[] = new Object[2];
                row[0] = t.getProcedureName();
                row[1] = t.getPrice();
                
                
                testsTableModel.addRow(row);
            }
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
        TestsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        testNameField = new javax.swing.JTextField();
        testPriceField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addTestBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Test Name", "Test Price"
            }
        ));
        jScrollPane1.setViewportView(TestsTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 310, 140));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setText("Test Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        add(testNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 70, -1));
        add(testPriceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 70, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setText("Test price");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 60, -1));

        addTestBtn.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        addTestBtn.setText("Add test");
        addTestBtn.setActionCommand("Add Tests");
        addTestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTestBtnActionPerformed(evt);
            }
        });
        add(addTestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hospital Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(360, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 70));

        backBtn.setText("back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setText("Tests");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void addTestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTestBtnActionPerformed
        // TODO add your handling code here:
         try {
            String procedureName = testNameField.getText();
            float price = Float.parseFloat(testPriceField.getText());

              if(procedureName.equals("")||price == 0.0 )
     {
         JOptionPane.showMessageDialog(this, "Please check data and try again!");
     }
              else{
            LabTests t =this.business.getLabTestsList().createLabTests(procedureName, price);
            
            displayTests();
            JOptionPane.showMessageDialog(this, "Test Added");
              }
        } catch (HeadlessException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please check data");
        }

       
        testNameField.setText("");
        testPriceField.setText("");
        
    }//GEN-LAST:event_addTestBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TestsTable;
    private javax.swing.JButton addTestBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField testNameField;
    private javax.swing.JTextField testPriceField;
    // End of variables declaration//GEN-END:variables
}
