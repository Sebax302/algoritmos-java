// Bono por antigüedad y evaluación
import java.util.Locale;
import java.util.Scanner;

public class BonoAntiguedadEvaluacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double A = 0.0;
        double S = 0.0;
        double B = 0.0;
        double T = 0.0;
        String E = "";

        // Ejercicio: Bono por antigüedad y evaluación
        // Entradas
        System.out.println(String.valueOf("Antiguedad del trabajador en anos:"));
        A = sc.nextDouble();
        System.out.println(String.valueOf("Sueldo base:"));
        S = sc.nextDouble();
        System.out.println(String.valueOf("Evaluacion excelente? (S/N):"));
        E = sc.next();
        if (A < 0  ||  S < 0  ||  (!E.equals("S")  &&  !E.equals("N"))) {
            System.out.println(String.valueOf("Datos invalidos"));
        } else {
            // Nota: el enunciado no otorga bono justo a los 2 anos
            B = 0;
            if (A > 2) {
                B = S * 0.10;
                if (E.equals("S")) {
                    B = B + S * 0.05;
                }
            } else {
                if (A < 2) {
                    if (E.equals("S")) {
                        B = S * 0.05;
                    }
                }
            }
            T = S + B;
            System.out.println(String.valueOf("Bono: $") + String.valueOf(B));
            System.out.println(String.valueOf("Sueldo total: $") + String.valueOf(T));
        }
    }
}
