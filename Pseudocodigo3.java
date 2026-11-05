import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Ingresar base del rectangulo");
        base = teclado.nextDouble();

        System.out.println("Ingresar altura del rectangulo");
        altura = teclado.nextDouble();

        area = base * altura;

        System.out.println("El area del rectangulo es: " + area);

        teclado.close();
    }
}
