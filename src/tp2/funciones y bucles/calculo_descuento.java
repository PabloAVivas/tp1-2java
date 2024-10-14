package tp2;
import java.util.Scanner;

public class calculo_descuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de clientes: ");
        int cantidadClientes = scanner.nextInt();
        String[] clientes = new String[cantidadClientes];
        int[] compras = new int[cantidadClientes];

        for (int i = 0; i < cantidadClientes; i++) {
            System.out.print("Nombre del cliente " + (i + 1) + ": ");
            clientes[i] = scanner.next();
            System.out.print("Número de compras de " + clientes[i] + ": ");
            compras[i] = scanner.nextInt();
        }

        calcularDescuentos(clientes, compras);
        scanner.close();
    }

    public static void calcularDescuentos(String[] clientes, int[] compras) {
        System.out.println("Descuentos aplicables:");
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) {
                System.out.println(clientes[i] + " - Descuento: 10%");
            }
        }
    }
}
