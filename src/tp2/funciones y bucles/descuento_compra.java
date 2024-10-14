package tp2;
import java.util.Scanner;

public class descuento_compra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de compras: ");
        int cantidadCompras = scanner.nextInt();
        double[] compras = new double[cantidadCompras];

        System.out.println("Ingresa los montos de las compras:");
        for (int i = 0; i < cantidadCompras; i++) {
            System.out.print("Compra " + (i + 1) + ": ");
            compras[i] = scanner.nextDouble();
        }

        aplicarDescuento(compras);
        scanner.close();
    }

    public static void aplicarDescuento(double[] compras) {
        double descuento = 0.15; // 15%
        System.out.println("Compras - Precio Final");
        for (double compra : compras) {
            if (compra > 500) {
                compra -= compra * descuento;
            }
            System.out.println("Precio final: $" + compra);
        }
    }
}
