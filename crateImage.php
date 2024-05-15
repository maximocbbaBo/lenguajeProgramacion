<?php
include("newbd.php");
if (isset($_POST['btnImage'])) {
    # code...
    $imagen=$_FILES['imagen']['name'];
    $nombre=$_POST['nombreImage'];
    if (isset($imagen) && $imagen != "") {
        # code...
        $tipo=$_FILES['imagen']['type'];
        //variable to location of place off img
        $temp=$_FILES['imagen']['tmp_name'];

        //another condicional
        if (!(strpos($tipo,'git') || strpos($tipo,'jpeg') || strpos($tipo,'webp'))) {
            # code...
            $_SESSION['mensaje']='solo se permite archivos jpeg, gif,webp';
            $_SESSION['tipo']='danger';
            echo "<div class='alert alert-danger' >solo se permite archivos jpeg, gif,webp</div>";
            //localizar imagen in the place
            header("location:pageMovi.php");
        }else{
            //create query
            $query="INSERT INTO image_tbl(imagen,nombreImage)
                                VALUES('$imagen','$nombre')";
            $result=mysqli_query($conexion,$query);
            if($result){
                move_uploaded_file($temp,'imagenes/'. $imagen);

                $_SESSION['mensaje']='se ha subido correctamente';

                $_SESSION['tipo']='success';

                header("location:pageMovi.php");
            }else{
                $_SESSION['mensaje']='ocurrio un error en el servidor';
                $_SESSION['tipo']='danger';
            }
        }
    }
}
?>