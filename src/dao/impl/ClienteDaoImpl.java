/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import config.conexion;
import dao.ClienteDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

/**
 *
 * @author Miguel Casa
 */
public class ClienteDaoImpl implements ClienteDao{
    Connection con ;
    PreparedStatement ps;
    ResultSet rs;
    conexion cn = new conexion();

    @Override
    public boolean registrarCliente(Cliente cli) {
        String sql = "INSERT INTO clientes (NOM_CLI,APE_CLI,DNI_CLI,TEF_CLI,MASCOTAS_CLI) VALUES (?,?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getApellido());
            ps.setString(3, cli.getDni());
            ps.setString(4, cli.getTelefono());
            ps.setInt(5, cli.getMascotas());
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
    public List listarCliente() {
        List<Cliente> listaCliente = new ArrayList<>();
        
        String sql  = "SELECT ID_CLI, NOM_CLI,APE_CLI,DNI_CLI,TEF_CLI,MASCOTAS_CLI,DEU_CLI FROM clientes";
        try{
        
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
            Cliente cliente = new Cliente();
            
            cliente.setId(rs.getInt("ID_CLI"));
            cliente.setNombre(rs.getString("NOM_CLI"));
            cliente.setApellido(rs.getString("APE_CLI"));
            cliente.setDni(rs.getString("DNI_CLI"));
            cliente.setTelefono(rs.getString("TEF_CLI"));
            cliente.setMascotas(rs.getInt("MASCOTAS_CLI"));
            cliente.setDeudas(rs.getInt("DEU_CLI"));
            listaCliente.add(cliente);
            }
            
        }catch(SQLException e){
            System.out.print("Error al listar Clientes "+e.getMessage());
    
        }
        return listaCliente;
    }

    @Override
    public boolean eliminarCliente(int id) {
        String sql = "DELETE FROM clientes WHERE ID_CLI = ? ";
            
        try{
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.out.println("error al eliminar el cliente "+e.getMessage());
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
    public boolean modificarCliente(Cliente cli) {
        String sql = "UPDATE clientes SET NOM_CLI = ?, APE_CLI = ?, DNI_CLI = ?, TEF_CLI = ?, MASCOTAS_CLI = ? WHERE ID_CLI = ?";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getApellido());
            ps.setString(3, cli.getDni());
            ps.setString(4, cli.getTelefono());
            ps.setInt(5, cli.getMascotas());
            ps.setInt(6, cli.getId());
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
    public List buscarCliente(String busqueda) {
        List<Cliente> listaCliente = new ArrayList<>();
        
        String sql  = "SELECT ID_CLI, NOM_CLI,APE_CLI,DNI_CLI,TEF_CLI,MASCOTAS_CLI,DEU_CLI FROM clientes WHERE ID_CLI LIKE ? OR NOM_CLI LIKE ?";
        try{
        
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,  busqueda+"%");
            ps.setString(2,  busqueda+"%");
            ps.execute();
            rs = ps.executeQuery();
            
            while (rs.next()){
            Cliente cliente = new Cliente();
            
            cliente.setId(rs.getInt("ID_CLI"));
            cliente.setNombre(rs.getString("NOM_CLI"));
            cliente.setApellido(rs.getString("APE_CLI"));
            cliente.setDni(rs.getString("DNI_CLI"));
            cliente.setTelefono(rs.getString("TEF_CLI"));
            cliente.setMascotas(rs.getInt("MASCOTAS_CLI"));
            cliente.setDeudas(rs.getInt("DEU_CLI"));
            listaCliente.add(cliente);
            }
            
        }catch(SQLException e){
            System.out.print("Error al buscar Clientes "+e.getMessage());
    
        }
        return listaCliente;
    }

    @Override
    public boolean vaciarMascotasCli(int id) {
        String sql = "DELETE FROM mascotas WHERE ID_CLI = ? ";
            
        try{
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.out.println("error al vaciar mascotas del cliente "+e.getMessage());
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
