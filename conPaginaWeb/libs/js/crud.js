import { readBinaryFile, writeBinaryFile } from './archivo.js';

let students = [];

function createStudent(data) {
  students.push(data);
  writeBinaryFile('../data/archivoBinario.dat', students);
}

function readStudents() {
  return readBinaryFile('../data/archivoBinario.dat').then((dataArray) => {
    students = [];
    for (let i = 0; i < dataArray.length; i += 5) {
      let id = dataArray[i];
      let name = String.fromCharCode(dataArray[i + 1], dataArray[i + 2], dataArray[i + 3], dataArray[i + 4]);
      students.push({ id, name });
    }
    return students;
  });
}

function updateStudent(id, data) {
  for (let i = 0; i < students.length; i++) {
    if (students[i].id === id) {
      students[i] = data;
      break;
    }
  }
  writeBinaryFile('../data/archivoBinario.dat', students);
}

function deleteStudent(id) {
  students = students.filter((student) => student.id !== id);
  writeBinaryFile('../data/archivoBinario.dat', students);
}

export { createStudent, readStudents, updateStudent, deleteStudent };