<?php

include('conexion.php');

$con = conexion();

$id = $_POST['id'];
$cedula = $_POST['cedula'];
$nombre = $_POST['nombre'];
$codigo = $_POST['codigo'];
$correo = $_POST['correo'];
$tipo = $_POST['tipo'];

$sql = "UPDATE usuarios SET nombre='$nombre', cedula='$cedula', codigo='$codigo', correo='$correo', tipo='$tipo' WHERE id='$id'";
$query = mysqli_query($con, $sql);

if ($query){
    Header("Location: index.php");
}





?>