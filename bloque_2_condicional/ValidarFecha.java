// Validación de fecha
import java.util.Locale;
import java.util.Scanner;

public class ValidarFecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int DIA = 0;
        int MES = 0;
        int ANIO = 0;
        int DM = 0;
        boolean BIS = false;

        // Ejercicio: Validación de fecha
        // Variables y datos del problema
        // Entrada de datos y validaciones
        System.out.println(String.valueOf("Ingrese el dia:"));
        DIA = sc.nextInt();
        System.out.println(String.valueOf("Ingrese el mes:"));
        MES = sc.nextInt();
        System.out.println(String.valueOf("Ingrese el anio:"));
        ANIO = sc.nextInt();
        // Proceso y cálculos
        DM = 0;
        BIS = false;
        if (ANIO > 0  &&  MES >= 1  &&  MES <= 12  &&  DIA >= 1) {
            if (ANIO % 400 == 0  ||  (ANIO % 4 == 0  &&  ANIO % 100 != 0)) {
                BIS = true;
            }
            if (MES == 2) {
                if (BIS) {
                    DM = 29;
                } else {
                    DM = 28;
                }
            } else {
                if (MES == 4  ||  MES == 6  ||  MES == 9  ||  MES == 11) {
                    DM = 30;
                } else {
                    DM = 31;
                }
            }
        }
        if (DM > 0  &&  DIA <= DM) {
            System.out.println(String.valueOf("La fecha es valida"));
        } else {
            System.out.println(String.valueOf("La fecha no es valida"));
        }
    }
}
