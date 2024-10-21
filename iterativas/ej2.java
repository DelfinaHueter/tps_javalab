import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tarifa = 15;

        System.out.println("Ingrese la cantidad de empleados: ");
        int cantidadEmpleados = sc.nextInt();

        int[] horas = new int [cantidadEmpleados];
        int[] dias = new int [cantidadEmpleados];

        for (int i = 0; i <= (cantidadEmpleados-1); i++) {

            System.out.printf("Ingrese las horas trabajadas por día del empleado %d: \n",i+1 );
            horas[i] = sc.nextInt();

            System.out.print("Ingrese la cantidad de dias trabajados del empleado \n");
            dias[i] = sc.nextInt();

            horas[i] = horas[i] * tarifa * dias[i];

        }

        for (int i = 0; i <= (cantidadEmpleados-1); i++) {

            System.out.println("Salario semanal del empleado "+(i+1)+": $" + horas[i]);

        }
    }
}
