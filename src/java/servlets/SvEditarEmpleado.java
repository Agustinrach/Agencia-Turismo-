/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dominio.Controladora;
import dominio.Empleado;
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


@WebServlet(name = "SvEditarEmpleado", urlPatterns = {"/SvEditarEmpleado"})
public class SvEditarEmpleado extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        }
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          SimpleDateFormat textFormat = new SimpleDateFormat("yyyy/MM/dd");
        String auxiliar = request.getParameter("fecha_nac");
        Date fecha_nac = null;

        long id = Long.parseLong(request.getParameter("id"));
        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String direccion = request.getParameter("direccion");
        String dni = request.getParameter("dni");
        String nacionalidad = request.getParameter("nacionalidad");
        Double celular = Double.parseDouble(request.getParameter("celular"));
        String email = request.getParameter("email");
        
        try {
            fecha_nac = textFormat.parse(auxiliar);
        } catch (ParseException ex) {
            Logger.getLogger(SvEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String cargo = request.getParameter("cargo");
        Double sueldo = Double.parseDouble(request.getParameter("sueldo"));
        
        Controladora control = new Controladora();
        
        Empleado emple = control.buscarEmpleado(id);
        
        
        
        
        emple.setNombre(nombre);
        emple.setApellido(apellido);
        emple.setDireccion(direccion);
        emple.setDni(dni);
        emple.setNacionalidad(nacionalidad);
        emple.setCelular(celular);
        emple.setCargo(cargo);
        emple.setSueldo(sueldo);
        emple.setEmail(email);
        emple.setFecha_nac(fecha_nac);
        
        
        control.editarEmpleado(emple);
        
        response.sendRedirect("verEmpleados.jsp");
        
        


    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        long id = Long.parseLong(request.getParameter("id"));
        
        Controladora control = new Controladora();
        Empleado emple = control.buscarEmpleado(id);
        
        HttpSession misession = request.getSession();
        
        misession.setAttribute("empleado", emple);
        response.sendRedirect("editarEmpleado.jsp");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
