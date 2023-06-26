package dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
public class ServicioTuristico implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo_servicio;
    @Basic
    private String nombre;
    private String descripcion;
    private String destino;    
    private int costo_servicio;
    @Temporal(TemporalType.DATE)
    private Date fecha_servicio;
    @ManyToMany
    public List<PaqueteTuristico> lista_paquetes;
    
    @OneToMany 
    public List<Venta>lista_ventas;
    

    public ServicioTuristico(int codigo_servicio, String nombre, String descripcion, String destino, Date fecha_servicio, int costo_servicio) {
        this.codigo_servicio = codigo_servicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.destino = destino;
        this.fecha_servicio = fecha_servicio;
        this.costo_servicio = costo_servicio;
    }

    public ServicioTuristico() {
    }

    public int getCodigo_servicio() {
        return codigo_servicio;
    }

    public void setCodigo_servicio(int codigo_servicio) {
        this.codigo_servicio = codigo_servicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecha_servicio() {
        return fecha_servicio;
    }

    public void setFecha_servicio(Date fecha_servicio) {
        this.fecha_servicio = fecha_servicio;
    }

    public int getCosto_servicio() {
        return costo_servicio;
    }

    public void setCosto_servicio(int costo_servicio) {
        this.costo_servicio = costo_servicio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ServicioTuristico{codigo_servicio=").append(codigo_servicio);
        sb.append(", nombre=").append(nombre);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", destino=").append(destino);
        sb.append(", fecha_servicio=").append(fecha_servicio);
        sb.append(", costo_servicio=").append(costo_servicio);
        sb.append('}');
        return sb.toString();
    }
    
    

}
