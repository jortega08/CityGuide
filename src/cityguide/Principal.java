package cityguide;

import clases.GestionNegocio;
import clases.GestionUsuario;
import clases.PreferenciaNeg;
import clases.SQLconexion;
import clases.Usuario;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    
    protected int idUsuario;
    protected String usuario;
    private int idNegocio;
    private String nombreNegocio;
    DefaultTableModel tmp = new DefaultTableModel();
    GestionUsuario gestion = new GestionUsuario();
    GestionNegocio gestionN = new GestionNegocio();
    
    public Principal(int idUsuario, String user) {
        initComponents();
        this.setLocationRelativeTo(this);
        this.idUsuario = idUsuario;
        this.usuario = user;
        obtenerDatosUsuario(idUsuario);
        obtenerDatosNegocioTable();
        inicializarComponentes();
        jTabbedPanel.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPanel = new javax.swing.JTabbedPane();
        JPanelInicio = new javax.swing.JPanel();
        jPanelUsuarios = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtEdad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtPassw = new javax.swing.JTextField();
        jbtnModificar = new javax.swing.JButton();
        txtId = new javax.swing.JLabel();
        jbtnDesac = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtnEdit = new javax.swing.JButton();
        jPanelNegocio = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableNegocio = new javax.swing.JTable();
        jPanelCalif = new javax.swing.JPanel();
        txtNombre = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableResenas = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtPuntaje = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jbtn5 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtxtComentario = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtId1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboPreferenciaNeg = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jbtnUser = new javax.swing.JButton();
        jbtnInicio = new javax.swing.JButton();
        jbtnExplorar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPanel.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPanel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTabbedPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPanelMouseClicked(evt);
            }
        });

        JPanelInicio.setBackground(new java.awt.Color(255, 255, 255));
        JPanelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPanel.addTab("Inicio", JPanelInicio);

        jPanelUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jPanelUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Modificar datos de usuario");
        jPanelUsuarios.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanelUsuarios.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jtxtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreActionPerformed(evt);
            }
        });
        jPanelUsuarios.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 400, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Apellido");
        jPanelUsuarios.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jtxtApellido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtxtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtApellidoActionPerformed(evt);
            }
        });
        jPanelUsuarios.add(jtxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 400, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Cédula");
        jPanelUsuarios.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jtxtId.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIdActionPerformed(evt);
            }
        });
        jPanelUsuarios.add(jtxtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 400, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Edad");
        jPanelUsuarios.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jtxtEdad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtxtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEdadActionPerformed(evt);
            }
        });
        jPanelUsuarios.add(jtxtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 400, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Usuario");
        jPanelUsuarios.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jtxtUser.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtxtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUserActionPerformed(evt);
            }
        });
        jPanelUsuarios.add(jtxtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 400, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña");
        jPanelUsuarios.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        jtxtPassw.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanelUsuarios.add(jtxtPassw, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 400, -1));

        jbtnModificar.setBackground(new java.awt.Color(204, 255, 153));
        jbtnModificar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jbtnModificar.setText("Modificar");
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });
        jPanelUsuarios.add(jbtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 600, -1, -1));

        txtId.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtId.setForeground(new java.awt.Color(0, 153, 153));
        txtId.setText("id");
        jPanelUsuarios.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jbtnDesac.setBackground(new java.awt.Color(255, 255, 153));
        jbtnDesac.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jbtnDesac.setText("Desactivarme");
        jbtnDesac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDesacActionPerformed(evt);
            }
        });
        jPanelUsuarios.add(jbtnDesac, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 600, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Mis preferencias");
        jPanelUsuarios.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Preferencias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jPanelUsuarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 300, 330));

        jbtnEdit.setBackground(new java.awt.Color(204, 255, 153));
        jbtnEdit.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jbtnEdit.setText("Editar preferencias");
        jbtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditActionPerformed(evt);
            }
        });
        jPanelUsuarios.add(jbtnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, -1, -1));

        jTabbedPanel.addTab("Usuario", jPanelUsuarios);

        jPanelNegocio.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNegocio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelNegocioMouseClicked(evt);
            }
        });
        jPanelNegocio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableNegocio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTableNegocio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo de negocio", "Nombre", "Dirección", "Horario de atención", "Calif"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableNegocio.setSelectionBackground(new java.awt.Color(153, 255, 153));
        jTableNegocio.setSelectionForeground(new java.awt.Color(0, 51, 51));
        jTableNegocio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNegocioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableNegocio);
        if (jTableNegocio.getColumnModel().getColumnCount() > 0) {
            jTableNegocio.getColumnModel().getColumn(0).setMinWidth(40);
            jTableNegocio.getColumnModel().getColumn(0).setMaxWidth(40);
            jTableNegocio.getColumnModel().getColumn(1).setMinWidth(100);
            jTableNegocio.getColumnModel().getColumn(1).setMaxWidth(100);
            jTableNegocio.getColumnModel().getColumn(2).setMinWidth(250);
            jTableNegocio.getColumnModel().getColumn(2).setMaxWidth(250);
            jTableNegocio.getColumnModel().getColumn(3).setMinWidth(200);
            jTableNegocio.getColumnModel().getColumn(3).setMaxWidth(200);
            jTableNegocio.getColumnModel().getColumn(4).setMinWidth(150);
            jTableNegocio.getColumnModel().getColumn(4).setMaxWidth(150);
            jTableNegocio.getColumnModel().getColumn(5).setMinWidth(80);
            jTableNegocio.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        jPanelNegocio.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 830, 270));

        jTabbedPanel.addTab("Explorar", jPanelNegocio);

        jPanelCalif.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCalif.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombre.setText("Nombre del negocio");
        jPanelCalif.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 570, -1));

        jTableResenas.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jTableResenas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Fecha", "Cliente", "Calif", "Comentario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableResenas);
        if (jTableResenas.getColumnModel().getColumnCount() > 0) {
            jTableResenas.getColumnModel().getColumn(0).setMinWidth(40);
            jTableResenas.getColumnModel().getColumn(0).setMaxWidth(40);
            jTableResenas.getColumnModel().getColumn(1).setMinWidth(100);
            jTableResenas.getColumnModel().getColumn(1).setMaxWidth(100);
            jTableResenas.getColumnModel().getColumn(2).setMinWidth(100);
            jTableResenas.getColumnModel().getColumn(2).setMaxWidth(100);
            jTableResenas.getColumnModel().getColumn(3).setMinWidth(60);
            jTableResenas.getColumnModel().getColumn(3).setMaxWidth(60);
            jTableResenas.getColumnModel().getColumn(4).setMinWidth(230);
            jTableResenas.getColumnModel().getColumn(4).setMaxWidth(230);
        }

        jPanelCalif.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 530, 220));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText("Historial de las reseñas");
        jPanelCalif.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        txtPuntaje.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        txtPuntaje.setForeground(new java.awt.Color(0, 153, 51));
        txtPuntaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPuntaje.setText("0.0");
        jPanelCalif.add(txtPuntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 90, 80));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText("Nuestros clientes califican nuestro servicio");
        jPanelCalif.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel12.setText("Deja un pequeño comentario sobre tu experencia");
        jPanelCalif.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jbtn5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jbtn5.setForeground(new java.awt.Color(255, 255, 0));
        jbtn5.setText("*");
        jbtn5.setBorder(null);
        jbtn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn5MouseExited(evt);
            }
        });
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });
        jPanelCalif.add(jbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 30, 30));

        jbtn1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jbtn1.setForeground(new java.awt.Color(255, 255, 0));
        jbtn1.setText("*");
        jbtn1.setBorder(null);
        jbtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn1MouseExited(evt);
            }
        });
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });
        jPanelCalif.add(jbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 30, 30));

        jbtn2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jbtn2.setForeground(new java.awt.Color(255, 255, 0));
        jbtn2.setText("*");
        jbtn2.setBorder(null);
        jbtn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn2MouseExited(evt);
            }
        });
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });
        jPanelCalif.add(jbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 30, 30));

        jbtn3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jbtn3.setForeground(new java.awt.Color(255, 255, 0));
        jbtn3.setText("*");
        jbtn3.setBorder(null);
        jbtn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn3MouseExited(evt);
            }
        });
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });
        jPanelCalif.add(jbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 30, 30));

        jbtn4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jbtn4.setForeground(new java.awt.Color(255, 255, 0));
        jbtn4.setText("*");
        jbtn4.setBorder(null);
        jbtn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn4MouseExited(evt);
            }
        });
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });
        jPanelCalif.add(jbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 30, 30));

        jtxtComentario.setColumns(20);
        jtxtComentario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtxtComentario.setRows(5);
        jtxtComentario.setBorder(null);
        jtxtComentario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtxtComentario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jtxtComentario.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(jtxtComentario);

        jPanelCalif.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jLabel13.setText("y califica nuestro servicio también");
        jPanelCalif.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jTabbedPanel.addTab("Detalles del negocio", jPanelCalif);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtId1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtId1.setForeground(new java.awt.Color(0, 153, 153));
        txtId1.setText("id");
        jPanel2.add(txtId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel10.setText("Editar mis preferencias");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jComboPreferenciaNeg.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboPreferenciaNeg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar preferencia" }));
        jComboPreferenciaNeg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboPreferenciaNegKeyPressed(evt);
            }
        });
        jPanel2.add(jComboPreferenciaNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setText("¿Al momento de salir en Villavicencio que tipo de lugares prefieres?");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setText("Selecciona una opción:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jTabbedPanel.addTab("Editar preferencias", jPanel2);

        getContentPane().add(jTabbedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 890, 670));

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnUser.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jbtnUser.setText("Usuario");
        jbtnUser.setBorder(null);
        jbtnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUserActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 180, 50));

        jbtnInicio.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jbtnInicio.setText("Inicio");
        jbtnInicio.setBorder(null);
        jbtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInicioActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 180, 50));

        jbtnExplorar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jbtnExplorar.setText("Explorar");
        jbtnExplorar.setBorder(null);
        jbtnExplorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExplorarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnExplorar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 180, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreActionPerformed

    private void jtxtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtApellidoActionPerformed

    private void jtxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtIdActionPerformed

    private void jtxtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEdadActionPerformed

    private void jtxtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUserActionPerformed

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        if (!"".equals(jtxtNombre.getText()) || !"".equals(jtxtId.getText()) || !"".equals(jtxtEdad.getText()) || !"".equals(jtxtUser.getText()) || !"".equals(jtxtPassw.getText())) {
            String nombre = jtxtNombre.getText();
            String apellido = jtxtApellido.getText();
            int cedula = Integer.parseInt(jtxtId.getText());
            int edad = Integer.parseInt(jtxtEdad.getText());
            String user = jtxtUser.getText();
            String passw = jtxtPassw.getText();
            int id = Integer.parseInt(txtId.getText());
            
            Usuario obj = new Usuario(id, nombre, apellido, cedula, edad, user, passw);
            
            gestion.modificar(obj);
            JOptionPane.showMessageDialog(null, "Datos del usuario modificados");
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios, complete la información");
        }
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jPanelNegocioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelNegocioMouseClicked
        
    }//GEN-LAST:event_jPanelNegocioMouseClicked

    private void jTabbedPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPanelMouseClicked

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        jbtn1.setBackground(Color.GREEN);
        jbtn2.setBackground(Color.GREEN);
        jbtn3.setBackground(Color.GREEN);
        jbtn4.setBackground(Color.GREEN);
        jbtn5.setBackground(Color.GREEN);
        int selectedRow = jTableNegocio.getSelectedRow();

        if (selectedRow != -1) {
            int idResena = -1;

            for (int row = 0; row < jTableResenas.getRowCount(); row++) {
                int id = (int) jTableResenas.getValueAt(row, 0);

                if (id == idUsuario) {
                    idResena = id;
                    break;
                }
            }

            if (idResena != -1) {
                float puntuacion = 2;
                String comentario = jtxtComentario.getText();
                gestionN.agregarReseña(idResena, idUsuario, idNegocio, usuario, puntuacion, comentario);
            }
        }
        float puntaje = gestionN.calcularPuntuacion(idNegocio);
        txtPuntaje.setText(String.format("%.1f", puntaje));
        jbtn5.setSelected(false);
        jbtn1.setBackground(Color.WHITE);
        jbtn2.setBackground(Color.WHITE);
        jbtn3.setBackground(Color.WHITE);
        jbtn4.setBackground(Color.WHITE);
        jbtn5.setBackground(Color.WHITE);
        jtxtComentario.setText("");
        LimpiarTableMenu();
        obtenerDatosResenaTable(idNegocio);
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        jbtn1.setBackground(Color.GREEN);
        jbtn2.setBackground(Color.WHITE);
        jbtn3.setBackground(Color.WHITE);
        jbtn4.setBackground(Color.WHITE);
        jbtn5.setBackground(Color.WHITE);
        int selectedRow = jTableNegocio.getSelectedRow();

        if (selectedRow != -1) {
            int idResena = -1;

            for (int row = 0; row < jTableResenas.getRowCount(); row++) {
                int id = (int) jTableResenas.getValueAt(row, 0);

                if (id == idUsuario) {
                    idResena = id;
                    break;
                }
            }

            if (idResena != -1) {
                float puntuacion = 2;
                String comentario = jtxtComentario.getText();
                gestionN.agregarReseña(idResena, idUsuario, idNegocio, usuario, puntuacion, comentario);
            }
        }
        float puntaje = gestionN.calcularPuntuacion(idNegocio);
        txtPuntaje.setText(String.format("%.1f", puntaje));
        jbtn1.setSelected(false);
        jbtn1.setBackground(Color.WHITE);
        jbtn2.setBackground(Color.WHITE);
        jbtn3.setBackground(Color.WHITE);
        jbtn4.setBackground(Color.WHITE);
        jbtn5.setBackground(Color.WHITE);
        jtxtComentario.setText("");
        LimpiarTableMenu();
        obtenerDatosResenaTable(idNegocio);
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        jbtn1.setBackground(Color.GREEN);
        jbtn2.setBackground(Color.GREEN);
        jbtn3.setBackground(Color.WHITE);
        jbtn4.setBackground(Color.WHITE);
        jbtn5.setBackground(Color.WHITE);
        
        int selectedRow = jTableNegocio.getSelectedRow();

        if (selectedRow != -1) {
            int idResena = -1;

            for (int row = 0; row < jTableResenas.getRowCount(); row++) {
                int id = (int) jTableResenas.getValueAt(row, 0);

                if (id == idUsuario) {
                    idResena = id;
                    break;
                }
            }

            if (idResena != -1) {
                float puntuacion = 2;
                String comentario = jtxtComentario.getText();
                gestionN.agregarReseña(idResena, idUsuario, idNegocio, usuario, puntuacion, comentario);
            }
        }

        String comentario = jtxtComentario.getText();
        float puntaje = gestionN.calcularPuntuacion(idNegocio);
        txtPuntaje.setText(String.format("%.1f", puntaje));
        jbtn2.setSelected(false);
        jbtn1.setBackground(Color.WHITE);
        jbtn2.setBackground(Color.WHITE);
        jbtn3.setBackground(Color.WHITE);
        jbtn4.setBackground(Color.WHITE);
        jbtn5.setBackground(Color.WHITE);
        jtxtComentario.setText("");
        LimpiarTableMenu();
        obtenerDatosResenaTable(idNegocio);
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        jbtn1.setBackground(Color.GREEN);
        jbtn2.setBackground(Color.GREEN);
        jbtn3.setBackground(Color.GREEN);
        jbtn4.setBackground(Color.WHITE);
        jbtn5.setBackground(Color.WHITE);
        int selectedRow = jTableNegocio.getSelectedRow();

        if (selectedRow != -1) {
            int idResena = -1;

            for (int row = 0; row < jTableResenas.getRowCount(); row++) {
                int id = (int) jTableResenas.getValueAt(row, 0);

                if (id == idUsuario) {
                    idResena = id;
                    break;
                }
            }

            if (idResena != -1) {
                float puntuacion = 2;
                String comentario = jtxtComentario.getText();
                gestionN.agregarReseña(idResena, idUsuario, idNegocio, usuario, puntuacion, comentario);
            }
        }
        float puntaje = gestionN.calcularPuntuacion(idNegocio);
        txtPuntaje.setText(String.format("%.1f", puntaje));
        jbtn3.setSelected(false);
        jbtn1.setBackground(Color.WHITE);
        jbtn2.setBackground(Color.WHITE);
        jbtn3.setBackground(Color.WHITE);
        jbtn4.setBackground(Color.WHITE);
        jbtn5.setBackground(Color.WHITE);
        jtxtComentario.setText("");
        LimpiarTableMenu();
        obtenerDatosResenaTable(idNegocio);
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        jbtn1.setBackground(Color.GREEN);
        jbtn2.setBackground(Color.GREEN);
        jbtn3.setBackground(Color.GREEN);
        jbtn4.setBackground(Color.GREEN);
        jbtn5.setBackground(Color.WHITE);
        int selectedRow = jTableNegocio.getSelectedRow();

        if (selectedRow != -1) {
            int idResena = -1;

            for (int row = 0; row < jTableResenas.getRowCount(); row++) {
                int id = (int) jTableResenas.getValueAt(row, 0);

                if (id == idUsuario) {
                    idResena = id;
                    break;
                }
            }

            if (idResena != -1) {
                float puntuacion = 2;
                String comentario = jtxtComentario.getText();
                gestionN.agregarReseña(idResena, idUsuario, idNegocio, usuario, puntuacion, comentario);
            }
        }
        float puntaje = gestionN.calcularPuntuacion(idNegocio);
        txtPuntaje.setText(String.format("%.1f", puntaje));
        jbtn4.setSelected(false);
        jbtn1.setBackground(Color.WHITE);
        jbtn2.setBackground(Color.WHITE);
        jbtn3.setBackground(Color.WHITE);
        jbtn4.setBackground(Color.WHITE);
        jbtn5.setBackground(Color.WHITE);
        jtxtComentario.setText("");
        LimpiarTableMenu();
        obtenerDatosResenaTable(idNegocio);
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jTableNegocioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNegocioMouseClicked
        int selectedRow = jTableNegocio.getSelectedRow();
        idNegocio = (int) jTableNegocio.getValueAt(selectedRow, 0);
        nombreNegocio = (String) jTableNegocio.getValueAt(selectedRow, 2);
        txtNombre.setText(nombreNegocio);
        LimpiarTableMenu();
        obtenerDatosResenaTable(idNegocio);
        jTabbedPanel.setSelectedIndex(3);
        System.out.println(idNegocio);
    }//GEN-LAST:event_jTableNegocioMouseClicked

    private void jbtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn1MouseEntered
        jbtn1.setBackground(Color.GREEN);
        jbtn2.setBackground(Color.WHITE);
        jbtn3.setBackground(Color.WHITE);
        jbtn4.setBackground(Color.WHITE);
        jbtn5.setBackground(Color.WHITE);
    }//GEN-LAST:event_jbtn1MouseEntered

    private void jbtn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn2MouseEntered
        jbtn1.setBackground(Color.GREEN);
        jbtn2.setBackground(Color.GREEN);
        jbtn3.setBackground(Color.WHITE);
        jbtn4.setBackground(Color.WHITE);
        jbtn5.setBackground(Color.WHITE);
    }//GEN-LAST:event_jbtn2MouseEntered

    private void jbtn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn3MouseEntered
        jbtn1.setBackground(Color.GREEN);
        jbtn2.setBackground(Color.GREEN);
        jbtn3.setBackground(Color.GREEN);
        jbtn4.setBackground(Color.WHITE);
        jbtn5.setBackground(Color.WHITE);
    }//GEN-LAST:event_jbtn3MouseEntered

    private void jbtn4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn4MouseEntered
        jbtn1.setBackground(Color.GREEN);
        jbtn2.setBackground(Color.GREEN);
        jbtn3.setBackground(Color.GREEN);
        jbtn4.setBackground(Color.GREEN);
        jbtn5.setBackground(Color.WHITE);
    }//GEN-LAST:event_jbtn4MouseEntered

    private void jbtn5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn5MouseEntered
        jbtn1.setBackground(Color.GREEN);
        jbtn2.setBackground(Color.GREEN);
        jbtn3.setBackground(Color.GREEN);
        jbtn4.setBackground(Color.GREEN);
        jbtn5.setBackground(Color.GREEN);
    }//GEN-LAST:event_jbtn5MouseEntered

    private void jbtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn1MouseExited
        jbtn1.setBackground(Color.WHITE);
        jbtn2.setBackground(Color.WHITE);
        jbtn3.setBackground(Color.WHITE);
        jbtn4.setBackground(Color.WHITE);
        jbtn5.setBackground(Color.WHITE);
    }//GEN-LAST:event_jbtn1MouseExited

    private void jbtn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn2MouseExited
        jbtn1.setBackground(Color.WHITE);
        jbtn2.setBackground(Color.WHITE);
        jbtn3.setBackground(Color.WHITE);
        jbtn4.setBackground(Color.WHITE);
        jbtn5.setBackground(Color.WHITE);
    }//GEN-LAST:event_jbtn2MouseExited

    private void jbtn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn3MouseExited
        jbtn1.setBackground(Color.WHITE);
        jbtn2.setBackground(Color.WHITE);
        jbtn3.setBackground(Color.WHITE);
        jbtn4.setBackground(Color.WHITE);
        jbtn5.setBackground(Color.WHITE);
    }//GEN-LAST:event_jbtn3MouseExited

    private void jbtn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn4MouseExited
        jbtn1.setBackground(Color.WHITE);
        jbtn2.setBackground(Color.WHITE);
        jbtn3.setBackground(Color.WHITE);
        jbtn4.setBackground(Color.WHITE);
        jbtn5.setBackground(Color.WHITE);
    }//GEN-LAST:event_jbtn4MouseExited

    private void jbtn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn5MouseExited
        jbtn1.setBackground(Color.WHITE);
        jbtn2.setBackground(Color.WHITE);
        jbtn3.setBackground(Color.WHITE);
        jbtn4.setBackground(Color.WHITE);
        jbtn5.setBackground(Color.WHITE);
    }//GEN-LAST:event_jbtn5MouseExited

    private void jbtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInicioActionPerformed
        jTabbedPanel.setSelectedIndex(0);
    }//GEN-LAST:event_jbtnInicioActionPerformed

    private void jbtnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUserActionPerformed
        jTabbedPanel.setSelectedIndex(1);
    }//GEN-LAST:event_jbtnUserActionPerformed

    private void jbtnExplorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExplorarActionPerformed
        jTabbedPanel.setSelectedIndex(2);
    }//GEN-LAST:event_jbtnExplorarActionPerformed

    private void jbtnDesacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDesacActionPerformed
        int id = Integer.parseInt(txtId.getText());
        Usuario obj = new Usuario(id);
        gestion.eliminar(obj);
    }//GEN-LAST:event_jbtnDesacActionPerformed

    private void jComboPreferenciaNegKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboPreferenciaNegKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            PreferenciaNeg selectedValue = (PreferenciaNeg) jComboPreferenciaNeg.getSelectedItem();
        }
    }//GEN-LAST:event_jComboPreferenciaNegKeyPressed

    private void jbtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditActionPerformed
                jTabbedPanel.setSelectedIndex(4);

    }//GEN-LAST:event_jbtnEditActionPerformed
    
    public void obtenerDatosUsuario(int idUsuario){
        Usuario datosUsuario = gestion.obtenerDatosUsuario(idUsuario);
        if (datosUsuario != null) {
            String nombre = datosUsuario.getNombreUsuario();
            String apellido = datosUsuario.getApellidoUsuario();
            int cedula = datosUsuario.getIdentificacionUsuario();
            int edad = datosUsuario.getEdadUsuario();
            String usuarioo = datosUsuario.getUsuario();
            String passw = datosUsuario.getContraseña();
            int id = datosUsuario.getId();

            jtxtNombre.setText(nombre);
            jtxtApellido.setText(apellido);
            jtxtId.setText(String.valueOf(cedula));
            jtxtEdad.setText(String.valueOf(edad));
            jtxtUser.setText(usuarioo);
            jtxtPassw.setText(passw);
            txtId.setText(String.valueOf(id));
            
        }
    }
            
        
    public void obtenerDatosNegocioTable(){
        
        try {
        gestionN.conexion = SQLconexion.conectar();
        String query = "SELECT nombreNegocio, tipoNegocio, direccionNegocio, horario_Atencion, puntuacion, idnegocio FROM negocio";
        gestionN.sentencia_preparada = gestionN.conexion.prepareStatement(query);
        gestionN.resultado = gestionN.sentencia_preparada.executeQuery();

        DefaultTableModel model = (DefaultTableModel) jTableNegocio.getModel();
        
        while (gestionN.resultado.next()) {
            int id = gestionN.resultado.getInt("idnegocio");
            String nombre = gestionN.resultado.getString("nombreNegocio");
            String tipoNegocio = gestionN.resultado.getString("tipoNegocio");
            String direccion = gestionN.resultado.getString("direccionNegocio");
            String horario = gestionN.resultado.getString("horario_Atencion");
            float puntuacion = gestionN.resultado.getFloat("puntuacion");

            Object[] registro = {id, tipoNegocio, nombre, direccion, horario, puntuacion};
            model.addRow(registro);
        }
            gestionN.conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void obtenerDatosResenaTable(int idNegocio) {
    try {
            gestionN.conexion = SQLconexion.conectar();
            String query = "SELECT idreseñas, fecha, usuario, puntuacion, comentario FROM reseñas WHERE idnegocio = ?";
            gestionN.sentencia_preparada = gestionN.conexion.prepareStatement(query);
            gestionN.sentencia_preparada.setInt(1, idNegocio);
            gestionN.resultado = gestionN.sentencia_preparada.executeQuery();

            DefaultTableModel model = (DefaultTableModel) jTableResenas.getModel();

            while (gestionN.resultado.next()) {
                int id = gestionN.resultado.getInt("idreseñas");
                String fecha = gestionN.resultado.getString("fecha");
                String cliente = gestionN.resultado.getString("usuario");
                float puntuacion = gestionN.resultado.getFloat("puntuacion");
                String comentario = gestionN.resultado.getString("comentario");
                
                Object[] registro = { id, fecha, cliente, puntuacion, comentario };
                model.addRow(registro);
            }
            gestionN.conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void LimpiarTableMenu() {
        tmp = (DefaultTableModel) jTableResenas.getModel();
        int fila = jTableResenas.getRowCount();
        for (int i = 0; i < fila; i++) {
            tmp.removeRow(0);
        }
    }
    
    private void inicializarComponentes() {
        PreferenciaNeg[] preferencias = PreferenciaNeg.values();
        String[] preferenciasStrings = new String[preferencias.length];
        for (int i = 0; i < preferencias.length; i++) {
            preferenciasStrings[i] = preferencias[i].toString();
        }
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(preferenciasStrings);
        jComboPreferenciaNeg.setModel(model);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelInicio;
    public javax.swing.JComboBox<String> jComboPreferenciaNeg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCalif;
    private javax.swing.JPanel jPanelNegocio;
    private javax.swing.JPanel jPanelUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPanel;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableNegocio;
    private javax.swing.JTable jTableResenas;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtnDesac;
    private javax.swing.JButton jbtnEdit;
    public javax.swing.JButton jbtnExplorar;
    public javax.swing.JButton jbtnInicio;
    private javax.swing.JButton jbtnModificar;
    public javax.swing.JButton jbtnUser;
    public javax.swing.JTextField jtxtApellido;
    private javax.swing.JTextArea jtxtComentario;
    public javax.swing.JTextField jtxtEdad;
    public javax.swing.JTextField jtxtId;
    public javax.swing.JTextField jtxtNombre;
    public javax.swing.JTextField jtxtPassw;
    public javax.swing.JTextField jtxtUser;
    public javax.swing.JLabel txtId;
    private javax.swing.JLabel txtId1;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtPuntaje;
    // End of variables declaration//GEN-END:variables
}
