

<%@page import="java.util.Date"%>
<%@page import="dominio.Controladora"%>
<%@page import="java.util.List"%>
<%@page import="dominio.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

    <head>
        <meta charset='UTF-8'>

        <title>Responsive Table</title>

        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="verEmpleados/style.css">

        <!--[if !IE]><!--> 
        <style>




        </style>
        <!--<![endif]-->

    </head>

    <body>

        <div id="page-wrap">

            <h1>EMPLEADOS</h1>





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
                        <th>Cargo</th>
                        <th>Sueldo</th>
                        <th>Eliminar</th>
                        <th>Editar</th>


                    </tr>
                </thead>
                <tbody>
                    <% Controladora control = new Controladora();
                        List<Empleado> listaEmpleado = control.traerEmpleado();
                        for (Empleado emple : listaEmpleado) {
                    %>
                    <tr>
                        <% String nombre = emple.getNombre();
                            String apellido = emple.getApellido();                           
                            String direccion = emple.getDireccion();
                            String dni = emple.getDni();
                            String nacionalidad = emple.getNacionalidad();
                            Double celular = emple.getCelular();
                            String email = emple.getEmail();
                            Date fecha_nac = emple.getFecha_nac();
                            String cargo = emple.getCargo();
                            Double sueldo = emple.getSueldo();
                            long id = emple.getId();
    ;%>

                        <td><%=nombre%> </td>
                        <td><%=apellido%> </td>
                        <td><%=direccion%> </td>
                        <td><%=dni%> </td>
                        <td><%=nacionalidad%> </td>
                        <td><%=celular%> </td>
                        <td><%=email%> </td>
                        <td><%=fecha_nac%> </td>
                        <td><%=cargo%> </td>
                        <td><%=sueldo%> </td>
                        <td>
                            <form name="formBorrarEmpleado" action="SvEliminarEmpleado" method="POST">
                                <input type="hidden" name="id" value="<%=id%>">
                                <button type="submit"> Eliminar</button>
                            </form>
                        </td>
                        
                        <td>
                            <form name="formEditarEmpleado" action="SvEditarEmpleado" method="POST">
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
