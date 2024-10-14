package tp2.bucles;
import java.util.Scanner;

public class calculo_extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de empleados: ");
        int cantidadEmpleados = scanner.nextInt();
        int i = 0;

        do {
            System.out.print("Ingresa las horas trabajadas por el empleado " + (i + 1) + ": ");
            double horasTrabajadas = scanner.nextDouble();

            if (horasTrabajadas > 40) {
                double horasExtras = horasTrabajadas - 40;
                System.out.println("El empleado " + (i + 1) + " trabajó " + horasExtras + " horas extra.");
            } else {
                System.out.println("El empleado " + (i + 1) + " no trabajó horas extra.");
            }
            i++;
        } while (i < cantidadEmpleados);

        scanner.close();
    }
}
