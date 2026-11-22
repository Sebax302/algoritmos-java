// Promedio de N notas
import java.util.Locale;
import java.util.Scanner;

public class PromedioNNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int N = 0;
        int I = 0;
        double NOTA = 0.0;
        double SUMA = 0.0;
        double P = 0.0;

        // Ejercicio: Promedio de N notas
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese la cantidad de notas:"));
        N = sc.nextInt();
        // Proceso y cálculos
        while (N <= 0) {
            System.out.println(String.valueOf("La cantidad de notas debe ser mayor que 0"));
            System.out.println(String.valueOf("Ingrese la cantidad de notas:"));
            N = sc.nextInt();
        }
        SUMA = 0;
        for (I = 1; I <= N; I++) {
            System.out.println(String.valueOf("Ingrese la nota ") + String.valueOf(I) + String.valueOf(" (0 a 10):"));
            NOTA = sc.nextDouble();
            while (NOTA < 0  ||  NOTA > 10) {
                System.out.println(String.valueOf("La nota debe estar entre 0 y 10"));
                System.out.println(String.valueOf("Ingrese la nota ") + String.valueOf(I) + String.valueOf(" (0 a 10):"));
                NOTA = sc.nextDouble();
            }
            SUMA = SUMA + NOTA;
        }
        P = SUMA / N;
        System.out.println(String.valueOf("El promedio de las notas es: ") + String.valueOf(P));
    }
}
