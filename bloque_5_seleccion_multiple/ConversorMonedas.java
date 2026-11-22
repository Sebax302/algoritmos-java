// Conversor de monedas con comisión
import java.util.Locale;
import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int O = 0;
        double M = 0.0;
        double T = 0.0;
        double C = 0.0;
        double CU = 0.0;
        double CD = 0.0;
        double R = 0.0;

        // Ejercicio: Conversor de monedas con comisión
        // Tasas didacticas de la diapositiva, NO cotizaciones actuales
        System.out.println(String.valueOf("Moneda: 1 EUR, 2 GBP, 3 JPY, 4 MXN"));
        O = sc.nextInt();
        System.out.println(String.valueOf("Monto en USD:"));
        M = sc.nextDouble();
        if (M < 0  ||  O < 1  ||  O > 4) {
            System.out.println(String.valueOf("Datos invalidos"));
        } else {
            // Tasa y comision por tipo
            switch (O) {
                case 1:
                    T = 0.92;
                    C = 0.01;
                    break;
                case 2:
                    T = 0.78;
                    C = 0.01;
                    break;
                case 3:
                    T = 149;
                    C = 0.015;
                    break;
                case 4:
                    T = 17.2;
                    C = 0.02;
                    break;
            }
            CU = M * C;
            CD = CU * T;
            R = M * T - CD;
            System.out.println(String.valueOf("Comision en USD: $") + String.valueOf(CU));
            System.out.println(String.valueOf("Comision en moneda destino: ") + String.valueOf(CD));
            System.out.println(String.valueOf("Monto convertido neto: ") + String.valueOf(R));
        }
    }
}
