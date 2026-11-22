// Máximo común divisor (Euclides)
import java.util.Locale;
import java.util.Scanner;

public class McdEuclides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int A = 0;
        int B = 0;
        int RES = 0;

        // Ejercicio: Máximo común divisor (Euclides)
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese el primer numero entero positivo:"));
        A = sc.nextInt();
        // Proceso y cálculos
        while (A <= 0) {
            System.out.println(String.valueOf("El numero debe ser mayor que 0"));
            System.out.println(String.valueOf("Ingrese el primer numero entero positivo:"));
            A = sc.nextInt();
        }
        System.out.println(String.valueOf("Ingrese el segundo numero entero positivo:"));
        B = sc.nextInt();
        while (B <= 0) {
            System.out.println(String.valueOf("El numero debe ser mayor que 0"));
            System.out.println(String.valueOf("Ingrese el segundo numero entero positivo:"));
            B = sc.nextInt();
        }
        while (B != 0) {
            RES = A % B;
            A = B;
            B = RES;
        }
        System.out.println(String.valueOf("El maximo comun divisor es: ") + String.valueOf(A));
    }
}
