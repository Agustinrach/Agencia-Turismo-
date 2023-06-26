
package dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
public class Venta implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int num_venta;
    @Basic
    private String medio_pago;
    @Temporal(TemporalType.DATE)
    private Date fecha_venta;
    
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Empleado empleado;
    @ManyToOne
    private PaqueteTuristico paquete;
    @ManyToOne
    private ServicioTuristico servicio;

    public Venta(int num_venta, String medio_pago, Date fecha_venta, Cliente cliente, Empleado empleado, PaqueteTuristico paquete, ServicioTuristico servicio) {
        this.num_venta = num_venta;
        this.medio_pago = medio_pago;
        this.fecha_venta = fecha_venta;
        this.cliente = cliente;
        this.empleado = empleado;
        this.paquete = paquete;
        this.servicio = servicio;
    }
    

    

    public Venta() {
    }

    public int getNum_venta() {
        return num_venta;
    }

    public void setNum_venta(int num_venta) {
        this.num_venta = num_venta;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public String getMedio_pago() {
        return medio_pago;
    }

    public void setMedio_pago(String medio_pago) {
        this.medio_pago = medio_pago;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venta{num_venta=").append(num_venta);
        sb.append(", fecha_venta=").append(fecha_venta);
        sb.append(", medio_pago=").append(medio_pago);
        sb.append('}');
        return sb.toString();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public PaqueteTuristico getPaquete() {
        return paquete;
    }

    public void setPaquete(PaqueteTuristico paquete) {
        this.paquete = paquete;
    }

    public ServicioTuristico getServicio() {
        return servicio;
    }

    public void setServicio(ServicioTuristico servicio) {
        this.servicio = servicio;
    }

    
    
    
    
}
