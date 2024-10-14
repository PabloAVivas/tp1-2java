package tp2.bucles;
import java.util.Scanner;

public class control_inventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de productos: ");
        int cantidadProductos = scanner.nextInt();

        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.print("Ingresa la cantidad disponible del producto " + i + ": ");
            int cantidad = scanner.nextInt();

            if (cantidad < 5) {
                System.out.println("Es necesario realizar un pedido del producto " + i + ".");
            }
        }
        scanner.close();
    }
}
