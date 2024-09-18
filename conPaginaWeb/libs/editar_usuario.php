<?php
$dataFile = 'data.bin';

$id = $_POST['id'];
$cedula = $_POST['cedula'];
$nombre = $_POST['nombre'];
$codigo = $_POST['codigo'];
$correo = $_POST['correo'];
$tipo = $_POST['tipo'];


$data = fopen($dataFile, 'r+');

// Read the entire file contents into a string
$fileContents = fread($data, filesize($dataFile));

// Close the file
fclose($data);

$usuarios = unserialize($fileContents);

// Find the index of the user to delete
$key = array_search($id, array_column($usuarios, 'id'));

if ($key !== false) {
    $usuarios[$key]['cedula'] = $cedula;
    $usuarios[$key]['nombre'] = $nombre;
    $usuarios[$key]['codigo'] = $codigo;
    $usuarios[$key]['correo'] = $correo;
    $usuarios[$key]['tipo'] = $tipo;
    
    $data = fopen($dataFile, 'w'); 
    
    // Write the updated user data
    fwrite($data, serialize($usuarios)); 

    // Close the file
    fclose($data);

    // Redirige a la página de index
    Header("Location: index.php");
} else {
    // Maneja el caso en que el usuario no fue encontrado
    echo "El usuario no fue encontrado.";
}

?>