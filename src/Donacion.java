import java.time.LocalDate;

public class Donacion {
    private TipoDonacion tipo;
    private String Descripcion;
    private LocalDate fecha;

    public Donacion(TipoDonacion tipo, String descripcion, LocalDate fecha) {
        this.tipo = tipo;
        Descripcion = descripcion;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Donacion{" +
                "tipo=" + tipo +
                ", Descripcion='" + Descripcion + '\'' +
                ", fecha=" + fecha +
                '}';
    }

    public TipoDonacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoDonacion tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
