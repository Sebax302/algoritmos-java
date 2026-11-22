// Tipo de ecuación cuadrática
import java.util.Locale;
import java.util.Scanner;

public class EcuacionCuadratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double A = 0.0;
        double B = 0.0;
        double C = 0.0;
        double D = 0.0;

        // Ejercicio: Tipo de ecuación cuadrática
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese el coeficiente A:"));
        A = sc.nextDouble();
        System.out.println(String.valueOf("Ingrese el coeficiente B:"));
        B = sc.nextDouble();
        System.out.println(String.valueOf("Ingrese el coeficiente C:"));
        C = sc.nextDouble();
        // Proceso y cálculos
        if (A == 0) {
            System.out.println(String.valueOf("No es una ecuacion cuadratica"));
        } else {
            D = Math.pow(B, 2) - 4 * A * C;
            if (D > 0) {
                System.out.println(String.valueOf("Tiene dos soluciones reales"));
            } else {
                if (D == 0) {
                    System.out.println(String.valueOf("Tiene una solucion real"));
                } else {
                    System.out.println(String.valueOf("No tiene soluciones reales"));
                }
            }
        }
    }
}
