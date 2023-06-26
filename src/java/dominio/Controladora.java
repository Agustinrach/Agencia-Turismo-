package dominio;

import java.util.Date;
import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();


    public void crearEmpleado(String nombre, String apellido, String direccion, String dni, String nacionalidad, Double celular, String email, Date fecha_nac, String cargo, Double sueldo, String nombre_usuario, String contrasenia) {
        Empleado empleado = new Empleado();
        Usuario usuario = new Usuario();

        //asigno valores a empleado
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);       
        empleado.setDireccion(direccion);
        empleado.setDni(dni);
        empleado.setNacionalidad(nacionalidad);
        empleado.setCelular(celular);
        empleado.setEmail(email);
        empleado.setFecha_nac(fecha_nac);
        empleado.setCargo(cargo);
        empleado.setSueldo(sueldo);
        

        //asigno valores a usuario
        usuario.setNombre_usuario(nombre_usuario);
        usuario.setContrasenia(contrasenia);

        //asigno usuario a empleado
        empleado.setUsu(usuario);

        controlPersistencia.crearEmpleado(empleado, usuario);
    }
    
    public List<Empleado> traerEmpleado() {
        return controlPersistencia.traerEmpleado();
    }
    
    public List<Cliente> traerClientes() {
        return controlPersistencia.traerClientes();
    }
     public List<ServicioTuristico> traerServicio() {
        return controlPersistencia.traerServicios();
    }
     
      public List<PaqueteTuristico> traerPaquetes(){
        return controlPersistencia.traerPaquetes();
    }
      
      public List<Empleado> traerEmpleados(){
        return controlPersistencia.traerEmpleados();
    }
      
      public List<Venta> traerVentas(){
        return controlPersistencia.traerVentas();
    } 
      
    
    public boolean verificarUsuario(String usuarioo, String contra) {
        List<Usuario> listaUsuarios = controlPersistencia.traerUsuario();

        if (listaUsuarios != null) {
            for (Usuario usu : listaUsuarios) {
                if (usu.getNombre_usuario().equals(usuarioo) && usu.getContrasenia().equals(contra)) {
                    return true;
                }
            }

        }
        return false;
    }

    public void eliminarEmpleado(long id) {
        controlPersistencia.eliminarEmpleado(id);
    }

    public Empleado buscarEmpleado(long id) {
        return controlPersistencia.buscarEmpleado(id);
    }

    public void editarEmpleado(Empleado emple) {
        
        
        controlPersistencia.editarEmpleado(emple);
    }

    public void crearCliente(String nombre, String apellido, String direccion, String dni, String nacionalidad, Double celular, String email, Date fecha_nac) {
         Cliente cliente = new Cliente();
         
         cliente.setNombre(nombre);
         cliente.setApellido(apellido);
         cliente.setDireccion(direccion);
         cliente.setDni(dni);
         cliente.setNacionalidad(nacionalidad);
         cliente.setCelular(celular);
         cliente.setEmail(email);
         cliente.setFecha_nac(fecha_nac);
         
         controlPersistencia.crearCliente(cliente);
    }

    public void eliminarCliente(long id) {
        controlPersistencia.eliminarCliente(id);
    }

    public Cliente buscarCliente(long id) {
        return controlPersistencia.buscarCliente(id);
    }

    public void editarCliente(Cliente cliente) {
        controlPersistencia.editarCliente(cliente);
    }

    public void crearServicio(String nombre, String descripcion, String destino, int costo, Date fecha_servicio) {
        
        ServicioTuristico servicio = new ServicioTuristico();
        
        servicio.setNombre(nombre);
        servicio.setDescripcion(descripcion);
        servicio.setDestino(destino);
        servicio.setCosto_servicio(costo);
        servicio.setFecha_servicio(fecha_servicio);
        
        controlPersistencia.crearServicio(servicio);

        
    }

  public void eliminarServicio(long id) {
        controlPersistencia.eliminarServicio(id);
    }
   
  public void editarServicio(ServicioTuristico servicio){
      controlPersistencia.editarServicio(servicio);
  }

    public ServicioTuristico buscarServicio(long id) {
        return controlPersistencia.buscarServicio(id);
    }

    public void crearPaquete(List<ServicioTuristico> servicios, double costoPaquete) {
        
        PaqueteTuristico paquete = new PaqueteTuristico();
        paquete.setLista_servicios_incluidos(servicios);
        
        double costoPaqueteTotal = costoPaquete-(costoPaquete*0.1);
        paquete.setCosto_paquete(costoPaqueteTotal);
        
        controlPersistencia.crearPaquete(paquete);
    }

    public void crearVenta(String medio_pago, Date fecha_venta) {
        
        Venta venta = new Venta();
        venta.setMedio_pago(medio_pago);
        venta.setFecha_venta(fecha_venta);
      
        
        
        
        controlPersistencia.crearVenta(venta);
   
    }
   
    
}

  
        

   


