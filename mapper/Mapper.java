/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapper;

import dto.EstudianteDto;
import dto.ProfesorDto;
import modelo.Estudiante;
import modelo.Persona;
import modelo.Profesor;

/**
 *
 * @author juand
 */
public class Mapper {
    
    public static EstudianteDto conversion_EstudianteDto(Estudiante estudiante){
        EstudianteDto dto = new EstudianteDto();
        dto.setCodigoE(estudiante.getCodigoE());
        dto.setNombre(estudiante.getNombre());
        dto.setMatricula(estudiante.getMatricula());
        dto.setCreditos(estudiante.getCreditos());
        dto.setCedula(((Persona) estudiante).getCedula());
        return dto;
    }
    
    public static Estudiante conversion_Estudiante(EstudianteDto dto) {
        Estudiante est = new Estudiante();
        est.setCodigoE(dto.getCodigoE());
        est.setNombre(dto.getNombre());
        est.setMatricula(dto.getMatricula());
        est.setCreditos(dto.getCreditos());
        est.setCedula(dto.getCedula());
        return est;
    }
        
    public static ProfesorDto conversion_ProfesorDto(Profesor profesor){
        ProfesorDto dto = new ProfesorDto();
        dto.setCodigoP(profesor.getCodigoP());
        dto.setNombre(profesor.getNombre());
        dto.setCategoria(profesor.getCategoria());
        dto.setCedula(((Persona) profesor).getCedula());
        return dto;
    }
    
    public static Profesor conversion_Profesor(ProfesorDto dto) {
        Profesor prof = new Profesor();
        prof.setCodigoP(dto.getCodigoP());
        prof.setNombre(dto.getNombre());
        prof.setCategoria(dto.getCategoria());
        prof.setCedula(dto.getCedula());
        return prof;
    }
    
   
}
