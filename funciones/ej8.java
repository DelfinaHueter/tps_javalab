import java.util.Scanner;
/*
Una empresa de servicios necesita llevar el control de las horas trabajadas por sus empleados durante una semana.
**Instrucciones**:
- Crea un arreglo `empleados` con los nombres de los empleados y otro arreglo `horasTrabajadas`
con las horas trabajadas en la semana.
- Escribe una función `calcularPagoSemanal` que calcule el pago semanal (a razón de $15 por hora trabajada).
 */

public class ej8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] empleados = {"Exe", "Lucho", "Uli", "Del"};

        int[] horasTrabajadas = {30, 20, 10, 50};

        double[] pagos = calcularPagoSemanal(horasTrabajadas);

        System.out.println("Sueldo semanal:");

        for (int i = 0; i < empleados.length; i++) {

            System.out.println(empleados[i] + ": $" + pagos[i]);
        }
    }

    public static double[] calcularPagoSemanal(int[] horasTrabajadas) {

        int pesos = 15;

        double[] sueldo = new double[horasTrabajadas.length];

        for (int i = 0; i < horasTrabajadas.length; i++) {

            sueldo[i] = horasTrabajadas[i] * pesos;
        }
        return sueldo;
    }
}
