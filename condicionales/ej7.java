//Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
//recomiende una actividad basada en su estado de ánimo.

import java.util.Scanner;
public class actividadAnimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su estado de ánimo ((1): Feliz, (2): Triste, (3): Enérgico, (4): Relajado):");
        int animo = scanner.nextInt();

        switch (animo) {
            case 1:
                System.out.println("Te recomiendo: \n Salir al boliche");
                break;
            case 2:
                System.out.println("Te recomiendo: \n Escuchar la música que te guste");
                break;
            case 3:
                System.out.println("Te recomiendo: \n Salir a correr a un parque o algo parecido");
                break;
            case 4:
                System.out.println("Te recomiendo:\n Leer un libro, o meditar.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}
