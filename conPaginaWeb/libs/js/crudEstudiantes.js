var nuevoId;
var db;
var request = indexedDB.open("estudiantesDB", 1);

function limpiar() {
  document.getElementById("cedula").value = "";
  document.getElementById("nombre").value = "";
  document.getElementById("codigoEstudiante").value = "";
  document.getElementById("matricula").value = "";
  document.getElementById("creditos").value = "";
}

$(function () {
  var crearBD = document.querySelector("#crear_tabla");
crearBD.addEventListener("click", function() {
  // Creamos la base de datos IndexedDB
  var request = indexedDB.open("estudiantesDB", 1);

  request.onupgradeneeded = function(event) {
    db = event.target.result;
    var store = db.createObjectStore("estudiantes", {
      keyPath: "cedula"
    });
    store.createIndex("nombre", "nombre", {
      unique: false
    });
    store.createIndex("codigoEstudiante", "codigoEstudiante", {
      unique: false
    });
    store.createIndex("matricula", "matricula", {
      unique: false
    });
    store.createIndex("creditos", "creditos", {
      unique: false
    });
  };

  request.onsuccess = function(event) {
    db = event.target.result;
    console.log("Base de datos creada satisfactoriamente");
  };

  request.onerror = function(event) {
    console.error("Error al crear la base de datos:", event.target.errorCode);
  };
});
  $("#listar").click(function () {
    cargarDatos();
  });

  function cargarDatos() {
    $("#listaEstudiantes").children().remove();
    var transaccion = db.transaction("estudiantes", "readwrite");
    var objectStore = transaccion.objectStore("estudiantes");
    var request = objectStore.getAll();
    
    request.onsuccess = function (event) {
      var result = event.target.result;
      

      for (var i = 0; i < result.length; i++) {
        var row = result[i];
        var estudiante =
          "<tr><td>" +
          row.cedula +
          "</td><td>" +
          row.nombre +
          "</td><td>" +
          row.codigoEstudiante +
          "</td><td>" +
          row.matricula +
          "</td><td>" +
          row.creditos +
          "</td></tr>";
        $("#listaEstudiantes").append(estudiante);
      }
    };

    request.onerror = function (event) {
      alert("Error al cargar los datos: " + event.target.errorCode);
    };
  }
});
