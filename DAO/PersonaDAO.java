/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.*;
import java.util.List;

import modelo.Persona;

import java.util.ArrayList;

/**
 *
 * @author juand
 */
//El objetivo del DAO es gestionar las peticiones a la base de datos o al gestor de la persistencia 
public class PersonaDAO {
    //dirección del archivo serializado
    private String direccion_archivo = System.getProperty("user.home") + "\\Documents\\archivo binario est-prof\\archivoBinario.dat";    
    
    //esta función recibe como parámetro la cédula de la persona
    public Persona buscarCedula(int cedula){
        //en la lista "personas" se guardan todos los registros que haya en el archivo de tipo Persona
        List<Persona> personas = leerArchivo();
        //Se recorre la lista
        for(Persona persona : personas){
            //Si la cédula de la persona coincide, retorna la persona asociada a esa cédula
            if(persona.getCedula().equals(cedula)){
                return persona;
            }
        }
        return null;
    }
    
    //Busca todos los registros que hay en el archivo y los guarda en un ArrayList
    public List<Persona> buscarTodos(){
        return leerArchivo();
    }

    //Este método guarda agrega personas al archivo
    public void guardar(Persona persona){
        //Crea el ArrayList con todo lo que hay dentro del archivo
        List<Persona> personas = leerArchivo();
        //agrega la persona
        personas.add(persona);
        //Vuelve a guardar el archivo
        escribirArchivo(personas);
    }
    
    //Este método actualiza la información de una persona ya guardada dentro del ArrayList 
    public void update(Persona persona){
        //Crea el ArrayList con todo lo que hay dentro del archivo
        List<Persona> personas = leerArchivo();
        //recorre cada posición del ArrayList
        for(int i = 0; i < personas.size(); i++){
            //obtiene la persona en la posición i
            Persona personaActual = personas.get(i);
            //Verifica que la persona actual sea igual a la persona que se busca y le actualiza la información
            if(personaActual.getCedula() != null && personaActual.getCedula().equals(persona.getCedula())){
                //reemplaza la persona en la posición deseada
                personas.set(i, persona);
                break;
            }
        }
        //guarda la información actualizada
        escribirArchivo(personas);
    }
    
    //esta función borra un registro del archivo 
    public void borrar(String cedulaBorrar){
        //en la lista "personas" se guardan todos los registros que haya en el archivo de tipo Persona
        List<Persona> personas = leerArchivo();
        //Elimina del ArrayList la persona cuya cédula no sea nula y sea igual al parámetro cedulaBorrar
        personas.removeIf(persona -> persona.getCedula()!= null && persona.getCedula().equals(cedulaBorrar));
        //llama al método y reescribe el ArrayList 
        escribirArchivo(personas);
    }
    
    //Esta función lee el archivo y guarda los registros en un ArrayList de tipo Persona
    private List<Persona> leerArchivo(){
        //se abre un try catch para evitar dañar el programa. Este try catch busca el archivos serializado
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(direccion_archivo))){
            //si encuentra el archivo lo lee y retorna un arraylist de tipo persona en el cual en cada posición hay una persona con sus atributos correspondientes
            return (List<Persona>) ois.readObject();
        } catch (EOFException e) {
            //En caso de que el archivo no tenga nada, devuelve una lista vacía
            return new ArrayList<>();
        } catch(FileNotFoundException e){
            //En caso de no encontrar el archivo, devuelve una lista vacía 
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e){
            //El método printStackTrace imprime la excepción en la pantalla 
            e.printStackTrace();
            //devuelve un array vacío si se produce un problema con el archivo o si el archivo no se puede deserializar
            return new ArrayList();
        }
    }

    //Abre el archivo y guarda el ArrayList 
    private void escribirArchivo(List<Persona> personas){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(direccion_archivo))){
            oos.writeObject(personas);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
