/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oopproject;

import javax.swing.JOptionPane;

/**
 *
 * @author zubi1
 */
public class OldStudentUpdateFrame extends javax.swing.JFrame {

    /**
     * Creates new form OldStudentUpdateFrame
     */
    public OldStudentUpdateFrame() {
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

        phonenumberjButton5 = new javax.swing.JButton();
        cnicjButton6 = new javax.swing.JButton();
        cnicjTextField2 = new javax.swing.JTextField();
        phonenumberjTextField3 = new javax.swing.JTextField();
        namejLabel = new javax.swing.JLabel();
        cnicjLabel = new javax.swing.JLabel();
        phonenojLabel = new javax.swing.JLabel();
        namejButton3 = new javax.swing.JButton();
        namejTextField = new javax.swing.JTextField();
        backjButton1 = new javax.swing.JButton();
        oldusernamejLabel3 = new javax.swing.JLabel();
        usernamejTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(520, 200));

        phonenumberjButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        phonenumberjButton5.setText("Submit");
        phonenumberjButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumberjButton5ActionPerformed(evt);
            }
        });

        cnicjButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cnicjButton6.setText("Submit");
        cnicjButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnicjButton6ActionPerformed(evt);
            }
        });

        namejLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namejLabel.setText("NAME       ");

        cnicjLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cnicjLabel.setText("CNIC ");

        phonenojLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        phonenojLabel.setText("PHONE NO");

        namejButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namejButton3.setText("Submit");
        namejButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namejButton3ActionPerformed(evt);
            }
        });

        backjButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backjButton1.setText("Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        oldusernamejLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        oldusernamejLabel3.setText("Username");

        usernamejTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamejTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("First Enter ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(oldusernamejLabel3))
                        .addGap(66, 66, 66)
                        .addComponent(usernamejTextField2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cnicjLabel)
                        .addGap(108, 108, 108)
                        .addComponent(cnicjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(namejLabel)
                        .addGap(81, 81, 81)
                        .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(phonenojLabel)
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backjButton1)
                            .addComponent(phonenumberjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phonenumberjButton5)
                    .addComponent(cnicjButton6)
                    .addComponent(namejButton3))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernamejTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldusernamejLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(namejLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(namejButton3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cnicjLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cnicjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(cnicjButton6)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(phonenojLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(phonenumberjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(phonenumberjButton5)))
                .addGap(37, 37, 37)
                .addComponent(backjButton1)
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void phonenumberjButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumberjButton5ActionPerformed
        AdminOperations admin = new AdminOperations();
        boolean checker = true;
        String userName = usernamejTextField2.getText();
        StudentOperations student = new StudentOperations();
        String phone = phonenumberjTextField3.getText();
        if (!student.phonenumberchecker(phone)) {
            checker = false;
            JOptionPane.showMessageDialog(null, "phone number must be of length of 11 and only integers");
            phonenumberjTextField3.setText("");
        }
        if (checker) {
            admin.changePhoneNo(userName, phone);
            phoneClear();
        }
    }//GEN-LAST:event_phonenumberjButton5ActionPerformed
    public void phoneClear(){
        usernamejTextField2.setText("");
        phonenumberjTextField3.setText("");
    }
    private void cnicjButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnicjButton6ActionPerformed
        AdminOperations admin = new AdminOperations();
        boolean checker = true;
        StudentOperations student = new StudentOperations();
        String userName = usernamejTextField2.getText();
        String cnic = cnicjTextField2.getText();
        if (!student.idchecker(cnic)) {
            checker = false;
            JOptionPane.showMessageDialog(null, "Cnic must be of length of 13 and only integers");
        }
        if (checker) {
            admin.changeCnic(userName, cnic);
            cnicClear();
        }
        
    }//GEN-LAST:event_cnicjButton6ActionPerformed
    public void cnicClear(){
        usernamejTextField2.setText("");
        cnicjTextField2.setText("");
    }
    private void namejButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namejButton3ActionPerformed
        AdminOperations admin = new AdminOperations();
        String userName = usernamejTextField2.getText();
        String name = namejTextField.getText();
        admin.changeName(userName, name);
        nameClear();
    }//GEN-LAST:event_namejButton3ActionPerformed
    public void nameClear(){
        usernamejTextField2.setText("");
        namejTextField.setText("");
    }
    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        OldStudentFrame o1 = new OldStudentFrame();
            dispose();
            o1.setVisible(true);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void usernamejTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamejTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamejTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(OldStudentUpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OldStudentUpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OldStudentUpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OldStudentUpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OldStudentUpdateFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton cnicjButton6;
    private javax.swing.JLabel cnicjLabel;
    private javax.swing.JTextField cnicjTextField2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton namejButton3;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JLabel oldusernamejLabel3;
    private javax.swing.JLabel phonenojLabel;
    private javax.swing.JButton phonenumberjButton5;
    private javax.swing.JTextField phonenumberjTextField3;
    private javax.swing.JTextField usernamejTextField2;
    // End of variables declaration//GEN-END:variables
}
