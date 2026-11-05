import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer dato: ");
        double n1 = entrada.nextDouble();
        System.out.print("Ingrese el segundo dato: ");
        double n2 = entrada.nextDouble();
        System.out.print("Ingrese el tercer dato: ");
        double n3 = entrada.nextDouble();
        System.out.print("Ingrese el cuarto dato: ");
        double n4 = entrada.nextDouble();

        double suma = n1 + n2 + n3 + n4;
        double producto = n1 * n2 * n3 * n4;
        double media = suma / 4;

        System.out.println("La suma es: " + suma);
        System.out.println("El producto es: " + producto);
        System.out.println("La media aritmetica es: " + media);

        entrada.close();
    }
}
