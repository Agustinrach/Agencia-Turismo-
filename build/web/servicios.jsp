

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/stylee.css">
        <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Servicios</title>
    </head>
    <body>
        <h1>Alta de Servicios</h1>
        
        <p>Ingrese los datos del Servicio</p>
        
        <form action="SvServicios" method="POST">
        <label> ELEGIR TIPO DE SERVICIO <br><br>
                
  <input type="radio" id="hotel" name="nombre" value="hotel">
  <label for="hotel">Hotel por Noche</label><br>
  
  <input type="radio" id="alquiler_auto" name="nombre" value="alquiler_auto">
  <label for="alquiler_auto">Alquiler de Auto</label><br>
  
  <input type="radio" id="pasaje_colectivo" name="nombre" value="pasaje_colectivo">
  <label for="pasaje_colectivo">Pasajes de Colectivo</label><br>
  
  <input type="radio" id="pasaje_avion" name="nombre" value="pasaje_avion">
  <label for="pasaje_avion">Pasajes de Avion</label><br>
  
  <input type="radio" id="pasaje_tren" name="nombre" value="pasaje_tren">
  <label for="pasaje_tren">Pasajes de Tren</label><br>
  
  <input type="radio" id="excursiones" name="nombre" value="excursiones">
  <label for="excursiones">Excursiones</label><br>
  
  <input type="radio" id="entradas" name="nombre" value="entradas">
  <label for="entradas">Entradas a Eventos</label><br>
                </label>
            <div class="bloque">     
        <p><label>Descripcion: </label><input type = "text" name ="descripcion"></p>
        <p><label>Destino: </label><input type = "text" name ="destino"></p>
        <p><label>Fecha del Servicio </label><input type ="text" name ="fecha_servicio" value="yyyy/MM/dd"></p>
        <p><label>Costo </label><input type = "text" name ="costo"></p>
           
        
        
        
        <button type="submit">ENVIAR</button>
         </div>
        </form>
        <a href="principal.jsp">VOLVER</a>
        <a href="verServicios.jsp">VER SERVICIOS</a>
        
        
        
        
    </body>
</html>