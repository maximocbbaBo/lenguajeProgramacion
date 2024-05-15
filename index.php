<?php include("tem/cabezera.php"); ?>
            <section class="container text-center py-4" id="contentH1">
                <h1>PELICULAS PRIMIUM</h1>
            </section>
            <section class="container">
                        <div class="container text-center">
                            <h2>CREAR USURIO</h2>
                        </div>
                <!--place from space login create renember fain alwes-->
                <br>
                <div class="container text-center">
                            <h2>INICIAR SECCION</h2>
                        </div>
                <!--place from space "LOGIN STARTED"create -->
                <form  action="" method="post" id="formStarted" name="" class="" enctype="multipart/form-data">
                    <article class="container">
                        <div class="mb-3">
                            <label for="usuario" class="form-label">Usuario</label>
                            <input
                                required
                                type="text"
                                class="form-control"
                                name="usuario"
                                id="usuario"
                                aria-describedby="helpId"
                                placeholder="Usuario"
                            />
                        </div>
                        <div class="mb-3">
                            <label for="clave" class="form-label">Contraseña:</label>
                            <input
                                required
                                type="password"
                                class="form-control"
                                name="clave"
                                id="clave"
                                aria-describedby="helpId"
                                placeholder="Contraseña:"
                            />
                        </div>
                        <div class="container text-center">
                            <button
                                type="submit"
                                class="btn btn-warning text-white"
                            >
                                AGREGAR
                            </button>
                        </div>
                        
                        
                    </article>
                </form>
            </section>
<?php include("tem/footer.php"); ?>