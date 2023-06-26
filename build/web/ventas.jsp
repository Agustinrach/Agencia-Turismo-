<%@page import="dominio.PaqueteTuristico"%>
<%@page import="dominio.Cliente"%>
<%@page import="dominio.Empleado"%>
<%@page import="java.util.List"%>
<%@page import="dominio.Controladora"%>
<%@page import="dominio.ServicioTuristico"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/stylee.css">
        <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>VENTAS</title>
    </head>
    <body>
        <h1>Alta de Ventas</h1>

        <p>Ingrese los datos de la venta</p>
    
    <form action="SvVentas" method="POST">

        <p><label> EMPLEADO: <br><br>


                <% Controladora control = new Controladora();

                    List<Empleado> listaEmpleados = control.traerEmpleados();

                    for (Empleado emple : listaEmpleados) {

                %>

                <input type="radio" id="<%emple.getId();%>" name="empleado" value="<%emple.getId();%>">
                <label for="<%emple.getId();%>">  <%out.println(emple.getNombre() + " " + emple.getApellido());%>  </label><br>



                <%}%>   

                <p><label> CLIENTE: <br><br>
                        <%

                            List<Cliente> listaClientes = control.traerClientes();

                            for (Cliente cliente : listaClientes) {

                        %>

                        <input type="radio" id="<%cliente.getId();%>" name="cliente" value="<%cliente.getId();%>">
                        <label for="<%cliente.getId();%>">  <%out.println(cliente.getNombre() + " " + cliente.getApellido() + " " + cliente.getDni());%>  </label><br>



                        <%}%>   


                        <p><label> SERVICIO: <br><br>


                                <%

                                    List<ServicioTuristico> listaServicio = control.traerServicio();

                                    for (ServicioTuristico servicio : listaServicio) {

                                %>

                                <input type="radio" id="<%servicio.getCodigo_servicio();%>" name="servicio" value="<%servicio.getCodigo_servicio();%>">
                                <label for="<%servicio.getCodigo_servicio();%>">  <%out.println(servicio.getNombre() + ", " + servicio.getDescripcion() + " ," + servicio.getDestino() + ", $" + servicio.getCosto_servicio() + ", *Codigo*: " + servicio.getCodigo_servicio());%>  </label><br>



                                <%}%>   



                             <p><label> PAQUETE: <br><br>


                                      <%

                                    List<PaqueteTuristico> listaPaquetes = control.traerPaquetes();

                                    for (PaqueteTuristico paquete : listaPaquetes) {

                                %>

                                <input type="radio" id="<%paquete.getCodigo_paquete();%>" name="paquete" value="<%paquete.getCodigo_paquete();%>">
                                <label for="<%paquete.getCodigo_paquete();%>">  <%out.println(paquete.getCodigo_paquete()+ ", " +  paquete.getCosto_paquete());%>  </label><br>



                                <%}%>   
                                
                                <p><label>Fecha de la venta </label><input type ="text" name ="fecha_venta" value="yyyy/MM/dd"></p>
                                <p><label>Forma de pago </label><input type = "text" name ="medio_pago"></p>
                                


                                <button type="submit">ENVIAR</button>
                                
                                </form>
                                <a href="principal.jsp">VOLVER</a>
                                <a href="verVentas.jsp">VER VENTAS</a> </li