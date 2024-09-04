/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;

import modelo.Estudiante;
import modelo.Persona;

import java.util.ArrayList;

/**
 *
 * @author juand
 */
//Hereda de la clase PersonaDAO
//El objetivo del DAO es gestionar las peticiones a la base de datos o al gestor de la persistencia 
public class EstudianteDAO extends PersonaDAO{

    public EstudianteDAO() {
    }
    //Esta función busca el código del estudiante y lo agrega en la lista de estudiantes
    public List<Estudiante> buscarCodigo(String codigoE){
        //Crea la lista vacía de estudiantes
        List<Estudiante> estudiantes = new ArrayList();
        //Trae todas las personas dentro del aarchivo
        List<Persona> personas = buscarTodos();
        //Recorre la lista persona y busca las personas cuyo código coincida con el parámetro 
        for(Persona persona : personas){
            if(persona instanceof Estudiante && ((Estudiante) persona).getCodigoE().equals(codigoE)){
                //Añade a la lista de estudiante a la persona que sea un estudiante
                estudiantes.add((Estudiante) persona);
            }
        }
        //Retorna el ArrayList de todos los estudiantes
        return estudiantes;
    }
}
