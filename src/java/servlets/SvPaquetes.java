/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import static dominio.PaqueteTuristico_.lista_servicios_incluidos;
import dominio.ServicioTuristico;
import dominio.*;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvPaquetes", urlPatterns = {"/SvPaquetes"})
public class SvPaquetes extends HttpServlet {

    List<ServicioTuristico> lista_servicios_incluidos;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Controladora control = new Controladora();
        String[] s = request.getParameterValues("id");
       
        List <ServicioTuristico> servicios = new ArrayList<>();
        
        double costoPaquete =0;
        
        for(String id : s ){
            int ids = Integer.parseInt(id);
            ServicioTuristico servi;
            
            servi = control.buscarServicio(ids);
            servicios.add(servi);
            costoPaquete+= servi.getCosto_servicio();
        }
        
        
        control.crearPaquete(servicios, costoPaquete);
        response.sendRedirect("principal.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
