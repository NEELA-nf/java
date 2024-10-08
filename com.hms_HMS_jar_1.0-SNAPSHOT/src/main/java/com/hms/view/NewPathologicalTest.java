package com.hms.view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package com.hms.view;

import com.hms.model.PathologicalTest;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class NewPathologicalTest extends javax.swing.JFrame {

    private String reagent;

    /**
     * Creates new form NewPathologicalTest
     */
    public NewPathologicalTest() {
        initComponents();
         pComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "Blood Test",
            "Urine Test",
            "X-Ray",
            "MRI Scan"
        }));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTestTitle = new javax.swing.JLabel();
        pCost = new javax.swing.JLabel();
        Available = new javax.swing.JLabel();
        pbtnSubmit = new javax.swing.JButton();
        pBtnCancel = new javax.swing.JButton();
        pTestFIELD1 = new javax.swing.JTextField();
        pCostField = new javax.swing.JTextField();
        pCheckBox1 = new javax.swing.JCheckBox();
        pOutputLabel = new javax.swing.JLabel();
        pLabel1 = new javax.swing.JLabel();
        pComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pTestTitle.setText("Test Title");

        pCost.setText("Cost");

        Available.setText("Available");

        pbtnSubmit.setText("Submit");
        pbtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbtnSubmitActionPerformed(evt);
            }
        });

        pBtnCancel.setText("Cancel");
        pBtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pBtnCancelActionPerformed(evt);
            }
        });

        pTestFIELD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pTestFIELD1ActionPerformed(evt);
            }
        });

        pCheckBox1.setText("no by DEFAULT");

        pOutputLabel.setText("Output");

        pLabel1.setText("Test Type");

        pComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(pbtnSubmit)
                        .addGap(50, 50, 50)
                        .addComponent(pBtnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pTestTitle)
                            .addComponent(pCost)
                            .addComponent(Available)
                            .addComponent(pLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pCheckBox1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pTestFIELD1)
                                .addComponent(pCostField, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)))))
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 69, Short.MAX_VALUE)
                .addComponent(pOutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pTestTitle)
                    .addComponent(pTestFIELD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pCost)
                    .addComponent(pCostField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pLabel1)
                    .addComponent(pComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Available)
                    .addComponent(pCheckBox1))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pbtnSubmit)
                    .addComponent(pBtnCancel))
                .addGap(18, 18, 18)
                .addComponent(pOutputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pTestFIELD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pTestFIELD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pTestFIELD1ActionPerformed
 private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void pBtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pBtnCancelActionPerformed
        // TODO add your handling code here:
          this.dispose();
    }//GEN-LAST:event_pBtnCancelActionPerformed

    private void pbtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbtnSubmitActionPerformed
        // TODO add your handling code here:
try {
    
 String testTitle = pTestFIELD1.getText();
//      pOutputLabel.setText(title);
double cost = Double.parseDouble(pCostField.getText()); // Parse cost from pCostField
            boolean isAvailable = pCheckBox1.isSelected();
          

   
  PathologicalTest pTest = new PathologicalTest(testTitle,cost,isAvailable,reagent);
            pOutputLabel.setText(pTest.show());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid cost.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    





//           pTestFIELD1.getText(),
//   Double.parseDouble(pCost.getText()),
//   pCheckBox1.isSelected());
//   pOutputLabel.setText(pTest.show());
//}
        // TODO add your handling code here:


    }//GEN-LAST:event_pbtnSubmitActionPerformed
 
 
  
  
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(NewPathologicalTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPathologicalTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPathologicalTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPathologicalTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPathologicalTest().setVisible(true);
            }
        }) ;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Available;
    private javax.swing.JButton pBtnCancel;
    private javax.swing.JCheckBox pCheckBox1;
    private javax.swing.JComboBox<String> pComboBox1;
    private javax.swing.JLabel pCost;
    private javax.swing.JTextField pCostField;
    private javax.swing.JLabel pLabel1;
    private javax.swing.JLabel pOutputLabel;
    private javax.swing.JTextField pTestFIELD1;
    private javax.swing.JLabel pTestTitle;
    private javax.swing.JButton pbtnSubmit;
    // End of variables declaration//GEN-END:variables
}
