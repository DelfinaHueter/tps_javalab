import java.util.Scanner;

public class Rutina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese su condición física ((1): Principiante, (2): Intermedio, (3): Avanzado):");
        int condicion = scanner.nextInt();

        switch (condicion) {
            case 1:
                Principiante();
                break;
            case 2:
                Intermedio();
                break;
            case 3:
                Avanzado();
                break;
            default:
                System.out.println("Ese nivel no está en la lista.");
                break;
        }
    }

    public static void Principiante() {

        String rutina = """
            RUTINA SEMANAL PARA PRINCIPIANTES:
            Objetivo: Desarrollar resistencia y aprender la técnica básica.
                Calentamiento (5-10 minutos): Marcha en el lugar o caminata rápida.
            Rutina:
                Sentadillas: 3 series de 10 repeticiones.
                Flexiones (rodillas en el suelo): 3 series de 8 repeticiones.
                Puente de glúteos: 3 series de 12 repeticiones.
                Plancha (de rodillas): 3 series de 20 segundos.
                Superman (boca abajo, levanta brazos y piernas): 3 series de 10 repeticiones.
                Cardio: 10-15 minutos de caminata rápida o trote ligero.
                
                Estiramiento (5 minutos): Estiramientos básicos para piernas, brazos y espalda.
        """;

        System.out.println(rutina);
    }

    public static void Intermedio() {

        String rutina = """
            RUTINA SEMANAL PARA INTERMEDIOS:
            Objetivo: Mejorar la fuerza y resistencia cardiovascular.
                Calentamiento (5-10 minutos): Saltos de tijera (jumping jacks) o trote suave.
            Rutina:
                Sentadillas con salto: 4 series de 12 repeticiones.
                Flexiones tradicionales: 4 series de 10 repeticiones.
                Zancadas alternas: 4 series de 12 repeticiones (cada pierna).
                Plancha: 4 series de 30-45 segundos.
                Mountain Climbers: 4 series de 20 repeticiones (10 por pierna).
                Cardio: 20 minutos de trote moderado o saltar la cuerda.
                
                Estiramiento (5-10 minutos): Enfocado en músculos trabajados (cuádriceps, glúteos, espalda y brazos).
        """;

        System.out.println(rutina);
    }

    public static void Avanzado() {
        String rutina = """
            RUTINA SEMANAL PARA AVANZADOS:
            Objetivo: Desafiar la fuerza y mejorar la capacidad cardiovascular.
                Calentamiento (5-10 minutos): Burpees o trote rápido.
            Rutina:
                Burpees: 4 series de 15 repeticiones.
                Sentadillas con peso (mancuernas): 4 series de 15 repeticiones.
                Flexiones tipo diamante: 4 series de 12 repeticiones.
                Zancadas con salto: 4 series de 10 repeticiones (cada pierna).
                Plancha con elevación de pierna: 4 series de 45 segundos por lado.
                Russian Twists (con peso): 4 series de 20 repeticiones (cada lado).
                Cardio: 30 minutos de HIIT (entrenamiento de intervalos de alta intensidad).
                
                Estiramiento (5-10 minutos): Enfocado en flexibilidad y relajación muscular profunda.
        """;

        System.out.println(rutina);
    }
}

