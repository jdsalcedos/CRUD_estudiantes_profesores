<?php

$dataFile = 'data.bin';

$cedula=$_GET['cedula'];
// Read the data from the binary file
$data = file_get_contents($dataFile);

// Unserialize the data
$usuarios = unserialize($data);

// Find the index of the user to delete
$key = array_search($cedula, array_column($usuarios, 'cedula'));

// Remove the user from the array
if ($index !== false) {
    unset($usuarios[$key]);
}

// Serialize the data
$data = serialize($usuarios);

// Write the data back to the binary file
file_put_contents($dataFile, $data);

// Redirect to the index page
header("Location: index.php");

?>