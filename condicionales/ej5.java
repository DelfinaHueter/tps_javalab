import java.util.Random;
import java.util.Scanner;

public class piedra_papel_tijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opciones = {"piedra", "papel", "tijera"};

        System.out.println("Elige una opción: Piedra, Papel o Tijera");
        String eleccionUsuario = scanner.nextLine().toLowerCase();

        if (eleccionUsuario == ("piedra") && eleccionUsuario == ("papel") && eleccionUsuario == ("tijera")) {
            System.out.println("Opción no válida.");
            return;
        }

        String eleccionPrograma = opciones[random.nextInt(opciones.length)];
        System.out.println("Robot: " + eleccionPrograma);

        if (eleccionUsuario.equals(eleccionPrograma)) {
            System.out.println("Empate");
        } else if ((eleccionUsuario.equals("piedra") && eleccionPrograma.equals("tijera")) ||
                (eleccionUsuario.equals("papel") && eleccionPrograma.equals("piedra")) ||
                (eleccionUsuario.equals("tijera") && eleccionPrograma.equals("papel"))) {
            System.out.println("Ganaste! <3 ");
        } else {
            System.out.println("Perdiste :( ");
        }
    }
}
