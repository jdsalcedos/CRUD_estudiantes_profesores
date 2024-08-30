/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;


/**
 *
 * @author juand
 */
public class EstudianteDto extends PersonaDto{
    private String codigoE;
    private int creditos;
    private int matricula;

    public EstudianteDto() {
        super(null, null);
    }

    public EstudianteDto(String codigoE, int creditos, int matricula) {
        this(codigoE, creditos, matricula, null, null);
    }

    public EstudianteDto(String codigoE, int creditos, int matricula, String cedula, String nombre) {
        super(cedula, nombre);
        this.codigoE = codigoE;
        this.creditos = creditos;
        this.matricula = matricula;
    }
    
    @Override
    public String toString(){
        return "EstudianteDto{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", codigo=" + codigoE +
                ", numero de creditos=" + creditos +
                ", numero de matricula=" + matricula +
                '}';
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
