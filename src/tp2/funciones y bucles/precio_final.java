package tp2;
import java.util.Scanner;

public class precio_final {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de productos: ");
        int cantidadProductos = scanner.nextInt();
        double[] preciosOriginales = new double[cantidadProductos];

        System.out.println("Ingresa los precios originales:");
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Precio del producto " + (i + 1) + ": ");
            preciosOriginales[i] = scanner.nextDouble();
        }

        double[] preciosFinales = calcularPrecioFinal(preciosOriginales);
        System.out.println("Precio final de los productos:");
        for (double precio : preciosFinales) {
            System.out.println("$ " + precio);
        }
        scanner.close();
    }

    public static double[] calcularPrecioFinal(double[] preciosOriginales) {
        double descuento = 0.10; // 10%
        double[] preciosFinales = new double[preciosOriginales.length];
        for (int i = 0; i < preciosOriginales.length; i++) {
            preciosFinales[i] = preciosOriginales[i] - (preciosOriginales[i] * descuento);
        }
        return preciosFinales;
    }
}
