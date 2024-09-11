<?php
include('conexion.php');
$con = conexion();

$id = null;
$cedula = $_POST['cedula'];
$nombre = $_POST['nombre'];
$codigo = $_POST['codigo'];
$correo = $_POST['correo'];
$tipo = $_POST['tipo'];

$sql = "INSERT INTO usuarios VALUES('$id', '$cedula', '$nombre', '$codigo', '$correo', '$tipo')";
$query = mysqli_query($con, $sql);

if ($query){
    Header("Location: index.php");
}

?>