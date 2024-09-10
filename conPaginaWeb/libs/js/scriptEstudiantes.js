import { readStudents, createStudent, deleteStudent, updateStudent } from "./crudEstudiantes.js"; 

const estudianteHTML = document.getElementById("estudiante-html");
// Get the buttons by their IDs
const listarButton = estudianteHTML.getElementById('listar');
const crearButton = estudianteHTML.getElementById('Crear');
const actualizarButton = estudianteHTML.getElementById('actualizar');
const eliminarButton = estudianteHTML.getElementById('eliminar');

// Get the input elements by their IDs
const cedulaInput = estudianteHTML.getElementById('cedula');
const nombreInput = estudianteHTML.getElementById('nombre');
const codigoEstudianteInput = estudianteHTML.getElementById('codigoEstudiante');
const matriculaInput = estudianteHTML.getElementById('matricula');
const creditosInput = estudianteHTML.getElementById('creditos');

// Add event listeners to each button
listarButton.addEventListener('click', readStudents);

crearButton.addEventListener('click', () => {
  const cedula = cedulaInput.value;
  const nombre = nombreInput.value;
  const codigoEstudiante = codigoEstudianteInput.value;
  const matricula = matriculaInput.value;
  const creditos = creditosInput.value;
  const estudianteNuevo = {
    cedula: cedula,
    nombre: nombre,
    codigoEstudiante: codigoEstudiante,
    matricula: matricula,
    creditos: creditos
  };
  createStudent(estudianteNuevo);
});

actualizarButton.addEventListener('click', () => {
  const cedula = cedulaInput.value;
  const nombre = nombreInput.value;
  const codigoEstudiante = codigoEstudianteInput.value;
  const matricula = matriculaInput.value;
  const creditos = creditosInput.value;
  const estudianteActualizado = {
    cedula: cedula,
    nombre: nombre,
    codigoEstudiante: codigoEstudiante,
    matricula: matricula,
    creditos: creditos
  };
  updateStudent(estudianteActualizado);
});

eliminarButton.addEventListener('click', () => {
  const cedula = cedulaInput.value;
  deleteStudent(cedula);
});