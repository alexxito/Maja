
package puntodeventa;


import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author PC
 */
public class Conexion {
    
    public static Connection conexionbd(){
        Connection con = null;
        try{
          Class.forName("org.postgresql.Driver");
          con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:8088/maja","postgres", "123456");
          System.out.println(con.isValid(3000) ? "Conexion correcta" : "Conexion fallida");
          
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
        return con;
    }
}
