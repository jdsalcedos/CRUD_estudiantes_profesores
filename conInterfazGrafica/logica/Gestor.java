/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dto.EstudianteDto;
import dto.ProfesorDto;

import java.util.List;
import java.util.stream.Collectors;

import dao.EstudianteDAO;
import dao.ProfesorDAO;
import mapper.Mapper;
import modelo.Estudiante;
import modelo.Persona;
import modelo.Profesor;

/**
 *
 * @author juand
 */
public class Gestor {
    private EstudianteDAO estudianteDao;
    private ProfesorDAO profesorDao;
    
    
    public Gestor(EstudianteDAO estudianteDao, ProfesorDAO profesorDao) {
        this.estudianteDao = estudianteDao;
        this.profesorDao = profesorDao;
    }
    
    public EstudianteDto buscar_estudiante_codigo(String codigoE){
        Estudiante estudiante = (Estudiante) estudianteDao.buscarCodigo(codigoE);
        return Mapper.conversion_EstudianteDto(estudiante);
    }
    
    public List<EstudianteDto> buscar_todos_estudiantes(){
        return estudianteDao.buscarTodos().stream()
                .filter(persona -> persona instanceof Estudiante)
                .map(estudiante -> Mapper.conversion_EstudianteDto((Estudiante) estudiante))
                .collect(Collectors.toList());
    }
    
    public void guardar_Estudiante(EstudianteDto dto){
        Estudiante estudiante = Mapper.conversion_Estudiante(dto);
        estudianteDao.guardar(estudiante);
    }
    
    public void update_Estudiante(EstudianteDto dto){
        Estudiante estudiante = Mapper.conversion_Estudiante(dto);
        estudianteDao.update(estudiante);
    }
    
    public void borrar_Estudiante(String cedula){
        estudianteDao.borrar(cedula);
    }
    
    public ProfesorDto buscar_profesor_codigo(String codigoP){
        Profesor profesor = (Profesor) profesorDao.buscarCodigo(codigoP);
        return Mapper.conversion_ProfesorDto(profesor);
    }
    
    public List<ProfesorDto> buscar_todos_profesores(){
        return profesorDao.buscarTodos().stream()
                .filter(persona -> persona instanceof Profesor)
                .map(profesor -> Mapper.conversion_ProfesorDto((Profesor) profesor))
                .collect(Collectors.toList());
    }
    
    public void guardar_Profesor(ProfesorDto dto){
        Profesor profesor = Mapper.conversion_Profesor(dto);
        profesorDao.guardar(profesor);
    }
    
    public void update_Profesor(ProfesorDto dto){
        Profesor profesor = Mapper.conversion_Profesor(dto);
        profesorDao.update(profesor);
    }
    
    public void borrar_Profesor(String cedulaBorrar){
        profesorDao.borrar(cedulaBorrar);
    }
}
