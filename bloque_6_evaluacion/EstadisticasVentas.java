// Diagnóstico 3 - Estadísticas de ventas hasta -1
import java.util.Locale;
import java.util.Scanner;

public class EstadisticasVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int D = 0;
        int C = 0;
        int DM = 0;
        double V = 0.0;
        double S = 0.0;
        double P = 0.0;
        double MAX = 0.0;

        // Ejercicio: Diagnóstico 3 - Estadísticas de ventas hasta -1
        // Acumuladores y control de dias validos
        S = 0;
        D = 0;
        C = 0;
        DM = 0;
        MAX = 0;
        System.out.println(String.valueOf("Venta diaria (-1 para terminar):"));
        V = sc.nextDouble();
        // Las ventas negativas distintas de -1 no cuentan como dias
        while (V != -1) {
            if (V < 0) {
                System.out.println(String.valueOf("Venta no valida; ingrese cero o un valor positivo"));
            } else {
                D = D + 1;
                S = S + V;
                if (V > 500) {
                    C = C + 1;
                }
                if (D == 1  ||  V > MAX) {
                    MAX = V;
                    DM = D;
                }
            }
            System.out.println(String.valueOf("Siguiente venta (-1 para terminar):"));
            V = sc.nextDouble();
        }
        // Resumen, evitando dividir por cero
        System.out.println(String.valueOf("Total de ventas: $") + String.valueOf(S));
        System.out.println(String.valueOf("Dias con venta superior a $500: ") + String.valueOf(C));
        if (D > 0) {
            P = S / D;
            System.out.println(String.valueOf("Promedio de ventas: $") + String.valueOf(P));
            System.out.println(String.valueOf("Dia de mayor venta: ") + String.valueOf(DM));
            System.out.println(String.valueOf("Mayor venta: $") + String.valueOf(MAX));
        } else {
            System.out.println(String.valueOf("Promedio: no hay ventas registradas"));
            System.out.println(String.valueOf("No hay dia con mayor venta"));
        }
    }
}
