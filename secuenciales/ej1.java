//Escribe un programa que pida al usuario su fecha de nacimiento (en formato DD/MM/AAAA) y luego
//imprima su signo del zodiaco y un mensaje de horóscopo correspondiente.
import java.util.Scanner;

public class Horoscopo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu fecha de nacimiento en formato (DD/MM/AAAA):");
        String fechaNacimiento = scanner.nextLine();

        String[] partesFecha = fechaNacimiento.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]);

        if (dia > 32) {
            System.out.println("Día incorrecto. Intente nuevamente.");
        }else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            System.out.println("Aries (21 marzo - 19 abril): Tu energía es contagiosa, siempre listo para nuevos retos.");
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            System.out.println("Tauro (20 abril - 20 mayo): Tu paciencia y determinación te llevan lejos.");
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            System.out.println("Géminis (21 mayo - 20 junio): Tu mente curiosa nunca deja de sorprender.");
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            System.out.println("Cáncer (21 junio - 22 julio): Tu corazón es tu mayor fortaleza.");
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            System.out.println("Leo (23 julio - 22 agosto): Tu carisma ilumina cada habitación que pisas.");
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            System.out.println("Virgo (23 agosto - 22 septiembre): Tu atención al detalle es admirable.");
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            System.out.println("Libra (23 septiembre - 22 octubre): Tu equilibrio y armonía inspiran a quienes te rodean.");
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            System.out.println("Escorpio (23 octubre - 21 noviembre): Tu pasión te hace imparable.");
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
                System.out.println("Sagitario (22 noviembre - 21 diciembre): Tu espíritu libre siempre busca nuevas aventuras.");
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            System.out.println("Capricornio (22 diciembre - 19 enero): Tu disciplina y ambición te llevan a la cima.");
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            System.out.println("Acuario (20 enero - 18 febrero): Tu visión única del mundo te hace especial.");
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            System.out.println("Piscis (19 febrero - 20 marzo): Tu empatía y creatividad son tu magia.");
        } else {
            System.out.println("Fecha inválida.");

        }
    }
    }
