/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import modelo.Veterinario;

/**
 *
 * @author Miguel Casa
 */
public interface VeterinarioDao {
    
    public List listarVeterinario();
    
    public List buscarVeterinario(String busqueda);

    public boolean registrarVeterinario(Veterinario vet);
    
    public boolean eleminarVeterinario(int id);

    public boolean vaciarUsuarioVet(int id);

    public boolean modificarVeterinario(Veterinario vet);

}
