<%-- 
    Document   : empleados
    Created on : 15 dic. 2021, 18:53:43
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <link rel="stylesheet" href="css/stylee.css">
        <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Empleados</title>    
    </head>
    <body>
         <h1>Alta Empleados</h1>
         <div class="form-style">
        <p>Ingrese los datos del empleado</p>
        <form action="SvEmpleado" method="POST">
             <div class="bloque">     
        <p><label>Nombre:</label><input type = "text" name ="nombre"></p>
        <p><label>Apellido:</label><input type = "text" name ="apellido"></p>
        <p><label>Direccion:</label><input type = "text" name ="direccion"></p>
        <p><label>DNI:</label><input type = "text" name ="dni"></p>
        <p><label>Nacionalidad:</label><input type = "text" name ="nacionalidad"></p>
        <p><label>Celular:</label><input type = "text" name ="celular"></p>
        <p><label>Email:</label><input type = "text" name ="email"></p>
        <p><label>Cargo:</label><input type = "text" name ="cargo"></p>
        <p><label>Sueldo:</label><input type = "text" name ="sueldo"></p>
        <p><label>Fecha de Nacimiento:</label><input type ="text" name ="fecha_nac" value="yyyy/MM/dd"></p>
        <p><label>Nombre de Usuario:</label><input type = "text" name ="nombreUsu"></p>
        <p><label>Contraseña:</label><input type = "password" name ="contrasenia"></p>
        <button type="submit">ENVIAR</button>
      
        </form>
</div>
        
        <a href="principal.jsp">VOLVER</a>
        <a href="verEmpleados.jsp">VER EMPLEADOS</a> 

        
        </div>
    </body> 

    
</html>
