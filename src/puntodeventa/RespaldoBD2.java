/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 *
 * @author PC
 */
public class RespaldoBD2 {

    public void respaldar(String ruta, String nombre) throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process p;
        ProcessBuilder pb;
        pb = new ProcessBuilder(
                "C:\\Program Files\\PostgreSQL\\11\\bin\\pg_dump.exe",
                "--host=localhost",
                "--port=8088",
                "--username=postgres",
                "-c", "-C", "-Fc", "-f",
                ruta + "\\" + nombre + ".backup", "maja");
        try {
            final Map<String, String> env = pb.environment();
            env.put("PGPASSWORD", "123456");
            p = pb.start();
            final BufferedReader r = new BufferedReader(
                    new InputStreamReader(p.getErrorStream()));
            String line = r.readLine();
            while (line != null) {
                System.err.println(line);
                line = r.readLine();
            }
            r.close();
            p.waitFor();
            System.out.println(p.exitValue());

        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public void restaurar(String ruta) throws IOException, InterruptedException {
        Runtime rt;
        Process p;
        ProcessBuilder pb;
        rt = Runtime.getRuntime();
        pb = new ProcessBuilder(
                "C:\\Program Files\\PostgreSQL\\11\\bin\\pg_restore.exe",
                "--host=localhost","--port=8088","--username=postgres","--dbname=maja","-v",ruta);
        try {
            final Map<String, String> env = pb.environment();
            env.put("PGPASSWORD", "123456");
            p = pb.start();
            final BufferedReader r = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            String line = r.readLine();
            while (line != null) {
                System.err.println(line);
                line = r.readLine();
            }
            r.close();
            p.waitFor();
            System.out.println(p.exitValue());

        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
