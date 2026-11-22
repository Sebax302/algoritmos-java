// Hipotenusa y área de un triángulo rectángulo
import java.util.Locale;
import java.util.Scanner;

public class TrianguloRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double A = 0.0;
        double B = 0.0;
        double H = 0.0;
        double AR = 0.0;

        // Ejercicio: Hipotenusa y área de un triángulo rectángulo
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese el primer cateto:"));
        A = sc.nextDouble();
        System.out.println(String.valueOf("Ingrese el segundo cateto:"));
        B = sc.nextDouble();
        // Proceso y cálculos
        if (A <= 0  ||  B <= 0) {
            System.out.println(String.valueOf("Los catetos deben ser mayores que cero"));
        } else {
            H = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
            AR = A * B / 2;
            System.out.println(String.valueOf("Hipotenusa: ") + String.valueOf(H));
            System.out.println(String.valueOf("Area: ") + String.valueOf(AR));
        }
    }
}
