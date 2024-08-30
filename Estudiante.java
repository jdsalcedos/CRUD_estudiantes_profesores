/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juand
 */
public class Estudiante extends Persona{
    private String codigoE;
    private int creditos;
    private int matricula;

    public Estudiante() {
    }

    public Estudiante(String codigoE, int creditos, int matricula, String nombre, String cedula) {
        super(nombre, cedula);
        this.codigoE = codigoE;
        this.creditos = creditos;
        this.matricula = matricula;
    }

    /**
     * @return the codigoE
     */
    public String getCodigoE() {
        return codigoE;
    }

    /**
     * @param codigoE the codigoE to set
     */
    public void setCodigoE(String codigoE) {
        this.codigoE = codigoE;
    }

    /**
     * @return the creditos
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * @param creditos the creditos to set
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    
}
