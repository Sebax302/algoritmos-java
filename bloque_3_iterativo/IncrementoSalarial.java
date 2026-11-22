// Incremento salarial anual
import java.util.Locale;
import java.util.Scanner;

public class IncrementoSalarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double S = 0.0;
        int A = 0;

        // Ejercicio: Incremento salarial anual
        // Variables y datos del problema
        // Proceso y cálculos
        S = 1500;
        A = 1;
        while (A <= 6) {
            S = S * 1.10;
            // Entrada de datos y validaciones
            System.out.println(String.valueOf("Salario al finalizar el año ") + String.valueOf(A) + String.valueOf(": $") + String.valueOf(S));
            A = A + 1;
        }
        System.out.println(String.valueOf("Salario final despues de 6 años: $") + String.valueOf(S));
    }
}
