// Tarifa de estacionamiento con recargo nocturno
import java.util.Locale;
import java.util.Scanner;

public class TarifaParqueoNocturno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double H = 0.0;
        double TB = 0.0;
        double T = 0.0;
        String N = "";

        // Ejercicio: Tarifa de estacionamiento con recargo nocturno
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese las horas de estacionamiento:"));
        H = sc.nextDouble();
        System.out.println(String.valueOf("Es horario nocturno? (S/N):"));
        N = sc.next();
        // Proceso y cálculos
        if (H < 0  ||  (!N.equals("S")  &&  !N.equals("s")  &&  !N.equals("N")  &&  !N.equals("n"))) {
            System.out.println(String.valueOf("Datos no validos"));
        } else {
            TB = H * 1.50;
            T = TB;
            if (H > 8) {
                T = T * 1.25;
            }
            if (N.equals("S")  ||  N.equals("s")) {
                T = T * 1.30;
            }
            System.out.println(String.valueOf("Tarifa base: $") + String.valueOf(TB));
            System.out.println(String.valueOf("Total a pagar: $") + String.valueOf(T));
        }
    }
}
