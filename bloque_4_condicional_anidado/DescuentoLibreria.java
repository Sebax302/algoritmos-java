// Descuento en librería de Loja
import java.util.Locale;
import java.util.Scanner;

public class DescuentoLibreria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String E = "";
        double M = 0.0;
        double D = 0.0;
        double T = 0.0;

        // Ejercicio: Descuento en librería de Loja
        // Entrada y validación
        System.out.println(String.valueOf("Es estudiante UTPL? (S/N):"));
        E = sc.next();
        System.out.println(String.valueOf("Monto de compra:"));
        M = sc.nextDouble();
        if (M < 0  ||  (!E.equals("S")  &&  !E.equals("N")  &&  !E.equals("s")  &&  !E.equals("n"))) {
            System.out.println(String.valueOf("Datos invalidos"));
        } else {
            // Descuentos por tipo de cliente
            D = 0;
            if (E.equals("S")  ||  E.equals("s")) {
                D = 20;
                if (M > 30) {
                    D = D + 5;
                }
            } else {
                if (M > 50) {
                    D = 10;
                }
            }
            T = M * (1 - D / 100);
            System.out.println(String.valueOf("Descuento aplicado: ") + String.valueOf(D) + String.valueOf("%"));
            System.out.println(String.valueOf("Total a pagar: $") + String.valueOf(T));
        }
    }
}
