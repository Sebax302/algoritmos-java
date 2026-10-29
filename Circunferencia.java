import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double radio, longitud, area;

        System.out.println("Ingresar el radio");
        radio = teclado.nextDouble();

        longitud = 2 * 3.1416 * radio;
        area = 3.1416 * radio * radio;

        System.out.println("La longitud es: " + longitud);
        System.out.println("El area es: " + area);

        teclado.close();
    }
}
