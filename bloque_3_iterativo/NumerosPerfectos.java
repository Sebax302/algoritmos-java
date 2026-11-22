// Números perfectos
import java.util.Locale;
import java.util.Scanner;

public class NumerosPerfectos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int N = 0;
        int DIV = 0;
        int SUMA = 0;

        // Ejercicio: Números perfectos
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese un numero entero positivo:"));
        N = sc.nextInt();
        // Proceso y cálculos
        while (N <= 0) {
            System.out.println(String.valueOf("El numero debe ser mayor que 0"));
            System.out.println(String.valueOf("Ingrese un numero entero positivo:"));
            N = sc.nextInt();
        }
        SUMA = 0;
        DIV = 1;
        while (DIV <= (int)Math.floor(N / 2)) {
            if (N % DIV == 0) {
                SUMA = SUMA + DIV;
            }
            DIV = DIV + 1;
        }
        if (SUMA == N  &&  N > 1) {
            System.out.println(String.valueOf(N) + String.valueOf(" es un numero perfecto"));
        } else {
            System.out.println(String.valueOf(N) + String.valueOf(" no es un numero perfecto"));
        }
    }
}
