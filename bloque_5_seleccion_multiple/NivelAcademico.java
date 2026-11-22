// Nivel académico y recomendación
import java.util.Locale;
import java.util.Scanner;

public class NivelAcademico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double P = 0.0;
        int R = 0;
        int N = 0;

        // Ejercicio: Nivel académico y recomendación
        System.out.println(String.valueOf("Promedio de 0 a 10:"));
        P = sc.nextDouble();
        System.out.println(String.valueOf("Materias reprobadas:"));
        R = sc.nextInt();
        if (P < 0  ||  P > 10  ||  R < 0) {
            System.out.println(String.valueOf("Datos invalidos"));
        } else {
            // Primero se determina el nivel
            N = 4;
            if (P >= 9  &&  R == 0) {
                N = 1;
            } else {
                if (P >= 8  &&  R <= 1) {
                    N = 2;
                } else {
                    if (P >= 7) {
                        N = 3;
                    }
                }
            }
            // Luego se presenta la recomendacion
            switch (N) {
                case 1:
                    System.out.println(String.valueOf("Excelente - Continua asi"));
                    break;
                case 2:
                    System.out.println(String.valueOf("Bueno - Refuerza debilidades"));
                    break;
                case 3:
                    System.out.println(String.valueOf("Regular - Necesitas mas estudio"));
                    break;
                case 4:
                    System.out.println(String.valueOf("En riesgo - Busca tutoria"));
                    break;
            }
        }
    }
}
