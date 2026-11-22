// Horas de trabajo
import java.util.Locale;
import java.util.Scanner;

public class HorasTrabajadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double H = 0.0;
        double HE = 0.0;
        double SXH = 0.0;
        double S1 = 0.0;
        double S2 = 0.0;
        double SF = 0.0;

        // Ejercicio: Horas de trabajo
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese las horas trabajadas"));
        H = sc.nextDouble();
        System.out.println(String.valueOf("Ingrese el sueldo por hora trabajada"));
        SXH = sc.nextDouble();
        // Proceso y cálculos
        HE = 0;
        // Horas trabajadas
        while (H <= 0  ||  H > 168) {
            System.out.println(String.valueOf("El numero ingresado debe ser mayor que 0 y menor o igual a 168 horas"));
            System.out.println(String.valueOf("Ingrese las horas trabajadas"));
            H = sc.nextDouble();
        }
        // Sueldo por hora
        while (SXH <= 0) {
            System.out.println(String.valueOf("El sueldo por hora debe ser mayor que 0"));
            System.out.println(String.valueOf("Ingrese el sueldo por hora trabajada"));
            SXH = sc.nextDouble();
        }
        // Horas extras
        if (H <= 40) {
            SF = H * SXH;
        } else {
            HE = H - 40;
            S1 = 40 * SXH;
            S2 = HE * (SXH * 2);
            SF = S1 + S2;
        }
        System.out.println(String.valueOf("Las horas extras trabajadas son: ") + String.valueOf(HE));
        System.out.println(String.valueOf("El sueldo semanal es: ") + String.valueOf(SF));
    }
}
