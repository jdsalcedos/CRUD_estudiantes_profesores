<?php

// Check if the file exists
if (file_exists('data.bin')) {
  // Read the file contents
  $data = file_get_contents('data.bin');

  // Unserialize the data, checking for errors
  $usuarios = unserialize($data);

  // Check for unserialization errors
  if ($usuarios === false) {
      // Handle the unserialization error, perhaps by:
      echo "Registre los datos del usuario";
      // Or initialize an empty array
      $usuarios = []; 
  }
} 

?>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/styles.css">
    <link rel="stylesheet" href="css/bootstrap.css">
    <title>CRUD Personal Universidad</title>
</head>

<body>
    <div>
        <form action="crear_usuario.php" method="POST">
            <h1>CREAR USUARIO</h1>
            <input type="text" name="cedula" placeholder="Cedula">
            <input type="text" name="nombre" placeholder="Nombre">
            <input type="text" name="codigo" placeholder="Codigo">
            <input type="text" name="correo" placeholder="Correo institucional">
            <select id="tipo_usuario" name="tipo">
                <option value="Estudiante">Estudiante</option>
                <option value="Profesor">Profesor</option>
            </select>
            <br>
            <input type="submit" value="Agregar usuario">
        </form>
    </div>
    <div>
        <h3>Usuarios registrados</h3>
        <table class="users-table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Cedula</th>
                    <th>Nombre</th>
                    <th>Codigo</th>
                    <th>Correo</th>
                    <th>Tipo</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>

            <tbody>
                <?php 
                $id = 1;
                foreach ($usuarios as $usuario): 
                ?>
                    <tr>
                        <th><?= $id++ ?></th>
                        <th><?= $usuario['cedula'] ?></th>
                        <th><?= $usuario['nombre'] ?></th>
                        <th><?= $usuario['codigo'] ?></th>
                        <th><?= $usuario['correo'] ?></th>
                        <th><?= $usuario['tipo'] ?></th>
                        <th><a href="actualizar.php?cedula=<?= $usuario['cedula'] ?>" class="users-table--edit">Editar</a></th>
                        <th><a href="eliminar.php?cedula=<?= $usuario['cedula'] ?>" class="users-table--delete">Eliminar</a></th>
                    </tr>
                <?php endforeach; ?>
            </tbody>
        </table>
    </div>

</body>

</html>