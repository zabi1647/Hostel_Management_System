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
public class UpdateStudentFrame extends javax.swing.JFrame {

    /**
     * Creates new form UpdateStudentFrame
     */
    public UpdateStudentFrame() {
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

        passwordjTextField = new javax.swing.JTextField();
        namejTextField = new javax.swing.JTextField();
        agejTextField1 = new javax.swing.JTextField();
        usernamejTextField1 = new javax.swing.JTextField();
        passwordjLabel = new javax.swing.JLabel();
        cnicjTextField2 = new javax.swing.JTextField();
        usernamejLabel = new javax.swing.JLabel();
        phonenumberjTextField3 = new javax.swing.JTextField();
        namejLabel = new javax.swing.JLabel();
        agejLabel = new javax.swing.JLabel();
        backjButton1 = new javax.swing.JButton();
        cnicjLabel = new javax.swing.JLabel();
        phonenojLabel = new javax.swing.JLabel();
        usernamejButton1 = new javax.swing.JButton();
        passwordjButton2 = new javax.swing.JButton();
        namejButton3 = new javax.swing.JButton();
        agejButton4 = new javax.swing.JButton();
        phonenumberjButton5 = new javax.swing.JButton();
        cnicjButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        oldusernamejLabel3 = new javax.swing.JLabel();
        oldusernamejTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(520, 200));

        usernamejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamejTextField1ActionPerformed(evt);
            }
        });

        passwordjLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passwordjLabel.setText("PASSWORD");

        usernamejLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        usernamejLabel.setText("New USERNAME");

        namejLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namejLabel.setText("NAME       ");

        agejLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agejLabel.setText("AGE       ");

        backjButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backjButton1.setText("back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        cnicjLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cnicjLabel.setText("CNIC ");

        phonenojLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        phonenojLabel.setText("PHONE NO");

        usernamejButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        usernamejButton1.setText("Submit");
        usernamejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamejButton1ActionPerformed(evt);
            }
        });

        passwordjButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passwordjButton2.setText("Submit");
        passwordjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordjButton2ActionPerformed(evt);
            }
        });

        namejButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namejButton3.setText("Submit");
        namejButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namejButton3ActionPerformed(evt);
            }
        });

        agejButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agejButton4.setText("Submit");
        agejButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agejButton4ActionPerformed(evt);
            }
        });

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("First Enter ");

        oldusernamejLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        oldusernamejLabel3.setText("Username");

        oldusernamejTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldusernamejTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(agejLabel)
                                .addGap(93, 93, 93)
                                .addComponent(agejTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(namejLabel)
                                .addGap(81, 81, 81)
                                .addComponent(namejTextField))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordjLabel)
                                    .addComponent(usernamejLabel))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordjTextField)
                                    .addComponent(usernamejTextField1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cnicjLabel)
                                    .addComponent(phonenojLabel))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phonenumberjTextField3)
                                    .addComponent(cnicjTextField2))))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernamejButton1)
                            .addComponent(passwordjButton2)
                            .addComponent(namejButton3)
                            .addComponent(agejButton4)
                            .addComponent(phonenumberjButton5)
                            .addComponent(cnicjButton6))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(oldusernamejLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(oldusernamejTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(179, 179, 179))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oldusernamejTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldusernamejLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernamejLabel)
                    .addComponent(usernamejButton1)
                    .addComponent(usernamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(passwordjLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordjButton2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(namejLabel))
                    .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namejButton3))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(agejLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(agejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(agejButton4)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cnicjLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cnicjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cnicjButton6)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(phonenojLabel))
                    .addComponent(phonenumberjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonenumberjButton5))
                .addGap(39, 39, 39)
                .addComponent(backjButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        
        AdminFrame a1 = new AdminFrame();
        dispose();
        a1.setVisible(true);
    }

    private void usernamejButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        AdminOperations admin = new AdminOperations();
        String oldUserName = oldusernamejTextField2.getText();
        String newUsername = usernamejTextField1.getText();
        admin.changeUsername(oldUserName, newUsername);
        clear();
    }
    public void clear(){
        oldusernamejTextField2.setText("");
        usernamejTextField1.setText("");
    }

    private void passwordjButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        AdminOperations admin = new AdminOperations();
        String userName = oldusernamejTextField2.getText();
        String password = passwordjTextField.getText();
        admin.changePassword(userName, password);
        passwordClear();
    }
    public void passwordClear(){
        oldusernamejTextField2.setText("");
        passwordjTextField.setText("");
    }
    private void namejButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        AdminOperations admin = new AdminOperations();
        String userName = oldusernamejTextField2.getText();
        String name = namejTextField.getText();
        admin.changeName(userName, name);
        nameClear();
    }
    public void nameClear(){
        oldusernamejTextField2.setText("");
        namejTextField.setText("");
    }

    private void agejButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agejButton4ActionPerformed
        AdminOperations admin = new AdminOperations();
        String userName = oldusernamejTextField2.getText();
        int age = (Integer.parseInt(agejTextField1.getText()));
        admin.changeAge(userName, age);
        ageClear();
    }//GEN-LAST:event_agejButton4ActionPerformed
    public void ageClear(){
        oldusernamejTextField2.setText("");
        agejTextField1.setText("");
    }

    private void cnicjButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnicjButton6ActionPerformed
        AdminOperations admin = new AdminOperations();
        boolean checker = true;
        StudentOperations student = new StudentOperations();
        String userName = oldusernamejTextField2.getText();
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
        oldusernamejTextField2.setText("");
        cnicjTextField2.setText("");
    }
    private void phonenumberjButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumberjButton5ActionPerformed
        AdminOperations admin = new AdminOperations();
        boolean checker = true;
        StudentOperations student = new StudentOperations();
        String userName = oldusernamejTextField2.getText();
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
        oldusernamejTextField2.setText("");
        phonenumberjTextField3.setText("");
    }
    private void usernamejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamejTextField1ActionPerformed
        
    }//GEN-LAST:event_usernamejTextField1ActionPerformed

    private void oldusernamejTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldusernamejTextField2ActionPerformed
        
    }//GEN-LAST:event_oldusernamejTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStudentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agejButton4;
    private javax.swing.JLabel agejLabel;
    private javax.swing.JTextField agejTextField1;
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton cnicjButton6;
    private javax.swing.JLabel cnicjLabel;
    private javax.swing.JTextField cnicjTextField2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton namejButton3;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JLabel oldusernamejLabel3;
    private javax.swing.JTextField oldusernamejTextField2;
    private javax.swing.JButton passwordjButton2;
    private javax.swing.JLabel passwordjLabel;
    private javax.swing.JTextField passwordjTextField;
    private javax.swing.JLabel phonenojLabel;
    private javax.swing.JButton phonenumberjButton5;
    private javax.swing.JTextField phonenumberjTextField3;
    private javax.swing.JButton usernamejButton1;
    private javax.swing.JLabel usernamejLabel;
    private javax.swing.JTextField usernamejTextField1;
    // End of variables declaration//GEN-END:variables
}
