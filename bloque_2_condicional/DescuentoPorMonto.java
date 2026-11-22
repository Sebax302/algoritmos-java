// Descuento según monto de compra
import java.util.Locale;
import java.util.Scanner;

public class DescuentoPorMonto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double C = 0.0;
        double P = 0.0;
        double P1 = 0.0;
        double D = 0.0;
        double PF = 0.0;

        // Ejercicio: Descuento según monto de compra
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese el monto de la compra:"));
        C = sc.nextDouble();
        // Proceso y cálculos
        while (C < 0) {
            System.out.println(String.valueOf("El monto no puede ser negativo"));
            System.out.println(String.valueOf("Ingrese el monto de la compra:"));
            C = sc.nextDouble();
        }
        if (C >= 200) {
            P = 0.15;
        } else {
            if (C >= 100) {
                P = 0.10;
            } else {
                P = 0.05;
            }
        }
        D = C * P;
        P1 = P * 100;
        PF = C - D;
        System.out.println(String.valueOf("Descuento aplicado: ") + String.valueOf(P1) + String.valueOf("%"));
        System.out.println(String.valueOf("Monto a pagar: $") + String.valueOf(PF));
    }
}
