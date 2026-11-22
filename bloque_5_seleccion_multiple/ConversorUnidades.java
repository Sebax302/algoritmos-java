// Conversor de unidades simple
import java.util.Locale;
import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int O = 0;
        double V = 0.0;
        double R = 0.0;

        // Ejercicio: Conversor de unidades simple
        System.out.println(String.valueOf("1. Km a m"));
        System.out.println(String.valueOf("2. m a cm"));
        System.out.println(String.valueOf("3. Horas a minutos"));
        System.out.println(String.valueOf("4. Salir"));
        O = sc.nextInt();
        if (O >= 1  &&  O <= 3) {
            System.out.println(String.valueOf("Ingrese el valor a convertir:"));
            V = sc.nextDouble();
            // Conversión por opción
            switch (O) {
                case 1:
                    R = V * 1000;
                    break;
                case 2:
                    R = V * 100;
                    break;
                case 3:
                    R = V * 60;
                    break;
            }
            System.out.println(String.valueOf("Resultado: ") + String.valueOf(R));
        } else {
            switch (O) {
                case 4:
                    System.out.println(String.valueOf("Fin del conversor"));
                    break;
                default:
                    System.out.println(String.valueOf("Opcion no valida"));
                    break;
            }
        }
    }
}
