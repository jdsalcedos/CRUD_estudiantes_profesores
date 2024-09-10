<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRUD Personal Universidad</title>
</head>
<body>
    <div>
        <form action="">
            <h1>CREAR USUARIO</h1>
            <input type="text" name="cedula" placeholder="Cedula">
            <input type="text" name="nombre" placeholder="Nombre">
            <input type="text" name="codigo" placeholder="Codigo">
            <input type="text" name="correo" placeholder="Correo institucional">
            <select id="tipo_usuario" name="tipo_usuario">
                <option value="Estudiante">Estudiante</option>
                <option value="Profesor">Profesor</option>
            </select>

            <input type="submit" value="Agregar usuario">
        </form>
    </div>
<div>
    <h3>Usuarios registrados</h3>
    <table>
        <thead>
            <tr>
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
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>

            <th><a href="">Editar</a></th>
            <th><a href="">Eliminar</a></th>
        </tbody>
    </table>
</div>

</body>
</html>