// Clasificacion de notas con seleccion anidada
import java.util.Locale;
import java.util.Scanner;

public class ClasificarNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double N = 0.0;

        // Ejemplo: Clasificacion de notas con seleccion anidada
        System.out.println(String.valueOf("Ingrese la nota (0 a 10):"));
        N = sc.nextDouble();
        // Primero comprobar el rango permitido
        if (N >= 0  &&  N <= 10) {
            if (N >= 9) {
                System.out.println(String.valueOf("Excelente"));
            } else {
                if (N >= 7) {
                    System.out.println(String.valueOf("Aprobado"));
                } else {
                    System.out.println(String.valueOf("Reprobado"));
                }
            }
        } else {
            System.out.println(String.valueOf("Nota fuera de rango"));
        }
    }
}
