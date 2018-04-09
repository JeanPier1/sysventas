<%-- 
    Document   : index
    Created on : 26/03/2018, 06:32:37 PM
    Author     : alum.fial8
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body>
        <div class="container" style="max-width: 300px;">
            <form action="hc" method="post">
            <div class="form-group">
                <label>Usuario:</label>
                <input type="text" class="form-control" name="user">
            </div>
            <div class="form-group">
                <label>Clave:</label>
                <input type="password" class="form-control" name="clave">
            </div>
            <div class="form-group">
                <input type="submit" class="btn btn-primary" value="Enviar">
            </div>
           </form>
        </div>
            <script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
            <script src="js/bootstrap.min.js" type="text/javascript"></script>
            <script src="js/script.js"></script>      
    </body>
</html>
