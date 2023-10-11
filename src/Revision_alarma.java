
import java.time.LocalDate;

public class Revision_alarma extends Servicios {

    private int num_alarmaRevisada;

    public Revision_alarma(int num_alarmaRevisada, String trabajador, LocalDate fecha_de_inicio, String cliente) {
        super("revisor Especialista contra Incendios", fecha_de_inicio, cliente);
        this.num_alarmaRevisada = num_alarmaRevisada;
    }

    public int getNum_alarmaRevisada() {
        return num_alarmaRevisada;
    }

    public void setNum_alarmaRevisada(int num_alarmaRevisada) {
        this.num_alarmaRevisada = num_alarmaRevisada;
    }

    @Override
    public double costo_material() {
        return 0;
    }

    @Override
    public double costo_de_obra() {
        return (num_alarmaRevisada / 3) * 40;
    }

    @Override
    public double costo_total() {
        return (num_alarmaRevisada / 3) * 40;
    }

    @Override

    public String detalle() {
        return String.format("""
                             REVISION PERIODICA CONTRA INCENDIOS
                             Cliente: %s
                             Fecha de revision: %s
                             ----------------------------------------------
                             Total: %.2f
                             ----------------------------------------------
                             """, super.getCliente(), super.getFecha_de_inicio(), costo_total());
    }

}
