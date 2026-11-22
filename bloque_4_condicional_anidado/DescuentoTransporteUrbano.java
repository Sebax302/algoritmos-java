// Descuento de transporte urbano en Loja
import java.util.Locale;
import java.util.Scanner;

public class DescuentoTransporteUrbano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int E = 0;
        int H = 0;
        double T = 0.0;
        double D = 0.0;
        double F = 0.0;

        // Ejemplo: Descuento de transporte urbano en Loja
        // Ingreso de datos
        System.out.println(String.valueOf("Es estudiante? (1 == Si, 0 == No):"));
        E = sc.nextInt();
        System.out.println(String.valueOf("Ingrese la hora del viaje (0 a 23):"));
        H = sc.nextInt();
        System.out.println(String.valueOf("Ingrese la tarifa base:"));
        T = sc.nextDouble();
        // Verificar los datos antes de calcular
        if ((E == 0  ||  E == 1)  &&  (H >= 0  &&  H <= 23)  &&  T >= 0) {
            D = 0;
            // Seleccion anidada por tipo de pasajero y horario
            if (E == 1) {
                D = 0.30;
                if (H >= 9  &&  H <= 16) {
                    D = D + 0.10;
                }
            } else {
                if (H >= 9  &&  H <= 16) {
                    D = 0.10;
                }
            }
            F = T * (1 - D);
            System.out.println(String.valueOf("Descuento aplicado: ") + String.valueOf(D * 100) + String.valueOf("%"));
            System.out.println(String.valueOf("Tarifa final: $") + String.valueOf(F));
        } else {
            System.out.println(String.valueOf("Datos no validos"));
        }
    }
}
