import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declaraciones
        double n1, n2, n3, prom;

        // Control de la n1
        System.out.println("Ingrese la nota 1, entre 0 y 10");
        n1 = teclado.nextDouble();

        while (n1 < 0 || n1 > 10) {
            System.out.println("Nota invalida");
            System.out.println("Ingrese la nota con los valores entre 0 y 10");
            n1 = teclado.nextDouble();
        }

        // Control de la n2
        System.out.println("Ingrese la nota 2, entre 0 y 10");
        n2 = teclado.nextDouble();

        while (n2 < 0 || n2 > 10) {
            System.out.println("Nota invalida");
            System.out.println("Ingrese la nota con los valores entre 0 y 10");
            n2 = teclado.nextDouble();
        }

        // Control de la n3
        System.out.println("Ingrese la nota 3, entre 0 y 10");
        n3 = teclado.nextDouble();

        while (n3 < 0 || n3 > 10) {
            System.out.println("Nota invalida");
            System.out.println("Ingrese la nota con los valores entre 0 y 10");
            n3 = teclado.nextDouble();
        }

        // Calculo del promedio
        prom = (n1 + n2 + n3) / 3;
    }
}
