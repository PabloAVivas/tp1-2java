package tp2;
import java.util.Scanner;

public class calculo_academic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalHoras = 0;
        String[] actividades = {"estudiar", "hacer ejercicios", "leer", "tiempo libre"};

        int i = 0;
        while (i < actividades.length) {
            System.out.print("Ingresa las horas dedicadas a " + actividades[i] + ": ");
            totalHoras += scanner.nextInt();
            i++;
        }

        System.out.println("Tiempo total dedicado: " + totalHoras + " horas.");
        scanner.close();
    }
}