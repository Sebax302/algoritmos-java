// Clasificación de notas por letra
import java.util.Locale;
import java.util.Scanner;

public class NotaALetra {
    static String upper(String a) { return a.toUpperCase(); }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String L = "";

        // Ejercicio: Clasificación de notas por letra
        System.out.println(String.valueOf("Letra de calificacion (A, B, C, D, F):"));
        L = sc.next();
        L = upper(L);
        // Correspondencia entre letra y rango
        switch (L) {
            case "A":
                System.out.println(String.valueOf("Nota entre 9.0 y 10.0"));
                break;
            case "B":
                System.out.println(String.valueOf("Nota entre 8.0 y 8.9"));
                break;
            case "C":
                System.out.println(String.valueOf("Nota entre 7.0 y 7.9"));
                break;
            case "D":
                System.out.println(String.valueOf("Nota entre 6.0 y 6.9"));
                break;
            case "F":
                System.out.println(String.valueOf("Nota entre 0.0 y 5.9"));
                break;
            default:
                System.out.println(String.valueOf("Letra no valida"));
                break;
        }
    }
}
