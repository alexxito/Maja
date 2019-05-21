
package puntodeventa;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author PC
 */
public class Conexion {
    
    public static Connection conexionbd() throws IOException{
        Connection con = null;
        try{
          Class.forName("org.postgresql.Driver");
          con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:8088/maja","postgres", "123456");
            if (con.isValid(3000)) {
                System.out.println("Conexion correcta");
            }
            else{
                Runtime.getRuntime().exec("createdb -O postgres maja -E utf-8");
            }
          //System.out.println(con.isValid(3000) ? "Conexion correcta" : "Conexion fallida");
          
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error "+e.getMessage());
        }
        return con;
    }
}
