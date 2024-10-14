package tp2.bucles;
import java.util.Scanner;

public class calculo_salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de empleados: ");
        int cantidadEmpleados = scanner.nextInt();
        double tarifaPorHora = 15.0;
        double salarioTotal;

        int i = 0;
        while (i < cantidadEmpleados) {
            System.out.print("Ingresa las horas trabajadas por el empleado " + (i + 1) + ": ");
            double horasTrabajadas = scanner.nextDouble();
            salarioTotal = horasTrabajadas * tarifaPorHora;
            System.out.println("Salario del empleado " + (i + 1) + ": $" + salarioTotal);
            i++;
        }
        scanner.close();
    }
}
