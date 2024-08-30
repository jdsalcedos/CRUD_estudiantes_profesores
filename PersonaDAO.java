/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import modelo.Persona;

/**
 *
 * @author juand
 */
public class PersonaDAO {
    private String direccion_archivo = System.getProperty("user.home") + "\\Documents\\archivo binario est-prof\\archivoBinario.dat";    
    
    public Persona buscarCedula(int cedula){
        List<Persona> personas = leerArchivo();
        for(Persona persona : personas){
            if(persona.getCedula().equals(cedula)){
                return persona;
            }
        }
        return null;
    }
    
    public List<Persona> buscarTodos(){
        return leerArchivo();
    }
    
    public void guardar(Persona persona){
        List<Persona> personas = leerArchivo();
        personas.add(persona);
        escribirArchivo(personas);
    }
    
    public void update(Persona persona){
        List<Persona> personas = leerArchivo();
        for(int i = 0; i < personas.size(); i++){
            Persona personaActual = personas.get(i);
            if(personaActual.getCedula() != null && personaActual.getCedula().equals(persona.getCedula())){
                personas.set(i, persona);
                break;
            }
        }
        escribirArchivo(personas);
    }
    
    public void borrar(String cedulaBorrar){
        List<Persona> personas = leerArchivo();
        personas.removeIf(persona -> persona.getCedula()!= null && persona.getCedula().equals(cedulaBorrar));
        escribirArchivo(personas);
    }
    
    
    private List<Persona> leerArchivo(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(direccion_archivo))){
            return (List<Persona>) ois.readObject();
        } catch (EOFException e) {
            return new ArrayList<>();
        } catch(FileNotFoundException e){
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
            return new ArrayList();
        }
    }
    
    private void escribirArchivo(List<Persona> personas){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(direccion_archivo))){
            oos.writeObject(personas);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
