import java.time.LocalDate;
import java.util.Date;

public class Tarea {
    private String descripcion;
    private LocalDate fecha;
    private Sector sector;

    public Tarea(String descripcion, LocalDate fecha, Sector sector) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.sector = sector;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }
}
