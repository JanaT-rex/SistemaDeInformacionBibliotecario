package com.trex.sistemabibliotecario.view;


import Clases.Libros;

public class LibrosPanel extends javax.swing.JPanel {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JPanel botones;
    private javax.swing.JButton btnAutor;
    private javax.swing.JButton btnCantidad;
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnEditorial;
    private javax.swing.JButton btnEjemplares;
    private javax.swing.JButton btnIdLib;
    private javax.swing.JButton btnTitulo;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modificar;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JSpinner spEjemplares;
    private javax.swing.JTable tabla_libros;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtTitulo;
    /**
     * Creates new form P_libros
     */
    public LibrosPanel() {
        initComponents();
        Libros mostrarDatos = new Libros();
        mostrarDatos.mostrar(tabla_libros);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnIdLib = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        btnTitulo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        btnAutor = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        btnEditorial = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_libros = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnCategoria = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        spCantidad = new javax.swing.JSpinner();
        cbCategoria = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        spEjemplares = new javax.swing.JSpinner();
        btnCantidad = new javax.swing.JButton();
        btnEjemplares = new javax.swing.JButton();
        botones = new javax.swing.JPanel();
        agregar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(738, 460));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(738, 460));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Id:");

        txtId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtId.setPreferredSize(new java.awt.Dimension(64, 20));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnIdLib.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscarPres.png"))); // NOI18N
        btnIdLib.setBorder(null);
        btnIdLib.setBorderPainted(false);
        btnIdLib.setContentAreaFilled(false);
        btnIdLib.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIdLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdLibActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Título:");

        txtTitulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtTitulo.setPreferredSize(new java.awt.Dimension(64, 20));
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        btnTitulo.setBackground(new java.awt.Color(255, 204, 0));
        btnTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscarPres.png"))); // NOI18N
        btnTitulo.setBorder(null);
        btnTitulo.setContentAreaFilled(false);
        btnTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTitulo.setDefaultCapable(false);
        btnTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTituloActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Autor:");

        txtAutor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtAutor.setPreferredSize(new java.awt.Dimension(64, 20));

        btnAutor.setBackground(new java.awt.Color(255, 204, 0));
        btnAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscarPres.png"))); // NOI18N
        btnAutor.setBorder(null);
        btnAutor.setContentAreaFilled(false);
        btnAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAutor.setDefaultCapable(false);
        btnAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Editorial:");

        txtEditorial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtEditorial.setPreferredSize(new java.awt.Dimension(64, 20));

        btnEditorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscarPres.png"))); // NOI18N
        btnEditorial.setBorder(null);
        btnEditorial.setBorderPainted(false);
        btnEditorial.setContentAreaFilled(false);
        btnEditorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditorialActionPerformed(evt);
            }
        });

        tabla_libros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tabla_libros.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {},
                        {},
                        {},
                        {}
                },
                new String[]{

                }
        ));
        tabla_libros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_librosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_libros);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Categoría:");

        btnCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscarPres.png"))); // NOI18N
        btnCategoria.setBorder(null);
        btnCategoria.setBorderPainted(false);
        btnCategoria.setContentAreaFilled(false);
        btnCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Cantidad:");

        spCantidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        spCantidad.setPreferredSize(new java.awt.Dimension(64, 20));

        cbCategoria.setForeground(new java.awt.Color(102, 102, 102));
        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Categoría", "Literatura", "Consulta y referencia", "Artísticos e ilustrados", "Divulgativos", "Libros de texto"}));
        cbCategoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cbCategoria.setMinimumSize(new java.awt.Dimension(146, 20));
        cbCategoria.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Ejemplares:");

        spEjemplares.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        spEjemplares.setPreferredSize(new java.awt.Dimension(64, 20));

        btnCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscarPres.png"))); // NOI18N
        btnCantidad.setBorder(null);
        btnCantidad.setBorderPainted(false);
        btnCantidad.setContentAreaFilled(false);
        btnCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantidadActionPerformed(evt);
            }
        });

        btnEjemplares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscarPres.png"))); // NOI18N
        btnEjemplares.setBorderPainted(false);
        btnEjemplares.setContentAreaFilled(false);
        btnEjemplares.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEjemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjemplaresActionPerformed(evt);
            }
        });

        botones.setBackground(new java.awt.Color(255, 255, 255));

        agregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar .png"))); // NOI18N
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
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar .png"))); // NOI18N
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
                                                    .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGap(25, 25, 25)
                                                    .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGap(26, 26, 26)
                                                    .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        );
        botonesLayout.setVerticalGroup(
                botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addGroup(botonesLayout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                           .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                           .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                           .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addContainerGap())
                                      );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(22, 22, 22)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                           .addComponent(jScrollPane2)
                                                                           .addComponent(botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                           .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                         .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                       .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                                       .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                              .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                                                              .addGap(3, 3, 3)))
                                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                                                                                                         .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                .addGap(254, 254, 254))
                                                                                                                         .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                .addGap(232, 232, 232))
                                                                                                                         .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                .addGap(274, 274, 274))
                                                                                                                         .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                       .addComponent(txtAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                                       .addComponent(txtEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                                       .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                                                                                .addGap(15, 15, 15)))
                                                                                                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                         .addComponent(btnIdLib, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                         .addComponent(btnEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                         .addComponent(btnAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                         .addComponent(btnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                  .addGap(34, 34, 34)
                                                                                                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                         .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                       .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                              .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                                                              .addGap(170, 170, 170))
                                                                                                                                                                       .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                              .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                                                              .addGap(154, 154, 154))
                                                                                                                                                                       .addComponent(spCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                                       .addComponent(cbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                                       .addComponent(spEjemplares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                                                                                .addGap(3, 3, 3))
                                                                                                                         .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                .addGap(164, 164, 164)))
                                                                                                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                         .addComponent(btnCategoria)
                                                                                                                         .addComponent(btnCantidad)
                                                                                                                         .addComponent(btnEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addGap(35, 35, 35))
                                        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(32, 32, 32)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                           .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                         .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addComponent(jLabel1)
                                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                         .addComponent(btnIdLib))
                                                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                         .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addComponent(jLabel3)
                                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                         .addComponent(btnTitulo))
                                                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                         .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addComponent(jLabel4)
                                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                         .addComponent(btnAutor))
                                                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                         .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addComponent(jLabel2)
                                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                         .addComponent(btnEditorial)))
                                                                           .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                  .addGap(31, 31, 31)
                                                                                                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                         .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                       .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                              .addComponent(jLabel5)
                                                                                                                                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                                              .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                       .addComponent(btnCategoria))
                                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                .addComponent(jLabel6)
                                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                         .addComponent(btnCantidad))
                                                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                         .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                                                .addComponent(jLabel7)
                                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                .addComponent(spEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                         .addComponent(btnEjemplares))))
                                                    .addGap(18, 18, 18)
                                                    .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                                    .addGap(33, 33, 33))
                                      );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                 );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                               );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIdLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdLibActionPerformed
        Libros BIL = new Libros();
        BIL.BuscarIdLibro(txtId, tabla_libros);
        BIL.Limpiar(txtId, txtTitulo, txtAutor, txtEditorial, cbCategoria, spCantidad, spEjemplares);
    }//GEN-LAST:event_btnIdLibActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed

    }//GEN-LAST:event_txtTituloActionPerformed

    private void btnTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTituloActionPerformed
        Libros BTL = new Libros();
        BTL.BuscarTitulo(txtTitulo, tabla_libros);
        BTL.Limpiar(txtId, txtTitulo, txtAutor, txtEditorial, cbCategoria, spCantidad, spEjemplares);
    }//GEN-LAST:event_btnTituloActionPerformed

    private void btnAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorActionPerformed
        Libros BAL = new Libros();
        BAL.BuscarAutor(txtAutor, tabla_libros);
        BAL.Limpiar(txtId, txtTitulo, txtAutor, txtEditorial, cbCategoria, spCantidad, spEjemplares);
    }//GEN-LAST:event_btnAutorActionPerformed

    private void btnEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditorialActionPerformed
        Libros BEL = new Libros();
        BEL.BuscarEditorial(txtEditorial, tabla_libros);
        BEL.Limpiar(txtId, txtTitulo, txtAutor, txtEditorial, cbCategoria, spCantidad, spEjemplares);
    }//GEN-LAST:event_btnEditorialActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        Libros BCL = new Libros();
        BCL.BuscarCategoria(cbCategoria, tabla_libros);
        BCL.Limpiar(txtId, txtTitulo, txtAutor, txtEditorial, cbCategoria, spCantidad, spEjemplares);
    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        Libros NL = new Libros();
        NL.agregarLibro(txtTitulo, txtAutor, txtEditorial, cbCategoria, spCantidad, spEjemplares);
        NL.mostrar(tabla_libros);
        NL.Limpiar(txtId, txtTitulo, txtAutor, txtEditorial, cbCategoria, spCantidad, spEjemplares);
    }//GEN-LAST:event_agregarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        Libros ML = new Libros();
        ML.ModificarLibro(txtId, txtTitulo, txtAutor, txtEditorial, cbCategoria, spCantidad, spEjemplares);
        ML.mostrar(tabla_libros);
        ML.Limpiar(txtId, txtTitulo, txtAutor, txtEditorial, cbCategoria, spCantidad, spEjemplares);
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        Libros EL = new Libros();
        EL.EliminarLibro(txtId);
        EL.mostrar(tabla_libros);
        EL.Limpiar(txtId, txtTitulo, txtAutor, txtEditorial, cbCategoria, spCantidad, spEjemplares);
    }//GEN-LAST:event_eliminarActionPerformed

    private void btnCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantidadActionPerformed
        Libros BC = new Libros();
        BC.BuscarCantidad(spCantidad, tabla_libros);
        BC.Limpiar(txtId, txtTitulo, txtAutor, txtEditorial, cbCategoria, spCantidad, spEjemplares);
    }//GEN-LAST:event_btnCantidadActionPerformed

    private void btnEjemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjemplaresActionPerformed
        Libros BE = new Libros();
        BE.BuscarEjemplares(spEjemplares, tabla_libros);
        BE.Limpiar(txtId, txtTitulo, txtAutor, txtEditorial, cbCategoria, spCantidad, spEjemplares);
    }//GEN-LAST:event_btnEjemplaresActionPerformed

    private void tabla_librosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_librosMouseClicked
        Libros evento = new Libros();
        evento.SeleccionarLibro(tabla_libros, txtId, txtTitulo, txtAutor, txtEditorial, cbCategoria, spCantidad, spEjemplares);
    }//GEN-LAST:event_tabla_librosMouseClicked
    // End of variables declaration//GEN-END:variables
}
