/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juand
 */
//Hereda de persona y agrega sus propios atributos
public class Profesor extends Persona{
    private String codigoP;
    private String categoria;
    private int materias_dictadas;
//constructor vacío
    public Profesor() {
    }
//constructor con parámetros propios y de la superclase
    public Profesor(String codigoP, String categoria, int materias_dictadas, String nombre, String cedula) {
        super(nombre, cedula);
        this.codigoP = codigoP;
        this.categoria = categoria;
        this.materias_dictadas = materias_dictadas;
    }
//métodos setters y getters
    public String getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(String codigoP) {
        this.codigoP = codigoP;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getMaterias_dictadas() {
        return materias_dictadas;
    }

    public void setMaterias_dictadas(int materias_dictadas) {
        this.materias_dictadas = materias_dictadas;
    }

}
