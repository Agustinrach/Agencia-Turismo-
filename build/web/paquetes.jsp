<%@page import="dominio.ServicioTuristico"%>
<%@page import="java.util.List"%>
<%@page import="dominio.Controladora"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="css/stylee.css">
        <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PAQUETES</title>
    </head>
    <body>
        <h1>Alta de Paquetes</h1>
        
        <p>Ingrese los datos del Paquete</p>
       
        <form action="SvPaquetes" method="POST">
        <p><label> ELEGIR SERVICIOS <br><br>
                
                <% Controladora control = new Controladora();
                 double costoFinal =0;
                
                        List<ServicioTuristico> listaServicio = control.traerServicio();
                        
                        for (ServicioTuristico servicio : listaServicio)
                        {
                         int id = servicio.getCodigo_servicio();
                    %>
                    
                    <input type="checkbox"  name="id" value="<%=id%>">
                    <label for="<%servicio.getCodigo_servicio();%>">  <%out.println(servicio.getNombre()+", "+servicio.getDescripcion()+" ,"+servicio.getDestino()+", $"+servicio.getCosto_servicio()+", *Codigo*: "+servicio.getCodigo_servicio());%>  </label><br>
                    
                      
              
                    <%}%>      
                
                  
       
                    

        
        <button type="submit">ENVIAR</button>
        
        </form>
                    <br>
        
        <a href="principal.jsp">VOLVER</a>
        <a href="verPaquetes.jsp">VER PAQUETES</a> 
        
        
        
    </body>
</html>
