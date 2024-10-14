//Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
//calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
//peso, peso normal, sobrepeso, obesidad).
import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Su Indice de Masa Corporal (IMC) es: " + imc);

        if (imc < 18.5) {
            System.out.println("Recomendación: Usted se encuentra con bajo peso, debería consultar con su médico.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Recomendación: Siga así, se encuentra en un peso ideal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Recomendación: Usted se encuentra con sobrepeso, debería consultar con su médico.");
        } else {
            System.out.println("Recomendación: Puede tener obesidad, consulte con su médico.");
        }

    }
}

