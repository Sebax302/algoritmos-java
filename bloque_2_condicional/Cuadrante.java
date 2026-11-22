// Determinación de cuadrante
import java.util.Locale;
import java.util.Scanner;

public class Cuadrante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double X = 0.0;
        double Y = 0.0;

        // Ejercicio: Determinación de cuadrante
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese la coordenada X:"));
        X = sc.nextDouble();
        System.out.println(String.valueOf("Ingrese la coordenada Y:"));
        Y = sc.nextDouble();
        // Proceso y cálculos
        if (X == 0  &&  Y == 0) {
            System.out.println(String.valueOf("El punto esta en el origen"));
        } else {
            if (X == 0) {
                System.out.println(String.valueOf("El punto esta sobre el eje Y"));
            } else {
                if (Y == 0) {
                    System.out.println(String.valueOf("El punto esta sobre el eje X"));
                } else {
                    if (X > 0  &&  Y > 0) {
                        System.out.println(String.valueOf("Primer cuadrante"));
                    } else {
                        if (X < 0  &&  Y > 0) {
                            System.out.println(String.valueOf("Segundo cuadrante"));
                        } else {
                            if (X < 0  &&  Y < 0) {
                                System.out.println(String.valueOf("Tercer cuadrante"));
                            } else {
                                System.out.println(String.valueOf("Cuarto cuadrante"));
                            }
                        }
                    }
                }
            }
        }
    }
}
