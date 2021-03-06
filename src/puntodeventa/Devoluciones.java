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
public class Devoluciones extends javax.swing.JPanel {

    /**
     * Creates new form Devoluciones
     */
    public Devoluciones() {
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
        busqueda = new javax.swing.JTextField();
        lupa = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaContenido = new javax.swing.JTable();
        etqTotal = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        botonDevolver = new javax.swing.JButton();
        etqFolio = new javax.swing.JLabel();
        folio = new javax.swing.JLabel();
        etqCalendar = new javax.swing.JLabel();
        fechaDevolucion = new javax.swing.JLabel();

        setBackground(new java.awt.Color(1, 47, 83));

        titulo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 60)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Devoluciones");

        busqueda.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        busqueda.setText("Folio de la venta...");

        lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario2.png"))); // NOI18N

        userName.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setText("Nombre_usuario");

        tablaContenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cantidad", "Nombre", "Precio", "Presentación"
            }
        ));
        jScrollPane1.setViewportView(tablaContenido);

        etqTotal.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        etqTotal.setForeground(new java.awt.Color(255, 255, 255));
        etqTotal.setText("Total:");

        total.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setText("0.00");

        botonDevolver.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        botonDevolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/devoluciones.png"))); // NOI18N
        botonDevolver.setText("Devolver");
        botonDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDevolverActionPerformed(evt);
            }
        });

        etqFolio.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        etqFolio.setForeground(new java.awt.Color(255, 255, 255));
        etqFolio.setText("Folio:");

        folio.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        folio.setForeground(new java.awt.Color(255, 255, 255));
        folio.setText("000000");

        etqCalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/calendario.png"))); // NOI18N

        fechaDevolucion.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        fechaDevolucion.setForeground(new java.awt.Color(255, 255, 255));
        fechaDevolucion.setText("dd-mm-aaaa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lupa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titulo)
                        .addGap(128, 128, 128))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etqCalendar)
                            .addComponent(user))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(392, 392, 392)
                                .addComponent(etqFolio)
                                .addGap(18, 18, 18)
                                .addComponent(folio))
                            .addComponent(fechaDevolucion))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 241, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonDevolver)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etqTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(total))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(titulo)
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lupa))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etqFolio)
                                    .addComponent(folio)
                                    .addComponent(userName))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqCalendar)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(fechaDevolucion)
                                .addGap(13, 13, 13)))
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonDevolver)
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etqTotal)
                            .addComponent(total))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(180, 180, 180))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDevolverActionPerformed
        int opc = JOptionPane.showConfirmDialog(this, "¿Desea devolver estos productos?");
        if (opc == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this,"Productos devueltos con éxito");
        }else{
            
        }
    }//GEN-LAST:event_botonDevolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDevolver;
    private javax.swing.JTextField busqueda;
    private javax.swing.JLabel etqCalendar;
    private javax.swing.JLabel etqFolio;
    private javax.swing.JLabel etqTotal;
    private javax.swing.JLabel fechaDevolucion;
    private javax.swing.JLabel folio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lupa;
    private javax.swing.JTable tablaContenido;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel total;
    private javax.swing.JLabel user;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
