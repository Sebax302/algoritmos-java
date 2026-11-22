// Plan de materias según semestre
import java.util.Locale;
import java.util.Scanner;

public class PlanMateriasSemestre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int S = 0;
        int M = 0;
        double P = 0.0;

        // Ejercicio: Plan de materias según semestre
        System.out.println(String.valueOf("Semestre actual (1 a 4):"));
        S = sc.nextInt();
        System.out.println(String.valueOf("Promedio (0 a 10):"));
        P = sc.nextDouble();
        if (P < 0  ||  P > 10  ||  S < 1  ||  S > 4) {
            System.out.println(String.valueOf("Datos invalidos"));
        } else {
            // Materias base segun semestre
            switch (S) {
                case 1:
                case 2:
                    M = 5;
                    break;
                case 3:
                case 4:
                    M = 4;
                    break;
            }
            // Ajuste por promedio y limites del plan
            if (P >= 8.5) {
                M = M + 1;
            } else {
                if (P < 7) {
                    M = M - 1;
                }
            }
            if (M < 3) {
                M = 3;
            }
            if (M > 6) {
                M = 6;
            }
            System.out.println(String.valueOf("Materias recomendadas: ") + String.valueOf(M));
        }
    }
}
