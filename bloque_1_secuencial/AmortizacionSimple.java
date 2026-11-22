// Amortización de préstamo simple
import java.util.Locale;
import java.util.Scanner;

public class AmortizacionSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double MON = 0.0;
        double TASA = 0.0;
        double INT = 0.0;
        double CUO = 0.0;
        int MES = 0;

        // Ejercicio: Amortización de préstamo simple
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese el monto del prestamo:"));
        MON = sc.nextDouble();
        // Proceso y cálculos
        while (MON <= 0) {
            System.out.println(String.valueOf("El monto debe ser mayor que 0"));
            System.out.println(String.valueOf("Ingrese el monto del prestamo:"));
            MON = sc.nextDouble();
        }
        System.out.println(String.valueOf("Ingrese la tasa de interes mensual (%):"));
        TASA = sc.nextDouble();
        while (TASA < 0) {
            System.out.println(String.valueOf("La tasa no puede ser negativa"));
            System.out.println(String.valueOf("Ingrese la tasa de interes mensual (%):"));
            TASA = sc.nextDouble();
        }
        System.out.println(String.valueOf("Ingrese el numero de meses:"));
        MES = sc.nextInt();
        while (MES <= 0) {
            System.out.println(String.valueOf("El numero de meses debe ser mayor que 0"));
            System.out.println(String.valueOf("Ingrese el numero de meses:"));
            MES = sc.nextInt();
        }
        INT = MON * (TASA / 100) * MES;
        CUO = (MON + INT) / MES;
        System.out.println(String.valueOf("Interes total: $") + String.valueOf(INT));
        System.out.println(String.valueOf("Cuota mensual: $") + String.valueOf(CUO));
    }
}
