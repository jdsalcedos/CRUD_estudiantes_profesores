<?php

include('conexion.php');

$con = conexion();

$id=$_GET['id'];

$sql = "SELECT * FROM usuarios WHERE id='$id'";

$query = mysqli_query($con, $sql);

$row=mysqli_fetch_array($query);
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
            <input type="hidden" name="id" value="<?= $row['id'] ?>">
            <input type="text" name="cedula" placeholder="Cedula" value="<?= $row['cedula'] ?>">
            <input type="text" name="nombre" placeholder="Nombre" value="<?= $row['nombre'] ?>">
            <input type="text" name="codigo" placeholder="Codigo" value="<?= $row['codigo'] ?>">
            <input type="text" name="correo" placeholder="Correo institucional" value="<?= $row['correo'] ?>">
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