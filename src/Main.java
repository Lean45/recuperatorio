import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //intanciando objetos
        //instanciando sectores
        Sector Frutales = new Sector("Frutales", "diversas frutas");
        Sector Aromaticas = new Sector("Aromaticas", "diversas flores aromaticas");

        //instanciando cultivos
        Cultivo cult1 = new Cultivo("Manzanas", TipoCultivo.FRUTAL, LocalDate.now());
        Cultivo cul2 = new Cultivo("Orquidea", TipoCultivo.AROMATICA, LocalDate.now());

        //Instanciando Voluntario
        //domicilio
        Domicilio domicilio = new Domicilio("San martin", "2728", "Ciudad", "Mendoza");
        Domicilio domicilio2 = new Domicilio("Rivadavia", "7654", "Ciudad", "Mendoza");
        Domicilio domicilio3 = new Domicilio("9 de julio", "5734", "Ciudad", "Mendoza");


        Turno turno = new Turno(LocalDate.now(), "15:30 a 23:00");
        Turno turno2 = new Turno(LocalDate.now(), "09:00 a 15:30");

        Tarea t1 = new Tarea("plantar semillas", LocalDate.now(), Frutales);
        Tarea t2 = new Tarea("Colocar insectisida", LocalDate.now(), Frutales);
        Tarea t3 = new Tarea("cosechar", LocalDate.now(), Frutales);

        Voluntario Lean = new Voluntario("leandro", "45123345", "lean@gmail.com", domicilio, turno);
        Voluntario Licha = new Voluntario("Lisandro", "45123246", "licha@gmail.com", domicilio2, turno2);

        Lean.realizarTarea(t1);
        Lean.realizarTarea(t2);
        Lean.realizarTarea(t3);

        //CAPACITADORES

        Capacitador Cinthia = new Capacitador("Cinthia", "45123987", "Cin@gmail.com", domicilio3, "Cultivadora Java");

        //Capacitacion

        Capacitacion cap = new Capacitacion("Cultivos Java", LocalDate.now(), Cinthia);
        cap.agregarVoluntarios(Lean);
        cap.agregarVoluntarios(Licha);

        cap.mostrarAsistentes();

        //DONACIONES
        Donacion palas = new Donacion(TipoDonacion.HERRAMIENTAS, "Donacion de palas", LocalDate.now());
        Donante LeanDona = new Donante("Lean", "45138112", "Lean@gmail.com", domicilio);

        LeanDona.Donar(palas);

        LeanDona.mostrarDonaciones();
    }
}