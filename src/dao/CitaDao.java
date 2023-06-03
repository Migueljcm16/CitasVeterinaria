/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import modelo.Cita;

/**
 *
 * @author Miguel Casa
 */
public interface CitaDao {

    public List listarCitas();
    
    public boolean registrarCita(Cita cita);
    
    public boolean modificarDeudaCli(int deuda, int idCli);
    
    public int obtenerDeudasCli(int idCli);

    public boolean eliminarCita(int idCita);

    public int seleccionarCli(int i);
    
    public boolean insertarRegistroCitas(Cita cita);

    public List listarRegistroCitas(String order);

    public boolean vaciarTablaRegistro();

    public List buscarCita(String busqueda);
}
