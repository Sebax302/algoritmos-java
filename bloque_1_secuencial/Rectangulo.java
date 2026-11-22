// Área y perímetro de un rectángulo
import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double L = 0.0;
        double A = 0.0;
        double AREA = 0.0;
        double P = 0.0;

        // Ejercicio: Área y perímetro de un rectángulo
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese el largo del rectangulo en metros:"));
        L = sc.nextDouble();
        // Proceso y cálculos
        while (L <= 0) {
            System.out.println(String.valueOf("El largo debe ser mayor que 0"));
            System.out.println(String.valueOf("Ingrese el largo del rectangulo en metros:"));
            L = sc.nextDouble();
        }
        System.out.println(String.valueOf("Ingrese el ancho del rectangulo en metros:"));
        A = sc.nextDouble();
        while (A <= 0) {
            System.out.println(String.valueOf("El ancho debe ser mayor que 0"));
            System.out.println(String.valueOf("Ingrese el ancho del rectangulo en metros:"));
            A = sc.nextDouble();
        }
        AREA = L * A;
        P = 2 * (L + A);
        System.out.println(String.valueOf("El area del rectangulo es: ") + String.valueOf(AREA) + String.valueOf(" metros cuadrados"));
        System.out.println(String.valueOf("El perimetro del rectangulo es: ") + String.valueOf(P) + String.valueOf(" metros"));
    }
}
