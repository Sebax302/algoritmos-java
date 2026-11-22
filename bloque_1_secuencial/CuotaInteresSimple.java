// Cuota de préstamo con interés simple
import java.util.Locale;
import java.util.Scanner;

public class CuotaInteresSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double C = 0.0;
        double T = 0.0;
        double IT = 0.0;
        double CU = 0.0;
        int N = 0;

        // Ejercicio: Cuota de préstamo con interés simple
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese el capital:"));
        C = sc.nextDouble();
        System.out.println(String.valueOf("Ingrese la tasa anual en decimal:"));
        T = sc.nextDouble();
        System.out.println(String.valueOf("Ingrese el plazo en meses:"));
        N = sc.nextInt();
        // Proceso y cálculos
        if (C < 0  ||  T < 0  ||  N <= 0) {
            System.out.println(String.valueOf("Datos no validos"));
        } else {
            IT = C * T * (N / 12);
            CU = (C + IT) / N;
            System.out.println(String.valueOf("Interes total: $") + String.valueOf(IT));
            System.out.println(String.valueOf("Cuota mensual: $") + String.valueOf(CU));
        }
    }
}
