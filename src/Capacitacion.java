import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Capacitacion {
    private String tema;
    private LocalDate fecha;
    private Capacitador capacitador;
    private Set<Voluntario> voluntarios = new HashSet<>();

    public Capacitacion(String tema, LocalDate fecha, Capacitador capacitador) {
        this.tema = tema;
        this.fecha = fecha;
        this.capacitador = capacitador;
    }

    public void agregarVoluntarios(Voluntario a){
        voluntarios.add(a);
    }

    public void mostrarAsistentes(){
        for (Voluntario v : voluntarios){
            System.out.println(v);
        }
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Capacitador getCapacitador() {
        return capacitador;
    }

    public void setCapacitador(Capacitador capacitador) {
        this.capacitador = capacitador;
    }

    public Set<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(Set<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }
}
