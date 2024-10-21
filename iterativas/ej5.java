import java.util.Scanner;

/*
Una empresa desea calcular las horas extras trabajadas por sus empleados.
Si un empleado trabaja más de 40 horas en la semana, las horas adicionales se consideran horas extras.
Instrucciones:
Pide al usuario ingresar el número de empleados.
Usa un bucle para ingresar las horas trabajadas por cada empleado.
Si un empleado trabajó más de 40 horas, calcula y muestra las horas extras.

 */
public class ej5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero de empleados: ");
        int cantEmpleados = sc.nextInt();

        int i = 0;

        while (i < cantEmpleados) {

            System.out.println("Ingrese las horas semanales trabajadas del empleado "+((i++)+1)+": ");
            int horasTrabajadas = sc.nextInt();

            if (horasTrabajadas > 40){

                System.out.printf("El empleado %d tiene %d horas extra\n",i,horasTrabajadas-40);

            }
        }
    }
}
