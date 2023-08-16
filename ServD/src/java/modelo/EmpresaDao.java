/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * clase del modelo DAO de "Empresa"
 * @author carlo
 */
public class EmpresaDao {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    //crea una lista de los elementos de empresa de Empresas de DB
    public List listar(){
        String sql = "select * from Empresa";
        List<Empresa> listaEmpresa = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Empresa emp = new Empresa();
                emp.setCodigoEmpresa(rs.getInt(1));
                emp.setNombreEmpresa(rs.getString(2));
                emp.setTelefonoEmpresa(rs.getString(3));
                emp.setDireccionEmpresa(rs.getString(4));
                emp.setEstadoEmpresa(rs.getString(5));
                listaEmpresa.add(emp);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return listaEmpresa;
    }
    
    //agrega datos a la lista de la DB
    public int agregar(Empresa emp){
        String sql = "insert into Empresa(nombreEmpresa, telefonoEmpresa, direccionEmpresa, estadoEmpresa) values(?,?,?,?)";
        try {
            con = cn.Conexion(); 
            ps = con.prepareStatement(sql); 
            ps.setString(1, emp.getNombreEmpresa());
            ps.setString(2, emp.getTelefonoEmpresa());
            ps.setString(3, emp.getDireccionEmpresa());
            ps.setString(4, emp.getEstadoEmpresa());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return resp; 
    }
    
    //buscar datos
    public Empresa buscarEmpresa(int id){
        Empresa emp = new Empresa(); 
        String sql = "select * from Empresa where codigoEmpresa = "+id;
        try {
            con = cn.Conexion(); 
            ps = con.prepareStatement(sql); 
            rs = ps.executeQuery(); 
            while (rs.next()) {
                emp.setNombreEmpresa(rs.getString(2));
                emp.setTelefonoEmpresa(rs.getString(3));
                emp.setDireccionEmpresa(rs.getString(4));
                emp.setEstadoEmpresa(rs.getString(5));   
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emp;       
    }
    
    //editar
    public int editarEmpresa(Empresa emp){
        String sql = "Update MedioTransporte set nombreEmpresa = ?, telefonoEmpresa = ?, direccionEmpresa = ?, estadoEmpresa = ? where codigoEmpresa = ?"; 
        try {
            con = cn.Conexion(); 
            ps = con.prepareStatement(sql); 
            ps.setString(1, emp.getNombreEmpresa());
            ps.setString(2, emp.getTelefonoEmpresa());
            ps.setString(3, emp.getDireccionEmpresa());
            ps.setString(4, emp.getEstadoEmpresa());
            ps.executeUpdate(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resp; 
    }
    
    //borrar
    public void eliminarEmpresa(int id){
        String sql = "delete from Empresa where codigoEmpresa = "+id; 
        try {
            con = cn.Conexion(); 
            ps = con.prepareStatement(sql); 
            ps.executeUpdate(); 
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }
}
