/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;


/**
 *
 * @author juand
 */
public class ProfesorDto extends PersonaDto{
    private String codigoP;
    private String categoria;
    private int materias_dictadas;

    //método que extrae toda la información del gestor de la base de datos y la imprime bajo ciertos parámetros
    @Override
    public String toString(){
        return "ProfesorDto{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", codigo=" + codigoP +
                ", categoria=" + categoria +
                ", numero de materias dictadas=" + materias_dictadas +
                '}';
    }
    
    //métiodos setters y getters
    /**
     * @return the codigoP
     */
    public String getCodigoP() {
        return codigoP;
    }

    /**
     * @param codigoP the codigoP to set
     */
    public void setCodigoP(String codigoP) {
        this.codigoP = codigoP;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the materias_dictadas
     */
    public int getMaterias_dictadas() {
        return materias_dictadas;
    }

    /**
     * @param materias_dictadas the materias_dictadas to set
     */
    public void setMaterias_dictadas(int materias_dictadas) {
        this.materias_dictadas = materias_dictadas;
    }
    
    
    
}
