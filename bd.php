<?php
$host='localhost';
$username='root';
$password='';
$bd='peliculas';

try{
    $conexion=new PDO("mysql:host=$host;dbname=$bd", $username, $password);
}catch(Exception $th){
    echo $th->getMessage();
}
?>