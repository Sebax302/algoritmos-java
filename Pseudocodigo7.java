
import java.util.Scanner;

public class DescuentoCompra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double compra, descuento, total;

        // Cuerpo
        System.out.println("Ingrese el monto de la compra");
        compra = teclado.nextDouble();

        if (compra >= 200) {
            descuento = compra * 0.15;
        } else {
            if (compra >= 100) {
                descuento = compra * 0.10;
            } else {
                descuento = compra * 0.05;
            }
        }

        total = compra - descuento;

        System.out.println("El descuento aplicado es: " + descuento);
        System.out.println("El monto a pagar es: " + total);

        teclado.close();
    }
}
