package tp2;
import java.util.Scanner;

public class control_horas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de empleados: ");
        int cantidadEmpleados = scanner.nextInt();
        String[] empleados = new String[cantidadEmpleados];
        int[] horasTrabajadas = new int[cantidadEmpleados];

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            empleados[i] = scanner.next();
            System.out.print("Horas trabajadas de " + empleados[i] + ": ");
            horasTrabajadas[i] = scanner.nextInt();
        }

        calcularPagoSemanal(empleados, horasTrabajadas);
        scanner.close();
    }

    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {
        double tarifaPorHora = 15.0;
        System.out.println("Empleado - Pago Semanal");
        for (int i = 0; i < empleados.length; i++) {
            double pago = horasTrabajadas[i] * tarifaPorHora;
            System.out.println(empleados[i] + " - $ " + pago);
        }
    }
}
