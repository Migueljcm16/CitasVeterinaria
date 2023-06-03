/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import modelo.Servicio;

/**
 *
 * @author Miguel Casa
 */
public interface ServicioDao {
    
    public List listarServicios();
    
    public String costoServicio(String Tipo);

    public boolean registrarServicio(Servicio ser);

    public boolean modificarServicio(Servicio ser);

    public boolean eliminarServicio(int id);
}
