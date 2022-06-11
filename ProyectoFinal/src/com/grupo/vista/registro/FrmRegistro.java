/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grupo.vista.registro;

import com.grupo.modelos.Usuario;
import com.grupo.sql.login.SqlLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author jhair
 */
public class FrmRegistro extends javax.swing.JFrame {

    SqlLogin sql = new SqlLogin();

    public FrmRegistro() {
        initComponents();
        jtbtnRegistro.setSelected(true);
    }

    private boolean camposVacios() {
        return !(jtxtNombre.getText().trim().isBlank());
    }

    private void registroSelected() {
        jpnlInicioSesion.setVisible(false);
        jpnlRegistro.setVisible(true);
        jpnlInicioSesion.updateUI();
    }

    private void inicioSelected() {
        jpnlRegistro.setVisible(false);
        jpnlInicioSesion.setVisible(true);
        jpnlRegistro.updateUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panelRound1 = new com.grupo.componentes.PanelRound();
        jpnlRegistro = new javax.swing.JPanel();
        jtxtNombre = new com.grupo.componentes.TextField();
        jtxtApellidos = new com.grupo.componentes.TextField();
        jtxtEmail = new com.grupo.componentes.TextField();
        jtxtPassword = new com.grupo.componentes.PasswordField();
        jtxtConfirmPassword = new com.grupo.componentes.PasswordField();
        jLabel7 = new javax.swing.JLabel();
        radioButton4 = new com.grupo.componentes.RadioButton();
        radioButton5 = new com.grupo.componentes.RadioButton();
        radioButton6 = new com.grupo.componentes.RadioButton();
        button2 = new com.grupo.componentes.Button();
        jpnlInicioSesion = new javax.swing.JPanel();
        textField9 = new com.grupo.componentes.TextField();
        passwordField5 = new com.grupo.componentes.PasswordField();
        button3 = new com.grupo.componentes.Button();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jtbtnInicioSesion = new javax.swing.JToggleButton();
        jtbtnRegistro = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(249, 249, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnlRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jpnlRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtNombre.setToolTipText("");
        jtxtNombre.setFont(new java.awt.Font("Josefin Sans", 0, 14)); // NOI18N
        jtxtNombre.setLabelText("Nombres");
        jpnlRegistro.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, -1));

