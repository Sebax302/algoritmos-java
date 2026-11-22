// Medios de transporte en Loja
import java.util.Locale;
import java.util.Scanner;

public class MediosTransporte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int O = 0;
        int T = 0;
        String C = "";

        // Ejercicio: Medios de transporte en Loja
        // Tiempos referenciales para 5 km; varian con trafico y terreno
        System.out.println(String.valueOf("1. Bus urbano"));
        System.out.println(String.valueOf("2. Taxi"));
        System.out.println(String.valueOf("3. Bicicleta"));
        System.out.println(String.valueOf("4. Caminar"));
        O = sc.nextInt();
        switch (O) {
            case 1:
                T = 30;
                C = "Economico, depende de las paradas";
                break;
            case 2:
                T = 15;
                C = "Comodo, sujeto al trafico";
                break;
            case 3:
                T = 25;
                C = "Activo y sin combustible";
                break;
            case 4:
                T = 60;
                C = "Saludable, requiere mas tiempo";
                break;
            default:
                T = -1;
                C = "Opcion no valida";
                break;
        }
        if (T >= 0) {
            System.out.println(String.valueOf("Tiempo aproximado: ") + String.valueOf(T) + String.valueOf(" minutos"));
        }
        System.out.println(String.valueOf(C));
    }
}
