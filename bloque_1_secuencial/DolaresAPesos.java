// Conversión de dólares a pesos mexicanos
import java.util.Locale;
import java.util.Scanner;

public class DolaresAPesos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double D = 0.0;
        double C = 0.0;
        double P = 0.0;

        // Ejercicio: Conversión de dólares a pesos mexicanos
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese la cantidad en dolares:"));
        D = sc.nextDouble();
        // Proceso y cálculos
        while (D < 0) {
            System.out.println(String.valueOf("La cantidad no puede ser negativa"));
            System.out.println(String.valueOf("Ingrese la cantidad en dolares:"));
            D = sc.nextDouble();
        }
        System.out.println(String.valueOf("Ingrese el valor de pesos por dolar:"));
        C = sc.nextDouble();
        while (C <= 0) {
            System.out.println(String.valueOf("El tipo de cambio debe ser mayor que 0"));
            System.out.println(String.valueOf("Ingrese el valor de pesos por dolar:"));
            C = sc.nextDouble();
        }
        P = D * C;
        System.out.println(String.valueOf("La cantidad equivalente en pesos mexicanos es: ") + String.valueOf(P));
    }
}
