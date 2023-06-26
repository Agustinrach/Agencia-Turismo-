<%-- 
    Document   : verVentas
    Created on : 11 feb. 2023, 17:05:47
    Author     : PC
--%>
<%@page import="java.util.Date"%>
<%@page import="dominio.Controladora"%>
<%@page import="java.util.List"%>
<%@page import="dominio.Venta"%>
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

            <h1>Ventas</h1>





            <table>
                <thead>
                    <tr>
                        <th>Nro Venta</th>
                        <th>Fecha Venta</th>
                        <th>Medio Pago</th>

                    </tr>
                </thead>
                <tbody>
                    <% Controladora control = new Controladora();
                        List<Venta> listaVenta = control.traerVentas();
                        for (Venta venta: listaVenta){
                    %>
                    <tr>
                        <%  int nro_venta = venta.getNum_venta();
                            Date fecha_venta = venta.getFecha_venta();
                            String medio_pago = venta.getMedio_pago()
                           
    ;%>

                        <td><%=nro_venta%> </td>
                        <td><%=fecha_venta%> </td>
                        <td><%=medio_pago%> </td>
                       
                      
                        
                        
                    </tr>




                </tbody>
                <%}%>
            </table>

        </div>
        <a href="principal.jsp"><input type="button" value="VOLVER"></a>
    </body>

</html>
