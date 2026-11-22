// Contar y sumar múltiplos de 3 y 5
import java.util.Locale;
import java.util.Scanner;

public class Multiplos3Y5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int N = 0;
        int I = 0;
        int C = 0;
        int S = 0;

        // Ejercicio: Contar y sumar múltiplos de 3 y 5
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese N:"));
        N = sc.nextInt();
        // Proceso y cálculos
        C = 0;
        S = 0;
        for (I = 1; I <= N; I++) {
            if (I % 3 == 0  ||  I % 5 == 0) {
                C = C + 1;
                S = S + I;
            }
        }
        System.out.println(String.valueOf("Cantidad de multiplos: ") + String.valueOf(C));
        System.out.println(String.valueOf("Suma de multiplos: ") + String.valueOf(S));
    }
}
