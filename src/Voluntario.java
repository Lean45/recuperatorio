import java.util.HashSet;
import java.util.Set;

public class Voluntario extends Persona{
    private Set<Tarea> tareasRealizadas = new HashSet<>();
    private Turno turno;

    public Voluntario(String nombre, String dni, String email, Domicilio domicilio, Turno turno) {
        super(nombre, dni, email, domicilio);
        this.turno = turno;
    }

    public void realizarTarea(Tarea a){
        tareasRealizadas.add(a);
    }

    public Set<Tarea> getTareasRealizadas() {
        return tareasRealizadas;
    }

    public void setTareasRealizadas(Set<Tarea> tareasRealizadas) {
        this.tareasRealizadas = tareasRealizadas;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
