package tp2;
import java.util.Scanner;

public class promedio_clientes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de calificaciones: ");
        int cantidadCalificaciones = scanner.nextInt();
        int[] calificaciones = new int[cantidadCalificaciones];

        System.out.println("Ingresa las calificaciones:");
        for (int i = 0; i < cantidadCalificaciones; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();
        }

        double promedio = calcularPromedioSatisfaccion(calificaciones);
        System.out.println("Promedio de satisfacción del cliente: " + promedio);
        scanner.close();
    }

    public static double calcularPromedioSatisfaccion(int[] calificaciones) {
        double suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }
}
