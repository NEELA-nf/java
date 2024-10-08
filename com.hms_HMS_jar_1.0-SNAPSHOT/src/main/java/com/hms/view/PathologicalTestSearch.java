/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hms.view;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class PathologicalTestSearch extends javax.swing.JFrame {

    /**
     * Creates new form PathologicalTestSearch
     */
    public PathologicalTestSearch() {
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

        pLabel1SearchPathology = new javax.swing.JLabel();
        txtPathology = new javax.swing.JTextField();
        pButton1Search = new javax.swing.JButton();
        pButton1Cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pLabel1SearchPathology.setText("Search Pathological ");

        pButton1Search.setText("search");
        pButton1Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pButton1SearchActionPerformed(evt);
            }
        });

        pButton1Cancel.setText("Cancel");
        pButton1Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pButton1CancelActionPerformed(evt);
            }
        });

        pTextArea1.setColumns(20);
        pTextArea1.setRows(5);
        jScrollPane1.setViewportView(pTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(pLabel1SearchPathology)
                        .addGap(26, 26, 26)
                        .addComponent(txtPathology, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(pButton1Search))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(pButton1Cancel)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pLabel1SearchPathology)
                    .addComponent(txtPathology, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pButton1Search)
                    .addComponent(pButton1Cancel))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pButton1CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pButton1CancelActionPerformed
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_pButton1CancelActionPerformed

    private void pButton1SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pButton1SearchActionPerformed
        // TODO add your handling code here:

 String searchTerm = txtPathology.getText().trim();

// Sample list of pathological tests (in a real application, you would query a database)
        String[] pathologicalTests = {"Blood Test", "Urine Test", "X-Ray", "CT Scan", "MRI", "Biopsy"};

// StringBuilder to hold the search results
        StringBuilder results = new StringBuilder();

// Perform the search
        for (String test : pathologicalTests) {
            if (test.toLowerCase().contains(searchTerm)) {
                results.append(test).append("\n");
            }
        }

// Display the results in a dialog box
        if (results.length() > 0) {
            JOptionPane.showMessageDialog(this, "Test is found : " +results.toString(), "Search Results", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No tests found for: " + searchTerm, "Search Results", JOptionPane.INFORMATION_MESSAGE);
        }

                      
    }//GEN-LAST:event_pButton1SearchActionPerformed
                                       
       
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
            java.util.logging.Logger.getLogger(PathologicalTestSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PathologicalTestSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PathologicalTestSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PathologicalTestSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PathologicalTestSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pButton1Cancel;
    private javax.swing.JButton pButton1Search;
    private javax.swing.JLabel pLabel1SearchPathology;
    private javax.swing.JTextArea pTextArea1;
    private javax.swing.JTextField txtPathology;
    // End of variables declaration//GEN-END:variables
}
