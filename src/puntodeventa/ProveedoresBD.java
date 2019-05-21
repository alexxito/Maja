/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class ProveedoresBD {

    private int id_proveedor;
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private String telefono;
    private String empresa;
    private String descrip;
    private char sexo;
    private String fecha;
    ResultSet resultado;
    Statement sql;
    Connection con;
    PreparedStatement pstm;

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
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

    public void agregarProveedor() throws SQLException, IOException {
        sql = Conexion.conexionbd().createStatement();
        resultado = sql.executeQuery("select id_emp from empresas where emp_nomb like '" + this.getEmpresa() + "'");
        resultado.next();
        String insercion = "insert into Proveedores values(DEFAULT,"+resultado.getInt("id_emp")+",'" + this.getNombre() + "','" + this.getApellido_p() + "','" + this.getApellido_m() + "','" + this.getFecha() + "','" + this.getSexo() + "','" + this.getTelefono() + "',"+"true)";
        //System.out.println(insercion);
        sql.executeUpdate(insercion);
    }

    public void editarProveedor() throws SQLException, IOException {
        con = Conexion.conexionbd();
        con.setAutoCommit(false);
        sql = con.createStatement();
        resultado = sql.executeQuery("select id_emp from empresas where emp_nomb like '" + this.getEmpresa() + "'");
        resultado.next();
        sql.executeUpdate("update Proveedores set id_emp = " + resultado.getInt("id_emp") + ", prv_nomb = '" + this.getNombre() + "', prv_appat = '" + this.getApellido_p() + "', prv_apmat = '" + this.getApellido_m() + "', prv_bdate = '" + this.getFecha() + "', prv_sex = '" + this.getSexo() + "', prv_tel = '" + this.getTelefono() + "' where id_prv = " + this.getId_proveedor());
        con.commit();
        sql.close();
        con.close();
    }

    public void eliminarProveedor() throws SQLException, IOException {
        con = Conexion.conexionbd();
        con.setAutoCommit(false);
        sql = con.createStatement();
        sql.executeUpdate("update proveedores set Activo=false where id_prv="+this.getId_proveedor());
        con.commit();
        sql.close();
        con.close();
    }

    public void consultarProveedor(JTable Tarb) throws IOException {
        try {
            sql = Conexion.conexionbd().createStatement();
            resultado = sql.executeQuery("select id_prv,prv_nomb,prv_appat,prv_apmat,prv_sex,prv_tel,prv_bdate,emp_nomb from Proveedores, empresas where proveedores.id_emp = empresas.id_emp and proveedores.Activo=true");
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("ID");
            dtm.addColumn("Nombre");
            dtm.addColumn("Apellido Paterno ");
            dtm.addColumn("Apellido Materno");
            dtm.addColumn("Sexo");
            dtm.addColumn("Teléfono");
            dtm.addColumn("Fecha de Nacimiento");
            dtm.addColumn("Empresa");
            Tarb.setModel(dtm);
            while (resultado.next()) {
                Object vector[] = new Object[8];
                for (int i = 0; i < vector.length; i++) {
                    vector[i] = resultado.getObject(i + 1);
                }
                dtm.addRow(vector);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

    public void consultaIndvi(String cad, JTable table) throws SQLException, IOException {
        sql = Conexion.conexionbd().createStatement();
        resultado = sql.executeQuery("select id_prv,prv_nomb,prv_appat,prv_apmat,prv_sex,prv_tel,prv_bdate,emp_nomb from Proveedores,empresas where prv_nomb like '" + cad + "%'  and Activo=true and proveedores.id_emp=empresas.id_emp");
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("Nombre");
        dtm.addColumn("Apellido Paterno ");
        dtm.addColumn("Apellido Materno");
        dtm.addColumn("Sexo");
        dtm.addColumn("Teléfono");
        dtm.addColumn("Fecha de Nacimiento");
        dtm.addColumn("Empresa");
        table.setModel(dtm);
        while (resultado.next()) {
            Object vector[] = new Object[8];
            for (int i = 0; i < vector.length; i++) {
                vector[i] = resultado.getObject(i + 1);
            }
            dtm.addRow(vector);
        }
    }

    public void agregarEmpresa() throws SQLException, IOException {
        sql = Conexion.conexionbd().createStatement();
        sql.executeUpdate("insert into Empresas values('" + (int) (Math.random() * 50 + 5) + "', '" + this.getEmpresa() + "', '" + this.getDescrip() + "')");
    }

    public ArrayList<String> obtenerEmpresas() throws SQLException, IOException {
        sql = Conexion.conexionbd().createStatement();
        ArrayList<String> arr = new ArrayList<>();
        resultado = sql.executeQuery("select emp_nomb from empresas");
        while (resultado.next()) {
            arr.add(resultado.getString("emp_nomb"));
        }
        return arr;
    }
}
