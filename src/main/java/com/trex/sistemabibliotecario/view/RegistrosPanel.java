
package com.trex.sistemabibliotecario.view;

import java.awt.BorderLayout;


public class RegistrosPanel extends javax.swing.JPanel {

    public RegistrosPanel() {
        initComponents();
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        background = new javax.swing.JPanel();
        botones1 = new javax.swing.JPanel();
        prestamos = new javax.swing.JButton();
        Aprestamos = new javax.swing.JButton();
        Adevoluciones = new javax.swing.JButton();
        contenido = new javax.swing.JPanel();

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

        botones1.setBackground(new java.awt.Color(255, 255, 255));
        botones1.setPreferredSize(new java.awt.Dimension(700, 44));

        prestamos.setBackground(new java.awt.Color(204, 224, 255));
        prestamos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        prestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reciente.png"))); // NOI18N
        prestamos.setText("Prestamos recientes");
        prestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prestamos.setPreferredSize(new java.awt.Dimension(160, 32));
        prestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamosActionPerformed(evt);
            }
        });

        Aprestamos.setBackground(new java.awt.Color(204, 224, 255));
        Aprestamos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Aprestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prestamosi.png"))); // NOI18N
        Aprestamos.setText("Actividad de prestamos");
        Aprestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aprestamos.setPreferredSize(new java.awt.Dimension(160, 32));
        Aprestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AprestamosActionPerformed(evt);
            }
        });

        Adevoluciones.setBackground(new java.awt.Color(204, 224, 255));
        Adevoluciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Adevoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regresar_1.png"))); // NOI18N
        Adevoluciones.setText("Actividad de devoluciones");
        Adevoluciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Adevoluciones.setPreferredSize(new java.awt.Dimension(160, 32));
        Adevoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdevolucionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botones1Layout = new javax.swing.GroupLayout(botones1);
        botones1.setLayout(botones1Layout);
        botones1Layout.setHorizontalGroup(
            botones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botones1Layout.createSequentialGroup()
                .addComponent(prestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Aprestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Adevoluciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        botones1Layout.setVerticalGroup(
            botones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botones1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aprestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Adevoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenido.setBackground(new java.awt.Color(255, 255, 255));
        contenido.setMinimumSize(new java.awt.Dimension(738, 400));
        contenido.setPreferredSize(new java.awt.Dimension(738, 400));
        contenido.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botones1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(contenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(botones1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void prestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamosActionPerformed

    CRUD_prestamos P= new CRUD_prestamos();
        P.setSize(738, 400);
        P.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(P, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_prestamosActionPerformed

    private void AprestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AprestamosActionPerformed
  ActividadPrestamosPanel P= new ActividadPrestamosPanel();
        P.setSize(738, 400);
        P.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(P, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_AprestamosActionPerformed

    private void AdevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdevolucionesActionPerformed
  ActividadDevolucionesPanel P= new ActividadDevolucionesPanel();
        P.setSize(738, 400);
        P.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(P, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();      
    }//GEN-LAST:event_AdevolucionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adevoluciones;
    private javax.swing.JButton Aprestamos;
    private javax.swing.JPanel background;
    private javax.swing.JPanel botones1;
    private javax.swing.JPanel contenido;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton prestamos;
    // End of variables declaration//GEN-END:variables
}
