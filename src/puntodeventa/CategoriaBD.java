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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carmen
 */
public class CategoriaBD {
    
    //Variables de Categorias-----------------
    private String nombreCtgo;
    private String descripcionCtgo;
    private boolean activoCtgo= false;
    
    //Variables extras------------------------
    private int id;
    private ResultSet resultado;
    private Statement sql;
    
    //-------------------------------------------------------------------------------------------
    
    //get & set de Categoria------------------------
    public String getNombreCtgo() {
        return nombreCtgo;
    }

    public void setNombreCtgo(String nombreCtgo) {
        this.nombreCtgo = nombreCtgo;
    }

    public String getDescripcionCtgo() {
        return descripcionCtgo;
    }

    public void setDescripcionCtgo(String descripcionCtgo) {
        this.descripcionCtgo = descripcionCtgo;
    }
    
    
    //--------------------------------------------------------------------------------------
    
    //Metodos de Categoria----------------------
    public void agregarCategoria() throws SQLException, IOException{
        sql = Conexion.conexionbd().createStatement();
        activoCtgo=true;
        sql.executeUpdate("INSERT INTO categorias(id_cat, cat_nomb, cat_desc, activo) "+"VALUES (default,'"+this.getNombreCtgo()+"','"+this.getDescripcionCtgo()+"','"+activoCtgo+"')");
    }
    
    public void editarCategoria(){
        
    }
    
    public void eliminarCategoria(){
        
    }
}
