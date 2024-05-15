
<?php  include("newbd.php");
$query="SELECT * FROM `image_tbl`";
$resul=mysqli_query($conexion,$query);
?>
<?php include("bd.php"); 
    if(isset($_GET['txtID'])){
        print_r($_GET['txtID']);
        $txtID=(isset($_GET['txtID'])?$_GET['txtID']:"");
    
        $sentencia=$conexion->prepare("DELETE FROM image_tbl
                                        where id=:id");
        $sentencia->bind_param(":id",$txtID);
        
        $sentencia->execute();
    
        header("location:pageMovi.php");
    }
    $sentencia=$conexion->prepare("SELECT FROM image_tbl");
    $listDelete=$sentencia->fetchAll(PDO::FETCH_ASSOC);
    //$sentencia->execute();
?>
<?php include("tem/cabezera.php");
?>
<br>
<link rel="stylesheet" href="estiloPage.css">
<div class="containe text-center py-3">
    <h4>PELICULAS MOVI</h4>
</div>
<br>
<section class="container">
    <div class="container">
        <span><b>USUARIO:</b><p><?php?></p></span>
    </div>
</section>
<section class="container">
    
</section>
<section class="container">
    <div class="row">
        <div class="col-lg-4">
            <h2 class="text-primary text-center">Subir Imagen</h2>
            <form action="crateImage.php" method="post" enctype="multipart/form-data">
            <div class="form-group">
                <label for="imagen">Seleccione una Image</label>
                <input type="file" name="imagen" id="imagen" accept="image/*">
            </div>
            <div class="form-group">
                <div class="mb-3">
                    <label for="nombreImage" class="form-label">Nombrar Imagen:</label>
                    <input
                        type="text"
                        class="form-control"
                        name="nombreImage"
                        id="nombreImage"
                        aria-describedby="helpId"
                        placeholder="Nombrar Imagen:"
                    />
                </div>
                
            </div>
            <?php if(isset($_SESSION['mensaje'])){?>

            <div class="alert alert-<?php echo $_SESSION['tipo'];?> alert-dismissible fade show" role="alert">
                <strong><?php echo $_SESSION['mensaje'];?></strong>
            </div>
            <?php session_unset();
    } ?>
            <button name="btnImage" type="submit" value="" href="<?php echo $url_base; ?>">Subir Imagen</button>
            
        </form>

        </div>
        
        <div class="col-lg-8">
            <div class="text-primary">
                <h1 class="text-primary text-center">Galeria De Imagenes:</h1>
            </div>
            <hr>
            <div class="card text-start">
                <?php foreach ($resul as $row){?>
                    <img class="card-img-top" src="imagenes/<?php echo $row['imagen']; ?>" alt="" >
                    <div class="card-body">
                        <h4 class="card-title"><strong><?php echo $row['nombreImage']; ?></strong></h4>
                        <a
                            name=""
                            id=""
                            class="btn btn-warning"
                            href="pageMovi.php?txtID=<?php echo $row['id'];?>"
                            role="button"
                            >ELIMINAR</a
                        >
                        
                    </div>
                <?php
                } ?>
                
            </div>
            
        </div>
    </div>
</section>
<?php include("tem/footer.php"); ?>
