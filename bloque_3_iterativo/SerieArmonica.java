// Suma de la serie armónica
import java.util.Locale;
import java.util.Scanner;

public class SerieArmonica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double S = 0.0;
        int N = 0;
        int I = 0;

        // Ejercicio: Suma de la serie armónica
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese N:"));
        N = sc.nextInt();
        // Proceso y cálculos
        if (N <= 0) {
            System.out.println(String.valueOf("N debe ser mayor que cero"));
        } else {
            S = 0;
            for (I = 1; I <= N; I++) {
                S = S + 1.0 / I;
            }
            System.out.println(String.valueOf("Suma de la serie: ") + String.valueOf(S));
        }
    }
}
