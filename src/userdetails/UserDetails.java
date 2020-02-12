/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userdetails;
import javax.swing.*;
import questionsdb.UsersDB;
import useroptions.*;

public class UserDetails extends javax.swing.JFrame {

    /**d
     * Creates new form UserDetails
     */
    public UserDetails() {
        super("Questions Generator- change user password");
        initComponents();
        ImageIcon i=new ImageIcon(getClass().getResource("/images/projecticon.png"));
        setIconImage(i.getImage());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new javax.swing.JLabel();
        newPassword = new javax.swing.JPasswordField();
        l2 = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JPasswordField();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        currentPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));
        setBounds(new java.awt.Rectangle(220, 40, 0, 0));
        setMinimumSize(new java.awt.Dimension(700, 560));
        setResizable(false);
        getContentPane().setLayout(null);

        l1.setBackground(new java.awt.Color(255, 255, 255));
        l1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("New Password");
        getContentPane().add(l1);
        l1.setBounds(80, 130, 108, 27);
        getContentPane().add(newPassword);
        newPassword.setBounds(240, 130, 230, 30);

        l2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("Confirm Password");
        getContentPane().add(l2);
        l2.setBounds(78, 173, 130, 30);
        getContentPane().add(confirmPassword);
        confirmPassword.setBounds(240, 170, 230, 30);

        save.setText("save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save);
        save.setBounds(250, 220, 100, 23);

        cancel.setText("cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(370, 220, 100, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Current Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 90, 120, 20);
        getContentPane().add(currentPassword);
        currentPassword.setBounds(240, 90, 230, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background4.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 720, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
         UsersDB p=new UsersDB();
        if(!p.checkPassword(currentPassword.getText()))
        {
            
            currentPassword.setText("");
            JOptionPane.showMessageDialog(this,"Current Password donot match" );
            return;
        }
        if(newPassword.getText().length()<5 || newPassword.getText().length()>20)
        {
            JOptionPane.showMessageDialog(this,"Password must contain atleast 5 and atmost 20 characters" );
            newPassword.setText("");
            confirmPassword.setText("");
            return;
        }
        
        if(newPassword.getText().equals(confirmPassword.getText()))
        {
            p=new UsersDB();
            p.setPassword(UserOptions.getCurrentUser(),newPassword.getText());
            dispose();
            UserOptions.main(new String[]{});
            
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Passwords donot match" );
        }
    }//GEN-LAST:event_saveActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        
        UserOptions.main(new String[]{});
        
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(UserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JPasswordField currentPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
