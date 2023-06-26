<%@page import="dominio.ServicioTuristico"%>
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

            <h1>SERVICIOS REGISTRADOS</h1>





            <table>
                <thead>
                    <tr><th>Codigo</th>
                        <th>Nombre</th>
                        <th>Descripcion</th>
                        <th>Destino</th>
                        <th>Costo</th>
                        <th>Fecha</th>
                        <th>Eliminar</th>
                        <th>Editar</th>



                    </tr>
                </thead>
                <tbody>
                    <% Controladora control = new Controladora();
                        List<ServicioTuristico> listaServicios = control.traerServicio();
                        for (ServicioTuristico servicio : listaServicios) {
                    %>
                    <tr>
                        <%  
                            String nombre = servicio.getNombre();
                            String descripcion = servicio.getDescripcion();
                            String destino = servicio.getDestino();
                            int costo = servicio.getCosto_servicio();
                            Date fecha_servicio = servicio.getFecha_servicio();

                            long id = servicio.getCodigo_servicio();
                            ;%>

                            <td><%=id%></td>
                        <td><%=nombre%> </td>
                        <td><%=descripcion%> </td>
                        <td><%=destino%> </td>
                        <td><%=costo%> </td>
                        <td><%=fecha_servicio%> </td>
                     

                        <td>
                            <form name="formBorrarServicio" action="SvEliminarServicio" method="POST">
                                <input type="hidden" name="id" value="<%=id%>">
                                <button type="submit"> Eliminar</button>
                            </form>
                        </td>

                        <td>
                            <form name="formEditarServicio" action="SvEditarServicio" method="POST">
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
