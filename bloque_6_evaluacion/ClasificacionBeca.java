// Diagnóstico 2 - Clasificación para beca
import java.util.Locale;
import java.util.Scanner;

public class ClasificacionBeca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double P = 0.0;
        int R = 0;
        int B = 0;
        String C = "";

        // Ejercicio: Diagnóstico 2 - Clasificación para beca
        // Datos de postulacion
        System.out.println(String.valueOf("Promedio (0 a 10):"));
        P = sc.nextDouble();
        System.out.println(String.valueOf("Materias reprobadas:"));
        R = sc.nextInt();
        System.out.println(String.valueOf("Es de primer ciclo? (S/N):"));
        C = sc.next();
        if (P < 0  ||  P > 10  ||  R < 0  ||  (!C.equals("S")  &&  !C.equals("N"))) {
            System.out.println(String.valueOf("Datos invalidos"));
        } else {
            // Se evalua de mayor a menor porcentaje de beca
            if (P >= 9  &&  R == 0  &&  C.equals("S")) {
                B = 100;
            } else {
                if (P >= 8  &&  R <= 1) {
                    B = 70;
                } else {
                    if (P >= 7  &&  R <= 2) {
                        B = 40;
                    } else {
                        B = 0;
                    }
                }
            }
            System.out.println(String.valueOf("Porcentaje de beca: ") + String.valueOf(B) + String.valueOf("%"));
            if (B > 0) {
                System.out.println(String.valueOf("Beca aprobada"));
            } else {
                System.out.println(String.valueOf("Beca rechazada"));
            }
        }
    }
}
