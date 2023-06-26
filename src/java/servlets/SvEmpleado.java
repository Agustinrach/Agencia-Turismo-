package servlets;


import dominio.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvEmpleado", urlPatterns = {"/SvEmpleado"})
public class SvEmpleado extends HttpServlet {

    

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
        String auxiliar = request.getParameter("fecha_nac");
        Date fecha_nac = null;
        
        
        
        
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
        String nombre_usuario = request.getParameter("nombreUsu");
        String contrasenia = request.getParameter("contrasenia");

        control.crearEmpleado(nombre, apellido, direccion, dni, nacionalidad, celular, email, fecha_nac, cargo, sueldo, nombre_usuario, contrasenia);
        response.sendRedirect("principal.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
