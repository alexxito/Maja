/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gamaliel Bernal
 */
public class ComprasBD {

    private String nom_producto;
    private String categoria;
    private String presentacion;
    private String proveedor;
    private int cantidad;
    private float precio;
    private Statement sql;
    private ResultSet resultado;
    DefaultTableCellRenderer alinearCentro;

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    private String fecha;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void consultaCompra(JTable Tabla, JLabel total) throws IOException {
        alinearCentro = new DefaultTableCellRenderer();
        alinearCentro.setHorizontalAlignment(SwingConstants.CENTER);
        try {
            sql = Conexion.conexionbd().createStatement();
            resultado = sql.executeQuery("SELECT * FROM view_compras");
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Código");
            dtm.addColumn("Nombre");
            dtm.addColumn("Presentación");
            dtm.addColumn("Cantidad");
            dtm.addColumn("Existencia");
            dtm.addColumn("Precio");
            dtm.addColumn("Caducidad");
            Tabla.setModel(dtm);
            while (resultado.next()) {
                Object vector[] = new Object[7];
                for (int i = 0; i < vector.length; i++) {
                    vector[i] = resultado.getObject(i + 1);
                    Tabla.getColumnModel().getColumn(i).setCellRenderer(alinearCentro);
                }
                dtm.addRow(vector);
            }
            Totalizar(Tabla, total);
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

    private void Totalizar(JTable tabla, JLabel total) {
        double t = 0;
        double p = 0;
        double z = 0;
        if (tabla.getRowCount() > 0) {
            for (int i = 0; i < tabla.getRowCount(); i++) {
                p = Double.parseDouble(tabla.getValueAt(i, 5).toString());
                z = Double.parseDouble(tabla.getValueAt(i, 3).toString());
                Double d = p * z;
                t += (p * z);
                total.setText((double) Math.round(t * 100d) / 100d + "");
            }
            //System.out.println("Con round: " + (double) Math.round(t * 100d) / 100d);
            //System.out.println("Con string: " + String.format("%.2f", t));
        } else {
        }
    }

    public ArrayList<String> obtenerProveedores() throws SQLException, IOException {
        sql = Conexion.conexionbd().createStatement();
        ArrayList<String> arr = new ArrayList<String>();
        resultado = sql.executeQuery("select prv_nomb from proveedores");
        while (resultado.next()) {
            arr.add(resultado.getString("prv_nomb"));
        }
        return arr;
    }

    public ArrayList<String> obtenerProductos() throws SQLException, IOException {
        sql = Conexion.conexionbd().createStatement();
        ArrayList<String> arr = new ArrayList<String>();
        resultado = sql.executeQuery("select prd_nomb from productos");
        while (resultado.next()) {
            arr.add(resultado.getString("prd_nomb"));
        }
        return arr;
    }

    public void consultaProductos(String cadena, JTable table) throws SQLException, IOException {
        alinearCentro = new DefaultTableCellRenderer();
        alinearCentro.setHorizontalAlignment(SwingConstants.CENTER);
        sql = Conexion.conexionbd().createStatement();
        resultado = sql.executeQuery("SELECT \n"
                + "	T1.id_prd as Identificador,\n"
                + "	prd_nomb as Nombre,\n"
                + "	pt_descrip as Presentación,\n"
                + "	prd_exist as Existencia,\n"
                + "	T4.prv_nomb as Proveedor\n"
                + "FROM \n"
                + "	productos as T1 FULL OUTER JOIN productosdecompras as T2 ON T1.id_prd = T2.id_prd \n"
                + "	FULL OUTER JOIN compras as T3 ON T2.id_cmp = T3.id_cmp\n"
                + "	LEFT JOIN proveedores as T4 ON T4.id_prv = T3.id_prv  FULL OUTER JOIN presentaciones T5\n"
                + "	ON T5.id_prd = T1.id_prd\n"
                + "WHERE\n"
                + "	T1.id_prd||'' LIKE '%" + cadena + "%' OR prd_nomb LIKE '%" + cadena + "%'\n"
                + "ORDER BY\n"
                + "	T1.id_prd ASC;");
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Código");
        dtm.addColumn("Nombre");
        dtm.addColumn("Presentación");
        dtm.addColumn("Existencia");
        dtm.addColumn("Proveedor");
        table.setModel(dtm);
        while (resultado.next()) {
            Object vector[] = new Object[5];
            for (int i = 0; i < vector.length; i++) {
                vector[i] = resultado.getObject(i + 1);
                table.getColumnModel().getColumn(i).setCellRenderer(alinearCentro);
            }
            dtm.addRow(vector);
        }
    }

    public void consultaProductosGen(JTable table) throws SQLException, IOException {
        alinearCentro = new DefaultTableCellRenderer();
        alinearCentro.setHorizontalAlignment(SwingConstants.CENTER);
        sql = Conexion.conexionbd().createStatement();
        resultado = sql.executeQuery("SELECT * FROM view_productos;");
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Código");
        dtm.addColumn("Nombre");
        dtm.addColumn("Presentación");
        dtm.addColumn("Existencia");
        dtm.addColumn("Proveedor");
        table.setModel(dtm);
        while (resultado.next()) {
            Object vector[] = new Object[5];
            for (int i = 0; i < vector.length; i++) {
                vector[i] = resultado.getObject(i + 1);
                table.getColumnModel().getColumn(i).setCellRenderer(alinearCentro);
            }
            dtm.addRow(vector);
        }
    }
}
