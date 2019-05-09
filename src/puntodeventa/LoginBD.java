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
    private String password;

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

    public boolean existeUsuario() {
        boolean exite = false;
        String SQL = "SELECT id_usr from usuarios where usr_nomb like '" + this.getNombre() + "' and pass like '" + this.getPassword() + "'";

        try (Connection conn = Conexion.conexionbd();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                exite = !(rs.getString("id_usr").equals(""));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return exite;
    }
    public String devuelveUsuario(){
        String SQL = "SELECT usr_nomb from usuarios where usr_nomb like '" + this.getNombre() + "' and pass = '"+this.getPassword()+"'";
        String user="";
        try (Connection conn = Conexion.conexionbd();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
               user = rs.getString("usr_nomb");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return user;
    }
}
