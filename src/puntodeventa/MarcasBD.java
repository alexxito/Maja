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
import java.util.ArrayList;

/**
 *
 * @author Carmen
 */
public class MarcasBD {
    
    //Variables de Marcas---------------------
    private String nombreMrc;
    private String descripcionMrc;
    private boolean activoMrc = false;
    
    //Variables extras------------------------
    private int id;
    private ResultSet resultado;
    private Statement sql;
    
    //-------------------------------------------------------------------------------------------
    
    //get & set de Marcas---------------------
    public String getNombreMrc() {
        return nombreMrc;
    }

    public void setNombreMrc(String nombreMrc) {
        this.nombreMrc = nombreMrc;
    }

    public String getDescripcionMrc() {
        return descripcionMrc;
    }

    public void setDescripcionMrc(String descripcionMrc) {
        this.descripcionMrc = descripcionMrc;
    }
    
    //--------------------------------------------------------------------------------------
    
    //Metodos de Marcas----------------------
    public void agregarMarca() throws SQLException, IOException{
        sql = Conexion.conexionbd().createStatement();
        activoMrc=true;
        sql.executeUpdate("INSERT INTO marcas(id_mrc, mrc_nomb, m_desc, activo)"+"VALUES (default,'"+this.getNombreMrc()+"','"+this.getDescripcionMrc()+"','"+activoMrc+"')");
    }
    
    public void editarMarca(){
        
    }
    
    public void eliminarMarca(){
        
    }
}
