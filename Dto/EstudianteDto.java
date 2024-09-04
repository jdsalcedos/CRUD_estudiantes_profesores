/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;


/**
 *
 * @author juand
 */
//El DTO se encarga de la transferencia de los datos desde el gestor de la persistencia a otras del programa
public class EstudianteDto extends PersonaDto{
    private String codigoE;
    private int creditos;
    private int matricula;
    
    //método que extrae toda la información del gestor de la base de datos y la imprime bajo ciertos parámetros
    @Override
    public String toString() {
    	 return "nombre=" + nombre +
         ", cedula='" + cedula + '\'' +
         ", codigo='" + codigoE+ '\'' +
         ", numero de creditos=" + creditos+
         ", matricula='" + matricula+ '\'';
    }

    //Setters y getters
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
