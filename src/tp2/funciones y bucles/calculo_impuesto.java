package tp2;

import java.util.Scanner;

public class calculo_impuesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de facturas: ");
        int cantidadFacturas = scanner.nextInt();
        double[] facturas = new double[cantidadFacturas];

        System.out.println("Ingresa los montos de las facturas:");
        for (int i = 0; i < cantidadFacturas; i++) {
            System.out.print("Factura " + (i + 1) + ": ");
            facturas[i] = scanner.nextDouble();
        }

        calcularImpuesto(facturas);
        scanner.close();
    }

    public static void calcularImpuesto(double[] facturas) {
        double tasaImpuesto = 0.21; // 21%
        System.out.println("Factura - Impuesto");
        for (double factura : facturas) {
            double impuesto = factura * tasaImpuesto;
            System.out.println("$ " + factura + " - Impuesto: $" + impuesto);
        }
    }
}