        jtxtApellidos.setFont(new java.awt.Font("Josefin Sans", 0, 14)); // NOI18N
        jtxtApellidos.setLabelText("Apellidos");
        jpnlRegistro.add(jtxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 130, -1));

        jtxtEmail.setFont(new java.awt.Font("Josefin Sans", 0, 14)); // NOI18N
        jtxtEmail.setLabelText("Correo electrónico");
        jpnlRegistro.add(jtxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 300, -1));

        jtxtPassword.setFont(new java.awt.Font("Josefin Sans", 0, 14)); // NOI18N
        jtxtPassword.setLabelText("Contraseña");
        jtxtPassword.setShowAndHide(true);
        jpnlRegistro.add(jtxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 300, -1));

        jtxtConfirmPassword.setFont(new java.awt.Font("Josefin Sans", 0, 14)); // NOI18N
        jtxtConfirmPassword.setLabelText("Confirmar contraseña");
        jtxtConfirmPassword.setShowAndHide(true);
        jpnlRegistro.add(jtxtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 300, -1));

        jLabel7.setFont(new java.awt.Font("Josefin Sans", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(224, 164, 0));
        jLabel7.setText("Te sugerimos que la contraseña sea más fuerte");
        jpnlRegistro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        radioButton4.setBackground(new java.awt.Color(54, 210, 163));
        radioButton4.setForeground(new java.awt.Color(52, 58, 75));
        radioButton4.setText("Contiene al menos un número");
        radioButton4.setEnabled(false);
        radioButton4.setFocusable(false);
        radioButton4.setFont(new java.awt.Font("Josefin Sans Light", 0, 14)); // NOI18N
        jpnlRegistro.add(radioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 210, -1));

        radioButton5.setBackground(new java.awt.Color(54, 210, 163));
        radioButton5.setForeground(new java.awt.Color(52, 58, 75));
        radioButton5.setText("Contiene al menos una letra mayúscula");
        radioButton5.setEnabled(false);
        radioButton5.setFocusable(false);
        radioButton5.setFont(new java.awt.Font("Josefin Sans Light", 0, 14)); // NOI18N
        jpnlRegistro.add(radioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 260, -1));

        radioButton6.setBackground(new java.awt.Color(54, 210, 163));
        radioButton6.setForeground(new java.awt.Color(52, 58, 75));
        radioButton6.setText("La contraseña debe tener mínimo 8 caractéres");
        radioButton6.setEnabled(false);
        radioButton6.setFocusable(false);
        radioButton6.setFont(new java.awt.Font("Josefin Sans Light", 0, 14)); // NOI18N
        jpnlRegistro.add(radioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 300, -1));

        button2.setBackground(new java.awt.Color(54, 210, 163));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("Empezar");
        button2.setBorderColor(new java.awt.Color(54, 210, 163));
        button2.setBorderPainted(false);
        button2.setColor(new java.awt.Color(54, 210, 163));
        button2.setColorClick(new java.awt.Color(54, 210, 163));
        button2.setColorOver(new java.awt.Color(119, 227, 194));
        button2.setFont(new java.awt.Font("Josefin Sans Light", 0, 20)); // NOI18N
        button2.setRadius(10);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jpnlRegistro.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 300, 50));

        panelRound1.add(jpnlRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 380, 490));

        jpnlInicioSesion.setBackground(new java.awt.Color(255, 255, 255));
        jpnlInicioSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textField9.setFont(new java.awt.Font("Josefin Sans", 0, 14)); // NOI18N
        textField9.setLabelText("Correo electrónico");
        jpnlInicioSesion.add(textField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 300, -1));

        passwordField5.setFont(new java.awt.Font("Josefin Sans", 0, 14)); // NOI18N
        passwordField5.setLabelText("Contraseña");
        passwordField5.setShowAndHide(true);
        jpnlInicioSesion.add(passwordField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 300, -1));

        button3.setBackground(new java.awt.Color(54, 210, 163));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("Empezar");
        button3.setBorderColor(new java.awt.Color(54, 210, 163));
        button3.setBorderPainted(false);
        button3.setColor(new java.awt.Color(54, 210, 163));
        button3.setColorClick(new java.awt.Color(54, 210, 163));
        button3.setColorOver(new java.awt.Color(119, 227, 194));
        button3.setFont(new java.awt.Font("Josefin Sans Light", 0, 20)); // NOI18N
        button3.setRadius(10);
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jpnlInicioSesion.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 300, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/grupo/imagenes/login/bienvenidoInicioSesion.png"))); // NOI18N
        jpnlInicioSesion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jButton1.setFont(new java.awt.Font("Josefin Sans Light", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(54, 210, 163));
        jButton1.setText("¿Olvidaste tu contraseña?");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jpnlInicioSesion.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        panelRound1.add(jpnlInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 380, 490));

        buttonGroup1.add(jtbtnInicioSesion);
        jtbtnInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/grupo/imagenes/login/jtgButonInicioInactive.png"))); // NOI18N
        jtbtnInicioSesion.setBorderPainted(false);
        jtbtnInicioSesion.setContentAreaFilled(false);
        jtbtnInicioSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtbtnInicioSesion.setFocusPainted(false);
        jtbtnInicioSesion.setRequestFocusEnabled(false);
        jtbtnInicioSesion.setRolloverEnabled(false);
        jtbtnInicioSesion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/grupo/imagenes/login/jtgButonInicioActive.png"))); // NOI18N
        jtbtnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbtnInicioSesionActionPerformed(evt);
            }
        });
        panelRound1.add(jtbtnInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 180, 40));

        buttonGroup1.add(jtbtnRegistro);
        jtbtnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/grupo/imagenes/login/jtgButonRegistroInactive.png"))); // NOI18N
        jtbtnRegistro.setBorderPainted(false);
        jtbtnRegistro.setContentAreaFilled(false);
        jtbtnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtbtnRegistro.setFocusPainted(false);
        jtbtnRegistro.setRequestFocusEnabled(false);
        jtbtnRegistro.setRolloverEnabled(false);
        jtbtnRegistro.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/grupo/imagenes/login/jtgButonRegistroActive.png"))); // NOI18N
        jtbtnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbtnRegistroActionPerformed(evt);
            }
        });
        panelRound1.add(jtbtnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 182, 40));

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 160, 400, 600));

        jLabel2.setFont(new java.awt.Font("Josefin Sans", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(53, 60, 77));
        jLabel2.setText("<html>Mantén una correcta<p>organización y toma apuntes<p>de forma sencilla.</html>");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 160, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/grupo/imagenes/login/imagenPrincipalLogin.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 393, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/grupo/imagenes/login/ondaLogin.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/grupo/imagenes/login/bordeAbajoLogin.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 760, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/grupo/imagenes/login/bordeArribaLogin.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 920));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtbtnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbtnInicioSesionActionPerformed
        jtbtnRegistro.setSelected(false);
        inicioSelected();

    }//GEN-LAST:event_jtbtnInicioSesionActionPerformed

    private void jtbtnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbtnRegistroActionPerformed
        jtbtnInicioSesion.setSelected(false);
        registroSelected();
    }//GEN-LAST:event_jtbtnRegistroActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Botón registro");
//        sql.agregarUsuario(new Usuario(nombre, apellidos, email, password));
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Botón inicio de sesión");
    }//GEN-LAST:event_button3ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLaf Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmRegistro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.grupo.componentes.Button button2;
    private com.grupo.componentes.Button button3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpnlInicioSesion;
    private javax.swing.JPanel jpnlRegistro;
    private javax.swing.JToggleButton jtbtnInicioSesion;
    private javax.swing.JToggleButton jtbtnRegistro;
    private com.grupo.componentes.TextField jtxtApellidos;
    private com.grupo.componentes.PasswordField jtxtConfirmPassword;
    private com.grupo.componentes.TextField jtxtEmail;
    private com.grupo.componentes.TextField jtxtNombre;
    private com.grupo.componentes.PasswordField jtxtPassword;
    private com.grupo.componentes.PanelRound panelRound1;
    private com.grupo.componentes.PasswordField passwordField5;
    private com.grupo.componentes.RadioButton radioButton4;
    private com.grupo.componentes.RadioButton radioButton5;
    private com.grupo.componentes.RadioButton radioButton6;
    private com.grupo.componentes.TextField textField9;
    // End of variables declaration//GEN-END:variables
}
