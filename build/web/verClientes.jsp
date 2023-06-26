

<%@page import="dominio.Cliente"%>
<%@page import="java.util.Date"%>
<%@page import="dominio.Controladora"%>
<%@page import="java.util.List"%>
<%@page import="dominio.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset='UTF-8'>

        <title>Clientes </title>

        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="verEmpleados/style.css">

        <!--[if !IE]><!--> 
        <style>




        </style>
        <!--<![endif]-->

    </head>

    <body>

        <div id="page-wrap">

            <h1>CLIENTES REGISTRADOS</h1>





            <table>
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Direccion</th>
                        <th>Dni</th>
                        <th>Nacionalidad</th>
                        <th>Celular</th>
                        <th>Email</th>
                        <th>Fecha Nac</th>                        
                        <th>Eliminar</th>
                        <th>Editar</th>


                    </tr>
                </thead>
                <tbody>
                    <% Controladora control = new Controladora();
                        List<Cliente> listaClientes = control.traerClientes();
                        for (Cliente cliente : listaClientes) {
                    %>
                    <tr>
                        <% String nombre = cliente.getNombre();
                            String apellido = cliente.getApellido();                           
                            String direccion = cliente.getDireccion();
                            String dni = cliente.getDni();
                            String nacionalidad = cliente.getNacionalidad();
                            Double celular = cliente.getCelular();
                            String email = cliente.getEmail();
                            Date fecha_nac = cliente.getFecha_nac();
                            
                            long id = cliente.getId();
    ;%>

                        <td><%=nombre%> </td>
                        <td><%=apellido%> </td>
                        <td><%=direccion%> </td>
                        <td><%=dni%> </td>
                        <td><%=nacionalidad%> </td>
                        <td><%=celular%> </td>
                        <td><%=email%> </td>
                        <td><%=fecha_nac%> </td>
                        
                        <td>
                            <form name="formBorrarCliente" action="SvEliminarCliente" method="POST">
                                <input type="hidden" name="id" value="<%=id%>">
                                <button type="submit"> Eliminar</button>
                            </form>
                        </td>
                        
                        <td>
                            <form name="formEditarCliente" action="SvEditarCliente" method="POST">
                                <input type="hidden" name="id" value="<%=id%>">
                                <button type="submit"> Editar</button>
                            </form>
                        </td>
                        
                        
                    </tr>




                </tbody>
                <%}%>
            </table>

        </div>
        <a href="principal.jsp"><input type="button" value="VOLVER"></a>
    </body>

</html>
