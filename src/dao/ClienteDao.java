/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import modelo.Cliente;

/**
 *
 * @author Miguel Casa
 */
public interface ClienteDao {
    
    public List listarCliente();
    
    public List buscarCliente(String busqueda);
    
    public boolean registrarCliente (Cliente cli);
    
    public boolean eliminarCliente (int id);
    
    public boolean modificarCliente (Cliente cli);
    
    public boolean vaciarMascotasCli (int id);
}
