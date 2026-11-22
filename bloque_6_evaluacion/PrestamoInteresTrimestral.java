// Diagnóstico 1 - Préstamo con interés compuesto trimestral
import java.util.Locale;
import java.util.Scanner;

public class PrestamoInteresTrimestral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double P = 0.0;
        double T = 0.0;
        double B = 0.0;
        double M = 0.0;
        double A = 0.0;
        double F = 0.0;
        int N = 0;

        // Ejercicio: Diagnóstico 1 - Préstamo con interés compuesto trimestral
        // Datos: prestamo, tasa trimestral decimal, periodos y porcentaje de abono
        System.out.println(String.valueOf("Monto del prestamo:"));
        P = sc.nextDouble();
        System.out.println(String.valueOf("Tasa trimestral en decimal (ej. 0.03):"));
        T = sc.nextDouble();
        System.out.println(String.valueOf("Numero de trimestres:"));
        N = sc.nextInt();
        System.out.println(String.valueOf("Porcentaje de abono extraordinario (0 a 100):"));
        B = sc.nextDouble();
        if (P <= 0  ||  T < 0  ||  N < 0  ||  B < 0  ||  B > 100) {
            System.out.println(String.valueOf("Datos invalidos"));
        } else {
            // Interes compuesto: monto = prestamo * (1 + tasa) ^ trimestres
            M = P * Math.pow((1 + T), N);
            A = M * B / 100;
            F = M - A;
            System.out.println(String.valueOf("Monto antes del abono: $") + String.valueOf(M));
            System.out.println(String.valueOf("Abono extraordinario: $") + String.valueOf(A));
            System.out.println(String.valueOf("Monto final a cancelar: $") + String.valueOf(F));
        }
    }
}
