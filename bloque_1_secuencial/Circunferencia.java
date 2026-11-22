// Calcular la longitud y el area de una circuferencia
import java.util.Locale;
import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double R = 0.0;
        double L = 0.0;
        double A = 0.0;

        // Ejercicio: Calcular la longitud y el area de una circuferencia
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingresar el radio:"));
        R = sc.nextDouble();
        // Proceso y cálculos
        L = 2*3.14159265*R;
        A = 3.14159265*Math.pow((R), 2);
        System.out.println(String.valueOf("La longitud es:") + String.valueOf(L));
        System.out.println(String.valueOf("El area del circulo es:") + String.valueOf(A));
    }
}
