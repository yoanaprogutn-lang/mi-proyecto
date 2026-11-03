import java.util.Date;

public class Servicio {
    private String ID;
    private String empresa;
    private String destino;
    private Date horario;
    private int cantAsientos;
    private double precio;
    private int asientosDisponibles;


    private ListaDeEspera<String> listaEspera; // O el tipo de objeto pasajero que uses

    public Servicio(String ID, String empresa, String destino, Date horario, int cantAsientos, double precio) {
        this.ID = ID;
        this.empresa = empresa;
        this.destino = destino;
        this.horario = horario;
        this.cantAsientos = cantAsientos;
        this.precio = precio;
        this.asientosDisponibles = cantAsientos; // ¡Aquí inicializamos el contador con el total!
        this.listaEspera = new ListaDeEspera<>();
    }