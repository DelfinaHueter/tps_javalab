import java.util.Scanner;

public class evaluacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuántas horas al día dormis? ");
        double horasSueño = scanner.nextDouble();

        System.out.print("Cuántas horas al día haces ejercicio? ");
        double horasEjercicio = scanner.nextDouble();

        System.out.print("Cuántas comidas saludables tenes al día? ");
        double comidasSaludables = scanner.nextDouble();

        String evaluacion = evaluarHabitos(horasSueño, horasEjercicio, comidasSaludables);

        System.out.println("Evaluación hábitos saludables: " + evaluacion);

    }

    public static String evaluarHabitos(double horasSueño, double horasEjercicio, double comidasSaludables) {
        String evaluacion = "";

        if (horasSueño >= 7 && horasSueño <= 9) {
            evaluacion += "Tus hábitos de sueño son buenos. ";
        } else {
            evaluacion += "Deberías dormir entre 7 y 9 horas al día. ";
        }


        if (horasEjercicio >= 0.30) {
            evaluacion += "Tus hábitos de ejercicio son buenos. ";
        } else {
            evaluacion += "Deberías hacer al menos 30 minutos de ejercicio al día. ";
        }


        if (comidasSaludables >= 3) {
            evaluacion += "Tus hábitos alimenticios son buenos.";
        } else {
            evaluacion += "Deberías consumir al menos 3 comidas saludables al día.";
        }

        return evaluacion;
    }
}

