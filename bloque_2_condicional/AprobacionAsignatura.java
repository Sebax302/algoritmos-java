// Aprobación de asignatura
import java.util.Locale;
import java.util.Scanner;

public class AprobacionAsignatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double P = 0.0;

        // Ejercicio: Aprobación de asignatura
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese el promedio final (0 a 10):"));
        P = sc.nextDouble();
        // Proceso y cálculos
        while (P < 0  ||  P > 10) {
            System.out.println(String.valueOf("El promedio debe estar entre 0 y 10"));
            System.out.println(String.valueOf("Ingrese el promedio final (0 a 10):"));
            P = sc.nextDouble();
        }
        if (P >= 7) {
            System.out.println(String.valueOf("APRUEBA"));
        } else {
            System.out.println(String.valueOf("NO APRUEBA"));
        }
    }
}
