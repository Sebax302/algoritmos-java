// Tarifa de parqueadero de estudiantes
import java.util.Locale;
import java.util.Scanner;

public class TarifaParqueaderoEstudiantil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double H = 0.0;
        double T = 0.0;
        String E = "";

        // Ejercicio: Tarifa de parqueadero de estudiantes
        // Datos
        System.out.println(String.valueOf("Horas de permanencia:"));
        H = sc.nextDouble();
        System.out.println(String.valueOf("Es estudiante UTPL? (S/N):"));
        E = sc.next();
        if (H < 0  ||  (!E.equals("S")  &&  !E.equals("N"))) {
            System.out.println(String.valueOf("Datos invalidos"));
        } else {
            // Tarifa base: un dolar por hora
            T = H * 1;
            if (E.equals("S")) {
                T = T * 0.50;
                if (H > 4) {
                    T = T * 1.20;
                }
            } else {
                if (H > 6) {
                    T = T * 1.20;
                }
            }
            System.out.println(String.valueOf("Total a pagar: $") + String.valueOf(T));
        }
    }
}
