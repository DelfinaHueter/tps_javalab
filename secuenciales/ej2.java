//Escribe un programa que pida al usuario su peso en kilogramos, la duración del ejercicio en
//minutos y el tipo de ejercicio (correr, nadar, andar en bicicleta), y luego calcule e imprima las
//calorías quemadas. Utiliza diferentes tasas de calorías quemadas por minuto para cada tipo de ejercicio.
import java.util.Scanner;

public class Calorias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un tipo de ejercicio (correr, nadar, andar en bicicleta):");
        String tipoEjercicio = scanner.next();
        System.out.println("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese la duración del ejercicio realizado en minutos:");
        int duracion = scanner.nextInt();


        double caloriasQuemadas = 0;

        switch (tipoEjercicio.toLowerCase()) {
            case "correr":
                caloriasQuemadas = 0.07 * peso * duracion;
                break;
            case "nadar":
                caloriasQuemadas = 0.05 * peso * duracion;
                break;
            case "andar en bicicleta":
                caloriasQuemadas = 0.04 * peso * duracion;
                break;
            default:
                System.out.println("Ese ejercicio no está en la lista.");
                return;
        }

        System.out.println("Calorías quemadas: " + caloriasQuemadas);
    }
}
