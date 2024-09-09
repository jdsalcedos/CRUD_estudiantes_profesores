/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juand
 */
//Estudiante hereda de la clase persona y agrega sus propios atributos
public class Estudiante extends Persona{
    private static final long serialVersionUID = 4166760794523280127L; // same value as when serialized

    private String codigoE;
    private int creditos;
    private int matricula;
//constructor vacío
    public Estudiante() {
    }
//Constructor con los parámetros propios y los parámetros de la superclase 
    public Estudiante(String codigoE, int creditos, int matricula, String nombre, String cedula) {
        super(nombre, cedula);
        this.codigoE = codigoE;
        this.creditos = creditos;
        this.matricula = matricula;
    }
    
   
//Métodos setters y getters
    public String getCodigoE() {
        return codigoE;
    }

    public void setCodigoE(String codigoE) {
        this.codigoE = codigoE;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
