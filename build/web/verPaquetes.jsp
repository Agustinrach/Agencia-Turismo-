
<%@page import="java.util.Iterator"%>
<%@page import="dominio.PaqueteTuristico"%>
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

        <title>Paquetes </title>

        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="verEmpleados/style.css">

        <!--[if !IE]><!--> 
        <style>




        </style>
        <!--<![endif]-->

    </head>

    <body>

        <div id="page-wrap">

            <h1>PAQUETES REGISTRADOS</h1>





            <table>
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Costo</th>


                    </tr>
                </thead>
                <tbody>
                    <% Controladora control = new Controladora();
                        List<PaqueteTuristico> listaPaquetes = control.traerPaquetes();
                        
                        
                        for (PaqueteTuristico paquete : listaPaquetes) {
                    %>
                    <tr>
                        <%        
                            double costo = paquete.getCosto_paquete();
                            long id = paquete.getCodigo_paquete();
                            
                            
                           %>

                        <td><%=id%> </td>

                        <td><%out.print("$" + costo);%> </td>

                     

                        


                    </tr>




                </tbody>
                <%}%>
            </table>

        </div>
        <a href="principal.jsp"><input type="button" value="VOLVER"></a>
    </body>

</html>

