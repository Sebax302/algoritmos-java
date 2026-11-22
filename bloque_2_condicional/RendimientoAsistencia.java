// Clasificación por rendimiento y asistencia
import java.util.Locale;
import java.util.Scanner;

public class RendimientoAsistencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double P = 0.0;
        double A = 0.0;
        String CAT = "";

        // Ejercicio: Clasificación por rendimiento y asistencia
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese el promedio (0 a 10):"));
        P = sc.nextDouble();
        System.out.println(String.valueOf("Ingrese la asistencia (0 a 100):"));
        A = sc.nextDouble();
        // Proceso y cálculos
        if (P < 0  ||  P > 10  ||  A < 0  ||  A > 100) {
            CAT = "Datos no validos";
        } else {
            if (P >= 9  &&  A >= 90) {
                CAT = "Excelente";
            } else {
                if (P >= 7  &&  A >= 80) {
                    CAT = "Bueno";
                } else {
                    if (P >= 6  &&  A >= 70) {
                        CAT = "Regular";
                    } else {
                        CAT = "Deficiente";
                    }
                }
            }
        }
        System.out.println(String.valueOf("Categoria: ") + String.valueOf(CAT));
    }
}
