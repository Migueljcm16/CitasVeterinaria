/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import config.conexion;
import dao.MascotaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Mascota;

/**
 *
 * @author Miguel Casa
 */
public class MascotaDaoImpl implements MascotaDao{
    Connection con ;
    PreparedStatement ps;
    ResultSet rs;
    conexion cn = new conexion();
    
    @Override
    public List listarMascota() {
        List<Mascota> listaMascota = new ArrayList<>();
        
        String sql  = "SELECT ID_PET, NOM_PET, AGE_PET, TIPO_PET, ID_CLI, NOM_CLI FROM mascotas";
        try{
        
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
            Mascota mascota = new Mascota();
            
            mascota.setId(rs.getInt("ID_PET"));
            mascota.setNombre_pet(rs.getString("NOM_PET"));
            mascota.setEdad(rs.getInt("AGE_PET"));
            mascota.setTipo(rs.getString("TIPO_PET"));
            mascota.setId_cli(rs.getInt("ID_CLI"));
            mascota.setNombre_cli(rs.getString("NOM_CLI"));
            listaMascota.add(mascota);
            }
            
        }catch(SQLException e){
            System.out.print("Error al listar Mascotas "+e.getMessage());
    
        }
        return listaMascota;
    }

    @Override
    public List listarMascotaRegistro(String dueño) {
        List<Mascota> listamascotaR = new ArrayList<>();
        
        String sql  = "SELECT ID_PET, ID_CLI, NOM_CLI, NOM_PET, AGE_PET, TIPO_PET  FROM mascotas WHERE ID_CLI = ?";
        try{
        
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,  dueño);
            ps.execute();
            rs = ps.executeQuery();
            
            while (rs.next()){
            Mascota mascotaR = new Mascota();
            
            mascotaR.setId(rs.getInt("ID_PET"));
            mascotaR.setId_cli(rs.getInt("ID_CLI"));
            mascotaR.setNombre_cli(rs.getString("NOM_CLI"));
            mascotaR.setNombre_pet(rs.getString("NOM_PET"));
            mascotaR.setEdad(rs.getInt("AGE_PET"));
            mascotaR.setTipo(rs.getString("TIPO_PET"));
            listamascotaR.add(mascotaR);
            }
            
        }catch(SQLException e){
            System.out.print("Error al listar MascotaR "+e.getMessage());
    
        }
        return listamascotaR;
    }

    @Override
    public int contarMascota(String dueño) {
        int nMascotas = 0;
        
        String sql = "SELECT COUNT(*) AS cantidad FROM mascotas WHERE ID_CLI = ?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,  dueño);
            ps.execute();
            rs = ps.executeQuery();
            
            if(rs.next()){
                nMascotas = rs.getInt("cantidad");
            } else{
                System.out.println("Hola");
            }
            
            
        }catch(SQLException e){
            System.out.print("Error al contar Mascotas "+e.getMessage());
        }
        return nMascotas;
    }

    @Override
    public boolean registrarMascota(Mascota pet) {
        String sql = "INSERT INTO mascotas (ID_CLI, NOM_CLI, NOM_PET, AGE_PET, TIPO_PET) VALUES (?,?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pet.getId_cli());
            ps.setString(2, pet.getNombre_cli());
            ps.setString(3, pet.getNombre_pet());
            ps.setInt(4, pet.getEdad());
            ps.setString(5, pet.getTipo());
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
    public String SeleccionarCli(String dueño) {
        String Cliente = "";
        
        String sql = "SELECT NOM_CLI FROM clientes WHERE ID_CLI = ?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,  dueño);
            ps.execute();
            rs = ps.executeQuery();
            
            if(rs.next()){
                Cliente = rs.getString("NOM_CLI");
            } else{
                System.out.println("Hola");
            }
            
            
        }catch(SQLException e){
            System.out.print("Error al contar Mascotas "+e.getMessage());
        }
        return Cliente;
    }

    @Override
    public boolean modificarMascotasCli(int Nmascota, int IDcliente) {
        String sql = "UPDATE clientes SET MASCOTAS_CLI = ? WHERE ID_CLI = ?";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, Nmascota);
            ps.setInt(2, IDcliente);
            ps.execute();
            return true;
            
        } catch(SQLException e){
            System.out.println("error al modificar mascotas del cliente "+e.getMessage());
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
    public List buscarMascota(String busqueda) {
        List<Mascota> listaMascota = new ArrayList<>();
        
        String sql  = "SELECT ID_PET, NOM_PET, AGE_PET, TIPO_PET, ID_CLI, NOM_CLI FROM mascotas WHERE ID_PET LIKE ? OR NOM_PET LIKE ?";
        try{
        
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,  busqueda+"%");
            ps.setString(2,  busqueda+"%");
            ps.execute();
            rs = ps.executeQuery();
            
            while (rs.next()){
            Mascota mascota = new Mascota();
            
            mascota.setId(rs.getInt("ID_PET"));
            mascota.setNombre_pet(rs.getString("NOM_PET"));
            mascota.setEdad(rs.getInt("AGE_PET"));
            mascota.setTipo(rs.getString("TIPO_PET"));
            mascota.setId_cli(rs.getInt("ID_CLI"));
            mascota.setNombre_cli(rs.getString("NOM_CLI"));
            listaMascota.add(mascota);
            }
            
        }catch(SQLException e){
            System.out.print("Error al buscar Mascota "+e.getMessage());
    
        }
        return listaMascota;
    }

    @Override
    public boolean eliminarMascota(int id) {
        String sql = "DELETE FROM mascotas WHERE ID_PET = ? ";
            
        try{
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.out.println("error al eliminar Mascota "+e.getMessage());
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
    public boolean modificarMascota(Mascota pet) {
        String sql = "UPDATE mascotas SET NOM_PET = ?, AGE_PET = ?, TIPO_PET = ? WHERE ID_PET = ?";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, pet.getNombre_pet());
            ps.setInt(2, pet.getEdad());
            ps.setString(3, pet.getTipo());
            ps.setInt(4, pet.getId());
            ps.execute();
            return true;
            
        } catch(SQLException e){
            System.out.println("error al modificar la Mascota "+e.getMessage());
            return false;
            
        } finally {
            
            try {
                con.close();
                
            }catch(SQLException e){
                System.out.println("error al cerrrar la conexión "+e.getMessage());
            }
        }    
    }
    
}
