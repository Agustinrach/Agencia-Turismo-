<%@page import="dominio.Cliente"%>
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
         <li> <a href="verClientes.jsp">VER CLIENTES</a> </li>
        <p>Ingrese los datos del cliente</p>
        <form action="SvEditarCliente" method="GET">
            <% HttpSession misession = request.getSession();
            Cliente cliente = (Cliente) misession.getAttribute("cliente");
{%>
            
<p>         <input type = "text" placeholder="Nombre " name ="nombre" value="<%= cliente.getNombre() %>"></p>
        <p><input type = "text" placeholder="Apellido " name ="apellido" value="<%=cliente.getApellido()%>"></p>
        <p><input type = "text" placeholder="Direccion "  name ="direccion" value="<%=cliente.getDireccion()%>"></p>
        <p><input type = "text" placeholder="DNI " name ="dni" value="<%=cliente.getDni()%>"></p>
        <p><input type = "text" placeholder="Nacionalidad " name ="nacionalidad" value="<%=cliente.getNacionalidad()%>"></p>
        <p><input type = "text" placeholder="Celular " name ="celular" value="<%=cliente.getCelular()%>"></p>
        <p><input type = "text" placeholder="Email " name ="email" value="<%=cliente.getEmail()%>"></p>
        
        <p><input type = "text" placeholder="Fecha Nac " name ="fecha_nac" value="<%=cliente.getFecha_nac()%>"></p>
        
        <input type="hidden" name="id" value="<%=cliente.getId()%>">
        <button type="submit"> Editar</button>
        <a href="verClientes.jsp"><input type="button" value="VOLVER"></a>
        <%}%>
        </form>
    </body>
    </body>
</html>
