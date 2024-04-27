package com.trex.sistemabibliotecario.view;

public class UsuariosPanel extends javax.swing.JPanel {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JPanel botones;
    private javax.swing.JButton btnBuscarId;
    private javax.swing.JComboBox<String> cbTurno;
    private javax.swing.JButton eliminar;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JTable tabla_usuarios;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    public UsuariosPanel() {
        initComponents();
        Clases.CUsuarios MU = new Clases.CUsuarios();
        MU.Mostrar(tabla_usuarios);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        cbTurno = new javax.swing.JComboBox<>();
        btnBuscarId = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable();
        botones = new javax.swing.JPanel();
        agregar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(738, 460));

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nombre de usuario:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Contraseña:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Turno:");

        txtId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtContraseña.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        cbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"TURNO", "Matutino", "Vespertino"}));
        cbTurno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cbTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTurnoActionPerformed(evt);
            }
        });

        btnBuscarId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscarPres.png"))); // NOI18N
        btnBuscarId.setBorder(null);
        btnBuscarId.setBorderPainted(false);
        btnBuscarId.setContentAreaFilled(false);
        btnBuscarId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscarPres.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setContentAreaFilled(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setDefaultCapable(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscarPres.png"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setContentAreaFilled(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.setDefaultCapable(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        tabla_usuarios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {},
                        {},
                        {},
                        {}
                },
                new String[]{

                }
        ));
        tabla_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_usuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_usuarios);

        botones.setBackground(new java.awt.Color(255, 255, 255));

        agregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nLector.png"))); // NOI18N
        agregar.setText("Agregar");
        agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar.setPreferredSize(new java.awt.Dimension(210, 32));
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        modificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        modificar.setText("Modificar");
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.setPreferredSize(new java.awt.Dimension(210, 32));
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dLector.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.setPreferredSize(new java.awt.Dimension(210, 32));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
        botones.setLayout(botonesLayout);
        botonesLayout.setHorizontalGroup(
                botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addGroup(botonesLayout.createSequentialGroup()
                                                    .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addGap(25, 25, 25)
                                                    .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addGap(26, 26, 26)
                                                    .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                        );
        botonesLayout.setVerticalGroup(
                botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addGroup(botonesLayout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                           .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                           .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                           .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                                                    .addContainerGap())
                                      );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
                fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(fondoLayout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                     .addComponent(botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                     .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                                                                     .addGroup(fondoLayout.createSequentialGroup()
                                                                                          .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                               .addComponent(jLabel1)
                                                                                                               .addComponent(jLabel5)
                                                                                                               .addComponent(cbTurno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                               .addComponent(txtId))
                                                                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                          .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                               .addComponent(btnBuscarId)
                                                                                                               .addComponent(jButton13))
                                                                                          .addGap(39, 39, 39)
                                                                                          .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                               .addComponent(jLabel2)
                                                                                                               .addComponent(jLabel6)
                                                                                                               .addComponent(txtNombre)
                                                                                                               .addComponent(txtContraseña))
                                                                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                          .addComponent(jButton12)))
                                                .addGap(41, 41, 41))
                                      );
        fondoLayout.setVerticalGroup(
                fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(fondoLayout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                     .addComponent(jButton13)
                                                                     .addGroup(fondoLayout.createSequentialGroup()
                                                                                          .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                               .addComponent(btnBuscarId)
                                                                                                               .addGroup(fondoLayout.createSequentialGroup()
                                                                                                                                    .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                         .addComponent(jLabel2)
                                                                                                                                                         .addComponent(jLabel1))
                                                                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                    .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                         .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                         .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                               .addComponent(jButton12))
                                                                                          .addGap(18, 18, 18)
                                                                                          .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                               .addComponent(jLabel6)
                                                                                                               .addComponent(jLabel5))
                                                                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                          .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                               .addComponent(cbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                               .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(59, 59, 59)
                                                .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                                .addGap(40, 40, 40))
                                    );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                 );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                               );
    }// </editor-fold>//GEN-END:initComponents

    private void cbTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTurnoActionPerformed

    }//GEN-LAST:event_cbTurnoActionPerformed

    private void btnBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdActionPerformed
        Clases.CUsuarios BU = new Clases.CUsuarios();
        BU.BuscarUsuario(txtId, tabla_usuarios);
        BU.Limpiar(txtId, txtNombre, cbTurno, txtContraseña);
    }//GEN-LAST:event_btnBuscarIdActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Clases.CUsuarios BNU = new Clases.CUsuarios();
        BNU.BuscarNombreUsuario(txtNombre, tabla_usuarios);
        BNU.Limpiar(txtId, txtNombre, cbTurno, txtContraseña);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Clases.CUsuarios BTU = new Clases.CUsuarios();
        BTU.BuscarTurnoUsuario(cbTurno, tabla_usuarios);
        BTU.Limpiar(txtId, txtNombre, cbTurno, txtContraseña);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void tabla_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_usuariosMouseClicked
        Clases.CUsuarios SU = new Clases.CUsuarios();
        SU.SeleccionarUsuario(tabla_usuarios, txtId, txtNombre, txtContraseña, cbTurno);
    }//GEN-LAST:event_tabla_usuariosMouseClicked

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        Clases.CUsuarios AU = new Clases.CUsuarios();
        AU.agregarUsuario(txtNombre, txtContraseña, cbTurno);
        AU.mostrarUsuAgregado(tabla_usuarios);
        AU.Limpiar(txtId, txtNombre, cbTurno, txtContraseña);
    }//GEN-LAST:event_agregarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        Clases.CUsuarios AU = new Clases.CUsuarios();
        AU.ModificarUsuario(txtId, txtNombre, txtContraseña, cbTurno, tabla_usuarios);
        AU.Limpiar(txtId, txtNombre, cbTurno, txtContraseña);
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        Clases.CUsuarios EU = new Clases.CUsuarios();
        EU.EliminarUsuario(txtId);
        EU.mostrarUsuAgregado(tabla_usuarios);
        EU.Limpiar(txtId, txtNombre, cbTurno, txtContraseña);
    }//GEN-LAST:event_eliminarActionPerformed
    // End of variables declaration//GEN-END:variables
}
