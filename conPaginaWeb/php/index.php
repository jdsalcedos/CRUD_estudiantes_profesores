<?php
include('conexion.php');

$con = conexion();

$sql = "SELECT * from usuarios";
$query = mysqli_query($con, $sql);

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
                <?php while ($row = mysqli_fetch_array($query)): ?>
                    <tr>
                        <th><?= $row['id'] ?></th>
                        <th><?= $row['cedula'] ?></th>
                        <th><?= $row['nombre'] ?></th>
                        <th><?= $row['codigo'] ?></th>
                        <th><?= $row['correo'] ?></th>
                        <th><?= $row['tipo'] ?></th>

                        <th><a href="" class="users-table--edit">Editar</a></th>
                        <th><a href="" class="users-table--delete">Eliminar</a></th>
                    </tr>
                <?php endwhile; ?>
            </tbody>
        </table>
    </div>

</body>

</html>