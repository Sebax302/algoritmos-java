// Par o Impar
import java.util.Locale;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int N = 0;

        // Ejercicio: Par o Impar
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese un numero entero:"));
        N = sc.nextInt();
        // Proceso y cálculos
        if (N % 2 == 0) {
            System.out.println(String.valueOf("El numero es PAR"));
        } else {
            System.out.println(String.valueOf("El numero es IMPAR"));
        }
    }
}
