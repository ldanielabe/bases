<%-- 
    Document   : index
    Created on : 24/05/2017, 01:24:35 PM
    Author     : estudiante
--%>
<!DOCTYPE html>
<html lang="en"> 
    <head>
        <title>PYMES</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
       
    </head>
    <body>

        <div class="container-fluid text-center">    
            <div class="row content">
               
                <div class="col-sm-12 text-left"> 
                    <h2>Producto</h2>
                    <form action="consultarProd.htm" method="post">
                        <center>
                            <table border="20" align="center" bordercolor="#FFFFFF" >
                                <tr> <td>
                                        Id :</td> <td><input type="number" name="txtId" required/></td> </tr>

                                <!--   <input type="image" src="https://static.wixstatic.com/media/17ddc5_d4d73c1b69a84b0b8bee42ac7ec23aaa.png" alt="Submit" width="20" height="20">-->
                            </table>
                            <input type="submit" value="Consultar..." />
                        </center>
                    </form>
                    <h1>Consultar Producto: ${requestScope.Prod.nombre}</h1>
                    <table border="1">   
                        <tr>
                            <th>Id</th>
                            <th>Nombre</th>
                            <th>Descripcion</th>
                            <th>Precio</th>
                            <th>Stack</th>
                        </tr>
                        <tr>
                            <td>${Prod.id}</td>
                            <td>${Prod.nombre}</td>
                            <td>${Prod.descripcion}</td>
                            <td>${Prod.precio}</td>
                            <td>${Prod.stack}</td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>


