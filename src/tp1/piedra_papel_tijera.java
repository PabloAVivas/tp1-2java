import java.util.Random;
import java.util.Scanner;

public class piedra_papel_tijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opciones = {"piedra", "papel", "tijeras"};

        System.out.println("Elige: piedra, papel o tijeras");
        String jugador = scanner.nextLine().toLowerCase();

        if (!jugador.equals("piedra") && !jugador.equals("papel") && !jugador.equals("tijeras")) {
            System.out.println("Opción no válida. Intenta de nuevo.");
            return;
        }

        int indexMaquina = random.nextInt(3);
        String maquina = opciones[indexMaquina];

        System.out.println("La máquina eligió: " + maquina);

        if (jugador.equals(maquina)) {
            System.out.println("Es un empate!");
        } else if ((jugador.equals("piedra") && maquina.equals("tijeras")) ||
                (jugador.equals("papel") && maquina.equals("piedra")) ||
                (jugador.equals("tijeras") && maquina.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }

        scanner.close();
    }
}
