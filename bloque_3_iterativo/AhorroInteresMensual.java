// Ahorro con interés compuesto mensual
import java.util.Locale;
import java.util.Scanner;

public class AhorroInteresMensual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double CAP = 0.0;
        double DEP = 0.0;
        double TASA = 0.0;
        double SAL = 0.0;
        int N = 0;
        int MES = 0;

        // Ejercicio: Ahorro con interés compuesto mensual
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese el capital inicial:"));
        CAP = sc.nextDouble();
        // Proceso y cálculos
        while (CAP < 0) {
            System.out.println(String.valueOf("El capital no puede ser negativo"));
            System.out.println(String.valueOf("Ingrese el capital inicial:"));
            CAP = sc.nextDouble();
        }
        System.out.println(String.valueOf("Ingrese el deposito mensual:"));
        DEP = sc.nextDouble();
        while (DEP < 0) {
            System.out.println(String.valueOf("El deposito no puede ser negativo"));
            System.out.println(String.valueOf("Ingrese el deposito mensual:"));
            DEP = sc.nextDouble();
        }
        System.out.println(String.valueOf("Ingrese el numero de meses:"));
        N = sc.nextInt();
        while (N <= 0) {
            System.out.println(String.valueOf("El numero de meses debe ser mayor que 0"));
            System.out.println(String.valueOf("Ingrese el numero de meses:"));
            N = sc.nextInt();
        }
        System.out.println(String.valueOf("Ingrese la tasa mensual de interes (%):"));
        TASA = sc.nextDouble();
        while (TASA < 0) {
            System.out.println(String.valueOf("La tasa no puede ser negativa"));
            System.out.println(String.valueOf("Ingrese la tasa mensual de interes (%):"));
            TASA = sc.nextDouble();
        }
        SAL = CAP;
        for (MES = 1; MES <= N; MES++) {
            SAL = SAL + DEP;
            SAL = SAL * (1 + TASA / 100);
            System.out.println(String.valueOf("Saldo al finalizar el mes ") + String.valueOf(MES) + String.valueOf(": $") + String.valueOf(SAL));
        }
        System.out.println(String.valueOf("Saldo final: $") + String.valueOf(SAL));
    }
}
