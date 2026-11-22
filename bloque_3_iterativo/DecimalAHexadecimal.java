// Conversión de decimal a hexadecimal
import java.util.Locale;
import java.util.Scanner;

public class DecimalAHexadecimal {
    static String concat(Object a, Object b) { return String.valueOf(a) + String.valueOf(b); }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int NUM = 0;
        int RES = 0;
        String HEX = "";
        String DIG = "";

        // Ejercicio: Conversión de decimal a hexadecimal
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
        HEX = "";
        if (NUM == 0) {
            HEX = "0";
        } else {
            while (NUM > 0) {
                RES = NUM % 16;
                if (RES < 10) {
                    DIG = String.valueOf(RES);
                } else {
                    switch (RES) {
                        case 10:
                            DIG = "A";
                            break;
                        case 11:
                            DIG = "B";
                            break;
                        case 12:
                            DIG = "C";
                            break;
                        case 13:
                            DIG = "D";
                            break;
                        case 14:
                            DIG = "E";
                            break;
                        case 15:
                            DIG = "F";
                            break;
                    }
                }
                HEX = concat(DIG, HEX);
                NUM = (int)Math.floor(NUM / 16);
            }
        }
        System.out.println(String.valueOf("Representacion hexadecimal: ") + String.valueOf(HEX));
    }
}
