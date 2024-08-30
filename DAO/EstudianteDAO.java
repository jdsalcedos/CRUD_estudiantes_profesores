/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import java.util.ArrayList;
import modelo.Estudiante;
import modelo.Persona;

/**
 *
 * @author juand
 */
public class EstudianteDAO extends PersonaDAO{

    public EstudianteDAO() {
    }
    
    public List<Estudiante> buscarCodigo(String codigoE){
        List<Estudiante> estudiantes = new ArrayList();
        List<Persona> personas = buscarTodos();
        for(Persona persona : personas){
            if(persona instanceof Estudiante && ((Estudiante) persona).getCodigoE().equals(codigoE)){
                estudiantes.add((Estudiante) persona);
            }
        }
        return estudiantes;
    }
}
