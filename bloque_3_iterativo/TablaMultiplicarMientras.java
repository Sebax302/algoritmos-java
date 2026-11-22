// Tabla de multiplicacion con mientras
import java.util.Locale;
import java.util.Scanner;

public class TablaMultiplicarMientras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int K = 0;
        int I = 0;
        int R = 0;

        // Ejercicio: Tabla de multiplicacion con mientras
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese el numero entero para mostrar su tabla:"));
        K = sc.nextInt();
        // Proceso y cálculos
        I = 1;
        while (I <= 10) {
            R = K * I;
            System.out.println(String.valueOf(K) + String.valueOf(" x ") + String.valueOf(I) + String.valueOf(" == ") + String.valueOf(R));
            I = I + 1;
        }
    }
}
