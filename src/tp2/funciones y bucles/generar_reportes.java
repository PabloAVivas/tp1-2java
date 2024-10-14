package tp2;
import java.util.Scanner;

public class generar_reportes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de productos: ");
        int cantidadProductos = scanner.nextInt();
        String[] productos = new String[cantidadProductos];
        int[] stocks = new int[cantidadProductos];

        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Nombre del producto " + (i + 1) + ": ");
            productos[i] = scanner.next();
            System.out.print("Stock de " + productos[i] + ": ");
            stocks[i] = scanner.nextInt();
        }

        generarReporteBajoStock(productos, stocks);
        scanner.close();
    }

    public static void generarReporteBajoStock(String[] productos, int[] stocks) {
        System.out.println("Productos con bajo stock:");
        for (int i = 0; i < productos.length; i++) {
            if (stocks[i] < 5) {
                System.out.println(productos[i] + " - Unidades: " + stocks[i]);
            }
        }
    }
}
