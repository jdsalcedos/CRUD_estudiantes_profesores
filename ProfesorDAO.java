/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import java.util.ArrayList;
import modelo.Persona;
import modelo.Profesor;
/**
 *
 * @author juand
 */
public class ProfesorDAO extends PersonaDAO {
    
    public List<Profesor> buscarCodigo(String codigoP){
        List<Profesor> profesores = new ArrayList<>();
        List<Persona> personas = buscarTodos();
        for (Persona persona : personas){
            if(persona instanceof Profesor && ((Profesor) persona).getCodigoP().equals(codigoP)){
                profesores.add((Profesor) persona);
            }
        }
        return profesores;
    }
}
