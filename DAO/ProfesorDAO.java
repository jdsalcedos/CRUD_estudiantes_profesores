/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.List;
import java.util.ArrayList;
import Modelo.Persona;
import Modelo.Profesor;
/**
 *
 * @author juand
 */
//hereda de la clase personaDAO
//El objetivo del DAO es gestionar las peticiones a la base de datos o al gestor de la persistencia 
public class ProfesorDAO extends PersonaDAO {
    
    //Esta función busca el código de los profesores con el código de los mismos
    public List<Profesor> buscarCodigo(String codigoP){
        //Crea el ArrayList de los profesores
        List<Profesor> profesores = new ArrayList<>();
        //Trae la lista de todas las personas 
        List<Persona> personas = buscarTodos();
        //Itera sobre la lista de objetos persona y busca al profesor cuyo código sea igual al parámetro
        for (Persona persona : personas){
            if(persona instanceof Profesor && ((Profesor) persona).getCodigoP().equals(codigoP)){
                //Guarda a la persona en la lista de profesores 
                profesores.add((Profesor) persona);
            }
        }
        //retorna el ArrayList con todos los profesores
        return profesores;
    }
}
