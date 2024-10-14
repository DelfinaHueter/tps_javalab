import java.util.Scanner;
public class Musica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su estado de ánimo ((1): Feliz, (2): Triste, (3): Enérgico, (4): Relajado):");
        int animo = scanner.nextInt();

        switch (animo) {
            case 1:
                feliz();
                break;
            case 2:
                triste();
                break;
            case 3:
                energico();
                break;
            case 4:
                relajado();
                break;
            default:
                System.out.println("Ese estado no está en la lista.");
                break;
        }
    }

    public static void feliz() {
        System.out.println("Musica para cuando estás feliz:");
        System.out.println("1. Happy - Pharrell Williams");
        System.out.println("2. Don't Stop Me Now - Queen");
        System.out.println("3. Good Life - OneRepublic");
    }

    public static void triste() {
        System.out.println("Musica para cuando estás triste:");
        System.out.println("1. Someone Like You - Adele");
        System.out.println("2. Fix You - Coldplay");
        System.out.println("3. Say Something - A Great Big World & Christina Aguilera");
    }

    public static void energico() {
        System.out.println("Musica para cuando estás enérgico:");
        System.out.println("1. Eye of the Tiger - Survivor");
        System.out.println("2. Pump It - The Black Eyed Peas");
        System.out.println("3. Titanium - David Guetta ft. Sia");
    }

    public static void relajado() {
        System.out.println("Musica para cuando estás relajado:");
        System.out.println("1. Weightless - Marconi Union");
        System.out.println("2. Clair de Lune - Claude Debussy");
        System.out.println("3. Spiegel im Spiegel - Arvo Pärt");
    }
}

