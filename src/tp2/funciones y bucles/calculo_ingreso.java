package tp2;
import java.util.Scanner;

public class calculo_ingreso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] ventas = new double[30];

        System.out.println("Ingresa las ventas diarias (30 días):");
        for (int i = 0; i < 30; i++) {
            System.out.print("Día " + (i + 1) + ": ");
            ventas[i] = scanner.nextDouble();
        }

        double totalIngresos = calcularIngresosMensuales(ventas);
        System.out.println("Total de ingresos mensuales: $" + totalIngresos);
        scanner.close();
    }

    public static double calcularIngresosMensuales(double[] ventas) {
        double suma = 0;
        for (double venta : ventas) {
            suma += venta;
        }
        return suma;
    }
}
