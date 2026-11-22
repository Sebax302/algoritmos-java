// Acceso a laboratorio de cómputo
import java.util.Locale;
import java.util.Scanner;

public class AccesoLaboratorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String E = "";
        String C = "";
        String A = "";

        // Ejercicio: Acceso a laboratorio de cómputo
        // Datos de estudiante, carne y autorizacion
        System.out.println(String.valueOf("Es estudiante? (S/N):"));
        E = sc.next();
        System.out.println(String.valueOf("Tiene carne vigente? (S/N):"));
        C = sc.next();
        System.out.println(String.valueOf("Tiene autorizacion especial? (S/N):"));
        A = sc.next();
        if ((!E.equals("S")  &&  !E.equals("N"))  ||  (!C.equals("S")  &&  !C.equals("N"))  ||  (!A.equals("S")  &&  !A.equals("N"))) {
            System.out.println(String.valueOf("Responda en mayusculas S o N"));
        } else {
            // Prioridad: estudiante con carne, o visitante autorizado
            if (E.equals("S")) {
                if (C.equals("S")) {
                    System.out.println(String.valueOf("Acceso permitido"));
                } else {
                    System.out.println(String.valueOf("Acceso denegado: carne no vigente"));
                }
            } else {
                if (A.equals("S")) {
                    System.out.println(String.valueOf("Ingreso temporal autorizado"));
                } else {
                    System.out.println(String.valueOf("Acceso denegado"));
                }
            }
        }
    }
}
