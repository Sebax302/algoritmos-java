// Número de Armstrong de tres dígitos
import java.util.Locale;
import java.util.Scanner;

public class NumeroArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int N = 0;
        int T = 0;
        int D = 0;
        int S = 0;

        // Ejercicio: Número de Armstrong de tres dígitos
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese un numero de tres digitos:"));
        N = sc.nextInt();
        // Proceso y cálculos
        if (N < 100  ||  N > 999) {
            System.out.println(String.valueOf("Debe ingresar un numero de tres digitos"));
        } else {
            T = N;
            S = 0;
            while (T > 0) {
                D = T % 10;
                S = (int) (S + Math.pow(D, 3));
                T = (int)Math.floor(T / 10);
            }
            if (S == N) {
                System.out.println(String.valueOf(N) + String.valueOf(" es un numero de Armstrong"));
            } else {
                System.out.println(String.valueOf(N) + String.valueOf(" no es un numero de Armstrong"));
            }
        }
    }
}
