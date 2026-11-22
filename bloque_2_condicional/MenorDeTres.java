// Menor de tres numeros
import java.util.Locale;
import java.util.Scanner;

public class MenorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double N1 = 0.0;
        double N2 = 0.0;
        double N3 = 0.0;
        double MEN = 0.0;

        // Ejercicio: Menor de tres numeros
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese el primer numero:"));
        N1 = sc.nextDouble();
        System.out.println(String.valueOf("Ingrese el segundo numero:"));
        N2 = sc.nextDouble();
        System.out.println(String.valueOf("Ingrese el tercer numero:"));
        N3 = sc.nextDouble();
        // Proceso y cálculos
        if (N1 <= N2  &&  N1 <= N3) {
            MEN = N1;
        } else {
            if (N2 <= N1  &&  N2 <= N3) {
                MEN = N2;
            } else {
                MEN = N3;
            }
        }
        System.out.println(String.valueOf("El menor de los tres numeros es: ") + String.valueOf(MEN));
    }
}
