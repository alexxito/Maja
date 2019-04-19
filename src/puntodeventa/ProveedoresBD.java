/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class ProveedoresBD {

    private String id_proveedor;
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private String telefono;
    private String email;
    private String empresa;
    private char sexo;
    private String fecha;
    private ResultSet resultado;
    private Statement sql;

    public String getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(String id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void agregarProveedor() {
        try {
            sql = Conexion.conexionbd().createStatement();
            sql.executeQuery("insert into Proveedores values('" + (int) (Math.random() * 50 + 5) + "','" + this.getNombre() + "','" + this.getApellido_p() + "','" + this.getApellido_m() + "','" + this.getFecha() + "','" + this.getSexo() + "','" + this.getTelefono() + "')");
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

    public void editarProveedor() {
        try {
            sql = Conexion.conexionbd().createStatement();
            sql.executeUpdate("UPDATE Proveedores SET Prv_Nomb='" + this.getNombre() + "',Prv_ApPat='" + this.getApellido_p() + "',Prv_ApMat='" + this.getApellido_m() + "',Prv_BDate='" + this.getFecha() + "',Prv_Sex='" + this.getSexo() + "',Prv_Tel='" + this.getTelefono() + "' WHERE id_proveedor=" + id_proveedor);
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

    public void eliminarProveedor() {
        try {
            sql = Conexion.conexionbd().createStatement();
            sql.executeUpdate("DELETE FROM Proveedores WHERE id_proveedor=" + id_proveedor);
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

    public void consultarProveedor(JTable Tarb) {
        try {
            sql = Conexion.conexionbd().createStatement();
            resultado = sql.executeQuery("select * from Proveedores");
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Nombre");
            dtm.addColumn("Apellido Paterno ");
            dtm.addColumn("Apellido Materno");
            dtm.addColumn("Sexo");
            dtm.addColumn("Teléfono");
            dtm.addColumn("Fecha de Nacimiento");
            Tarb.setModel(dtm);
            while (resultado.next()) {
                Object vector[] = new Object[6];
                for (int i = 1; i < vector.length; i++) {
                    vector[i] = resultado.getObject(i + 1);
                }
                dtm.addRow(vector);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
}
