package puntodeventa;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gamaliel Bernal
 */
public class Compras extends javax.swing.JPanel implements Runnable {

    /*
        * Declaración de variables globales.
     */
    private Reloj reloj;
    ComprasBD cmp = new ComprasBD();
    Calendario calend = new Calendario();
    int contador = 0, aumento = 0, id = 0, identificador, idCompra;
    private ArrayList<String> arr = new ArrayList();
    Connection conn = null;
    String fecha, fechaAyuda, descripcionProducto = "1", prov = "--";

    /*
        * Setters & Getters
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getProv() {
        return prov;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdCompra() {
        return idCompra;
    }

    /*
        * Constructor de la clase Compras.
     */
    public Compras(String nombre) throws SQLException, IOException {
        initComponents();
        reloj = new Reloj();

        borrar.setVisible(false);
        this.setSize(100, 100);
        Thread t = new Thread(this);
        t.start();
        fechaActual();
        getConn();
        botonFinalizar.setEnabled(true);
        setDescripcionProducto("1");
        userName.setText(nombre);

        try {
            String SQL = "SELECT id_cmp FROM compras";
            PreparedStatement numCompra = conn.prepareStatement(SQL);
            ResultSet res = numCompra.executeQuery();
            if (res.next()) {
                setIdCompra(Integer.parseInt(res.getString("id_cmp")));
                folioCompra.setText(getIdCompra() + "");
            }
        } catch (SQLException ex) {

        }

        arr = cmp.obtenerProveedores();
        if (!arr.isEmpty()) {
            for (int i = 0; i < arr.size(); i++) {
                proveedores.addItem(arr.get(i));
            }
        }
        cmp.consultaCompra(tablaProductos, total);
        total.setText("000.00");
        try {
            cmp.consultaProductosGen(tablaProductos);
        } catch (SQLException ex) {

        }
        presentacion.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!Character.isLetterOrDigit(e.getKeyChar()) & e.getKeyChar() != KeyEvent.VK_SPACE) {
                    e.consume();
                    getToolkit().beep();
                }
                if (Character.isLowerCase(e.getKeyChar())) {
                    e.setKeyChar(Character.toUpperCase(e.getKeyChar()));
                }
            }
        });
    }

    /*
        * Método para obtener la conexión con la base de datos.
     */
    public Connection getConn() {
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:8088/maja", "postgres", "123456");
            System.out.println(conn.isValid(3000) ? "Conexion correcta" : "Conexion fallida");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
        return conn;
    }

    /*
        * Método para establecer la hora actual del equipo.
     */
    public void fechaActual() {
        Calendar date = Calendar.getInstance();
        SimpleDateFormat dateformatter = new SimpleDateFormat("E dd/MM/yyyy");
        etqFecha.setText(dateformatter.format(date.getTime()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        eqtFolio = new javax.swing.JLabel();
        calendar = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        etqProducto = new javax.swing.JLabel();
        busqueda = new javax.swing.JTextField();
        etqCantidad = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        folioCompra = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCompras = new javax.swing.JTable();
        botonFinalizar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        etqTotal = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        etqFecha = new javax.swing.JLabel();
        etqPrecio = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        etqCaducidad = new javax.swing.JLabel();
        caducidad = new javax.swing.JLabel();
        etqCategoria = new javax.swing.JLabel();
        proveedores = new javax.swing.JComboBox<>();
        hora = new javax.swing.JLabel();
        borrar = new javax.swing.JButton();
        descripcion = new javax.swing.JButton();
        producto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        etqCambio = new javax.swing.JLabel();
        etqEfectivo = new javax.swing.JLabel();
        efectivo = new javax.swing.JLabel();
        cambio = new javax.swing.JLabel();
        etqPresentacion = new javax.swing.JLabel();
        presentacion = new javax.swing.JTextField();

        setBackground(new java.awt.Color(1, 47, 83));
        setPreferredSize(new java.awt.Dimension(1222, 768));

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
        userName.setText("admin");

        etqProducto.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        etqProducto.setForeground(new java.awt.Color(255, 255, 255));
        etqProducto.setText("Producto:");

        busqueda.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        busqueda.setText("Buscar...");
        busqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                busquedaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                busquedaFocusLost(evt);
            }
        });
        busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                busquedaKeyTyped(evt);
            }
        });

        etqCantidad.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        etqCantidad.setForeground(new java.awt.Color(255, 255, 255));
        etqCantidad.setText("Cantidad:");

        cantidad.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad.setText("1");
        cantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cantidadFocusGained(evt);
            }
        });
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });

        folioCompra.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        folioCompra.setForeground(new java.awt.Color(255, 255, 255));
        folioCompra.setText("0");

        botonAgregar.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/añadir.png"))); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        tablaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Identificador", "Nombre", "Descripción", "Cantidad", "Existencia", "Precio", "Caducidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaComprasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCompras);
        if (tablaCompras.getColumnModel().getColumnCount() > 0) {
            tablaCompras.getColumnModel().getColumn(0).setResizable(false);
            tablaCompras.getColumnModel().getColumn(1).setResizable(false);
            tablaCompras.getColumnModel().getColumn(2).setResizable(false);
            tablaCompras.getColumnModel().getColumn(3).setResizable(false);
            tablaCompras.getColumnModel().getColumn(4).setResizable(false);
            tablaCompras.getColumnModel().getColumn(5).setResizable(false);
            tablaCompras.getColumnModel().getColumn(6).setResizable(false);
        }

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

        etqTotal.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        etqTotal.setForeground(new java.awt.Color(255, 255, 255));
        etqTotal.setText("Total");

        total.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setText("000.00");

        etqFecha.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        etqFecha.setForeground(new java.awt.Color(255, 255, 255));
        etqFecha.setText("dd-mm-aaaa");

        etqPrecio.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        etqPrecio.setForeground(new java.awt.Color(255, 255, 255));
        etqPrecio.setText("Precio:");

        precio.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precio.setText("000.00");
        precio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                precioFocusGained(evt);
            }
        });
        precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioKeyTyped(evt);
            }
        });

        etqCaducidad.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        etqCaducidad.setForeground(new java.awt.Color(255, 255, 255));
        etqCaducidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/calendario.png"))); // NOI18N
        etqCaducidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etqCaducidadMouseClicked(evt);
            }
        });

        caducidad.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        caducidad.setForeground(new java.awt.Color(255, 255, 255));
        caducidad.setText("Caducidad");

        etqCategoria.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        etqCategoria.setForeground(new java.awt.Color(255, 255, 255));
        etqCategoria.setText("Proveedor");

        proveedores.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        proveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        hora.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        hora.setForeground(new java.awt.Color(255, 255, 255));
        hora.setText("00:00:00");

        borrar.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/borrar.png"))); // NOI18N
        borrar.setText("Borrar");
        borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                borrarMousePressed(evt);
            }
        });

        descripcion.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        descripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        descripcion.setText("Descripción");
        descripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                descripcionMousePressed(evt);
            }
        });

        producto.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        producto.setForeground(new java.awt.Color(255, 255, 255));
        producto.setText("Nombre producto");

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
                "Identificador", "Nombre", "Presentación", "Existencia", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaProductosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaProductos);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(0).setResizable(false);
            tablaProductos.getColumnModel().getColumn(1).setResizable(false);
            tablaProductos.getColumnModel().getColumn(2).setResizable(false);
            tablaProductos.getColumnModel().getColumn(3).setResizable(false);
        }

        etqCambio.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        etqCambio.setForeground(new java.awt.Color(255, 255, 255));
        etqCambio.setText("Cambio:");

        etqEfectivo.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        etqEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        etqEfectivo.setText("Efectivo: ");

        efectivo.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        efectivo.setForeground(new java.awt.Color(255, 255, 255));
        efectivo.setText("000.00");

        cambio.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        cambio.setForeground(new java.awt.Color(255, 255, 255));
        cambio.setText("000.00");

        etqPresentacion.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        etqPresentacion.setForeground(new java.awt.Color(255, 255, 255));
        etqPresentacion.setText("Presentación");

        presentacion.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        presentacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                presentacionFocusGained(evt);
            }
        });

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
                        .addComponent(etqFecha)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(titulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eqtFolio)
                        .addGap(41, 41, 41)
                        .addComponent(folioCompra)
                        .addGap(238, 238, 238))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etqCategoria)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(producto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(etqCaducidad)
                        .addGap(18, 18, 18)
                        .addComponent(caducidad))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqProducto))
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etqCantidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etqPrecio)
                                .addGap(32, 32, 32)
                                .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(botonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etqPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(presentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqCambio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(etqTotal))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(total)))
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
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
                            .addComponent(folioCompra)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(userName)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(calendar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(etqFecha)
                                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqCantidad)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqPrecio)
                            .addComponent(etqProducto)
                            .addComponent(producto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etqCaducidad)
                                .addComponent(caducidad))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(etqCategoria)
                                .addComponent(proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(botonFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(presentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etqPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cambio)
                            .addComponent(etqCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqEfectivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etqTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total)
                        .addGap(24, 24, 24))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinalizarActionPerformed
        int opc = JOptionPane.showConfirmDialog(this, "¿Desea finalizar la compra?");
        if (opc == JOptionPane.YES_OPTION) {

            try {
                String update = "UPDATE compras\n"
                        + "	SET "
                        + " cmp_efect = ?, "
                        + " cmp_tot = ? "
                        + "	WHERE id_cmp = '" + Integer.parseInt(folioCompra.getText()) + "';";
                PreparedStatement actualiza = conn.prepareStatement(update);
                String pago;
                boolean flag = false;
                Double efectivoD = 0.0;
                do {
                    pago = JOptionPane.showInputDialog(null, "Ingrese la cantidad pagada");
                    try {
                        efectivoD = Double.parseDouble(pago);
                        efectivo.setText(efectivoD + "");
                        Double vuelto = efectivoD - (Float.parseFloat(total.getText()));
                        cambio.setText(String.format("%.2f", vuelto));
                        flag = true;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Sólo puedes ingresar números y 1 punto.", "Error", JOptionPane.ERROR_MESSAGE);
                        flag = false;
                    }
                } while (!flag);
                actualiza.setDouble(1, Float.parseFloat(pago));
                actualiza.setDouble(2, (Float.parseFloat(total.getText())));
                actualiza.executeUpdate();
                JOptionPane.showMessageDialog(this, "Compra realizada con éxito");
                cmp.consultaCompra(tablaCompras, total);

                /*
                    * Limpieza de pantalla.
                    * Actualización.
                 */
                busqueda.setText("Buscar...");
                proveedores.setSelectedIndex(0);
                precio.setText("000.00");
                cantidad.setText("1");
                total.setText("000.00");
                calend.setVisible(false);
                cambio.setText("000.00");
                efectivo.setText("000.00");
                caducidad.setText("Caducidad");
                botonFinalizar.setEnabled(false);
                presentacion.setText("600ml/1kg");
                contador = 0;
                etqCaducidad.setIcon(new ImageIcon(getClass().getResource("/iconos/calendario.png")));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en la actualización \n" + e);
            }
            /*
                * Actualización del folio de compra.
             */
            int cont = Integer.parseInt(folioCompra.getText());
            cont = cont + 1;
            folioCompra.setText(cont + "");
        } else {

        }
    }//GEN-LAST:event_botonFinalizarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        int opc = JOptionPane.showConfirmDialog(this, "¿Desea cancelar la compra?");
        if (opc == JOptionPane.YES_OPTION) {

            String cancelar = "DELETE FROM productosdecompras\n"
                    + "	WHERE id_cmp = '" + folioCompra.getText() + "';";
            try {
                PreparedStatement cancela = conn.prepareStatement(cancelar);
                cancela.executeUpdate();

                String compra = "DELETE FROM compras\n"
                        + "	WHERE id_cmp = '" + folioCompra.getText() + "';";
                PreparedStatement cancelaCompra = conn.prepareStatement(compra);
                cancelaCompra.executeUpdate();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en la cancelación\n" + ex);
            }
            botonFinalizar.setEnabled(false);
            busqueda.setText("Buscar...");
            proveedores.setSelectedIndex(0);
            precio.setText("000.00");
            cantidad.setText("1");
            caducidad.setText("Caducidad");
            total.setText("000.00");
            presentacion.setText("600ml/1kg");
            calend.setVisible(false);
            contador = 0;
            etqCaducidad.setIcon(new ImageIcon(getClass().getResource("/iconos/calendario.png")));
            tablaCompras.setModel(new DefaultTableModel());
            try {
                cmp.consultaCompra(tablaCompras, total);
            } catch (IOException e) {
            }
            
            JOptionPane.showMessageDialog(this, "Compra cancelada con éxito");
        } else {

        }
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_cantidadKeyTyped

    private void precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < '.' || car > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_precioKeyTyped

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        if ((!proveedores.getSelectedItem().equals("--"))
                && (!precio.getText().equals("000.00"))
                && (!presentacion.getText().equals(""))
                && (!caducidad.getText().equals("Caducidad"))) {

            if (cantidad.getText().equals("0")) {
                JOptionPane.showMessageDialog(null, "La cantidad no puede ser 0", "Formulario de compras", HEIGHT);
            } else {
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                int opc = JOptionPane.showConfirmDialog(this, "¿Desea agregar este producto a la compra?");
                if (opc == JOptionPane.YES_OPTION) {
                    botonFinalizar.setEnabled(true);

                    try {
                        String consultaCompra = "SELECT * FROM compras WHERE id_cmp = '" + folioCompra.getText() + "'";
                        PreparedStatement existeC = conn.prepareStatement(consultaCompra);
                        ResultSet resultadoC = existeC.executeQuery();
                        if (resultadoC.next()) {
                            JOptionPane.showMessageDialog(null, "Compra existente");
                        } else {
                            JOptionPane.showMessageDialog(null, "Nueva compra"); // NUEVA COMPRA.
                            String SQL2 = "INSERT INTO compras(\n"
                                    + "	id_cmp, id_prv, id_usr, cmp_efect, cmp_tot, cmp_date, cmp_time)\n"
                                    + "	VALUES (default, ?, ?, ?, ?, ?, ?);";
                            PreparedStatement agregarCompra = conn.prepareStatement(SQL2);

                            agregarCompra.setInt(1, (int) proveedores.getSelectedIndex());
                            agregarCompra.setInt(2, 1);
                            agregarCompra.setDouble(3, 1);
                            agregarCompra.setDouble(4, Float.parseFloat(total.getText()));
                            /*
                            * Sección del código para establecer el formato que se usará en la base de datos.
                             */

                            Calendar date = Calendar.getInstance();
                            SimpleDateFormat dateformatter = new SimpleDateFormat("yyyy-MM-dd");
                            fecha = dateformatter.format(date.getTime());
                            JLabel etq = new JLabel(fecha);
                            /*
                            * Fin de la sección de fecha.
                             */
                            agregarCompra.setDate(5, java.sql.Date.valueOf(etq.getText()));
                            agregarCompra.setString(6, hora.getText());
                            agregarCompra.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Insertado compras");

                            //}
                        }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                        String consultaProductos = "SELECT * FROM productos WHERE id_prd = '" + id + "'";
                        PreparedStatement existeP = conn.prepareStatement(consultaProductos);
                        ResultSet resultadoP = existeP.executeQuery();
                        if (resultadoP.next()) {
                            JOptionPane.showMessageDialog(null, "Producto existente");

                            String SQL = "UPDATE productos\n"
                                    + "	SET "
                                    + "     prd_exist = prd_exist + ?\n"
                                    + "	WHERE id_prd = '" + id + "';";
                            PreparedStatement upPro = conn.prepareStatement(SQL);
                            upPro.setInt(1, (Integer.parseInt(cantidad.getText())));
                            upPro.executeUpdate();

                        } else {
                            JOptionPane.showMessageDialog(null, "El producto es nuevo, debe registrarlo en productos primero."); // NUEVO PRODUCTO.
                        }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                        String consultaPC = "SELECT * FROM productosdecompras WHERE id_prd = '" + id + "' AND id_cmp = '" + folioCompra.getText() + "'";
                        PreparedStatement existePC = conn.prepareStatement(consultaPC);
                        ResultSet resultadoPC = existePC.executeQuery();
                        if (resultadoPC.next()) {
                            JOptionPane.showMessageDialog(null, "El producto ya está en el carrito de compras "); // PRODUCTO EXISTENTE EN EL CARRO DE COMPRAS.
                            String SQLu = "UPDATE productosdecompras\n"
                                    + "	SET noart = noart + ?\n"
                                    + "	WHERE id_cmp = '" + folioCompra.getText() + "'";
                            PreparedStatement upPDC = conn.prepareStatement(SQLu);
                            upPDC.setInt(1, Integer.parseInt(cantidad.getText()));
                            upPDC.executeUpdate();

                            try {
                                String validar = "SELECT prd_exist FROM productos as T1 WHERE T1.id_prd = " + id + "";
                                PreparedStatement valido = conn.prepareStatement(validar);
                                ResultSet res = valido.executeQuery();
                                JLabel ayuda = new JLabel();
                                if (res.next()) {
                                    JOptionPane.showMessageDialog(null, "Id encontrado");
                                    ayuda.setText(res.getString("prd_exist"));
                                    if (Integer.parseInt(ayuda.getText()) <= 0) {
                                        try {
                                            String SQL0 = "UPDATE productos\n"
                                                    + "SET\n"
                                                    + "	prd_exist = 0,\n"
                                                    + "	activo = false\n"
                                                    + "WHERE id_prd = '" + id + "';";
                                            PreparedStatement desactivar = conn.prepareStatement(SQL0);
                                            desactivar.executeUpdate();
                                            JOptionPane.showMessageDialog(null, "La cantidad y el boleano se ha cambiado :D");
                                        } catch (SQLException ex) {
                                            JOptionPane.showMessageDialog(null, "Ocurrió un error con el boleano o la cantidad.\n" + ex);
                                        }
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Id NO encontrado");
                                }
                            } catch (SQLException ex) {

                            }

                            // Agregar modificación del producto.
                        } else {
                            JOptionPane.showMessageDialog(null, "Producto añadido al carro de compras"); // NUEVO PRODUCTO AGREGADO A LA COMPRA.
                            String SQL3 = "INSERT INTO productosdecompras(\n"
                                    + "	id_prd, id_cmp, noart)\n"
                                    + "	VALUES (?, ?, ?);";
                            PreparedStatement productosCompras = conn.prepareStatement(SQL3);

                            productosCompras.setInt(1, id);
                            productosCompras.setInt(2, Integer.parseInt(folioCompra.getText()));
                            productosCompras.setInt(3, Integer.parseInt(cantidad.getText()));
                            productosCompras.executeUpdate();
                            try {
                                String SQL4 = "INSERT INTO presentaciones(\n"
                                        + "	id_pt, id_prd, cantidad, pt_cost, pt_cad, activo, pt_descrip, pt_precvent)\n"
                                        + "	VALUES (default, ?, 1, ?, ?, ?, ?, ?);";
                                PreparedStatement present = conn.prepareStatement(SQL4);
                                present.setInt(1, id);
                                present.setDouble(2, (Float.parseFloat(precio.getText())));

                                Calendar date = Calendar.getInstance();
                                SimpleDateFormat dateformatter = new SimpleDateFormat("yyyy-MM-dd");
                                fecha = dateformatter.format(date.getTime());
                                JLabel etq2 = new JLabel(fecha);

                                present.setDate(3, java.sql.Date.valueOf(etq2.getText()));
                                present.setBoolean(4, true);
                                present.setString(5, presentacion.getText());
                                present.setFloat(6, 1);
                                present.executeUpdate();
                                JOptionPane.showMessageDialog(null, "Nueva presentación");
                            } catch (SQLException ex) {
                                JOptionPane.showMessageDialog(null, "Presentaciones\n" + ex);
                            }

                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "" + ex);
                    }
                    try {
                        cmp.consultaProductosGen(tablaCompras);
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Consulta de productos fallida\n" + ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        cmp.consultaCompra(tablaCompras, total);
                    } catch (IOException ex) {
                        Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    /*
                        * Sección de limpieza.
                        * Actualización de la pantalla.
                     */
                    busqueda.setText("Buscar...");
                    proveedores.setSelectedIndex(0);
                    precio.setText("000.00");
                    cantidad.setText("1");
                    total.setText("000.00");
                    calend.setVisible(false);
                    cambio.setText("000.00");
                    efectivo.setText("000.00");
                    caducidad.setText("Caducidad");
                    presentacion.setText("600ml/1kg");
                    contador = 0;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos primero.", "Formulario de compras", HEIGHT);
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void etqCaducidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etqCaducidadMouseClicked
        calend.setVisible(true);
        caducidad.setText(calend.fecha + "");
        if (calend.fecha == null) {
            Calendar date = Calendar.getInstance();
            SimpleDateFormat dateformatter = new SimpleDateFormat("dd-MM-yyyy");
            fechaAyuda = dateformatter.format(date.getTime());
            caducidad.setText(fechaAyuda);
        }
        contador++;
        etqCaducidad.setIcon(new ImageIcon(getClass().getResource("/iconos/caducidad.png")));
        if (contador == 2) {
            calend.setVisible(false);
            contador = 0;
            etqCaducidad.setIcon(new ImageIcon(getClass().getResource("/iconos/calendario.png")));
        }
    }//GEN-LAST:event_etqCaducidadMouseClicked

    private void busquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car != KeyEvent.VK_SPACE) && (car < '0' || car > '9')) {
            evt.consume(); // Valida únicamente letras y espacios.
        }
        if (Character.isLowerCase(car)) {
            evt.setKeyChar(Character.toUpperCase(car)); // Convierte las minúsculas a mayúsculas.
        }
    }//GEN-LAST:event_busquedaKeyTyped

    private void tablaComprasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaComprasMousePressed
        tablaCompras.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int fila = tablaCompras.rowAtPoint(e.getPoint());
                int columna = tablaCompras.columnAtPoint(e.getPoint());
                if ((fila > -1) && (columna > -1)) {
                    //System.out.println(jTable1.getValueAt(fila, columna));
                    //setIdentificador((int) tablaCompras.getValueAt(fila, 0));
                    //id = getIdentificador();
                    id = (int) tablaProductos.getValueAt(fila, 0);
                    aumento = (int) tablaCompras.getValueAt(fila, 3);
                    producto.setText((String) tablaCompras.getValueAt(fila, 1));
                    setDescripcionProducto((String) tablaCompras.getValueAt(fila, 2) + " ");
                    borrar.setVisible(true);
                }
            }
        });
    }//GEN-LAST:event_tablaComprasMousePressed

    private void borrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarMousePressed
        int opc = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el producto de la compra?");
        if (opc == JOptionPane.YES_OPTION) {
            try {
                String borra = "DELETE FROM productosdecompras\n"
                        + "	WHERE id_prd = '" + id + "' AND id_cmp = '" + folioCompra.getText() + "';";
                PreparedStatement borrado = conn.prepareStatement(borra);
                borrado.executeUpdate();
            } catch (SQLException sQLException) {
                JOptionPane.showMessageDialog(null, "Borrado \n" + sQLException);
            }
            try {
                String productos = "UPDATE productos\n"
                        + "	SET \n"
                        + "     prd_exist = prd_exist - ? \n"
                        + "	WHERE id_prd = '" + id + "';";
                PreparedStatement menosCantidad = conn.prepareStatement(productos);
                menosCantidad.setInt(1, aumento);
                menosCantidad.executeUpdate();

                borrar.setVisible(false);
                cmp.consultaCompra(tablaCompras, total);
                cmp.consultaProductosGen(tablaProductos);
                JOptionPane.showMessageDialog(null, "Producto borrado con éxito.");
            } catch (SQLException sQLException) {
                JOptionPane.showMessageDialog(null, "Update \n" + sQLException);
            } catch (IOException ex) {
                Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                cmp.consultaCompra(tablaCompras, total);
            } catch (IOException ex) {
                Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                cmp.consultaProductosGen(tablaProductos);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Consulta general \n" + ex);
            }catch(IOException e){
            }
        } else {
            borrar.setVisible(false);
        }
    }//GEN-LAST:event_borrarMousePressed

    private void descripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descripcionMousePressed
        setDescripcionProducto(JOptionPane.showInputDialog(null, "Ingrese la descripción del producto") + "  ");
    }//GEN-LAST:event_descripcionMousePressed

    private void busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyReleased
        try {
            if (busqueda.getText().equals("")) { // Siempre que la búsqueda sea un vacio, se mostrarán todos los productos.
                cmp.consultaProductosGen(tablaProductos);
            } else { // Búsqueda individual / conjunto.
                cmp.consultaProductos(busqueda.getText(), tablaProductos);
            }
        } catch (SQLException ex) {

        } catch (IOException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_busquedaKeyReleased

    private void busquedaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_busquedaFocusGained
        if (busqueda.getText().equals("Buscar...")) {
            busqueda.setText("");
            borrar.setVisible(false);
        }
    }//GEN-LAST:event_busquedaFocusGained

    private void cantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantidadFocusGained
        if (cantidad.getText().equals("1")) {
            cantidad.setText("");
        }
    }//GEN-LAST:event_cantidadFocusGained

    private void precioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precioFocusGained
        if (precio.getText().equals("000.00")) {
            precio.setText("");
        }
    }//GEN-LAST:event_precioFocusGained

    private void busquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_busquedaFocusLost
        if (busqueda.getText().equals("")) {
            busqueda.setText("Buscar...");
        }
    }//GEN-LAST:event_busquedaFocusLost

    private void tablaProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMousePressed
        tablaProductos.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int fila = tablaProductos.rowAtPoint(e.getPoint());
                int columna = tablaProductos.columnAtPoint(e.getPoint());
                if ((fila > -1) && (columna > -1)) {
                    //System.out.println(tablaProductos.getValueAt(fila, columna));
                    //setIdentificador((int) tablaProductos.getValueAt(fila, 0));
                    //id = getIdentificador();
                    id = (int) tablaProductos.getValueAt(fila, 0); // Obtenemos el ID del producto.
                    producto.setText((String) tablaProductos.getValueAt(fila, 1)); // Mostramos el nombre del producto.
                    setDescripcionProducto((String) tablaProductos.getValueAt(fila, 2) + " "); // Obtenemos la presentación del producto seleccionado.
                    presentacion.setText(getDescripcionProducto()); // Mostramos la presentación del producto seleccionado.
                    /*
                        * Proceso M.
                        * Código encargado de asignar la medida correcta en el JComboBox (medidas) con base en el producto seleccionado.
                     */
 /*
                    String cadena = presentacion.getText();
                    boolean next = true;
                    int i = 0;
                    
                    while (next) {
                        medidas.setSelectedIndex(i);
                        i++;
                        String medida = (String) medidas.getSelectedItem();
                        if (cadena.indexOf(medida) != -1) {
                            //System.out.println(cadena + " contiene a: " + medida);
                            next = false;
                            i = 0;
                        }
                    } // Fin del proceso M.
                     */

                    setProv((String) tablaProductos.getValueAt(fila, 4)); // Obtenemos el nombre del proveedor al que se le compró el producto seleccionado.
                    proveedores.setSelectedItem(getProv()); // Mostramos el nombre del proveedor.
                }
            }
        }
        );
    }//GEN-LAST:event_tablaProductosMousePressed

    private void presentacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_presentacionFocusGained
        if (!presentacion.getText().equals("")) {
            presentacion.setText("");
        }
    }//GEN-LAST:event_presentacionFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonFinalizar;
    private javax.swing.JTextField busqueda;
    private javax.swing.JLabel caducidad;
    private javax.swing.JLabel calendar;
    private javax.swing.JLabel cambio;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton descripcion;
    private javax.swing.JLabel efectivo;
    private javax.swing.JLabel eqtFolio;
    private javax.swing.JLabel etqCaducidad;
    private javax.swing.JLabel etqCambio;
    private javax.swing.JLabel etqCantidad;
    private javax.swing.JLabel etqCategoria;
    private javax.swing.JLabel etqEfectivo;
    private javax.swing.JLabel etqFecha;
    private javax.swing.JLabel etqPrecio;
    private javax.swing.JLabel etqPresentacion;
    private javax.swing.JLabel etqProducto;
    private javax.swing.JLabel etqTotal;
    private javax.swing.JLabel folioCompra;
    private javax.swing.JLabel hora;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField presentacion;
    private javax.swing.JLabel producto;
    private javax.swing.JComboBox<String> proveedores;
    private javax.swing.JTable tablaCompras;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel total;
    private javax.swing.JLabel user;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            reloj.establecerHora();
            if (reloj.getMeridiem() == 1) {
                hora.setText(reloj.getHora() + ":" + reloj.getMinuto() + ":" + reloj.getSegundo() + " PM");
            } else {
                hora.setText(reloj.getHora() + ":" + reloj.getMinuto() + ":" + reloj.getSegundo() + " AM");
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
