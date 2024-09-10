import { readJSONFile, writeJSONFile } from './archivo.js'; // Assuming you still want to use this for file handling

async function readStudents() {
  try {
    const students = await readJSONFile('../data/archivoEstudiantes.json'); 
    return students; // Return students directly
  } catch (error) {
    console.error("Error reading students:", error);
    return []; // Return an empty array if there's an error
  }
}
// Function to create a new student
async function createStudent(data) {
  try {
    const students = await readStudents(); // Fetch students from the file
    students.push(data);
    await writeJSONFile('../data/archivoEstudiantes.json',students); // Write updated students back to the file
    return students;
  } catch (error) {
    console.error("Error creating student:", error);
    return null; // Or handle the error in a different way
  }
}

// Function to update a student's information
async function updateStudent(cedula, data) {
  try {
    const students = await readStudents(); // Fetch students from the file
    const index = students.findIndex((student) => student.cedula === cedula);
    if (index !== -1) {
      students[index] = data;
      await writeJSONFile('../data/archivoEstudiantes.json',students); // Write updated students back to the file
      return students;
    } else {
      console.error("Student not found.");
      return null; // Or handle the error in a different way
    }
  } catch (error) {
    console.error("Error updating student:", error);
    return null; // Or handle the error in a different way
  }
}

// Function to delete a student
async function deleteStudent(cedula) {
  try {
    const students = await readStudents(); // Fetch students from the file
    const updatedStudents = students.filter((student) => student.cedula !== cedula);
    await writeJSONFile('../data/archivoEstudiantes.json',updatedStudents); // Write updated students back to the file
    return updatedStudents;
  } catch (error) {
    console.error("Error deleting student:", error);
    return null; // Or handle the error in a different way
  }
}
// ... (Rest of your script.js code)