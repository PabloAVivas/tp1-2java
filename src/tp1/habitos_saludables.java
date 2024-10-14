import java.util.Scanner;

public class habitos_saludables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas horas duerme al día? ");
        int horasDormir = scanner.nextInt();

        System.out.print("¿Cuántas horas hace ejercicio al día? ");
        int horasEjercicio = scanner.nextInt();

        System.out.print("¿Cuántas comidas saludables consume al día? ");
        int comidasSaludables = scanner.nextInt();

        String evaluacion = "Evaluación de hábitos saludables:\n";

        // Evaluación del sueño
        if (horasDormir >= 7) {
            evaluacion += "Duerme lo suficiente. ¡Bien hecho!\n";
        } else {
            evaluacion += "No duerme lo suficiente. Intente dormir al menos 7 horas.\n";
        }

        // Evaluación del ejercicio
        if (horasEjercicio >= 1) {
            evaluacion += "Hace ejercicio regularmente. ¡Excelente!\n";
        } else {
            evaluacion += "Se recomienda hacer al menos 1 hora de ejercicio al día.\n";
        }

        // Evaluación de la dieta
        if (comidasSaludables >= 3) {
            evaluacion += "Consume suficientes comidas saludables. ¡Sigue así!\n";
        } else {
            evaluacion += "Intente consumir al menos 3 comidas saludables al día.\n";
        }

        System.out.println(evaluacion);

        scanner.close();
    }
}
