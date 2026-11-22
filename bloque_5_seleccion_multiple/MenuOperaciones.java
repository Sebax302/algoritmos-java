// Menu de operaciones con control multiple
import java.util.Locale;
import java.util.Scanner;

public class MenuOperaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int O = 0;

        // Ejemplo: Menu de operaciones con control multiple
        // Este menu solo identifica la operacion elegida, como solicita el ejemplo
        System.out.println(String.valueOf("1. Sumar"));
        System.out.println(String.valueOf("2. Restar"));
        System.out.println(String.valueOf("3. Multiplicar"));
        System.out.println(String.valueOf("4. Salir"));
        System.out.println(String.valueOf("Elija una opcion:"));
        O = sc.nextInt();
        switch (O) {
            case 1:
                System.out.println(String.valueOf("Operacion: Suma"));
                break;
            case 2:
                System.out.println(String.valueOf("Operacion: Resta"));
                break;
            case 3:
                System.out.println(String.valueOf("Operacion: Multiplicacion"));
                break;
            case 4:
                System.out.println(String.valueOf("Saliendo del programa"));
                break;
            default:
                System.out.println(String.valueOf("Opcion no valida"));
                break;
        }
    }
}
