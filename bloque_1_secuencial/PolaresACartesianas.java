// Conversión de coordenadas polares a cartesianas
import java.util.Locale;
import java.util.Scanner;

public class PolaresACartesianas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double R = 0.0;
        double G = 0.0;
        double RAD = 0.0;
        double X = 0.0;
        double Y = 0.0;

        // Ejercicio: Conversión de coordenadas polares a cartesianas
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese el radio:"));
        R = sc.nextDouble();
        System.out.println(String.valueOf("Ingrese el angulo en grados:"));
        G = sc.nextDouble();
        // Proceso y cálculos
        RAD = G * 3.14159265 / 180;
        X = R * Math.cos(RAD);
        Y = R * Math.sin(RAD);
        System.out.println(String.valueOf("Coordenada X: ") + String.valueOf(X));
        System.out.println(String.valueOf("Coordenada Y: ") + String.valueOf(Y));
    }
}
