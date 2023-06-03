/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import config.conexion;
import config.interfaceVET;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Login;

/**
 *
 * @author Miguel Casa
 */
public class LoginImpl implements interfaceVET{
    
    Connection con ;
    PreparedStatement ps;
    ResultSet rs;
    conexion cn = new conexion();
    
    @Override
    public Login obtenerLogin(String usuario, String pass) {
        Login logueo  = new Login();
            String sql = "select * from usuarios where NOM_USU = ? and PASS_USU = ? ";
            try {                
                con = cn.getConnection();
                ps = con.prepareStatement(sql);
                ps.setString(1, usuario);
                ps.setString(2, pass);
                rs = ps.executeQuery();
                if(rs.next()){
                  logueo.setId(rs.getInt("ID_VET"));
                  logueo.setNombre(rs.getString("NOM_USU"));
                  logueo.setPassword(rs.getString("PASS_USU"));
                  logueo.setCorreo(rs.getString("CORR_USU"));
                }  else {
                logueo= null;
                }      
            
            }catch(Exception e) {
                logueo = null;
                System.out.println("Error al realizar la consulta " + e.getMessage());
            }
            
            return logueo;
    }
    
}
