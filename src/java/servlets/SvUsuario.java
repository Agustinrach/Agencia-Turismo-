/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dominio.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PC
 */
@WebServlet(name = "SvUsuario", urlPatterns = {"/SvUsuario"})
public class SvUsuario extends HttpServlet {

    
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
        String usuario = request.getParameter("user");
        String contra = request.getParameter("pass");
        
        Controladora control = new Controladora();
        
        boolean autorizado = control.verificarUsuario(usuario,contra);
        
       if (autorizado == true){
        HttpSession miSession = request.getSession(true);
        miSession.setAttribute("usuario", usuario);
        miSession.setAttribute("contra", contra);
        
        response.sendRedirect ("principal.jsp");
       }else{
           
           response.sendRedirect( "index.jsp");
           
    }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
