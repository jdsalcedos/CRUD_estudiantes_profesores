/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dao.EstudianteDAO;
import dao.ProfesorDAO;
import dto.EstudianteDto;
import dto.ProfesorDto;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author juand
 */
public class Launcher {
    private static final Scanner scanner = new Scanner(System.in);
    private static Gestor gestor;

    
    
    public static void main(String[] args) {
        EstudianteDAO estudianteDao = new EstudianteDAO(); 
        ProfesorDAO profesorDao = new ProfesorDAO();
        gestor = new Gestor(estudianteDao, profesorDao);
        
        while (true) {
            mostrarMenu();
            int opcion = obtenerOpcion();
            procesarOpcion(opcion);
        }
    }

    private static void mostrarMenu() {
        System.out.println("=== Menú Principal ===");
        System.out.println("1. Listar Estudiantes");
        System.out.println("2. Agregar Estudiante");
        System.out.println("3. Actualizar Estudiante");
        System.out.println("4. Eliminar Estudiante");
        System.out.println("5. Listar Profesores");
        System.out.println("6. Agregar Profesor");
        System.out.println("7. Actualizar Profesor");
        System.out.println("8. Eliminar Profesor");
        System.out.println("0. Salir");
        System.out.print("Elija una opción: ");
    }

    private static int obtenerOpcion() {
        return scanner.nextInt();
    }

    private static void procesarOpcion(int opcion) {
        scanner.nextLine(); // Limpiar buffer de entrada
        switch (opcion) {
            case 1:
                listarEstudiantes();
                break;
            case 2:
                agregarEstudiante();
                break;
            case 3:
                actualizarEstudiante();
                break;
            case 4:
                eliminarEstudiante();
                break;
            case 5:
                listarProfesores();
                break;
            case 6:
                agregarProfesor();
                break;
            case 7:
                actualizarProfesor();
                break;
            case 8:
                eliminarProfesor();
                break;
            case 0:
                System.out.println("Saliendo...");
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida. Inténtelo de nuevo.");
                break;
        }
    }

    private static void listarEstudiantes() {
        List<EstudianteDto> estudiantes = gestor.buscar_todos_estudiantes();
        for (EstudianteDto estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    private static void agregarEstudiante() {
        System.out.print("Codigo: ");
        String codigoE = scanner.nextLine();
        scanner.nextLine(); // Limpiar buffer de entrada
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Cedula: ");
        String cedula = scanner.nextLine();
        System.out.print("Numero de creditos: ");
        int creditos = scanner.nextInt();
        System.out.print("Matricula: ");
        int matricula = scanner.nextInt();

        EstudianteDto estudianteDto = new EstudianteDto();
        estudianteDto.setCedula(cedula);
        estudianteDto.setCreditos(creditos);
        estudianteDto.setMatricula(matricula);
        estudianteDto.setCodigoE(codigoE);
        estudianteDto.setNombre(nombre);
        gestor.guardar_Estudiante(estudianteDto);
        System.out.println("Estudiante agregado con éxito.");
    }

    private static void actualizarEstudiante() {
        System.out.print("Cedula del Estudiante a actualizar: ");
        String cedula = scanner.nextLine();
        scanner.nextLine(); // Limpiar buffer de entrada
        System.out.print("Nuevo Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Nuevo Codigo: ");
        String codigoE = scanner.nextLine();
        System.out.print("Nuevo numero de creditos: ");
        int creditos = scanner.nextInt();
        System.out.print("Nuevo numero de matricula: ");
        int matricula = scanner.nextInt();

        EstudianteDto estudianteDto = new EstudianteDto();
        estudianteDto.setCedula(cedula);
        estudianteDto.setCreditos(creditos);
        estudianteDto.setMatricula(matricula);
        estudianteDto.setCodigoE(codigoE);
        estudianteDto.setNombre(nombre);
        gestor.update_Estudiante(estudianteDto);
        System.out.println("Estudiante actualizado con éxito.");
    }

    private static void eliminarEstudiante() {
        System.out.print("Cedula del Estudiante a eliminar: ");
        String cedula = scanner.nextLine();
        gestor.borrar_Estudiante(cedula);
        System.out.println("Estudiante eliminado con éxito.");
    }

    private static void listarProfesores() {
        List<ProfesorDto> profesores = gestor.buscar_todos_profesores();
        for (ProfesorDto profesor : profesores) {
            System.out.println(profesor);
        }
    }

    private static void agregarProfesor() {
        System.out.print("Codigo: ");
        String codigoP = scanner.nextLine();
        scanner.nextLine(); // Limpiar buffer de entrada
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Cedula: ");
        String cedula = scanner.nextLine();
        System.out.print("Categoria: ");
        String categoria = scanner.nextLine();
        System.out.print("Numero de materias dictadas: ");
        int materias_dictadas= scanner.nextInt();

        ProfesorDto profesorDto = new ProfesorDto();
        profesorDto.setCodigoP(codigoP);
        profesorDto.setCategoria(categoria);
        profesorDto.setMaterias_dictadas(materias_dictadas);
        profesorDto.setCedula(cedula);
        profesorDto.setNombre(nombre);
        gestor.guardar_Profesor(profesorDto);
        System.out.println("Profesor agregado con éxito.");
    }

    private static void actualizarProfesor() {
        System.out.print("Cedula del Profesor a actualizar: ");
        String cedula = scanner.nextLine();
        scanner.nextLine(); // Limpiar buffer de entrada
        System.out.print("Nuevo Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Nuevo Codigo: ");
        String codigoP = scanner.nextLine();
        System.out.print("Nueva Categoria: ");
        String categoria = scanner.nextLine();
        System.out.print("Nueva cantidad de materias dictadas: ");
        int materias_dictadas = scanner.nextInt();

        ProfesorDto profesorDto = new ProfesorDto();
        profesorDto.setCodigoP(codigoP);
        profesorDto.setCategoria(categoria);
        profesorDto.setMaterias_dictadas(materias_dictadas);
        profesorDto.setCedula(cedula);
        profesorDto.setNombre(nombre);
        gestor.update_Profesor(profesorDto);
        System.out.println("Profesor actualizado con éxito.");
    }

    private static void eliminarProfesor() {
        System.out.print("Cedula del Profesor a eliminar: ");
        String cedulaBorrar = scanner.nextLine();
        gestor.borrar_Profesor(cedulaBorrar);
        System.out.println("Profesor eliminado con éxito.");
    }
}

