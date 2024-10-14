import java.util.Scanner;

public class estado_animo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuál es tu estado de ánimo? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        String recomendacion;

        switch (estadoAnimo) {
            case "feliz":
                recomendacion = "¡Genial! Te recomiendo salir a celebrar con amigos o disfrutar de tu canción favorita.";
                break;
            case "triste":
                recomendacion = "Lo siento. Tal vez te ayudaría ver una película divertida o hablar con un amigo.";
                break;
            case "enérgico":
                recomendacion = "¡Fantástico! Te sugeriría hacer ejercicio, como correr o bailar.";
                break;
            case "relajado":
                recomendacion = "Perfecto. Tal vez quieras meditar, leer un buen libro o dar un paseo tranquilo.";
                break;
            default:
                recomendacion = "Estado de ánimo no reconocido. Por favor, elige entre feliz, triste, enérgico o relajado.";
        }

        System.out.println(recomendacion);
        scanner.close();
    }
}
