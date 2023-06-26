package dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class PaqueteTuristico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo_paquete;
    @Basic
    private Double costo_paquete;
    @ManyToMany
    public List<ServicioTuristico> lista_servicios_incluidos;
    
    @OneToMany 
    public List<Venta>lista_ventas;

    public PaqueteTuristico(int codigo_paquete, List<ServicioTuristico> lista_servicios_incluidos, Double costo_paquete) {
        this.codigo_paquete = codigo_paquete;
        this.lista_servicios_incluidos = lista_servicios_incluidos;
        this.costo_paquete = costo_paquete;
    }

    public PaqueteTuristico() {
    }
    

    public int getCodigo_paquete() {
        return codigo_paquete;
    }

    public void setCodigo_paquete(int codigo_paquete) {
        this.codigo_paquete = codigo_paquete;
    }

    public List<ServicioTuristico> getLista_servicios_incluidos() {
        return lista_servicios_incluidos;
    }

    public void setLista_servicios_incluidos(List<ServicioTuristico> lista_servicios_incluidos) {
        this.lista_servicios_incluidos = lista_servicios_incluidos;
    }

    public Double getCosto_paquete() {
        return costo_paquete;
    }

    public void setCosto_paquete(Double costo_paquete) {
        this.costo_paquete = costo_paquete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaqueteTuristico{codigo_paquete=").append(codigo_paquete);
        sb.append(", lista_servicios_incluidos=").append(lista_servicios_incluidos);
        sb.append(", costo_paquete=").append(costo_paquete);
        sb.append('}');
        return sb.toString();
    }

}
