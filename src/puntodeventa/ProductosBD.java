/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import java.util.ArrayList;

/**
 *
 * @author Carmen
 */
public class ProductosBD {

    //Variables de Productos------------------
    private String nombreProduc;
    private String descripcionProduc;
    private String categoriaProduc;
    private String marcaProduc;
    private boolean activoProduc = false;
    int colCount;

    //Variables extras------------------------
    private ResultSet resultado;
    private ResultSet resultado2;
    private ResultSet resultado3;
    private Statement sql;
    ResultSetMetaData rsmd = null;
    private int id;

    //--------------------------------------------------------------------------------------
    //get & set de Producto-------------------------
    public String getNombreProduc() {
        return nombreProduc;
    }

    public void setNombreProduc(String nombreProduc) {
        this.nombreProduc = nombreProduc;
    }

    public String getDescripcionProduc() {
        return descripcionProduc;
    }

    public void setDescripcionProduc(String descripcionProduc) {
        this.descripcionProduc = descripcionProduc;
    }

    public String getCategoriaProduc() {
        return categoriaProduc;
    }

    public void setCategoriaProduc(String categoriaProduc) {
        this.categoriaProduc = categoriaProduc;
    }

    public String getMarcaProduc() {
        return marcaProduc;
    }

    public void setMarcaProduc(String marcaProduc) {
        this.marcaProduc = marcaProduc;
    }

    //Metodos de Productos----------------------------------------------------------------
    public ArrayList<String> llenarlistaMarcas() throws SQLException, IOException {
        sql = Conexion.conexionbd().createStatement();
        resultado2 = sql.executeQuery("SELECT mrc_nomb FROM marcas");
        rsmd = resultado2.getMetaData();
        colCount = rsmd.getColumnCount();
        ArrayList<String> arreglo = new ArrayList<String>();
        while (resultado2.next()) {

            for (int i = 0; i < rsmd.getColumnCount(); i++) {
                arreglo.add(resultado2.getString(i + 1));
            }
        }
        return arreglo;
    }

    public ArrayList<String> llenarlistaCategorias() throws SQLException, IOException {
        sql = Conexion.conexionbd().createStatement();
        resultado2 = sql.executeQuery("SELECT cat_nomb FROM categorias");
        rsmd = resultado2.getMetaData();
        colCount = rsmd.getColumnCount();
        ArrayList<String> arreglo = new ArrayList<String>();
        while (resultado2.next()) {

            for (int i = 0; i < rsmd.getColumnCount(); i++) {
                arreglo.add(resultado2.getString(i + 1));
            }
        }
        return arreglo;
    }

    
     
    public void agregarProducto() throws SQLException, IOException {
        sql = Conexion.conexionbd().createStatement();
        activoProduc = true;
        resultado = sql.executeQuery("SELECT id_cat FROM categorias WHERE cat_nomb LIKE '" + this.getCategoriaProduc() + "'");
        resultado.next();
        int a1 = resultado.getInt("id_cat");
        resultado3 = sql.executeQuery("select id_mrc from marcas where mrc_nomb like '" + this.getMarcaProduc() + "'");
        resultado3.next();
        int a2 = resultado3.getInt("id_mrc");
        sql.executeUpdate("INSERT INTO productos(id_prd, id_cat, id_mrc, prd_nomb, prd_exist, activo)" + " VALUES (default," + a1 + "," + a2 + ",'" + this.getNombreProduc() + "',0,'" + activoProduc + "')");
    }

    public void editarProducto() throws IOException {
        try {
            sql = Conexion.conexionbd().createStatement();
            //sql.executeUpdate("UPDATE Proveedores SET Prv_Nomb='"+this.getNombre()+"',Prv_ApPat='"+this.getApellido_p()+"',Prv_ApMat='"+this.getApellido_m()+"',Prv_BDate='"+this.getFecha()+"',Prv_Sex='"+this.getSexo()+"',Prv_Tel='"+this.getTelefono()+"' WHERE id_proveedor="+id_proveedor);
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

    public void eliminarProducto() throws IOException {
        try {
            sql = Conexion.conexionbd().createStatement();
            //sql.executeUpdate("DELETE FROM Proveedores WHERE id_proveedor="+id_proveedor);
        } catch (SQLException ex) {
            ex.getMessage();
        }

    }

    /*
    public int consultaListaCategoria(int consulta) throws SQLException {
        sql = Conexion.conexionbd().createStatement();
        resultado = sql.executeQuery("SELECT id_cat FROM categorias");
        resultado.next();
        int seleccion = consulta;
        consulta = (int)resultado.getObject(seleccion);
        //sql.executeUpdate("insert into Presentaciones values('"+(int)(id+1)+"','"+this.getCantidadDPresen()+"','"+this.getCostoPresen()/*+"','"+this.getPorcentajePresen()+"')");
        return consulta;
    }
     */
    public void consultarProducto(JTable Tarb) throws IOException {
        try {
            sql = Conexion.conexionbd().createStatement();
            /* resultado = sql.executeQuery("select * from Proveedores");
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Id");
            dtm.addColumn("Nombre");
            dtm.addColumn("Apellido Paterno ");
            dtm.addColumn("Apellido Materno");
            dtm.addColumn("Fecha de Nacimiento");
            dtm.addColumn("Sexo");
            dtm.addColumn("TelÃ©fono");
            
            Tarb.setModel(dtm);
            while(resultado.next()){
                Object vector[]=new Object[7];
                for(int i=0;i<vector.length;i++)
                    vector[i]=resultado.getObject(i+1);
                dtm.addRow(vector);
            }*/
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
}
