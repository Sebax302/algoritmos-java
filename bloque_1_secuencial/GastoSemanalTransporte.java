// Gasto semanal transporte
import java.util.Locale;
import java.util.Scanner;

public class GastoSemanalTransporte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int VD = 0;
        int DS = 0;
        double PC = 0.0;
        double GS = 0.0;

        // Ejercicio: Gasto semanal transporte
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese el numero de viajes por dia:"));
        VD = sc.nextInt();
        // Proceso y cálculos
        while (VD <= 0) {
            System.out.println(String.valueOf("Los viajes por dia deben ser mayores que 0"));
            System.out.println(String.valueOf("Ingrese el numero de viajes por dia:"));
            VD = sc.nextInt();
        }
        System.out.println(String.valueOf("Ingrese el costo de cada pasaje:"));
        PC = sc.nextDouble();
        while (PC <= 0) {
            System.out.println(String.valueOf("El costo del pasaje debe ser mayor que 0"));
            System.out.println(String.valueOf("Ingrese el costo de cada pasaje:"));
            PC = sc.nextDouble();
        }
        System.out.println(String.valueOf("Ingrese los dias que viaja a la semana (1 a 7):"));
        DS = sc.nextInt();
        while (DS < 1  ||  DS > 7) {
            System.out.println(String.valueOf("Los dias deben estar entre 1 y 7"));
            System.out.println(String.valueOf("Ingrese los dias que viaja a la semana (1 a 7):"));
            DS = sc.nextInt();
        }
        GS = VD * PC * DS;
        System.out.println(String.valueOf("El gasto semanal de transporte es: $") + String.valueOf(GS));
    }
}
