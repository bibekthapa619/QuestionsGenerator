/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useroptions;



import userdetails.*;

import javax.swing.ImageIcon;

public class UserOptions extends javax.swing.JFrame {
    private static String currentUser;
    
    public UserOptions() {
        super("Questions Generator-"+currentUser);
         
        initComponents();
        ImageIcon i=new ImageIcon(getClass().getResource("/images/projecticon.png"));
        setIconImage(i.getImage());
        
    }
    public static void setCurrentUser(String u)
    {
        currentUser=u;
    }
    public static String getCurrentUser()
    {
        return currentUser;
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generateQuestion = new javax.swing.JLabel();
        updatePassword = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(220, 40, 0, 0));
        setMinimumSize(new java.awt.Dimension(750, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        generateQuestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generate.png"))); // NOI18N
        generateQuestion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generateQuestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generateQuestionMouseClicked(evt);
            }
        });
        getContentPane().add(generateQuestion);
        generateQuestion.setBounds(260, 50, 200, 200);

        updatePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/updatepassword.png"))); // NOI18N
        updatePassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatePasswordMouseClicked(evt);
            }
        });
        getContentPane().add(updatePassword);
        updatePassword.setBounds(50, 240, 210, 210);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(470, 230, 200, 210);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Generate Question");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 260, 140, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Update Password");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 470, 140, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Logout");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(560, 460, 60, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background2.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(500, 350));
        jLabel2.setMinimumSize(new java.awt.Dimension(500, 350));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 760, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateQuestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateQuestionMouseClicked
        // TODO add your handling code here:
        useroptions.GenerateQuestion.main(new String[]{});
        dispose();
    }//GEN-LAST:event_generateQuestionMouseClicked

    private void updatePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePasswordMouseClicked
        // TODO add your handling code here:
       UserDetails.main(new String[]{});
        dispose();
    }//GEN-LAST:event_updatePasswordMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        currentUser=null;
        questionsgenerator.QuestionsGenerator.main(new String[]{});
        dispose();
    }//GEN-LAST:event_logoutMouseClicked

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserOptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel generateQuestion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel updatePassword;
    // End of variables declaration//GEN-END:variables
}
