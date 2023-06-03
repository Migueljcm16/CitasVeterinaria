/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import config.conexion;
import dao.ServicioDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Servicio;

/**
 *
 * @author Miguel Casa
 */
public class ServicioDaoImpl implements ServicioDao {

    Connection con ;
    PreparedStatement ps;
    ResultSet rs;
    conexion cn = new conexion();
    
    @Override
    public List listarServicios() {
        List<Servicio> listaServicio = new ArrayList<>();
        
        String sql  = "SELECT ID_SEV, TIPO, PRECIO FROM servicios";
        try{
        
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
            Servicio servicio = new Servicio();
            
            servicio.setId(rs.getInt("ID_SEV"));
            servicio.setTipo(rs.getString("TIPO"));
            servicio.setPrecio(rs.getInt("PRECIO"));
            listaServicio.add(servicio);
            }
            
        }catch(SQLException e){
            System.out.print("Error al listar Servicios "+e.getMessage());
    
        }
        return listaServicio;
    }

    @Override
    public String costoServicio(String Tipo) {
        String Costo = "";
        
        String sql = "SELECT PRECIO FROM servicios WHERE TIPO = ?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,  Tipo);
            ps.execute();
            rs = ps.executeQuery();
            
            if(rs.next()){
                Costo = rs.getString("PRECIO");
            }
            
        }catch(SQLException e){
            System.out.print("Error al seleccionar Costo "+e.getMessage());
        }
        return Costo;
    }

    @Override
    public boolean registrarServicio(Servicio ser) {
        String sql = "INSERT INTO servicios (TIPO,PRECIO) VALUES (?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, ser.getTipo());
            ps.setInt(2, ser.getPrecio());
            ps.execute();
           return true;
           
        }catch (SQLException e) {
            System.out.println("Error en el registro "+e.getMessage());
            return false;
            
        }finally{
            try{
              con.close();
              
            }catch(SQLException e){
                System.out.println("Error al cerrar la conexion"+e.getMessage());
            }
        }
    }

    @Override
    public boolean modificarServicio(Servicio ser) {
        String sql = "UPDATE servicios SET TIPO = ?, PRECIO = ? WHERE ID_SEV = ?";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, ser.getTipo());
            ps.setInt(2, ser.getPrecio());
            ps.setInt(3, ser.getId());
            ps.execute();
            return true;
            
        } catch(SQLException e){
            System.out.println("error al modificar el servicio "+e.getMessage());
            return false;
            
        } finally {
            
            try {
                con.close();
                
            }catch(SQLException e){
                System.out.println("error al cerrrar la conexión "+e.getMessage());
            }
        }    
    }

    @Override
    public boolean eliminarServicio(int id) {
        String sql = "DELETE FROM servicios WHERE ID_SEV = ? ";
            
        try{
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.out.println("error al eliminar el servicio "+e.getMessage());
            return false;
            
        }finally {

            try {
                con.close();
                
            }catch(SQLException e){
                System.out.println("error al cerrrar la conexión "+e.getMessage());
            }
        }
    }
    
}
