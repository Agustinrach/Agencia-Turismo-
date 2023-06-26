package persistencia;

import dominio.Cliente;
import dominio.Empleado;
import dominio.PaqueteTuristico;
import dominio.ServicioTuristico;
import dominio.Usuario;
import dominio.Venta;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    ClienteJpaController clienteJPA = new ClienteJpaController();
    EmpleadoJpaController empleadoJPA = new EmpleadoJpaController();
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();
    PaqueteTuristicoJpaController paqueteJPA = new PaqueteTuristicoJpaController();
    ServicioTuristicoJpaController servicioJPA = new ServicioTuristicoJpaController();
    VentaJpaController ventaJPA = new VentaJpaController();

    public void crearEmpleado(Empleado empleado, Usuario usuario) {

        usuarioJPA.create(usuario);
        empleadoJPA.create(empleado);

    }

    public List<Empleado> traerEmpleado() {
        return empleadoJPA.findEmpleadoEntities();
    }

    public List<Usuario> traerUsuario() {
        return usuarioJPA.findUsuarioEntities();
    }

    public void eliminarEmpleado(long id) {
        try {
            empleadoJPA.destroy((int) id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Empleado buscarEmpleado(long id) {
        return empleadoJPA.findEmpleado((int) id);
    }

    public void editarEmpleado(Empleado emple) {
        try {
            empleadoJPA.edit(emple);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearCliente(Cliente cliente) {
        clienteJPA.create(cliente);
    }

    public List<Cliente> traerClientes() {
        return clienteJPA.findClienteEntities();
    }

    public void eliminarCliente(long id) {
        try {
            clienteJPA.destroy((int) id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cliente buscarCliente(long id) {
        return clienteJPA.findCliente((int) id);
    }

    public void editarCliente(Cliente cliente) {
        try {
            clienteJPA.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearServicio(ServicioTuristico servicio) {
        servicioJPA.create(servicio);
    }

    public List<ServicioTuristico> traerServicios() {
        return servicioJPA.findServicioTuristicoEntities();
    }

    public void eliminarServicio(long id) {

        try {
            servicioJPA.destroy((int) id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarServicio(ServicioTuristico servicio) {
        try {
            servicioJPA.edit(servicio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ServicioTuristico buscarServicio(long id) {
        
        return servicioJPA.findServicioTuristico((int) id);
    }

    public void crearPaquete(PaqueteTuristico paquete) {
        paqueteJPA.create(paquete);
    }

    public List<PaqueteTuristico> traerPaquetes() {
        return paqueteJPA.findPaqueteTuristicoEntities();
    }

    public List<Empleado> traerEmpleados() {
        return empleadoJPA.findEmpleadoEntities();
    }
    
    public List<Venta> traerVentas() {
        return ventaJPA.findVentaEntities();
    }
    
    

    public void crearVenta(Venta venta) {
        ventaJPA.create(venta);
    }
    
    

    

}
