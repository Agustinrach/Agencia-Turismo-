/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dominio.Cliente;
import dominio.Controladora;
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
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvEditarServicio", urlPatterns = {"/SvEditarServicio"})
public class SvEditarServicio extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        SimpleDateFormat textFormat = new SimpleDateFormat("yyyy/MM/dd");
        String auxiliar = request.getParameter("fecha_servicio");
        Date fecha_servicio = null;

        long id = Long.parseLong(request.getParameter("id"));
        
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");
        String destino = request.getParameter("destino");
        int costo = (int) Double.parseDouble(request.getParameter("costo"));
        
        
        try {
            fecha_servicio = textFormat.parse(auxiliar);
        } catch (ParseException ex) {
            Logger.getLogger(SvClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
        
        Controladora control = new Controladora();
        
        ServicioTuristico servicio = control.buscarServicio(id);
        
        
        
        
        servicio.setNombre(nombre);
        servicio.setDescripcion(descripcion);
        servicio.setDestino(destino);
        servicio.setCosto_servicio(costo);
        
      
        servicio.setFecha_servicio(fecha_servicio);
        
        
        control.editarServicio(servicio);
        
        response.sendRedirect("verServicios.jsp");
        
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       long id = Long.parseLong(request.getParameter("id"));
        
        Controladora control = new Controladora();
        ServicioTuristico servicio = control.buscarServicio(id);
        
        HttpSession misession = request.getSession();
        
        misession.setAttribute("servicio", servicio);
        response.sendRedirect("editarServicio.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
