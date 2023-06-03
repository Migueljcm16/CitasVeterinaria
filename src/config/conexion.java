/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Miguel Casa
 */
public class conexion {
    
    Connection con;
    
    public Connection getConnection(){
        try{
          String myBd = "jdbc:mysql://localhost:3306/dbveterinaria?ServerTimezone=UTC";
          con = DriverManager.getConnection(myBd,"root","");
            return con;
        }catch (Exception e){
        System.out.println("Error de Conexion "+ e.getMessage() );
        }
        return null;
    }    
}
