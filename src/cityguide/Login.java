
package cityguide;

import clases.SQLconexion;
import clases.GestionUsuario;
import clases.Usuario;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
        this.setLocationRelativeTo(this);
        jbtnOcultar.setVisible(false);
        JPanelRegistro.setVisible(true);
        jtxtUser2.setText("jortega");
        jtxtPassw2.setText("1234juan");
        jPanelEntrar.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelRegistro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtId = new javax.swing.JTextField();
        jtxtEdad = new javax.swing.JTextField();
        jtxtName = new javax.swing.JTextField();
        jbtnRegistrar = new javax.swing.JButton();
        jbtnMostrar = new javax.swing.JButton();
        jbtnOcultar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtUser = new javax.swing.JTextField();
        jtxtPassw = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jbtnInicioSesion = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTipoUser = new javax.swing.JComboBox<>();
        jtxtApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanelEntrar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtUser2 = new javax.swing.JTextField();
        jtxtPassw2 = new javax.swing.JPasswordField();
        jbtnEntrar = new javax.swing.JButton();
        jbtnMostrar2 = new javax.swing.JButton();
        jbtnOcultar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelRegistro.setBackground(new java.awt.Color(255, 255, 255));
        JPanelRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JPanelRegistro.setForeground(new java.awt.Color(255, 255, 255));
        JPanelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Apellido");
        JPanelRegistro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Cédula");
        JPanelRegistro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Edad");
        JPanelRegistro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jtxtId.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIdActionPerformed(evt);
            }
        });
        JPanelRegistro.add(jtxtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 270, -1));

        jtxtEdad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JPanelRegistro.add(jtxtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 270, -1));

        jtxtName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JPanelRegistro.add(jtxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 270, -1));

        jbtnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtnRegistrar.setText("Registrarme");
        jbtnRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarActionPerformed(evt);
            }
        });
        JPanelRegistro.add(jbtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 100, 30));

        jbtnMostrar.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jbtnMostrar.setText("Mostrar");
        jbtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrarActionPerformed(evt);
            }
        });
        JPanelRegistro.add(jbtnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 100, -1));

        jbtnOcultar.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jbtnOcultar.setText("Ocultar");
        jbtnOcultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOcultarActionPerformed(evt);
            }
        });
        JPanelRegistro.add(jbtnOcultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 100, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel7.setText("Registrarse");
        JPanelRegistro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText("Usuario");
        JPanelRegistro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("Tipo Usuario");
        JPanelRegistro.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jtxtUser.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JPanelRegistro.add(jtxtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 270, -1));

        jtxtPassw.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JPanelRegistro.add(jtxtPassw, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 270, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setText("Si ya está registrado, inicie sesión");
        JPanelRegistro.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, -1, 20));

        jbtnInicioSesion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtnInicioSesion.setText("Iniciar Sesión");
        jbtnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInicioSesionActionPerformed(evt);
            }
        });
        JPanelRegistro.add(jbtnInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText("Contraseña");
        JPanelRegistro.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jTipoUser.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTipoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Negocio", " " }));
        JPanelRegistro.add(jTipoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 270, -1));

        jtxtApellido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtxtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtApellidoActionPerformed(evt);
            }
        });
        JPanelRegistro.add(jtxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 270, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");
        JPanelRegistro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        getContentPane().add(JPanelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 530));

        jPanelEntrar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEntrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelEntrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel8.setText("Iniciar Sesión");
        jPanelEntrar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 238, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Usuario");
        jPanelEntrar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Contraseña");
        jPanelEntrar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jtxtUser2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanelEntrar.add(jtxtUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 270, -1));

        jtxtPassw2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanelEntrar.add(jtxtPassw2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 270, -1));

        jbtnEntrar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtnEntrar.setText("Iniciar Sesión");
        jbtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEntrarActionPerformed(evt);
            }
        });
        jPanelEntrar.add(jbtnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        jbtnMostrar2.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jbtnMostrar2.setText("Mostrar");
        jbtnMostrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrar2ActionPerformed(evt);
            }
        });
        jPanelEntrar.add(jbtnMostrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jbtnOcultar2.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jbtnOcultar2.setText("Ocultar");
        jbtnOcultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOcultar2ActionPerformed(evt);
            }
        });
        jPanelEntrar.add(jbtnOcultar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        getContentPane().add(jPanelEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 340, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtIdActionPerformed

    private void jbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarActionPerformed
    String nombre = jtxtName.getText();
    String apellido = jtxtApellido.getText();
    int identificacion = Integer.parseInt(jtxtId.getText());
    int edad = Integer.parseInt(jtxtEdad.getText());
    String usuario = jtxtUser.getText();
    String contraseña = jtxtPassw.getText();
    String tipo = (String) jTipoUser.getSelectedItem();
  

    if (nombre.isEmpty() || apellido.isEmpty() || usuario.isEmpty() || contraseña.isEmpty() || tipo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios. Por favor, complete todos los campos.");
        return;
    }
    
    GestionUsuario cliente = new GestionUsuario();
    Usuario obj = new Usuario(nombre, apellido, identificacion, edad, usuario, contraseña, tipo);
    
    if (cliente.idExistente(identificacion)) {
        JOptionPane.showMessageDialog(null, "La cédula ya está registrada.");
        return;
    } else if (cliente.usuarioExistente(usuario)) {
        JOptionPane.showMessageDialog(null, "El nombre de usuario ya está registrado.");
        return;
    } else{
        boolean registroExitoso = cliente.registrar(obj);

        if (registroExitoso) {
            JOptionPane.showMessageDialog(this, "Registro exitoso. Ahora puedes iniciar sesión con tu nuevo usuario.");
            jPanelEntrar.setVisible(true);
            jtxtName.setText("");
            jtxtApellido.setText("");
            jtxtId.setText("");
            jtxtEdad.setText("");
            jtxtUser.setText("");
            jtxtPassw.setText("");
            jTipoUser.setSelectedItem("");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo completar el registro. Por favor, inténtalo de nuevo.");
        }
    }

    
    }//GEN-LAST:event_jbtnRegistrarActionPerformed

    private void jbtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrarActionPerformed
        jbtnMostrar.setVisible(false);
        jbtnOcultar.setVisible(true);
        jtxtPassw.setEchoChar((char)0);
    }//GEN-LAST:event_jbtnMostrarActionPerformed

    private void jbtnOcultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOcultarActionPerformed
        jbtnMostrar.setVisible(true);
        jbtnOcultar.setVisible(false);
        jtxtPassw.setEchoChar((char)'*');
    }//GEN-LAST:event_jbtnOcultarActionPerformed

    private void jbtnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInicioSesionActionPerformed
        jPanelEntrar.setVisible(true);
    }//GEN-LAST:event_jbtnInicioSesionActionPerformed

    private void jbtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEntrarActionPerformed
        SQLconexion.conectar();
        GestionUsuario user = new GestionUsuario();
        
        String usuario = jtxtUser2.getText();
        String contraseña = jtxtPassw2.getText();
        
        Usuario obj = new Usuario(usuario, contraseña);
        
        boolean autenticacionExitosa = user.buscar(obj);

        if (autenticacionExitosa) {
            int idUsuario = user.buscarIdUsuario(usuario, contraseña);
            Principal abrir = new Principal(idUsuario, usuario);
            frmWelcom abrir2 = new frmWelcom();
            abrir2.txtWelcom.setText("¡Bienvenido "+ usuario +" a CityGuide!");
            abrir.jbtnUser.setBackground(Color.white);
            abrir.jbtnExplorar.setBackground(Color.white);
            abrir.jbtnInicio.setBackground(Color.white);
            abrir.setVisible(true);
            abrir2.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Error en el usuario y contraseña ingresados");
        }
    }//GEN-LAST:event_jbtnEntrarActionPerformed

    private void jbtnOcultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOcultar2ActionPerformed
        jbtnMostrar2.setVisible(true);
        jbtnOcultar2.setVisible(false);
        jtxtPassw2.setEchoChar((char)'*');
    }//GEN-LAST:event_jbtnOcultar2ActionPerformed

    private void jbtnMostrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrar2ActionPerformed
        jbtnMostrar2.setVisible(false);
        jbtnOcultar2.setVisible(true);
        jtxtPassw2.setEchoChar((char)0);
    }//GEN-LAST:event_jbtnMostrar2ActionPerformed

    private void jtxtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtApellidoActionPerformed

    public void PanelH(JPanel p){  
        
        p.setSize(671, 528);
        p.setLocation(0, 0);
        
        JPanelRegistro.removeAll();
        JPanelRegistro.add(p, BorderLayout.CENTER);
        JPanelRegistro.revalidate();
        JPanelRegistro.repaint();
        
        jPanelEntrar.removeAll();
        jPanelEntrar.add(p, BorderLayout.CENTER);
        jPanelEntrar.revalidate();
        jPanelEntrar.repaint();

    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login abrir = new Login();
                abrir.setVisible(true);  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelEntrar;
    private javax.swing.JComboBox<String> jTipoUser;
    public javax.swing.JButton jbtnEntrar;
    private javax.swing.JButton jbtnInicioSesion;
    private javax.swing.JButton jbtnMostrar;
    private javax.swing.JButton jbtnMostrar2;
    private javax.swing.JButton jbtnOcultar;
    private javax.swing.JButton jbtnOcultar2;
    private javax.swing.JButton jbtnRegistrar;
    private javax.swing.JTextField jtxtApellido;
    private javax.swing.JTextField jtxtEdad;
    private javax.swing.JTextField jtxtId;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JPasswordField jtxtPassw;
    private javax.swing.JPasswordField jtxtPassw2;
    private javax.swing.JTextField jtxtUser;
    private javax.swing.JTextField jtxtUser2;
    // End of variables declaration//GEN-END:variables
}
