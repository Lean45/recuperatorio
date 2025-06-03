import java.security.cert.CertPath;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sector {
    private String nombre;
    private String descripcion;
    private Set<Cultivo> cultivos = new HashSet<>();

    public Sector(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void agregarCultivos(Cultivo a){
        cultivos.add(a);
    }

    public String getCosechasDelSector(){
    return "no me acuerdo :c";
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

    public Set<Cultivo> getCultivos() {
        return cultivos;
    }

    public void setCultivos(Set<Cultivo> cultivos) {
        this.cultivos = cultivos;
    }
}
