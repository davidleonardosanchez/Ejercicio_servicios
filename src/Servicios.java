
import java.time.LocalDate;

public abstract class Servicios {

    private String trabajador;
    private LocalDate fecha_de_inicio;
    private String cliente;

    public Servicios(String trabajador, LocalDate fecha_de_inicio, String cliente) {
        this.trabajador = trabajador;
        this.fecha_de_inicio = fecha_de_inicio;
        this.cliente = cliente;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public LocalDate getFecha_de_inicio() {
        return fecha_de_inicio;
    }

    public void setFecha_de_inicio(LocalDate fecha_de_inicio) {
        this.fecha_de_inicio = fecha_de_inicio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public abstract double costo_material();

    public abstract double costo_de_obra();

    public abstract double costo_total();

    public abstract String detalle();

}
