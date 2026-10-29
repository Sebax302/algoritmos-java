
import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Ingresar base del triangulo");
        base = teclado.nextDouble();

        System.out.println("Ingresar altura del triangulo");
        altura = teclado.nextDouble();

        area = (base * altura) / 2;

        System.out.println("El area del triangulo es: " + area);

        teclado.close();
    }
}

    

