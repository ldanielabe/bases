<%-- 
    Document   : index
    Created on : 24/05/2017, 01:24:35 PM
    Author     : estudiante
--%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">  
    <head> 

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/price-range.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <link href="css/responsive.css" rel="stylesheet">

        <title>PYMES</title>
        <link href="StyleSheet.css" rel="stylesheet" type="text/css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <script>
            $(document).ready(function () {
                $('#Registrar').click(function () {
                    $.get("registrarProd.htm", function (data, status) {
                        $('#contenido').html(data);
                    });
                });

                $('#Consultar').click(function () {
                    $.get("consultarProd.htm", function (data, status) {
                        $('#contenido').html(data);
                    });
                });

                $('#Link').click(function () {
                    $.get("prueba.htm", function (data, status) {
                        $('#contenido').html(data);
                    });

                });

            });
        </script>
    </head>

    <body id="body">

        <jsp:include page="header.jsp" />

        <jsp:include page="slide.jsp" />
        <div id="container">

            <div class="container-fluid text-center">    
                <div class="row content">
                    <div class="col-sm-2 sidenav">
                        <!--<h3>Producto</h3>
                        <p> <a href="#" id="Registrar">Registrar</a></p>
                        <p><a href="#" id="Consultar">Consultar</a></p>
                        <p><a href="#" id="Link">Link</a></p>
                        -->
                        <jsp:include page="productos.jsp" />
                    </div>
                    <div class="col-sm-8 text-left" id="contenido">
                    </div>
                    <div class="col-sm-2 sidenav">
                        <div class="well">
                            <p>ADS</p>
                        </div>
                        <div class="well">
                            <p>ADS</p>
                        </div>
                    </div>
                </div>
            </div>
            <div id="footer">
                <footer class="container-fluid text-center">
                    <p>Footer Text</p>
                </footer>
            </div>

            <script src="js/jquery.js"></script>
            <script src="js/bootstrap.min.js"></script>
            <script src="js/jquery.scrollUp.min.js"></script>
            <script src="js/price-range.js"></script>
            <script src="js/jquery.prettyPhoto.js"></script>
            <script src="js/main.js"></script>
        </div>
    </body>
</html>

          