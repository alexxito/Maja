/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Carmen, Se quitó email temporalmente, hasta modificación de la BD
 */
public class Proveedores extends javax.swing.JPanel {

    /**
     * Creates new form Proveedores
     */
    Calendario cal = new Calendario();
    ProveedoresBD pb = new ProveedoresBD();

    public Proveedores() {
        initComponents();
        pb.consultarProveedor(jTable1);
        TelefonoProveedor.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (!Character.isDigit(e.getKeyChar()) || TelefonoProveedor.getText().length() > 10) {
                    e.consume();
                    getToolkit().beep();
                }
            }
        });
        fechaNacimientoProveedor.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (fechaNacimientoProveedor.getText().length() >= 10) {
                    e.consume();
                    getToolkit().beep();
                }
            }
        });
        nombreProveedor.setEnabled(false);
        ApellidoPaternoProveedor.setEnabled(false);
        ApellidoMaternoProveedor.setEnabled(false);
        TelefonoProveedor.setEnabled(false);
        fechaNacimientoProveedor.setEnabled(false);
        mf.setEnabled(false);
        empresasCombo.setEnabled(false);
        campoNomEmp.setEnabled(false);
        descripEmpre.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscar = new javax.swing.JTextField();
        lupa = new javax.swing.JLabel();
        addProveedor = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        editarProveedor = new javax.swing.JButton();
        etqnombre = new javax.swing.JLabel();
        nombreProveedor = new javax.swing.JTextField();
        apellidoP = new javax.swing.JLabel();
        ApellidoPaternoProveedor = new javax.swing.JTextField();
        apellidoM = new javax.swing.JLabel();
        ApellidoMaternoProveedor = new javax.swing.JTextField();
        tele = new javax.swing.JLabel();
        mf = new javax.swing.JComboBox<>();
        sexo = new javax.swing.JLabel();
        TelefonoProveedor = new javax.swing.JTextField();
        fechaNac = new javax.swing.JLabel();
        fechaNacimientoProveedor = new javax.swing.JTextField();
        GuardarProveedor = new javax.swing.JButton();
        eliminarProveedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        calendarioProveedor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        empresasCombo = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        agregarEmpButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoNomEmp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripEmpre = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(1, 47, 83));
        setPreferredSize(new java.awt.Dimension(1365, 765));

        buscar.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N
        buscar.setText("ßuscar....");
        buscar.setToolTipText("");
        buscar.setCaretColor(new java.awt.Color(0, 0, 153));
        buscar.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                buscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                buscarFocusLost(evt);
            }
        });
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        addProveedor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        addProveedor.setForeground(new java.awt.Color(0, 0, 0));
        addProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/añadir.png"))); // NOI18N
        addProveedor.setText(" Agregar Proveedor");
        addProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProveedorActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 60)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Proveedores");

        editarProveedor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        editarProveedor.setForeground(new java.awt.Color(0, 0, 0));
        editarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        editarProveedor.setText("Editar Proveedor");
        editarProveedor.setMaximumSize(new java.awt.Dimension(231, 61));
        editarProveedor.setMinimumSize(new java.awt.Dimension(231, 61));
        editarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarProveedorActionPerformed(evt);
            }
        });

        etqnombre.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N
        etqnombre.setForeground(new java.awt.Color(255, 255, 255));
        etqnombre.setText("Nombre: ");

        nombreProveedor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N

        apellidoP.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N
        apellidoP.setForeground(new java.awt.Color(255, 255, 255));
        apellidoP.setText("Apellido P: ");

        ApellidoPaternoProveedor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N

        apellidoM.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N
        apellidoM.setForeground(new java.awt.Color(255, 255, 255));
        apellidoM.setText("Apellido M: ");

        ApellidoMaternoProveedor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N

        tele.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N
        tele.setForeground(new java.awt.Color(255, 255, 255));
        tele.setText("Teléfono:");

        mf.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N
        mf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        mf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mfActionPerformed(evt);
            }
        });

        sexo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N
        sexo.setForeground(new java.awt.Color(255, 255, 255));
        sexo.setText("Sexo:");

        TelefonoProveedor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N

        fechaNac.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N
        fechaNac.setForeground(new java.awt.Color(255, 255, 255));
        fechaNac.setText("F. Nacimiento:");

        fechaNacimientoProveedor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N

        GuardarProveedor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 19)); // NOI18N
        GuardarProveedor.setForeground(new java.awt.Color(0, 0, 0));
        GuardarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        GuardarProveedor.setText("Guardar");
        GuardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarProveedorActionPerformed(evt);
            }
        });

        eliminarProveedor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 19)); // NOI18N
        eliminarProveedor.setForeground(new java.awt.Color(0, 0, 0));
        eliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/borrar.png"))); // NOI18N
        eliminarProveedor.setText("Eliminar");
        eliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProveedorActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido Paterno", "Apellido Materno", "Sexo", "Telefono", "Fecha Nacimiento", "Empresa"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        calendarioProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/calendario.png"))); // NOI18N
        calendarioProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calendarioProveedorMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Empresa:");

        empresasCombo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N
        empresasCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marinela", "Rocolino", "Item 3", "Item 4" }));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        agregarEmpButton.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        agregarEmpButton.setForeground(new java.awt.Color(0, 0, 0));
        agregarEmpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/añadir.png"))); // NOI18N
        agregarEmpButton.setText("Agregar Empresa");
        agregarEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEmpButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        campoNomEmp.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripción:");

        descripEmpre.setColumns(20);
        descripEmpre.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17)); // NOI18N
        descripEmpre.setRows(5);
        jScrollPane2.setViewportView(descripEmpre);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(240, 240, 240))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoNomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(337, 337, 337)
                                        .addComponent(GuardarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(96, 96, 96)
                                        .addComponent(eliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(apellidoP)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(94, 94, 94)
                                                .addComponent(empresasCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(ApellidoPaternoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(etqnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(apellidoM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(tele, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(sexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(fechaNac))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(33, 33, 33)
                                                            .addComponent(fechaNacimientoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(calendarioProveedor))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(106, 106, 106)
                                                            .addComponent(nombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(mf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(ApellidoMaternoProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(TelefonoProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addProveedor)
                                        .addGap(79, 79, 79)
                                        .addComponent(editarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(agregarEmpButton)
                                    .addComponent(jSeparator1))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(lupa)))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ApellidoMaternoProveedor, ApellidoPaternoProveedor, TelefonoProveedor, fechaNacimientoProveedor, nombreProveedor});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lupa)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApellidoPaternoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(apellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApellidoMaternoProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tele, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(empresasCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fechaNacimientoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(calendarioProveedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(addProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregarEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarProveedor)
                    .addComponent(eliminarProveedor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ApellidoMaternoProveedor, ApellidoPaternoProveedor, TelefonoProveedor, fechaNacimientoProveedor, nombreProveedor});

    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        try {
            pb.consultaIndvi(buscar.getText(), jTable1);
            if (buscar.getText().equals("")) {
                pb.consultarProveedor(jTable1);
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void buscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarFocusGained
        if (buscar.getText().equals("ßuscar....")) {
            buscar.setText("");
        }

    }//GEN-LAST:event_buscarFocusGained

    private void buscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarFocusLost
        if (buscar.getText().equals("")) {
            buscar.setText("ßuscar....");
        }
    }//GEN-LAST:event_buscarFocusLost

    private void addProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProveedorActionPerformed
        // TODO add your handling code here:
        nombreProveedor.setEnabled(true);
        ApellidoMaternoProveedor.setEnabled(true);
        ApellidoPaternoProveedor.setEnabled(true);
        fechaNacimientoProveedor.setEnabled(true);
        TelefonoProveedor.setEnabled(true);
        mf.setEnabled(true);
        empresasCombo.setEnabled(true);
    }//GEN-LAST:event_addProveedorActionPerformed

    private void mfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mfActionPerformed

    private void GuardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarProveedorActionPerformed
        int opc = JOptionPane.showConfirmDialog(this, "¿Desea guardar todos los cambios?");
        pb.setNombre(nombreProveedor.getText());
        pb.setApellido_p(ApellidoPaternoProveedor.getText());
        pb.setApellido_m(ApellidoMaternoProveedor.getText());
        pb.setTelefono(TelefonoProveedor.getText());
        pb.setEmpresa(empresasCombo.getSelectedItem().toString());
        pb.setFecha(fechaNacimientoProveedor.getText());
        pb.setSexo(mf.getSelectedItem().toString().charAt(0));
        try {
            if (jTable1.getSelectedRow() == -1 & campoNomEmp.isEnabled()==false) {
                if (opc == JOptionPane.YES_OPTION) {
                    pb.agregarProveedor();
                    nombreProveedor.setText("");
                    ApellidoPaternoProveedor.setText("");
                    ApellidoMaternoProveedor.setText("");
                    TelefonoProveedor.setText("");
                    fechaNacimientoProveedor.setText("");
                    JOptionPane.showMessageDialog(this, "Cambios guardados con éxito.");
                    pb.consultarProveedor(jTable1);
                } else {
                }
            } else if (campoNomEmp.isEnabled() & jTable1.getSelectedRow() == -1) {
                if (opc == JOptionPane.YES_OPTION) {
                    pb.setEmpresa(campoNomEmp.getText());
                    pb.setDescrip(descripEmpre.getText());
                    campoNomEmp.setText("");
                    descripEmpre.setText("");
                    pb.agregarEmpresa();
                } else {
                }
            } else {
                if (opc == JOptionPane.YES_OPTION) {
                    pb.editarProveedor();
                    pb.consultarProveedor(jTable1);
                }
            }
        } catch (SQLException e) {
        }

    }//GEN-LAST:event_GuardarProveedorActionPerformed

    private void eliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProveedorActionPerformed
        int opc = JOptionPane.showConfirmDialog(this, "¿Desea eliminar al proveedor?");
        try {
            if (opc == JOptionPane.YES_OPTION) {
                pb.eliminarProveedor();
                pb.consultarProveedor(jTable1);
                JOptionPane.showMessageDialog(this, "Proveedor borrado con éxito.");
            } else {
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_eliminarProveedorActionPerformed

    private void calendarioProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioProveedorMouseClicked
        // TODO add your handling code here:
        cal.setVisible(true);
    }//GEN-LAST:event_calendarioProveedorMouseClicked

    private void agregarEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEmpButtonActionPerformed
        // TODO add your handling code here:
        campoNomEmp.setEnabled(true);
        descripEmpre.setEnabled(true);
    }//GEN-LAST:event_agregarEmpButtonActionPerformed

    private void editarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarProveedorActionPerformed
        // TODO add your handling code here:
        nombreProveedor.setEnabled(true);
        ApellidoPaternoProveedor.setEnabled(true);
        ApellidoMaternoProveedor.setEnabled(true);
        mf.setEnabled(true);
        empresasCombo.setEnabled(true);
        TelefonoProveedor.setEnabled(true);
        fechaNacimientoProveedor.setEnabled(true);
    }//GEN-LAST:event_editarProveedorActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        pb.setId_proveedor(jTable1.getValueAt(row, 0).toString());
        nombreProveedor.setText(jTable1.getValueAt(row, 1).toString());
        ApellidoPaternoProveedor.setText(jTable1.getValueAt(row, 2).toString());
        ApellidoMaternoProveedor.setText(jTable1.getValueAt(row, 3).toString());
        if (jTable1.getValueAt(row, 4).toString().equals("F")) {
            mf.setSelectedIndex(0);
        } else {
            mf.setSelectedIndex(1);
        }
        TelefonoProveedor.setText(jTable1.getValueAt(row, 5).toString());
        fechaNacimientoProveedor.setText(jTable1.getValueAt(row, 6).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoMaternoProveedor;
    private javax.swing.JTextField ApellidoPaternoProveedor;
    private javax.swing.JButton GuardarProveedor;
    private javax.swing.JTextField TelefonoProveedor;
    private javax.swing.JButton addProveedor;
    private javax.swing.JButton agregarEmpButton;
    private javax.swing.JLabel apellidoM;
    private javax.swing.JLabel apellidoP;
    private javax.swing.JTextField buscar;
    private javax.swing.JLabel calendarioProveedor;
    private javax.swing.JTextField campoNomEmp;
    private javax.swing.JTextArea descripEmpre;
    private javax.swing.JButton editarProveedor;
    private javax.swing.JButton eliminarProveedor;
    private javax.swing.JComboBox<String> empresasCombo;
    private javax.swing.JLabel etqnombre;
    private javax.swing.JLabel fechaNac;
    private javax.swing.JTextField fechaNacimientoProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lupa;
    private javax.swing.JComboBox<String> mf;
    private javax.swing.JTextField nombreProveedor;
    private javax.swing.JLabel sexo;
    private javax.swing.JLabel tele;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
