package com.trex.sistemabibliotecario.view;


import Clases.Actividades;
import Clases.Prestamos;
import Clases.PrestamosYDevoluciones;

public class PrestamosPanel extends javax.swing.JPanel {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel botones;
    private javax.swing.JButton btnBuscarPrestamo;
    private com.toedter.calendar.JDateChooser devolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser prestado;
    private javax.swing.JButton prestarYagregar;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField txtAlumno;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdLibro;
    public PrestamosPanel() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        background = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnBuscarPrestamo = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        botones = new javax.swing.JPanel();
        prestarYagregar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        devolver = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        prestado = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdLibro = new javax.swing.JTextField();
        txtAlumno = new javax.swing.JTextField();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGap(0, 100, Short.MAX_VALUE)
                                              );
        jLayeredPane1Layout.setVerticalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGap(0, 100, Short.MAX_VALUE)
                                            );

        setBackground(new java.awt.Color(255, 255, 255));
        setFocusTraversalPolicyProvider(true);
        setInheritsPopupMenu(true);
        setMinimumSize(new java.awt.Dimension(738, 460));
        setPreferredSize(new java.awt.Dimension(738, 460));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(738, 460));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prestarr.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Id:");

        txtId.setToolTipText("");
        txtId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnBuscarPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscarPres.png"))); // NOI18N
        btnBuscarPrestamo.setBorder(null);
        btnBuscarPrestamo.setBorderPainted(false);
        btnBuscarPrestamo.setContentAreaFilled(false);
        btnBuscarPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPrestamoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Id del lector:");

        botones.setBackground(new java.awt.Color(255, 255, 255));

        prestarYagregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        prestarYagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aprobado.png"))); // NOI18N
        prestarYagregar.setText("Prestar");
        prestarYagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prestarYagregar.setPreferredSize(new java.awt.Dimension(160, 32));
        prestarYagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestarYagregarActionPerformed(evt);
            }
        });

        regresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regresar_1.png"))); // NOI18N
        regresar.setText("Devolver");
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        regresar.setPreferredSize(new java.awt.Dimension(160, 32));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
        botones.setLayout(botonesLayout);
        botonesLayout.setHorizontalGroup(
                botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addGroup(botonesLayout.createSequentialGroup()
                                                    .addComponent(prestarYagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        );
        botonesLayout.setVerticalGroup(
                botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addGroup(botonesLayout.createSequentialGroup()
                                                    .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                           .addComponent(prestarYagregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                           .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(0, 8, Short.MAX_VALUE))
                                      );

        devolver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Fecha de devolución:");

        prestado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Fecha de préstamo:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Id del libro:");

        txtIdLibro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtIdLibro.setPreferredSize(new java.awt.Dimension(100, 25));

        txtAlumno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAlumno.setPreferredSize(new java.awt.Dimension(100, 25));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
                backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(backgroundLayout.createSequentialGroup()
                                                          .addGap(5, 5, 5)
                                                          .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 413, Short.MAX_VALUE)
                                                          .addGap(18, 18, 18)
                                                          .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                    .addGroup(backgroundLayout.createSequentialGroup()
                                                                                                              .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                              .addGap(33, 33, 33))
                                                                                    .addGroup(backgroundLayout.createSequentialGroup()
                                                                                                              .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                        .addComponent(txtAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                        .addComponent(txtIdLibro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                                              .addGap(22, 22, 22))
                                                                                    .addGroup(backgroundLayout.createSequentialGroup()
                                                                                                              .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                        .addComponent(prestado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addComponent(devolver, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                        .addGroup(backgroundLayout.createSequentialGroup()
                                                                                                                                                                  .addComponent(jLabel1)
                                                                                                                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                  .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                  .addComponent(btnBuscarPrestamo)))
                                                                                                              .addGap(19, 19, 19))))
                                           );
        backgroundLayout.setVerticalGroup(
                backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(backgroundLayout.createSequentialGroup()
                                                          .addGap(19, 19, 19)
                                                          .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                              .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                              .addComponent(jLabel1))
                                                                                    .addComponent(btnBuscarPrestamo))
                                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                          .addComponent(jLabel10)
                                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                          .addComponent(txtAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                          .addComponent(jLabel7)
                                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                          .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                          .addComponent(jLabel9)
                                                          .addGap(12, 12, 12)
                                                          .addComponent(prestado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                          .addGap(13, 13, 13)
                                                          .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                          .addComponent(devolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                          .addGap(32, 32, 32)
                                                          .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                          .addGap(42, 42, 42))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                                                                                      .addContainerGap()
                                                                                                      .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                                                                                                      .addGap(31, 31, 31))
                                         );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                                 );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                               );

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPrestamoActionPerformed
        PrestamosYDevoluciones BP = new PrestamosYDevoluciones();
        BP.BuscarPrestamo(txtId, txtAlumno, txtIdLibro, prestado, devolver);

    }//GEN-LAST:event_btnBuscarPrestamoActionPerformed

    private void prestarYagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestarYagregarActionPerformed
        Actividades NP = new Actividades();
        Prestamos PL = new Prestamos();
        NP.prestamo(txtAlumno, txtIdLibro, prestado);
        PL.Prestar(txtAlumno, txtIdLibro, prestado, devolver);
        PL.Limpiar(txtId, txtAlumno, txtIdLibro, prestado, devolver);
    }//GEN-LAST:event_prestarYagregarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Prestamos DL = new Prestamos();
        Actividades AD = new Actividades();
        DL.Devolucion(txtId, txtIdLibro);
        AD.devolucion(txtAlumno, txtIdLibro, devolver);
        DL.Limpiar(txtId, txtAlumno, txtIdLibro, prestado, devolver);

    }//GEN-LAST:event_regresarActionPerformed
    // End of variables declaration//GEN-END:variables
}
