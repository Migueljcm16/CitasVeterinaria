/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import config.conexion;
import dao.VeterinarioDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Veterinario;

/**
 *
 * @author Miguel Casa
 */
public class VeterinarioDaoImpl implements VeterinarioDao{
    Connection con ;
    PreparedStatement ps;
    ResultSet rs;
    conexion cn = new conexion();
    
    @Override
    public List listarVeterinario() {
        List<Veterinario> listaVeterinario = new ArrayList<>();
        
        String sql  = "SELECT ID_VET, NOM_VET, APE_VET, EDA_VET, DNI_VET, FOT_VET FROM veterinarios";
        try{
        
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
            Veterinario veterinario = new Veterinario();
            
            veterinario.setId(rs.getInt("ID_VET"));
            veterinario.setNombre(rs.getString("NOM_VET"));
            veterinario.setApellido(rs.getString("APE_VET"));
            veterinario.setEdad(rs.getInt("EDA_VET"));
            veterinario.setDni(rs.getString("DNI_VET"));
            veterinario.setImagen(rs.getBytes("FOT_VET"));
            listaVeterinario.add(veterinario);
            }
            
        }catch(SQLException e){
            System.out.print("Error al listar Veterinarios "+e.getMessage());
    
        }
        return listaVeterinario;
    }

    @Override
    public boolean registrarVeterinario(Veterinario vet) {
        String sql = "INSERT INTO veterinarios (NOM_VET, APE_VET, EDA_VET, DNI_VET, FOT_VET) VALUES (?,?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, vet.getNombre());
            ps.setString(2, vet.getApellido());
            ps.setInt(3, vet.getEdad());
            ps.setString(4,vet.getDni());
            if(vet.getImagen()== null){
                ps.setNull(5, java.sql.Types.NULL);
            }else {
                ps.setBytes(5, vet.getImagen());
            }
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
    public boolean eleminarVeterinario(int id) {
        String sql = "DELETE FROM veterinarios WHERE ID_VET = ? ";
            
        try{
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.out.println("error al eliminar el veterinario "+e.getMessage());
            return false;
            
        }finally {

            try {
                con.close();
                
            }catch(SQLException e){
                System.out.println("error al cerrrar la conexión "+e.getMessage());
            }
        }
    }

    @Override
    public boolean vaciarUsuarioVet(int id) {
        String sql = "DELETE FROM usuarios WHERE ID_VET = ? ";
            
        try{
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.out.println("error al vaciar usuario del cliente "+e.getMessage());
            return false;
            
        }finally {

            try {
                con.close();
                
            }catch(SQLException e){
                System.out.println("error al cerrrar la conexión "+e.getMessage());
            }
        }  
    }

    @Override
    public boolean modificarVeterinario(Veterinario vet) {
        String sql = "UPDATE veterinarios SET NOM_VET = ?, APE_VET = ?, EDA_VET = ?, DNI_VET = ?, FOT_VET = ? WHERE ID_VET = ?";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, vet.getNombre());
            ps.setString(2, vet.getApellido());
            ps.setInt(3, vet.getEdad());
            ps.setString(4,vet.getDni());
            if(vet.getImagen()== null){
                ps.setNull(5, java.sql.Types.NULL);
            }else {
                ps.setBytes(5, vet.getImagen());
            }
            ps.setInt(6, vet.getId());
            ps.execute();
            return true;
            
        } catch(SQLException e){
            System.out.println("error al modificar el cliente "+e.getMessage());
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
    public List buscarVeterinario(String busqueda) {
        List<Veterinario> listaVeterinario = new ArrayList<>();
        
        String sql  = "SELECT ID_VET, NOM_VET, APE_VET, EDA_VET, DNI_VET, FOT_VET FROM veterinarios WHERE ID_VET LIKE ? OR NOM_VET LIKE ?";
        try{
        
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,  busqueda+"%");
            ps.setString(2,  busqueda+"%");
            ps.execute();
            rs = ps.executeQuery();
            
            while (rs.next()){
            Veterinario veterinario = new Veterinario();
            
            veterinario.setId(rs.getInt("ID_VET"));
            veterinario.setNombre(rs.getString("NOM_VET"));
            veterinario.setApellido(rs.getString("APE_VET"));
            veterinario.setEdad(rs.getInt("EDA_VET"));
            veterinario.setDni(rs.getString("DNI_VET"));
            veterinario.setImagen(rs.getBytes("FOT_VET"));
            listaVeterinario.add(veterinario);
            }
            
        }catch(SQLException e){
            System.out.print("Error al buscar Veterinario "+e.getMessage());
    
        }
        return listaVeterinario;
    }
    
}
