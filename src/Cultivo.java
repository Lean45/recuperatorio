import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Cultivo {
    private String especie;
    private TipoCultivo tipoCultivo;
    private LocalDate fechaSiembra;
    private Set<Cosecha> cosechas = new HashSet<>();

    public Cultivo(String especie, TipoCultivo tipoCultivo, LocalDate fechaSiembra){
        this.especie = especie;
        this.tipoCultivo = tipoCultivo;
        this.fechaSiembra = fechaSiembra;
    }

    public void agregarCosecha(Cosecha a){
        cosechas.add(a);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public TipoCultivo getTipoCultivo() {
        return tipoCultivo;
    }

    public void setTipoCultivo(TipoCultivo tipoCultivo) {
        this.tipoCultivo = tipoCultivo;
    }

    public LocalDate getFechaSiembra() {
        return fechaSiembra;
    }

    public void setFechaSiembra(LocalDate fechaSiembra) {
        this.fechaSiembra = fechaSiembra;
    }

    public Set<Cosecha> getCosechas() {
        return cosechas;
    }

    public void setCosechas(Set<Cosecha> cosechas) {
        this.cosechas = cosechas;
    }
}
