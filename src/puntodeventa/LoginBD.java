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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginBD {

    ResultSet resultado;
    Statement sql;

    public boolean existeUsuario(String nombre, String password) throws SQLException {
        sql = Conexion.conexionbd().createStatement();
        resultado = sql.executeQuery("select usr_nomb from usuarios where usr_nomb='" + nombre + "' and pass='" + password + "'");
        if (resultado.getObject(1).equals("")) {
            return false;
        } else {
            return true;
        }
    }
}
