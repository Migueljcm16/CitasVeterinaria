/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import config.conexion;
import dao.CitaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cita;

/**
 *
 * @author Miguel Casa
 */
public class CitaDaoImpl implements CitaDao{
    Connection con ;
    PreparedStatement ps;
    ResultSet rs;
    conexion cn = new conexion();
    
    @Override
    public boolean registrarCita(Cita cita) {
        String sql = "INSERT INTO citas(ID_CLI, NOM_CLI, ID_PET, NOM_PET, ID_VET, NOM_VET, TIPO_CITA, PRECIO_CITA, "
                + "FECHA_CITA, HORA_CITA) VALUES ( ?,?,?,?,?,?,?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cita.getIdCli());
            ps.setString(2, cita.getNombreCli());
            ps.setInt(3, cita.getIdPet());
            ps.setString(4, cita.getNombrePet());
            ps.setInt(5, cita.getIdVet());
            ps.setString(6, cita.getNombreVet());
            ps.setString(7, cita.getTipoCita());
            ps.setInt(8, cita.getPrecioCita());
            ps.setString(9, cita.getFechaCita());
            ps.setString(10, cita.getHoraCita());
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
    public boolean modificarDeudaCli(int deuda, int idCli) {
        String sql = "UPDATE clientes SET DEU_CLI = ? WHERE ID_CLI = ?";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, deuda);
            ps.setInt(2, idCli);
            ps.execute();
            return true;
            
        } catch(SQLException e){
            System.out.println("error al modificar deudas del cliente "+e.getMessage());
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
    public List listarCitas() {
        List<Cita> listaCita = new ArrayList<>();
        
        String sql  = "SELECT ID_CITA, ID_CLI, NOM_CLI, ID_PET, NOM_PET, ID_VET, NOM_VET, TIPO_CITA, PRECIO_CITA, FECHA_CITA, HORA_CITA, ESTADO_CITA FROM citas";
        try{
        
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
            Cita cita = new Cita();
            
            cita.setId(rs.getInt("ID_CITA"));
            cita.setIdCli(rs.getInt("ID_CLI"));
            cita.setNombreCli(rs.getString("NOM_CLI"));
            cita.setIdPet(rs.getInt("ID_PET"));
            cita.setNombrePet(rs.getString("NOM_PET"));
            cita.setIdVet(rs.getInt("ID_VET"));
            cita.setNombreVet(rs.getString("NOM_VET"));
            cita.setTipoCita(rs.getString("TIPO_CITA"));
            cita.setPrecioCita(rs.getInt("PRECIO_CITA"));
            cita.setFechaCita(rs.getString("FECHA_CITA"));
            cita.setHoraCita(rs.getString("HORA_CITA"));
            cita.setEstadoCita(rs.getString("ESTADO_CITA"));
            listaCita.add(cita);
            }
            
        }catch(SQLException e){
            System.out.print("Error al listar Citas "+e.getMessage());
    
        }
        return listaCita;
    }

