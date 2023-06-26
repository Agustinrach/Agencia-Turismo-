/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dominio.Cliente;
import dominio.Controladora;
import dominio.Empleado;
import dominio.PaqueteTuristico;
import dominio.ServicioTuristico;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvVentas", urlPatterns = {"/SvVentas"})
public class SvVentas extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        SimpleDateFormat textFormat = new SimpleDateFormat("yyyy/MM/dd");
        String auxiliar = request.getParameter("fecha_venta");
        Date fecha_venta = null;
        
        String medio_pago = request.getParameter("medio_pago");
        String cliente = request.getParameter("cliente");
        String empleado = request.getParameter("empleado");
        String servicio = request.getParameter("servicio");
        String paquete = request.getParameter("paquete");
        
                    
     
        
        
        try {
            fecha_venta = textFormat.parse(auxiliar);
        } catch (ParseException ex) {
            Logger.getLogger(SvEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Cliente client = new Cliente();
        client.setNombre("cliente");
        
        control.crearVenta(medio_pago, fecha_venta);

        response.sendRedirect("principal.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
