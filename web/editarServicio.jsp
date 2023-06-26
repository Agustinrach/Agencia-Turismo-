<%@page import="dominio.ServicioTuristico"%>
<%@page import="dominio.Cliente"%>
<%@page import="dominio.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SERVICIOS</title>
    </head>
    <body>
         <h1>Editar Servicio</h1>
         
        <p>Ingrese los datos del Servicio</p>
        <form action="SvEditarServicio" method="GET">
            <% HttpSession misession = request.getSession();
            ServicioTuristico servicio = (ServicioTuristico) misession.getAttribute("servicio");
{%>
            
<p>         <input type = "text" placeholder="Nombre " name ="nombre" value="<%= servicio.getNombre() %>"></p>
        <p><input type = "text" placeholder="Descripcion " name ="descripcion" value="<%=servicio.getDescripcion()%>"></p>
        <p><input type = "text" placeholder="Destino "  name ="destino" value="<%=servicio.getDestino()%>"></p>
        <p><input type = "text" placeholder="Costo " name ="costo" value="<%=servicio.getCosto_servicio()%>"></p>
        <p><input type = "text" placeholder="Fecha Servicio " name ="fecha_servicio" value="<%=servicio.getFecha_servicio()%>"></p>
        
        
        <input type="hidden" name="id" value="<%=servicio.getCodigo_servicio()%>">
        <button type="submit"> Editar</button>
        <a href="verServicios.jsp"><input type="button" value="VOLVER"></a>
        <%}%>
        </form>
    </body>
    </body>
</html>
