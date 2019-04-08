/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

import static puntodeventa.Principal.contenedor;

/**
 *
 * @author Gamaliel Bernal
 */
public class Menus extends javax.swing.JPanel {
    
    public Menus() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JLabel();
        ventas = new javax.swing.JLabel();
        etqVentas = new javax.swing.JLabel();
        compras = new javax.swing.JLabel();
        etqCompras = new javax.swing.JLabel();
        usuarios = new javax.swing.JLabel();
        etqUsuarios = new javax.swing.JLabel();
        etqRespaldar = new javax.swing.JLabel();
        proveedores = new javax.swing.JLabel();
        etqProveedores = new javax.swing.JLabel();
        productos = new javax.swing.JLabel();
        etqProductos = new javax.swing.JLabel();
        reportes = new javax.swing.JLabel();
        etqReportes = new javax.swing.JLabel();
        respaldo = new javax.swing.JLabel();
        etqSalida = new javax.swing.JLabel();

        setBackground(new java.awt.Color(40, 40, 40));
        setPreferredSize(new java.awt.Dimension(1366, 768));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salida.png"))); // NOI18N
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });

        ventas.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        ventas.setForeground(new java.awt.Color(255, 255, 255));
        ventas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ventas.png"))); // NOI18N
        ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ventasMouseClicked(evt);
            }
        });

        etqVentas.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        etqVentas.setForeground(new java.awt.Color(255, 255, 255));
        etqVentas.setText("VENTAS");

        compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/compras.png"))); // NOI18N
        compras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprasMouseClicked(evt);
            }
        });

        etqCompras.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        etqCompras.setForeground(new java.awt.Color(255, 255, 255));
        etqCompras.setText("COMPRAS");

        usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuarios.png"))); // NOI18N
        usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuariosMouseClicked(evt);
            }
        });

        etqUsuarios.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        etqUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        etqUsuarios.setText("USUARIOS");

        etqRespaldar.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        etqRespaldar.setForeground(new java.awt.Color(255, 255, 255));
        etqRespaldar.setText("RESPALDAR");

        proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/proveedores.png"))); // NOI18N
        proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proveedoresMouseClicked(evt);
            }
        });

        etqProveedores.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        etqProveedores.setForeground(new java.awt.Color(255, 255, 255));
        etqProveedores.setText("PROVEEDORES");

        productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/productos.png"))); // NOI18N
        productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productosMouseClicked(evt);
            }
        });

        etqProductos.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        etqProductos.setForeground(new java.awt.Color(255, 255, 255));
        etqProductos.setText("PRODUCTOS");

        reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/reportes.png"))); // NOI18N
        reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportesMouseClicked(evt);
            }
        });

        etqReportes.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        etqReportes.setForeground(new java.awt.Color(255, 255, 255));
        etqReportes.setText("REPORTES");

        respaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/respaldo.png"))); // NOI18N
        respaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                respaldoMouseClicked(evt);
            }
        });

        etqSalida.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        etqSalida.setForeground(new java.awt.Color(255, 255, 255));
        etqSalida.setText("SALIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(compras)
                            .addComponent(etqCompras)
                            .addComponent(productos)
                            .addComponent(etqProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqUsuarios)
                            .addComponent(usuarios)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(etqVentas)
                                .addComponent(ventas))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(respaldo))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqProveedores)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(proveedores))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etqReportes)
                                .addComponent(reportes))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(etqSalida))
                                .addComponent(salir))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etqRespaldar)
                        .addGap(15, 15, 15)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(ventas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(compras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqCompras)
                .addGap(18, 18, 18)
                .addComponent(productos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usuarios)
                .addGap(4, 4, 4)
                .addComponent(etqUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(respaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqRespaldar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proveedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqProveedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reportes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqReportes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(salir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqSalida)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    private void ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasMouseClicked
        Ventas c = new Ventas();
        contenedor.removeAll();
        contenedor.add(c);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_ventasMouseClicked

    private void comprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprasMouseClicked
        Compras c = new Compras();
        contenedor.removeAll();
        contenedor.add(c);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_comprasMouseClicked

    private void productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosMouseClicked
        Productos c = new Productos();
        contenedor.removeAll();
        contenedor.add(c);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_productosMouseClicked

    private void usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosMouseClicked
        Usuarios c = new Usuarios();
        contenedor.removeAll();
        contenedor.add(c);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_usuariosMouseClicked

    private void proveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedoresMouseClicked
        Proveedores c = new Proveedores();
        contenedor.removeAll();
        contenedor.add(c);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_proveedoresMouseClicked

    private void respaldoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_respaldoMouseClicked
        Respaldo c = new Respaldo();
        contenedor.removeAll();
        contenedor.add(c);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_respaldoMouseClicked

    private void reportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportesMouseClicked
        Reportes c = new Reportes();
        contenedor.removeAll();
        contenedor.add(c);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_reportesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel compras;
    private javax.swing.JLabel etqCompras;
    private javax.swing.JLabel etqProductos;
    private javax.swing.JLabel etqProveedores;
    private javax.swing.JLabel etqReportes;
    private javax.swing.JLabel etqRespaldar;
    private javax.swing.JLabel etqSalida;
    private javax.swing.JLabel etqUsuarios;
    private javax.swing.JLabel etqVentas;
    private javax.swing.JLabel productos;
    private javax.swing.JLabel proveedores;
    private javax.swing.JLabel reportes;
    private javax.swing.JLabel respaldo;
    private javax.swing.JLabel salir;
    private javax.swing.JLabel usuarios;
    private javax.swing.JLabel ventas;
    // End of variables declaration//GEN-END:variables
}
