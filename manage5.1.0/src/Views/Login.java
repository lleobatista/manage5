/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import App.Aplicativo;
import br.com.DomainMode.PostGresJPA.LoginSenha;
import br.com.FunçõesTeste.TestesFuncionais;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author leandrocnb
 */
public class Login extends javax.swing.JFrame {
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        user_image.requestFocus();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaLogin = new javax.swing.JPanel();
        jTextField_User = new javax.swing.JTextField();
        user_image = new javax.swing.JLabel();
        jButton_Logar = new javax.swing.JButton();
        jPasswordField_Password = new javax.swing.JPasswordField();
        base_password = new javax.swing.JLabel();
        base_user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(193, 171, 254));
        setResizable(false);

        TelaLogin.setBackground(new java.awt.Color(193, 171, 254));
        TelaLogin.setPreferredSize(new java.awt.Dimension(550, 470));
        TelaLogin.setLayout(null);

        jTextField_User.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_User.setText("USER");
        jTextField_User.setBorder(null);
        jTextField_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_UserMouseClicked(evt);
            }
        });
        TelaLogin.add(jTextField_User);
        jTextField_User.setBounds(50, 225, 460, 30);

        user_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user_image200x200trans.png"))); // NOI18N
        TelaLogin.add(user_image);
        user_image.setBounds(175, 12, 200, 200);

        jButton_Logar.setText("Logar");
        jButton_Logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LogarActionPerformed(evt);
            }
        });
        TelaLogin.add(jButton_Logar);
        jButton_Logar.setBounds(230, 330, 90, 30);

        jPasswordField_Password.setText("PASSWORD");
        jPasswordField_Password.setBorder(null);
        jPasswordField_Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField_PasswordMouseClicked(evt);
            }
        });
        TelaLogin.add(jPasswordField_Password);
        jPasswordField_Password.setBounds(50, 280, 460, 30);

        base_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/base_text500x51.png"))); // NOI18N
        TelaLogin.add(base_password);
        base_password.setBounds(30, 270, 500, 51);

        base_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/base_text500x51.png"))); // NOI18N
        base_user.setPreferredSize(new java.awt.Dimension(500, 64));
        TelaLogin.add(base_user);
        base_user.setBounds(30, 200, 500, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_UserMouseClicked
        jTextField_User.setText("");
    }//GEN-LAST:event_jTextField_UserMouseClicked

    private void jPasswordField_PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordMouseClicked
        jPasswordField_Password.setText("");
    }//GEN-LAST:event_jPasswordField_PasswordMouseClicked

    private void jButton_LogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LogarActionPerformed
        LoginSenha login = new LoginSenha();
        login.setNome(jTextField_User.getText());
        char[] teste = jPasswordField_Password.getPassword();
        String b = String.copyValueOf(teste);
        login.setSenha(b);
        TestesFuncionais tf = new TestesFuncionais();
        try {
            if(tf.validaLogin(login)){
                Aplicativo app = new Aplicativo();
                if(app.validaLoginBD(login)){
                    JFrame desk = new Desktop();
                    desk.setVisible(true);
                    this.dispose();
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton_LogarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TelaLogin;
    private javax.swing.JLabel base_password;
    private javax.swing.JLabel base_user;
    private javax.swing.JButton jButton_Logar;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JTextField jTextField_User;
    private javax.swing.JLabel user_image;
    // End of variables declaration//GEN-END:variables
}
