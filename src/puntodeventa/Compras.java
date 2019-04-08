/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

import javax.swing.JOptionPane;
import static puntodeventa.Principal.contenedor;

/**
 *
 * @author Gamaliel Bernal
 */
public class Compras extends javax.swing.JPanel {

    /**
     * Creates new form Compras
     */
    public Compras() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        eqtFolio = new javax.swing.JLabel();
        calendar = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        etqProducto = new javax.swing.JLabel();
        producto = new javax.swing.JTextField();
        etqCantidad = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        numeroVenta = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonFinalizar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        etqProveedor = new javax.swing.JLabel();
        opcionesProveedor = new javax.swing.JComboBox<>();
        etqTotal = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        etqPrecio = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        etqCaducidad = new javax.swing.JLabel();
        caducidad = new javax.swing.JLabel();
        etqCategoria = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox<>();
        etqPresentacion = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(1, 47, 83));
        setPreferredSize(new java.awt.Dimension(1366, 768));

        titulo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 60)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Compras");

        eqtFolio.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        eqtFolio.setForeground(new java.awt.Color(255, 255, 255));
        eqtFolio.setText("N° Compra");

        calendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/calendario.png"))); // NOI18N

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario2.png"))); // NOI18N

        userName.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setText("Nombre_usuario");

        etqProducto.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        etqProducto.setForeground(new java.awt.Color(255, 255, 255));
        etqProducto.setText("Producto:");

        producto.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        producto.setText("Buscar...");

        etqCantidad.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        etqCantidad.setForeground(new java.awt.Color(255, 255, 255));
        etqCantidad.setText("Cantidad:");

        cantidad.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        cantidad.setText("1");

        numeroVenta.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        numeroVenta.setForeground(new java.awt.Color(255, 255, 255));
        numeroVenta.setText("000000");

        botonAgregar.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/añadir.png"))); // NOI18N
        botonAgregar.setText("Agregar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cantidad", "Producto", "Subtotal", "Total", "Proveedor"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        botonFinalizar.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        botonFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/finalizar.png"))); // NOI18N
        botonFinalizar.setText("Finalizar");
        botonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinalizarActionPerformed(evt);
            }
        });

        botonCancelar.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        etqProveedor.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        etqProveedor.setForeground(new java.awt.Color(255, 255, 255));
        etqProveedor.setText("Proveedor:");

        opcionesProveedor.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        opcionesProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coca Cola", "Marinela", "Bimbo", "Gamesa", "Tia Rosa", "Duero", "Yoplait", "Fud", "Señor del queso" }));

        etqTotal.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        etqTotal.setForeground(new java.awt.Color(255, 255, 255));
        etqTotal.setText("Total:");

        total.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setText("000.00");

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("dd-mm-aaaa");

        jButton1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/devoluciones.png"))); // NOI18N
        jButton1.setText("Devoluciones");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        etqPrecio.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        etqPrecio.setForeground(new java.awt.Color(255, 255, 255));
        etqPrecio.setText("Precio:");

        precio.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        precio.setText("000.00");

        etqCaducidad.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        etqCaducidad.setForeground(new java.awt.Color(255, 255, 255));
        etqCaducidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/calendario.png"))); // NOI18N

        caducidad.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        caducidad.setForeground(new java.awt.Color(255, 255, 255));
        caducidad.setText("Caducidad");

        etqCategoria.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        etqCategoria.setForeground(new java.awt.Color(255, 255, 255));
        etqCategoria.setText("Categoria:");

        categoria.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Frutas y verduras", "Lácteos", "Enlatados", "Golosinas", "Tianguis", "Casero" }));

        etqPresentacion.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        etqPresentacion.setForeground(new java.awt.Color(255, 255, 255));
        etqPresentacion.setText("Presentación: ");

        jComboBox1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Litro", "Kilo", "Gramo" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userName))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calendar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(eqtFolio)
                        .addGap(41, 41, 41)
                        .addComponent(numeroVenta)
                        .addGap(238, 238, 238))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(titulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(etqProducto)
                        .addGap(46, 46, 46)
                        .addComponent(producto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etqPrecio)
                                .addGap(32, 32, 32)
                                .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etqCantidad)
                                .addGap(32, 32, 32)
                                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botonFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(etqProveedor)
                                            .addGap(32, 32, 32)
                                            .addComponent(opcionesProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(etqCategoria)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etqPresentacion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addComponent(etqCaducidad)
                                .addGap(18, 18, 18)
                                .addComponent(caducidad)
                                .addGap(0, 69, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(etqTotal)
                        .addGap(18, 18, 18)
                        .addComponent(total))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eqtFolio)
                            .addComponent(numeroVenta)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(userName)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(calendar)
                            .addComponent(jLabel1))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etqProducto)
                            .addComponent(producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqCantidad)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etqCategoria)
                            .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqPrecio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(etqPresentacion)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(etqCaducidad)
                            .addComponent(caducidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etqProveedor)
                            .addComponent(opcionesProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total)
                            .addComponent(etqTotal))
                        .addGap(101, 101, 101))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Devoluciones c = new Devoluciones();
        contenedor.removeAll();
        contenedor.add(c);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinalizarActionPerformed
        int opc = JOptionPane.showConfirmDialog(this, "¿Desea finalizar la compra?");
        if (opc == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this,"Compra realizada con éxito");
        }else{
            
        }
    }//GEN-LAST:event_botonFinalizarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        int opc = JOptionPane.showConfirmDialog(this, "¿Desea cancelar la compra?");
        if (opc == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this,"Compra cancelada con éxito");
        }else{
            
        }
    }//GEN-LAST:event_botonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonFinalizar;
    private javax.swing.JLabel caducidad;
    private javax.swing.JLabel calendar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JLabel eqtFolio;
    private javax.swing.JLabel etqCaducidad;
    private javax.swing.JLabel etqCantidad;
    private javax.swing.JLabel etqCategoria;
    private javax.swing.JLabel etqPrecio;
    private javax.swing.JLabel etqPresentacion;
    private javax.swing.JLabel etqProducto;
    private javax.swing.JLabel etqProveedor;
    private javax.swing.JLabel etqTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel numeroVenta;
    private javax.swing.JComboBox<String> opcionesProveedor;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField producto;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel total;
    private javax.swing.JLabel user;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}