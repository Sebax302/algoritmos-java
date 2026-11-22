// Tabla de multiplicar con for
import java.util.Locale;
import java.util.Scanner;

public class TablaMultiplicarPara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int K = 0;
        int I = 0;
        int R = 0;

        // Ejercicio: Tabla de multiplicar con for
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese el numero entero para mostrar su tabla:"));
        K = sc.nextInt();
        // Proceso y cálculos
        for (I = 1; I <= 10; I++) {
            R = K * I;
            System.out.println(String.valueOf(K) + String.valueOf(" x ") + String.valueOf(I) + String.valueOf(" == ") + String.valueOf(R));
        }
    }
}
