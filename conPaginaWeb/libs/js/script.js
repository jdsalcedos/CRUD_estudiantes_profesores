// Get the buttons by their IDs
const listarButton = document.getElementById('listar');
const crearButton = document.getElementById('Crear');
const actualizarButton = document.getElementById('actualizar');
const eliminarButton = document.getElementById('eliminar');

// Add event listeners to each button
listarButton.addEventListener('click', readStudents);
crearButton.addEventListener('click', createStudent);
actualizarButton.addEventListener('click', updateStudent);
eliminarButton.addEventListener('click', deleteStudent);

// Define the CRUD functions
function readStudents() {
  // Call the readStudents function from the crud.js file
  crud.readStudents();
}

function createStudent() {
  // Call the createStudent function from the crud.js file
  crud.createStudent();
}

function updateStudent() {
  // Call the updateStudent function from the crud.js file
  crud.updateStudent();
}

function deleteStudent() {
  // Call the deleteStudent function from the crud.js file
  crud.deleteStudent();
}