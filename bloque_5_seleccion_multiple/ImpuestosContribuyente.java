// Impuestos por tipo de contribuyente
import java.util.Locale;
import java.util.Scanner;

public class ImpuestosContribuyente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int O = 0;
        double I = 0.0;
        double T = 0.0;
        boolean V = false;

        // Ejercicio: Impuestos por tipo de contribuyente
        // Datos de ingreso anual
        System.out.println(String.valueOf("Tipo: 1 Estudiante, 2 Independiente, 3 Empleado, 4 Empresa"));
        O = sc.nextInt();
        System.out.println(String.valueOf("Ingreso anual:"));
        I = sc.nextDouble();
        V = true;
        T = 0;
        if (I < 0) {
            System.out.println(String.valueOf("Ingreso no valido"));
        } else {
            // Impuesto por categoria, incluyendo recargo si procede
            switch (O) {
                case 1:
                    if (I >= 5000) {
                        T = I * 0.05;
                    }
                    break;
                case 2:
                    T = I * 0.10;
                    break;
                case 3:
                    T = I * 0.12;
                    if (I > 20000) {
                        T = T + I * 0.02;
                    }
                    break;
                case 4:
                    T = I * 0.15;
                    break;
                default:
                    V = false;
                    break;
            }
            if (V) {
                System.out.println(String.valueOf("Impuesto anual: $") + String.valueOf(T));
            } else {
                System.out.println(String.valueOf("Tipo invalido"));
            }
        }
    }
}
