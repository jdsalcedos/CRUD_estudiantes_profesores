<?php
  $data = file_get_contents('data.bin');
  $users = unserialize($data);

  $id = null;
  $cedula = $_POST['cedula'];
  $nombre = $_POST['nombre'];
  $codigo = $_POST['codigo'];
  $correo = $_POST['correo'];
  $tipo = $_POST['tipo'];

  $new_user = [
    'id' => $id,
    'cedula' => $cedula,
    'nombre' => $nombre,
    'codigo' => $codigo,
    'correo' => $correo,
    'tipo' => $tipo
  ];

  $users[] = $new_user;

  $data = serialize($users);
  file_put_contents('data.bin', $data);

  Header("Location: index.php");
?>