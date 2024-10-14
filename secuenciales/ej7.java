//Escribe un programa que pida al usuario varios factores de felicidad (nivel de satisfacción con la vida, nivel de estrés, nivel de salud, etc.) en una escala del 1 al 10 y luego calcule e imprima un índice de felicidad basado en esos factores.
import java.util.Scanner;

public class IndiceFelicidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese su nivel de satisfacción con la vida (1 al 10): ");
        int vida = scanner.nextInt();

        System.out.println("ingrese su nivel de estres (1 al 10): ");
        int estres = scanner.nextInt();

        System.out.println("ingrese su nivel de salud (1 al 10): ");
        int salud = scanner.nextInt();

        System.out.println("ingrese su nivel de relaciones personales (1 al 10): ");
        int relaciones = scanner.nextInt();

        System.out.println("ingrese su nivel de trabajo/estudio (1 al 10): ");
        int trabajoEstudio = scanner.nextInt();

        double indiceFelicidad = calcularIndice(vida, estres, salud, relaciones, trabajoEstudio);

        System.out.printf("Su índice de felicidad es: %.2f\n", indiceFelicidad);
    }

    public static double calcularIndice(int vida, int estres, int salud, int relaciones, int trabajoEstudio) {

        double indice = (vida * 0.2) + (salud * 0.3) + (relaciones * 0.2) + (trabajoEstudio * 0.1) - (estres * 0.1);
        return indice;
    }
}

