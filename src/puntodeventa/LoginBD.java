/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

/**
 *
 * @author PC
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginBD {

    ResultSet resultado;
    Statement sql;
    Connection con;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    private String password;

    public boolean existeUsuario() throws SQLException {
        boolean existe;
        con = Conexion.conexionbd();
        sql = con.createStatement();
        resultado = sql.executeQuery("SELECT id_usr from usuarios where usr_nomb like '" + this.getNombre() + "' and pass like '" + this.getPassword() + "'");
        resultado.next();
        existe = !resultado.getObject("id_usr").equals("");
        resultado.close();
        sql.close();
        con.close();
        return existe;
    }
}
