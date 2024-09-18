<?php

// Abrir el archivo binario en modo lectura binaria
$file = fopen('data.bin', 'rb');

// Leer el contenido completo del archivo en una variable
$data = fread($file, filesize('data.bin'));

// Cerrar el archivo
fclose($file);

// Decodificar los datos serializados 
$usuarios = unserialize($data);

// Obtener el ID del usuario a actualizar
$id = $_GET['id'];

// Buscar el usuario en el array de usuarios
$usuario = array_filter($usuarios, function ($user) use ($id) {
    return $user['id'] == $id;
});

// Obtener los datos del usuario
$usuario = reset($usuario);

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/styles.css">
    <link rel="stylesheet" href="css/bootstrap.css">
    <title>Actualizar usuarios</title>
</head>
<body>
    <div class="">
        <form action="editar_usuario.php" method="POST">
            <h1>Actualizar usuario</h1>
            <input type="hidden" name="id" value="<?= $usuario['id'] ?>">
            <input type="text" name="cedula" placeholder="Cedula" value="<?= $usuario['cedula'] ?>">
            <input type="text" name="nombre" placeholder="Nombre" value="<?= $usuario['nombre'] ?>">
            <input type="text" name="codigo" placeholder="Codigo" value="<?= $usuario['codigo'] ?>">
            <input type="text" name="correo" placeholder="Correo institucional" value="<?= $usuario['correo'] ?>">
            <select id="tipo_usuario" name="tipo">
                <option value="Estudiante">Estudiante</option>
                <option value="Profesor">Profesor</option>
            </select>
            <br>
            <input type="submit" value="Actualizar usuario">
        </form>
    </div>
</body>
</html>