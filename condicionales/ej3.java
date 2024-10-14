import java.util.Scanner;

public class libros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuál es tu género literario favorito?");
        System.out.println("1. Fantasia");
        System.out.println("2. Misterio");
        System.out.println("3. Romance");
        System.out.println("4. Ciencia ficción");

        int opcion = scanner.nextInt();

        String recomendacion;

        switch (opcion) {
            case 1:
                recomendacion = "Recomiendo la saga de 'Harry Potter' de J.K Rowling.";
                break;
            case 2:
                recomendacion = "Recomiendo 'El nombre de la rosa' de Umberto Eco.";
                break;
            case 3:
                recomendacion = "Recomiendo 'Orgullo y prejuicio' de Jane Austen.";
                break;
            case 4:
                recomendacion = "Recomiendo 'Dune' de Frank Herbert.";
                break;
            default:
                recomendacion = "Opción no válida.";
                break;
        }

        System.out.println(recomendacion);

    }
}
