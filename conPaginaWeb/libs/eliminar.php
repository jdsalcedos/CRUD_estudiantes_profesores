<?php

$dataFile = 'data.bin';

$id=$_GET['id'];
// Read the data from the binary file
$data = file_get_contents($dataFile);

// Unserialize the data
$usuarios = unserialize($data);

// Find the index of the user to delete
$index = array_search($id, array_column($usuarios, 'id'));

// Remove the user from the array
if ($index !== false) {
    unset($usuarios[$index]);
}

// Serialize the data
$data = serialize($usuarios);

// Write the data back to the binary file
file_put_contents($dataFile, $data);

// Redirect to the index page
header("Location: index.php");

?>