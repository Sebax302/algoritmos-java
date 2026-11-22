// Conversión de base decimal a binario (método manual)
import java.util.Locale;
import java.util.Scanner;

public class DecimalABinario {
    static String concat(Object a, Object b) { return String.valueOf(a) + String.valueOf(b); }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int NUM = 0;
        int RES = 0;
        String BIN = "";

        // Ejercicio: Conversión de base decimal a binario (método manual)
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese un numero entero decimal no negativo:"));
        NUM = sc.nextInt();
        // Proceso y cálculos
        while (NUM < 0) {
            System.out.println(String.valueOf("El numero debe ser no negativo"));
            System.out.println(String.valueOf("Ingrese un numero entero decimal no negativo:"));
            NUM = sc.nextInt();
        }
        BIN = "";
        if (NUM == 0) {
            BIN = "0";
        } else {
            while (NUM > 0) {
                RES = NUM % 2;
                BIN = concat(String.valueOf(RES), BIN);
                NUM = (int)Math.floor(NUM / 2);
            }
        }
        System.out.println(String.valueOf("Representacion binaria: ") + String.valueOf(BIN));
    }
}
