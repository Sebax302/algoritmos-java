// Estadísticas de N calificaciones
import java.util.Locale;
import java.util.Scanner;

public class EstadisticasCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int N = 0;
        int I = 0;
        int APR = 0;
        int REP = 0;
        double NOTA = 0.0;
        double SUMA = 0.0;
        double P = 0.0;
        double MAY = 0.0;
        double MEN = 0.0;

        // Ejercicio: Estadísticas de N calificaciones
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese la cantidad de calificaciones:"));
        N = sc.nextInt();
        // Proceso y cálculos
        while (N <= 0) {
            System.out.println(String.valueOf("La cantidad debe ser mayor que 0"));
            System.out.println(String.valueOf("Ingrese la cantidad de calificaciones:"));
            N = sc.nextInt();
        }
        SUMA = 0;
        APR = 0;
        REP = 0;
        for (I = 1; I <= N; I++) {
            System.out.println(String.valueOf("Ingrese la calificacion ") + String.valueOf(I) + String.valueOf(" (0 a 10):"));
            NOTA = sc.nextDouble();
            while (NOTA < 0  ||  NOTA > 10) {
                System.out.println(String.valueOf("La nota debe estar entre 0 y 10"));
                System.out.println(String.valueOf("Ingrese la calificacion ") + String.valueOf(I) + String.valueOf(" (0 a 10):"));
                NOTA = sc.nextDouble();
            }
            SUMA = SUMA + NOTA;
            if (I == 1) {
                MAY = NOTA;
                MEN = NOTA;
            } else {
                if (NOTA > MAY) {
                    MAY = NOTA;
                }
                if (NOTA < MEN) {
                    MEN = NOTA;
                }
            }
            if (NOTA >= 7) {
                APR = APR + 1;
            } else {
                REP = REP + 1;
            }
        }
        P = SUMA / N;
        System.out.println(String.valueOf("Promedio: ") + String.valueOf(P));
        System.out.println(String.valueOf("Calificacion mayor: ") + String.valueOf(MAY));
        System.out.println(String.valueOf("Calificacion menor: ") + String.valueOf(MEN));
        System.out.println(String.valueOf("Cantidad de aprobados: ") + String.valueOf(APR));
        System.out.println(String.valueOf("Cantidad de reprobados: ") + String.valueOf(REP));
    }
}
