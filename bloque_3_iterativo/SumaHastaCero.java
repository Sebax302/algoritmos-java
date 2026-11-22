// Suma de números hasta ingresar  0
import java.util.Locale;
import java.util.Scanner;

public class SumaHastaCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int N = 0;
        int SUMA = 0;

        // Ejercicio: Suma de números hasta ingresar  0
        // Variables y datos del problema
        // Proceso y cálculos
        SUMA = 0;
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese un numero (0 para terminar):"));
        N = sc.nextInt();
        while (N != 0) {
            SUMA = SUMA + (N);
            System.out.println(String.valueOf("Ingrese un numero (0 para terminar):"));
            N = sc.nextInt();
        }
        System.out.println(String.valueOf("La suma total es: ") + String.valueOf(SUMA));
    }
}
