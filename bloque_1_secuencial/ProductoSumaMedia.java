// Producto su suma y media Aritmetica
import java.util.Locale;
import java.util.Scanner;

public class ProductoSumaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double N1 = 0.0;
        double N2 = 0.0;
        double N3 = 0.0;
        double N4 = 0.0;
        double S = 0.0;
        double P = 0.0;
        double M = 0.0;

        // Ejercicio: Producto su suma y media Aritmetica
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese el primer numero"));
        N1 = sc.nextDouble();
        System.out.println(String.valueOf("Ingrese el segundo numero"));
        N2 = sc.nextDouble();
        System.out.println(String.valueOf("Ingrese el trecer numero"));
        N3 = sc.nextDouble();
        System.out.println(String.valueOf("Ingrese el cuarto numero"));
        N4 = sc.nextDouble();
        // Proceso y cálculos
        S = N1+N2+N3+N4;
        P = N1*N2*N3*N4;
        M = S/4;
        System.out.println(String.valueOf("La suma es:") + String.valueOf(S));
        System.out.println(String.valueOf("Es producto es:") + String.valueOf(P));
        System.out.println(String.valueOf("La media aritmetica es:") + String.valueOf(M));
    }
}
