import java.util.Scanner;

public class Peliculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuál es tu género de película favorito?");
        System.out.println("1. Acción");
        System.out.println("2. Comedia");
        System.out.println("3. Drama");
        System.out.println("4. Ciencia ficción");

        int opcion = scanner.nextInt();

        String recomendacion;

        switch (opcion) {
            case 1:
                recomendacion = "Recomiendo la saga de 'John Wick'.";
                break;
            case 2:
                recomendacion = "Recomiendo 'Son como niños 1 y 2'.";
                break;
            case 3:
                recomendacion = "Recomiendo 'El Padrino'.";
                break;
            case 4:
                recomendacion = "Recomiendo 'Interstellar'.";
                break;
            default:
                recomendacion = "Opción no válida.";
                break;
        }

        System.out.println(recomendacion);

    }
}

