

<%@page import="dominio.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>Editar Empleados</h1>
         <li> <a href="verEmpleados.jsp">VER EMPLEADOS</a> </li>
        <p>Ingrese los datos del empleado</p>
        <form action="SvEditarEmpleado" method="GET">
            <% HttpSession misession = request.getSession();
            Empleado emple = (Empleado) misession.getAttribute("empleado");
{%>
            
<p>         <input type = "text" placeholder="Nombre " name ="nombre" value="<%= emple.getNombre() %>"></p>
        <p><input type = "text" placeholder="Apellido " name ="apellido" value="<%=emple.getApellido()%>"></p>
        <p><input type = "text" placeholder="Direccion "  name ="direccion" value="<%=emple.getDireccion()%>"></p>
        <p><input type = "text" placeholder="DNI " name ="dni" value="<%=emple.getDni()%>"></p>
        <p><input type = "text" placeholder="Nacionalidad " name ="nacionalidad" value="<%=emple.getNacionalidad()%>"></p>
        <p><input type = "text" placeholder="Celualr " name ="celular" value="<%=emple.getCelular()%>"></p>
        <p><input type = "text" placeholder="Email " name ="email" value="<%=emple.getEmail()%>"></p>
        <p><input type = "text" placeholder="Cargo " name ="cargo" value="<%=emple.getCargo()%>"></p>
        <p><input type = "text" placeholder="Sueldo " name ="sueldo" value="<%=emple.getSueldo()%>"></p>
        <p><input type = "text" placeholder="Fecha Nac " name ="fecha_nac" value="<%=emple.getFecha_nac()%>"></p>
        
        <input type="hidden" name="id" value="<%=emple.getId()%>">
        <button type="submit"> Editar</button>
        <a href="verEmpleados.jsp"><input type="button" value="VOLVER"></a>
        <%}%>
        </form>
    </body>
    </body>
</html>
