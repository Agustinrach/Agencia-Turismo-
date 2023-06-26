
package dominio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Usuario implements Serializable {
    
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private int id;
    @Basic 
    private String nombre_usuario;
    private String contrasenia;

    public Usuario(int id, String nombre_usuario, String contrasenia) {
        this.id = id;
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
    }

    public Usuario() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{id=").append(id);
        sb.append(", nombre_usuario=").append(nombre_usuario);
        sb.append(", contrasenia=").append(contrasenia);
        sb.append('}');
        return sb.toString();
    }
    
    
}
