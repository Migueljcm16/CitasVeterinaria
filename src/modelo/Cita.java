/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Miguel Casa
 */
public class Cita {
    private int id;
    private int idCli;
    private String nombreCli;
    private int idPet;
    private String nombrePet;
    private int idVet;
    private String nombreVet;
    private String tipoCita;
    private int precioCita;
    private String fechaCita;
    private String horaCita;
    private String estadoCita;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getNombreCli() {
        return nombreCli;
    }

    public void setNombreCli(String nombreCli) {
        this.nombreCli = nombreCli;
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public String getNombrePet() {
        return nombrePet;
    }

    public void setNombrePet(String nombrePet) {
        this.nombrePet = nombrePet;
    }

    public int getIdVet() {
        return idVet;
    }

    public void setIdVet(int idVet) {
        this.idVet = idVet;
    }

    public String getNombreVet() {
        return nombreVet;
    }

    public void setNombreVet(String nombreVet) {
        this.nombreVet = nombreVet;
    }

    public String getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
    }

    public int getPrecioCita() {
        return precioCita;
    }

    public void setPrecioCita(int precioCita) {
        this.precioCita = precioCita;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }
    
}
