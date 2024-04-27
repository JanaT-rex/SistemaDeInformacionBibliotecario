
package Interfaz;

import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;





public class All_Modulos extends javax.swing.JFrame {


    public All_Modulos() {
        
        initComponents();
        bienvenida();
        InitStyles();
   LocalDate now = LocalDate.now();
int year = now.getYear();
int diaSemana = now.getDayOfWeek().getValue(); 
int dia = now.getDayOfMonth();
int month = now.getMonthValue();
String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
String[] semana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
fechalbl.setText(semana[diaSemana - 1] + " " + dia + " de " + meses[month - 1] + " de " + year);       
}
  
      private void InitStyles() {
  FlatCyanLightIJTheme.setup();
    }
    

   

    @SuppressWarnings("unchecked")
   public void bienvenida (){
         Interfaz.bienvenida B= new Interfaz.bienvenida();
        B.setSize(738, 450);
        B.setLocation(0,0);
        
       ventanas.removeAll();
        ventanas.add(B, BorderLayout.CENTER);
        ventanas.revalidate();
        ventanas.repaint();
   }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        btnUsuarios = new javax.swing.JButton();
        btnPrestamos = new javax.swing.JButton();
        btnLibros = new javax.swing.JButton();
        btnLectores = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnRegistros = new javax.swing.JButton();
        cabecera = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fechalbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ventanas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1020, 640));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMinimumSize(new java.awt.Dimension(1020, 640));

        menu.setBackground(new java.awt.Color(32, 45, 148));
        menu.setMinimumSize(new java.awt.Dimension(270, 640));
        menu.setPreferredSize(new java.awt.Dimension(270, 640));

        btnUsuarios.setBackground(new java.awt.Color(32, 45, 148));
        btnUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuarios.png"))); // NOI18N
        btnUsuarios.setText("  Usuarios");
        btnUsuarios.setToolTipText("");
        btnUsuarios.setBorder(null);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setFocusPainted(false);
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUsuarios.setPreferredSize(new java.awt.Dimension(240, 90));
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnUsuarios.setBackground(Color.decode("#000066")); // Nuevo color cuando el mouse pasa por encima
            }
            public void mouseExited(MouseEvent e) {
                btnUsuarios.setBackground(Color.decode("#202D94")); // Restaurar color de fondo predeterminado cuando el mouse sale
            }
        });

        btnPrestamos.setBackground(new java.awt.Color(32, 45, 148));
        btnPrestamos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPrestamos.setForeground(new java.awt.Color(255, 255, 255));
        btnPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prestamos.png"))); // NOI18N
        btnPrestamos.setText("   Prestamos");
        btnPrestamos.setBorder(null);
        btnPrestamos.setBorderPainted(false);
        btnPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrestamos.setFocusPainted(false);
        btnPrestamos.setHideActionText(true);
        btnPrestamos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPrestamos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPrestamos.setPreferredSize(new java.awt.Dimension(240, 90));
        btnPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrestamosMouseClicked(evt);
            }
        });
        btnPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamosActionPerformed(evt);
            }
        });
        btnPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnPrestamos.setBackground(Color.decode("#000066")); // Nuevo color cuando el mouse pasa por encima
            }
            public void mouseExited(MouseEvent e) {
                btnPrestamos.setBackground(Color.decode("#202D94")); // Restaurar color de fondo predeterminado cuando el mouse sale
            }
        });

        btnLibros.setBackground(new java.awt.Color(32, 45, 148));
        btnLibros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLibros.setForeground(new java.awt.Color(255, 255, 255));
        btnLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/libros.png"))); // NOI18N
        btnLibros.setText("  Libros");
        btnLibros.setBorder(null);
        btnLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLibros.setFocusPainted(false);
        btnLibros.setHideActionText(true);
        btnLibros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLibros.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLibros.setPreferredSize(new java.awt.Dimension(240, 90));
        btnLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosActionPerformed(evt);
            }
        });
        btnLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnLibros.setBackground(Color.decode("#000066")); // Nuevo color cuando el mouse pasa por encima
            }
            public void mouseExited(MouseEvent e) {
                btnLibros.setBackground(Color.decode("#202D94")); // Restaurar color de fondo predeterminado cuando el mouse sale
            }
        });

        btnLectores.setBackground(new java.awt.Color(32, 45, 148));
        btnLectores.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLectores.setForeground(new java.awt.Color(255, 255, 255));
        btnLectores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lector.png"))); // NOI18N
        btnLectores.setText("  Lectores");
        btnLectores.setBorder(null);
        btnLectores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLectores.setFocusPainted(false);
        btnLectores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLectores.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLectores.setPreferredSize(new java.awt.Dimension(240, 90));
        btnLectores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLectoresActionPerformed(evt);
            }
        });
        btnLectores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnLectores.setBackground(Color.decode("#000066")); // Nuevo color cuando el mouse pasa por encima
            }
            public void mouseExited(MouseEvent e) {
                btnLectores.setBackground(Color.decode("#202D94")); // Restaurar color de fondo predeterminado cuando el mouse sale
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 51, 153));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("David Alfaro Siqueiros");
        jLabel2.setToolTipText("");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(240, 3));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edomex.png"))); // NOI18N

        btnRegistros.setBackground(new java.awt.Color(32, 45, 148));
        btnRegistros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistros.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registroBiblio.png"))); // NOI18N
        btnRegistros.setText("Registros");
        btnRegistros.setBorder(null);
        btnRegistros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistros.setDefaultCapable(false);
        btnRegistros.setFocusPainted(false);
        btnRegistros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistros.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRegistros.setPreferredSize(new java.awt.Dimension(240, 90));
        btnRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrosActionPerformed(evt);
            }
        });
        btnRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnRegistros.setBackground(Color.decode("#000066")); // Nuevo color cuando el mouse pasa por encima
            }
            public void mouseExited(MouseEvent e) {
                btnRegistros.setBackground(Color.decode("#202D94")); // Restaurar color de fondo predeterminado cuando el mouse sale
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(menuLayout.createSequentialGroup()
                                    .addGap(90, 90, 90)
                                    .addComponent(jLabel5))
                                .addGroup(menuLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel2))
                                .addGroup(menuLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(menuLayout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(btnLectores, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnLectores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        cabecera.setBackground(new java.awt.Color(255, 204, 51));
        cabecera.setPreferredSize(new java.awt.Dimension(738, 150));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/biblioteca.png"))); // NOI18N
        jLabel4.setText("BIBLIOTECA ESCOLAR    ");
        jLabel4.setAutoscrolls(true);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Prestamos \\ Lectores \\ Libros \\ Usuarios");
        jLabel6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jLabel6ComponentResized(evt);
            }
        });
        jLabel6.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jLabel6CaretPositionChange(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 204, 51));
        jLabel8.setText("ESPACIO");

        jLabel10.setForeground(new java.awt.Color(255, 204, 51));
        jLabel10.setText("ESPACIO");

        javax.swing.GroupLayout cabeceraLayout = new javax.swing.GroupLayout(cabecera);
        cabecera.setLayout(cabeceraLayout);
        cabeceraLayout.setHorizontalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabeceraLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(310, 310, 310))
            .addGroup(cabeceraLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        cabeceraLayout.setVerticalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabeceraLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(12, 12, 12))
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(738, 30));

        fechalbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fechalbl.setForeground(new java.awt.Color(255, 255, 255));
        fechalbl.setText(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechalbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(172, 172, 172))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechalbl)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ventanas.setBackground(new java.awt.Color(255, 255, 255));
        ventanas.setPreferredSize(new java.awt.Dimension(738, 460));
        ventanas.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                    .addComponent(cabecera, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                    .addComponent(ventanas, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(ventanas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
  Clases.conexion_bd con = new Clases.conexion_bd();
    String consulta = "SELECT * FROM usuarios WHERE contraseña = ?";
       try {
        String pass = JOptionPane.showInputDialog(null, "Introduzca la contraseña");
        PreparedStatement pst = con.establecerConexion().prepareStatement(consulta);
        pst.setString(1, pass);    
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {  
    Interfaz.P_usuarios P = new Interfaz.P_usuarios();
    P.setSize(738, 460);
    P.setLocation(0, 0);   
    ventanas.removeAll();
    ventanas.add(P, BorderLayout.CENTER);
    ventanas.revalidate();
    ventanas.repaint();
        } else {
            JOptionPane.showMessageDialog(null, "No es posible acceder.");
        }
} catch (SQLException e) {

    }

    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnLectoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLectoresActionPerformed
         Interfaz.P_lectores P= new Interfaz.P_lectores();
        P.setSize(738, 460);
        P.setLocation(0,0);
        
       ventanas.removeAll();
        ventanas.add(P, BorderLayout.CENTER);
        ventanas.revalidate();
        ventanas.repaint();
    }//GEN-LAST:event_btnLectoresActionPerformed

    private void btnPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamosActionPerformed
     Interfaz.P_prestamos P= new Interfaz.P_prestamos();
        P.setSize(738, 460);
        P.setLocation(0,0);
        
       ventanas.removeAll();
        ventanas.add(P, BorderLayout.CENTER);
        ventanas.revalidate();
        ventanas.repaint();
    }//GEN-LAST:event_btnPrestamosActionPerformed

    private void jLabel6CaretPositionChange(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLabel6CaretPositionChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6CaretPositionChange

    private void jLabel6ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel6ComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6ComponentResized

    private void btnLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosActionPerformed
       Interfaz.P_libros L= new Interfaz.P_libros();
        L.setSize(738, 460);
        L.setLocation(0,0);
        
       ventanas.removeAll();
        ventanas.add(L, BorderLayout.CENTER);
        ventanas.revalidate();
        ventanas.repaint();
    }//GEN-LAST:event_btnLibrosActionPerformed

    private void btnRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrosActionPerformed
      Clases.conexion_bd con = new Clases.conexion_bd();
    String consulta = "SELECT * FROM usuarios WHERE contraseña = ?";
       try {
        String pass = JOptionPane.showInputDialog(null, "Introduzca la contraseña");
        PreparedStatement pst = con.establecerConexion().prepareStatement(consulta);
        pst.setString(1, pass); 
        
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {  
     //   JOptionPane.showMessageDialog(null, "Contraseña correcta");
        Interfaz.P_registros L= new Interfaz.P_registros();
        L.setSize(738, 460);
        L.setLocation(0,0);
        
       ventanas.removeAll();
        ventanas.add(L, BorderLayout.CENTER);
        ventanas.revalidate();
        ventanas.repaint();
           } else {
          
            JOptionPane.showMessageDialog(null, "No es posible acceder.");
        }
} catch (SQLException e) {
 
    }


    }//GEN-LAST:event_btnRegistrosActionPerformed

    private void btnPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrestamosMouseClicked

        
            
    }//GEN-LAST:event_btnPrestamosMouseClicked

    public static void main(String args[]) {                        
    FlatCyanLightIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new All_Modulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnLectores;
    private javax.swing.JButton btnLibros;
    private javax.swing.JButton btnPrestamos;
    private javax.swing.JButton btnRegistros;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JPanel cabecera;
    private javax.swing.JLabel fechalbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel ventanas;
    // End of variables declaration//GEN-END:variables

    
 
}
