/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import modelo.Usuario;

/**
 *
 * @author Miguel Casa
 */
public interface UsuarioDao {
    
    public List listarUsuario();
    
    public List buscarUsuario(String busqueda);
    
    public String SeleccionarVet(String id);
    
    public boolean registrarUsuario (Usuario usu);

    public boolean modificarUsuario(Usuario usu, String usuario);

    public boolean eliminarUsuario(String usu);
    
}
