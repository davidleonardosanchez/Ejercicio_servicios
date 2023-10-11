
import java.time.LocalDate;

public class Trabajo_pintura extends Servicios {

    private double superficie;
    private double precio_pintura;

    public Trabajo_pintura(double superficie, double precio_pintura, String trabajador, LocalDate fecha_de_inicio, String cliente) {
        super(trabajador, fecha_de_inicio, cliente);
        this.superficie = superficie;
        this.precio_pintura = precio_pintura;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecio_pintura() {
        return precio_pintura;
    }

    public void setPrecio_pintura(double precio_pintura) {
        this.precio_pintura = precio_pintura;
    }

    @Override
    public double costo_material() {
        return (superficie / 7.8) * precio_pintura;
    }

    @Override
    public double costo_de_obra() {
        return (superficie / 10) * 9.5;
    }

    public double costo_adicional() {
        double total_p = costo_material() + costo_de_obra();
        if (superficie < 50)
        {
            double total = total_p * 1.15;
        }
        return (total_p);
    }

    @Override
    public double costo_total() {
        double total_p = costo_material() + costo_de_obra();
        if (superficie < 50)
        {
            total_p = total_p * 1.15;
        }
        return total_p;
    }

    @Override
    public String detalle() {
        return "Trabajo pintura.\nCliente: " + super.getCliente() + "\nFecha de inicio: " + super.getFecha_de_inicio() + "\n-----------------------------------\n"
                + "Pintor: " + super.getTrabajador()
                + String.format("\nCoste material: %.2f\nCoste mano de obra: %.2f\nCoste adicional: %.2f\nTotal: %.2f",
                         costo_material(), costo_de_obra(), costo_adicional(), costo_total()) + "\n-----------------------------------\n";
    }
}
