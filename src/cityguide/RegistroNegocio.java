package cityguide;

import clases.GestionNegocio;
import clases.Negocio;
import javax.swing.JOptionPane;

/**
 *
 * @author juan ortega
 */
public class RegistroNegocio extends javax.swing.JFrame {

    public RegistroNegocio() {
        initComponents();
        this.setLocationRelativeTo(this);
        jboxTipoLugar.setSelectedItem("Seleccione la opción");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelRegistro = new javax.swing.JPanel();
        horario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtDireccion = new javax.swing.JTextField();
        jtxtName = new javax.swing.JTextField();
        jbtnRegistrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        preferencia = new javax.swing.JLabel();
        jtxtHorario = new javax.swing.JTextField();
        jboxTipoLugar = new javax.swing.JComboBox<>();
        jtxtLugares = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelRegistro.setBackground(new java.awt.Color(255, 255, 255));
        JPanelRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JPanelRegistro.setForeground(new java.awt.Color(255, 255, 255));
        JPanelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        horario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        horario.setText("Horario de atención");
        JPanelRegistro.add(horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JPanelRegistro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jtxtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtxtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDireccionActionPerformed(evt);
            }
        });
        JPanelRegistro.add(jtxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 270, -1));

        jtxtName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNameActionPerformed(evt);
            }
        });
        JPanelRegistro.add(jtxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 270, -1));

        jbtnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbtnRegistrar.setText("Registrar");
        jbtnRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarActionPerformed(evt);
            }
        });
        JPanelRegistro.add(jbtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 100, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel7.setText("Registro de lugar");
        JPanelRegistro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        nombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nombre.setText("Nombre del negocio");
        JPanelRegistro.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        tipo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tipo.setText("Tipo");
        JPanelRegistro.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        direccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        direccion.setText("Dirección");
        JPanelRegistro.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        preferencia.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        preferencia.setText("Numeros de lugares disponibles");
        JPanelRegistro.add(preferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jtxtHorario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JPanelRegistro.add(jtxtHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 270, -1));

        jboxTipoLugar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jboxTipoLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Restaurante", "Cine", "Spa", "Discoteca", "Restaurante Vegetariano", "Bar" }));
        jboxTipoLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxTipoLugarActionPerformed(evt);
            }
        });
        JPanelRegistro.add(jboxTipoLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 270, -1));

        jtxtLugares.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JPanelRegistro.add(jtxtLugares, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 270, -1));

        getContentPane().add(JPanelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDireccionActionPerformed

    private void jbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarActionPerformed
        String nombre = jtxtName.getText();
        String tipo = (String) jboxTipoLugar.getSelectedItem();
        String direccion = jtxtDireccion.getText();
        String horario = jtxtHorario.getText();
        int lugares = Integer.parseInt(jtxtLugares.getText());

        if (nombre.isEmpty() || tipo.isEmpty() || direccion.isEmpty() || horario.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios. Por favor, complete todos los campos.");
            return;
        }
        GestionNegocio obj = new GestionNegocio();
        if (obj.nombreNegocioExiste(nombre)) {
            JOptionPane.showMessageDialog(null, "El nombre del lugar ya está registrada.");
            return;
        } else {
            Negocio neg =  new Negocio(nombre, direccion, direccion, horario, lugares);
            boolean registroExitoso = obj.registrar(neg);
            if (registroExitoso) {
                JOptionPane.showMessageDialog(this, "Registro exitoso. Ahora puedes iniciar sesión con tu nuevo usuario.");
                jtxtName.setText("");
                jboxTipoLugar.setSelectedItem("");
                jtxtDireccion.setText("");
                jtxtHorario.setText("");
                jtxtLugares.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo completar el registro. Por favor, inténtalo de nuevo.");
            }
        }
    }//GEN-LAST:event_jbtnRegistrarActionPerformed

    private void jtxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNameActionPerformed

    private void jboxTipoLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxTipoLugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jboxTipoLugarActionPerformed

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new RegistroNegocio().setVisible(true);
        }
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelRegistro;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel horario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> jboxTipoLugar;
    private javax.swing.JButton jbtnRegistrar;
    private javax.swing.JTextField jtxtDireccion;
    private javax.swing.JTextField jtxtHorario;
    private javax.swing.JTextField jtxtLugares;
    public javax.swing.JTextField jtxtName;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel preferencia;
    private javax.swing.JLabel tipo;
    // End of variables declaration//GEN-END:variables
}
