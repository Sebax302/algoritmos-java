// Menú de cafetería UTPL
import java.util.Locale;
import java.util.Scanner;

public class MenuCafeteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int O = 0;

        // Ejercicio: Menú de cafetería UTPL
        // Menú
        System.out.println(String.valueOf("1. Cafe ($1.50)"));
        System.out.println(String.valueOf("2. Jugo ($1.20)"));
        System.out.println(String.valueOf("3. Sandwich ($2.50)"));
        System.out.println(String.valueOf("4. Salir"));
        O = sc.nextInt();
        // Seleccion del producto
        switch (O) {
            case 1:
                System.out.println(String.valueOf("Cafe: $1.50"));
                break;
            case 2:
                System.out.println(String.valueOf("Jugo: $1.20"));
                break;
            case 3:
                System.out.println(String.valueOf("Sandwich: $2.50"));
                break;
            case 4:
                System.out.println(String.valueOf("Gracias por visitar la cafeteria"));
                break;
            default:
                System.out.println(String.valueOf("Opcion no valida"));
                break;
        }
    }
}
