
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static Scanner entrada = new Scanner(System.in);
    public static ArrayList<Servicios> trabajo_pinturaa = new ArrayList();

    public static void main(String[] args) {
        boolean control = true;
        ArrayList<Servicios> trabajos = new ArrayList();
        do{
        } while (menu());
        

    }

    public static boolean menu() {
        System.out.print("""
                         seleccione
                         1. trabajo pintura.
                         2. revision de alarma
                         3. salir
                         >""");

        int seleccion = entrada.nextInt();
        switch (seleccion)
        {
            case 1:

                pintar();

                break;
            case 2:
                Revisioin_alarma();
                break;
            case 3:
                System.out.print("hasta la proxima");
                return false;
               
                    
        }
        return false;
    }

    public static void pintar() {
        Trabajo_pintura pintura = new Trabajo_pintura(0, 0, "", LocalDate.now(), "");
        System.out.print("nombre del trabajador: ");
        pintura.setTrabajador(entrada.next());
        System.out.print("Nombre de ccliente: ");
        pintura.setCliente(entrada.next());
        System.out.print("ingrese la superficie: ");
        pintura.setSuperficie(entrada.nextDouble());
        System.out.print("precio de la pintura: ");
        pintura.setPrecio_pintura(entrada.nextDouble());
        System.out.print(pintura.detalle());

//        Añado el objeto a nuestro array de pinturas...
        trabajo_pinturaa.add(pintura);
    }

    public static void Revisioin_alarma() {
        Revision_alarma alarma = new Revision_alarma(0, "", LocalDate.now(), "");
//        System.out.print("nombre del trabajador: ");
//        alarma.setTrabajador(entrada.next());
        System.out.print("nommbre del cliente: ");
        alarma.setCliente(entrada.next());
        System.out.print("numero de alarmas: ");
        alarma.setNum_alarmaRevisada(entrada.nextInt());
        System.out.print(alarma.detalle());
    }
}
