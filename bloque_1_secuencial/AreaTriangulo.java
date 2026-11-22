// Área de un triangulo
import java.util.Locale;
import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double B = 0.0;
        double H = 0.0;
        double A = 0.0;

        // Ejercicio: Área de un triangulo
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingresar la base:"));
        B = sc.nextDouble();
        System.out.println(String.valueOf("Ingresar la altura:"));
        H = sc.nextDouble();
        // Proceso y cálculos
        A = (B*H)/2;
        System.out.println(String.valueOf("La area del triangulo es:") + String.valueOf(A));
    }
}
