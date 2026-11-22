// Factorial de un numero
import java.util.Locale;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int N = 0;
        int X = 0;
        int F = 0;

        // Ejercicio: Factorial de un numero
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese un numero entero"));
        N = sc.nextInt();
        // Proceso y cálculos
        if (N < 0) {
            System.out.println(String.valueOf("No existe factorial para numeros negativos"));
        } else {
            X = N;
            F = 1;
            while (X>=1) {
                F = F*X;
                X = X-1;
            }
            System.out.println(String.valueOf("El factorial del numero es:") + String.valueOf(F));
        }
    }
}
