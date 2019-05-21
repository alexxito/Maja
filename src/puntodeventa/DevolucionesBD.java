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
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gamaliel Bernal
 */
public class DevolucionesBD {

    private Statement sql;
    private ResultSet resultado;
    DefaultTableCellRenderer alinearCentro;

    public void consultaVentasGen(JTable table) throws SQLException, IOException{
        alinearCentro = new DefaultTableCellRenderer();
        alinearCentro.setHorizontalAlignment(SwingConstants.CENTER);
        sql = Conexion.conexionbd().createStatement();
        resultado = sql.executeQuery("SELECT \n"
                + "	id_vnt as \"Num Venta\",\n"
                + "	T2.id_prd as Idenfiticador,\n"
                + "	prd_nomb as Nombre,\n"
                + "	prd_descrip as Presentación,\n"
                + "	noart as \"N° Art\",\n"
                + "	pt_cost as Precio,\n"
                + "	vnt_tot as Total,\n"
                + "	vnt_date as Fecha\n"
                + "FROM\n"
                + "	ventas INNER JOIN productosdeventas USING (id_vnt) INNER JOIN productos as T2\n"
                + "	ON T2.id_prd = productosdeventas.id_prd INNER JOIN presentaciones as T3\n"
                + "	ON T3.id_prd = T2.id_prd\n"
                + "ORDER BY\n"
                + "	id_vnt ASC");
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("N° Venta");
        dtm.addColumn("ID");
        dtm.addColumn("Nombre");
        dtm.addColumn("Presentación");
        dtm.addColumn("N° Artículos");
        dtm.addColumn("Precio");
        dtm.addColumn("Total");
        dtm.addColumn("Fecha");
        table.setModel(dtm);
        while (resultado.next()) {
            Object vector[] = new Object[8];
            for (int i = 0; i < vector.length; i++) {
                vector[i] = resultado.getObject(i + 1);
                table.getColumnModel().getColumn(i).setCellRenderer(alinearCentro);
            }
            dtm.addRow(vector);
        }
    }

    public void consultaVentasInd(String cadena, JTable table) throws SQLException, IOException {
        alinearCentro = new DefaultTableCellRenderer();
        alinearCentro.setHorizontalAlignment(SwingConstants.CENTER);
        sql = Conexion.conexionbd().createStatement();
        resultado = sql.executeQuery("SELECT \n"
                + "	id_vnt as \"Num Venta\",\n"
                + "	T2.id_prd as Idenfiticador,\n"
                + "	prd_nomb as Nombre,\n"
                + "	pt_descrip as Presentación,\n"
                + "	noart as \"N° Art\",\n"
                + "	pt_cost as Precio,\n"
                + "	vnt_tot as Total,\n"
                + "	vnt_date as Fecha\n"
                + "FROM\n"
                + "	ventas INNER JOIN productosdeventas USING (id_vnt) INNER JOIN productos as T2\n"
                + "	ON T2.id_prd = productosdeventas.id_prd INNER JOIN presentaciones as T3\n"
                + "	ON T3.id_prd = T2.id_prd\n"
                + "WHERE\n"
                + "	id_vnt||'' LIKE '%" + cadena + "%' OR vnt_date||'' LIKE '%" + cadena + "%'\n"
                + "ORDER BY\n"
                + "	id_vnt ASC");
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("N° Venta");
        dtm.addColumn("ID");
        dtm.addColumn("Nombre");
        dtm.addColumn("Presentación");
        dtm.addColumn("N° Articulos");
        dtm.addColumn("Precio");
        dtm.addColumn("Total");
        dtm.addColumn("Fecha");
        table.setModel(dtm);
        while (resultado.next()) {
            Object vector[] = new Object[8];
            for (int i = 0; i < vector.length; i++) {
                vector[i] = resultado.getObject(i + 1);
                table.getColumnModel().getColumn(i).setCellRenderer(alinearCentro);
            }
            dtm.addRow(vector);
        }
    }

}
