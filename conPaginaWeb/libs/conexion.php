<?php
function conexion(){
    $file = 'data.bin'; 

    if (!file_exists($file)) {
        touch($file);
    }

    $connect = fopen($file, 'r+b');

    return $connect;
};
?>