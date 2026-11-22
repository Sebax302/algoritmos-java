// Inversión de un número
import java.util.Locale;
import java.util.Scanner;

public class InvertirNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int N = 0;
        int T = 0;
        int D = 0;
        int INV = 0;

        // Ejercicio: Inversión de un número
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese un numero entero positivo:"));
        N = sc.nextInt();
        // Proceso y cálculos
        if (N <= 0) {
            System.out.println(String.valueOf("El numero debe ser positivo"));
        } else {
            T = N;
            INV = 0;
            while (T > 0) {
                D = T % 10;
                INV = INV * 10 + D;
                T = (int)Math.floor(T / 10);
            }
            System.out.println(String.valueOf("Numero invertido: ") + String.valueOf(INV));
        }
    }
}
