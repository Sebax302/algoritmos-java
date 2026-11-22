// Clasificación de temperatura en Loja
import java.util.Locale;
import java.util.Scanner;

public class ClasificarTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double T = 0.0;

        // Ejercicio: Clasificación de temperatura en Loja
        // Entrada
        System.out.println(String.valueOf("Temperatura en grados Celsius:"));
        T = sc.nextDouble();
        // Clasificación con selección anidada
        if (T < 15) {
            System.out.println(String.valueOf("Clima frio"));
        } else {
            if (T <= 25) {
                System.out.println(String.valueOf("Clima templado"));
            } else {
                System.out.println(String.valueOf("Clima calido"));
                if (T > 30) {
                    System.out.println(String.valueOf("Alerta: calor extremo"));
                }
            }
        }
    }
}
