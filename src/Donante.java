import java.util.HashSet;
import java.util.Set;

public class Donante extends Persona {
    private Set<Donacion> donaciones = new HashSet<>();


    public Donante(String nombre, String dni, String email, Domicilio domicilio) {
        super(nombre, dni, email, domicilio);
    }

    public void Donar(Donacion a){
        donaciones.add(a);
    }

    public void mostrarDonaciones(){
        for(Donacion a : donaciones){
            System.out.println(a);
        }
    }

    public Set<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(Set<Donacion> donaciones) {
        this.donaciones = donaciones;
    }
}
