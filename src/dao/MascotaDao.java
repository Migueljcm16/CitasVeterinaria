/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import modelo.Mascota;

/**
 *
 * @author Miguel Casa
 */
public interface MascotaDao {
    
    public List listarMascota();
    
    public List listarMascotaRegistro(String dueño);
    
    public List buscarMascota(String busqueda);
    
    public int contarMascota(String dueño);
    
    public String SeleccionarCli(String dueño);
    
    public boolean registrarMascota (Mascota pet);
    
    public boolean eliminarMascota (int id);
    
    public boolean modificarMascota (Mascota pet);
    
    public boolean modificarMascotasCli (int Nmascota, int IDcliente);
}
