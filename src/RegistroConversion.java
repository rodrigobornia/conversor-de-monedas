import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// este objeto se usa para almacenar toda la informacion de la conversion de la moneda
public class RegistroConversion {
    private int numeroOpcion;
    private String monedaOrigen;
    private String monedaDestino;
    private double monto;
    private double resultado;
    private TasaDeCambio tasaDeCambio;
    private String horaDeRealizacion;

    // Constructor vacío (necesario para Gson)
    public RegistroConversion(){}

    //Se crea el constructor con los parametros
    public RegistroConversion(int numeroOpcion, String monedaOrigen, String monedaDestino,
                              double monto, double resultado, TasaDeCambio tasaDeCambio) {
        this.numeroOpcion = numeroOpcion;
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.monto = monto;
        this.resultado = resultado;
        this.tasaDeCambio = tasaDeCambio;

        //Establecer la hora actual con el formato
        this.horaDeRealizacion = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss"));
    }

    // Getters (requeridos por Gson)
    public int getNumeroOpcion() { return numeroOpcion; }
    public String getMonedaOrigen() { return monedaOrigen; }
    public String getMonedaDestino() { return monedaDestino; }
    public double getMonto() { return monto; }
    public double getResultado() { return resultado; }
    public TasaDeCambio getTasaDeCambio() { return tasaDeCambio; }
}


