import java.util.Scanner;
/*
Una empresa desea conocer el promedio de satisfacción de sus clientes basado en
encuestas de calificación de 1 a 5.

**Instrucciones**:
- Crea un arreglo `calificaciones` con las puntuaciones de satisfacción de los clientes.
- Escribe una función `calcularPromedioSatisfaccion` que recorra el arreglo y calcule el promedio de satisfacción
 */

public class ej5 {

    public static void main(String[] args) {

        Scanner A = new Scanner(System.in);

        int clientes;

        System.out.println("Ingrese la cantidad de clientes que realizaron la encuesta ");
        clientes = A.nextInt();

        int[] calificaciones = new int[clientes];

        for (int i = 0; i < clientes; i++){

            System.out.println("Calificacion del cliente numero "+(i+1));
            calificaciones[i] = A.nextInt();

            while (calificaciones[i] < 1 || calificaciones[i] > 5){

                System.out.println("Ingrese un numero del 1 al 5");
                calificaciones[i] = A.nextInt();

            }
        }

        double promedio = calcularPromedioSatisfaccion(calificaciones,clientes);

        System.out.println("El promedio de satisfacción de los clientes es: " + promedio);
    }

    public static double calcularPromedioSatisfaccion(int[] calificaciones,int clientes) {

        double suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            
            suma += calificaciones[i];
        }
        return suma / clientes;
    }
}
