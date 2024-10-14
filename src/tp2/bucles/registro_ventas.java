package tp2.bucles;
import java.util.Scanner;

public class registro_ventas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalVentas = 0.0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Ingresa las ventas del día " + i + ": ");
            double ventasDiarias = scanner.nextDouble();
            totalVentas += ventasDiarias;
        }

        System.out.println("Total de ventas de la semana: $" + totalVentas);
        scanner.close();
    }
}
