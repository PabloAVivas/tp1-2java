package tp2;
import java.util.Scanner;

public class gestion_cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de clientes: ");
        int cantidadClientes = scanner.nextInt();
        String[] clientes = new String[cantidadClientes];
        double[] facturasPendientes = new double[cantidadClientes];

        for (int i = 0; i < cantidadClientes; i++) {
            System.out.print("Nombre del cliente " + (i + 1) + ": ");
            clientes[i] = scanner.next();
            System.out.print("Factura pendiente de " + clientes[i] + ": ");
            facturasPendientes[i] = scanner.nextDouble();
        }

        enviarFacturas(clientes, facturasPendientes);
        scanner.close();
    }

    public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
        System.out.println("Clientes con facturas mayores a $500:");
        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500) {
                System.out.println(clientes[i] + " - Factura: $" + facturasPendientes[i]);
            }
        }
    }
}