    @Override
    public int obtenerDeudasCli(int idCli) {
        int nDeudas = 0;
        
        String sql = "SELECT DEU_CLI FROM clientes WHERE ID_CLI = ?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1,  idCli);
            ps.execute();
            rs = ps.executeQuery();
            
            if(rs.next()){
                nDeudas = rs.getInt("DEU_CLI");
            } else{
                System.out.println("Hola");
            }
            
            
        }catch(SQLException e){
            System.out.print("Error al obtener deudas "+e.getMessage());
        }
        return nDeudas;
    }

    @Override
    public boolean eliminarCita(int idCita) {
        String sql = "DELETE FROM citas WHERE ID_CITA = ? ";
            
        try{
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, idCita);
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.out.println("error al cancelar la cita "+e.getMessage());
            return false;
            
        }finally {

            try {
                con.close();
                
            }catch(SQLException e){
                System.out.println("error al cerrar la conexión "+e.getMessage());
            }
        }  
    }

    @Override
    public int seleccionarCli(int i) {
        int idCl = 0;
        
        String sql = "SELECT ID_CLI FROM citas WHERE ID_CITA = ?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1,  i);
            ps.execute();
            rs = ps.executeQuery();
            
            if(rs.next()){
                idCl = rs.getInt("ID_CLI");
            } else{
                System.out.println("Hola");
            }
            
            
        }catch(SQLException e){
            System.out.print("Error al obtener id "+e.getMessage());
        }
        return idCl;
    }

    @Override
    public boolean insertarRegistroCitas(Cita cita) {
        String sql = "INSERT INTO registrocitas(ID_CITA, ID_CLI, NOM_CLI, ID_PET, NOM_PET, ID_VET, NOM_VET, TIPO_CITA, "
                + "FECHA_CITA, HORA_CITA, ESTADO_CITA) VALUES ( ?,?,?,?,?,?,?,?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cita.getId());
            ps.setInt(2, cita.getIdCli());
            ps.setString(3, cita.getNombreCli());
            ps.setInt(4, cita.getIdPet());
            ps.setString(5, cita.getNombrePet());
            ps.setInt(6, cita.getIdVet());
            ps.setString(7, cita.getNombreVet());
            ps.setString(8, cita.getTipoCita());
            ps.setString(9, cita.getFechaCita());
            ps.setString(10, cita.getHoraCita());
            ps.setString(11, cita.getEstadoCita());
            ps.execute();
           return true;
           
        }catch (SQLException e) {
           System.out.println("Error en el registro de citas"+e.getMessage());
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
    public List listarRegistroCitas(String order) {
        List<Cita> listaTotalCitas = new ArrayList<>();
        
        String sql = null;
        
        if(null != order)switch (order) {
            case "Id":
                sql = "SELECT ID_CITA, ID_CLI, NOM_CLI, ID_PET, NOM_PET, ID_VET, NOM_VET, TIPO_CITA, FECHA_CITA, HORA_CITA, ESTADO_CITA FROM registrocitas ORDER BY ID_CITA ASC";
                break;
            case "Cliente":
                sql = "SELECT ID_CITA, ID_CLI, NOM_CLI, ID_PET, NOM_PET, ID_VET, NOM_VET, TIPO_CITA, FECHA_CITA, HORA_CITA, ESTADO_CITA FROM registrocitas ORDER BY NOM_CLI ASC";
                break;
            case "Mascota":
                sql = "SELECT ID_CITA, ID_CLI, NOM_CLI, ID_PET, NOM_PET, ID_VET, NOM_VET, TIPO_CITA, FECHA_CITA, HORA_CITA, ESTADO_CITA FROM registrocitas ORDER BY NOM_PET ASC";
                break;
            case "Veterinario":
                sql = "SELECT ID_CITA, ID_CLI, NOM_CLI, ID_PET, NOM_PET, ID_VET, NOM_VET, TIPO_CITA, FECHA_CITA, HORA_CITA, ESTADO_CITA FROM registrocitas ORDER BY NOM_VET ASC";
                break;
            case "Servicio":
                sql = "SELECT ID_CITA, ID_CLI, NOM_CLI, ID_PET, NOM_PET, ID_VET, NOM_VET, TIPO_CITA, FECHA_CITA, HORA_CITA, ESTADO_CITA FROM registrocitas ORDER BY TIPO_CITA ASC";
                break;
            case "Fecha":
                sql = "SELECT ID_CITA, ID_CLI, NOM_CLI, ID_PET, NOM_PET, ID_VET, NOM_VET, TIPO_CITA, FECHA_CITA, HORA_CITA, ESTADO_CITA FROM registrocitas ORDER BY FECHA_CITA ASC";
                break;
            case "Hora":
                sql = "SELECT ID_CITA, ID_CLI, NOM_CLI, ID_PET, NOM_PET, ID_VET, NOM_VET, TIPO_CITA, FECHA_CITA, HORA_CITA, ESTADO_CITA FROM registrocitas ORDER BY HORA_CITA ASC";
                break;
            case "Estado":
                sql = "SELECT ID_CITA, ID_CLI, NOM_CLI, ID_PET, NOM_PET, ID_VET, NOM_VET, TIPO_CITA, FECHA_CITA, HORA_CITA, ESTADO_CITA FROM registrocitas ORDER BY ESTADO_CITA ASC";
                break;
            default:
                break;
        }
        
        try{
        
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
            Cita cita = new Cita();
            
            cita.setId(rs.getInt("ID_CITA"));
            cita.setIdCli(rs.getInt("ID_CLI"));
            cita.setNombreCli(rs.getString("NOM_CLI"));
            cita.setIdPet(rs.getInt("ID_PET"));
            cita.setNombrePet(rs.getString("NOM_PET"));
            cita.setIdVet(rs.getInt("ID_VET"));
            cita.setNombreVet(rs.getString("NOM_VET"));
            cita.setTipoCita(rs.getString("TIPO_CITA"));
            cita.setFechaCita(rs.getString("FECHA_CITA"));
            cita.setHoraCita(rs.getString("HORA_CITA"));
            cita.setEstadoCita(rs.getString("ESTADO_CITA"));
            listaTotalCitas.add(cita);
            }
            
        }catch(SQLException e){
            System.out.print("Error al listar Citas "+e.getMessage());
    
        }
        return listaTotalCitas;
    }

    @Override
    public boolean vaciarTablaRegistro() {
        String sql = "DELETE FROM registrocitas";
            
        try{
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.out.println("error al vaciar la tabla registros"+e.getMessage());
            return false;
            
        }finally {

            try {
                con.close();
                
            }catch(SQLException e){
                System.out.println("error al cerrar la conexión "+e.getMessage());
            }
        }  
    }

    @Override
    public List buscarCita(String busqueda) {
        List<Cita> listaCita = new ArrayList<>();
        
        String sql  = "SELECT ID_CITA, ID_CLI, NOM_CLI, ID_PET, NOM_PET, ID_VET, NOM_VET, TIPO_CITA, PRECIO_CITA, FECHA_CITA, HORA_CITA, ESTADO_CITA FROM citas"
                + " WHERE ID_CITA LIKE ? OR NOM_CLI LIKE ? OR FECHA_CITA LIKE ? OR TIPO_CITA LIKE ?";
        try{
        
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,  busqueda+"%");
            ps.setString(2,  busqueda+"%");
            ps.setString(3,  busqueda+"%");
            ps.setString(4,  busqueda+"%");
            ps.execute();
            rs = ps.executeQuery();
            
            while (rs.next()){
            Cita cita = new Cita();
            
            cita.setId(rs.getInt("ID_CITA"));
            cita.setIdCli(rs.getInt("ID_CLI"));
            cita.setNombreCli(rs.getString("NOM_CLI"));
            cita.setIdPet(rs.getInt("ID_PET"));
            cita.setNombrePet(rs.getString("NOM_PET"));
            cita.setIdVet(rs.getInt("ID_VET"));
            cita.setNombreVet(rs.getString("NOM_VET"));
            cita.setTipoCita(rs.getString("TIPO_CITA"));
            cita.setPrecioCita(rs.getInt("PRECIO_CITA"));
            cita.setFechaCita(rs.getString("FECHA_CITA"));
            cita.setHoraCita(rs.getString("HORA_CITA"));
            cita.setEstadoCita(rs.getString("ESTADO_CITA"));
            listaCita.add(cita);
            }
            
        }catch(SQLException e){
            System.out.print("Error al buscar citas "+e.getMessage());
    
        }
        return listaCita;
    }
}
