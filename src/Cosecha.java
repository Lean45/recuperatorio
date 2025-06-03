import java.time.LocalDate;

public class Cosecha {
    private LocalDate fecha;
    private double cantidadKG;

    public Cosecha(LocalDate fecha, double cantidadKG){
        this.fecha = fecha;
        this.cantidadKG = cantidadKG;
    }
    public Cosecha(double cantidadKG){
        this.fecha = LocalDate.now();
        this.cantidadKG = cantidadKG;
    }

    public double getCantidadKG() {
        return cantidadKG;
    }

    public void setCantidadKG(double cantidadKG) {
        this.cantidadKG = cantidadKG;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
