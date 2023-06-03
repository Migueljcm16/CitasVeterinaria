/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import config.conexion;
import dao.UsuarioDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

/**
 *
 * @author Miguel Casa
 */
public class UsuarioDaoImpl implements UsuarioDao{
    Connection con ;
    PreparedStatement ps;
    ResultSet rs;
    conexion cn = new conexion();

    @Override
    public List listarUsuario() {
        List<Usuario> listaUsuario = new ArrayList<>();
        
        String sql  = "SELECT ID_VET, NOM_USU, PASS_USU, CORR_USU FROM usuarios ORDER BY ID_VET ASC";
        try{
        
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
            Usuario usuario = new Usuario();
            
            usuario.setId_vet(rs.getInt("ID_VET"));
            usuario.setUsuario(rs.getString("NOM_USU"));
            usuario.setPassword(rs.getString("PASS_USU"));
            usuario.setCorreo(rs.getString("CORR_USU"));
            listaUsuario.add(usuario);
            }
            
        }catch(SQLException e){
            System.out.print("Error al listar Usuarios "+e.getMessage());
    
        }
        return listaUsuario;
    }

    @Override
    public String SeleccionarVet(String id) {
        String Veterinario = "";
        
        String sql = "SELECT NOM_VET FROM veterinarios WHERE ID_VET = ?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,  id);
            ps.execute();
            rs = ps.executeQuery();
            
            if(rs.next()){
                Veterinario = rs.getString("NOM_VET");
            }
            
        }catch(SQLException e){
            System.out.print("Error al seleccionar Veterinario "+e.getMessage());
        }
        return Veterinario;
    }

    @Override
    public boolean registrarUsuario(Usuario usu) {
        String sql = "INSERT INTO usuarios (ID_VET, NOM_USU, PASS_USU, CORR_USU) VALUES (?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            if(usu.getId_vet() == null){
                ps.setNull(1, java.sql.Types.NULL);
            }else {
                ps.setInt(1, usu.getId_vet());
            }
            ps.setString(2, usu.getUsuario());
            ps.setString(3, usu.getPassword());
            ps.setString(4, usu.getCorreo());
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
    public boolean modificarUsuario(Usuario usu, String usuario) {
        String sql = "UPDATE usuarios SET NOM_USU = ?, PASS_USU = ?, CORR_USU = ? WHERE NOM_USU = ?";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, usu.getUsuario());
            ps.setString(2, usu.getPassword());
            ps.setString(3, usu.getCorreo());
            ps.setString(4, usuario);
            ps.execute();
            return true;
            
        } catch(SQLException e){
            System.out.println("error al modificar el usuario "+e.getMessage());
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
    public boolean eliminarUsuario(String usu) {
        String sql = "DELETE FROM usuarios WHERE NOM_USU = ? ";
            
        try{
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, usu);
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.out.println("error al eliminar el usuario "+e.getMessage());
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
    public List buscarUsuario(String busqueda) {
        List<Usuario> listaUsuario = new ArrayList<>();
        
        String sql  = "SELECT ID_VET, NOM_USU, PASS_USU, CORR_USU FROM usuarios WHERE ID_VET LIKE ? OR NOM_USU LIKE ?";
        try{
        
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,  busqueda+"%");
            ps.setString(2,  busqueda+"%");
            ps.execute();
            rs = ps.executeQuery();
            
            while (rs.next()){
            Usuario usuario = new Usuario();
            
            usuario.setId_vet(rs.getInt("ID_VET"));
            usuario.setUsuario(rs.getString("NOM_USU"));
            usuario.setPassword(rs.getString("PASS_USU"));
            usuario.setCorreo(rs.getString("CORR_USU"));
            listaUsuario.add(usuario);
            }
            
        }catch(SQLException e){
            System.out.print("Error al buscar Usuarios "+e.getMessage());
    
        }
        return listaUsuario;
    }
}
