import java.util.Scanner;

/*
Una tienda desea registrar las ventas realizadas cada día durante una semana. El programa debe calcular
el total de ventas al final de la semana.
Instrucciones:
Usa un bucle para registrar las ventas diarias durante 7 días.
Al final del bucle, muestra el total de ventas de la semana.
 */

public class ej4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cont = 0;
        int ventaTotal=0;

        while (cont < 7) {

            cont = cont + 1;

            System.out.println("Cantidad de ventas del día "+ cont);
            int ventaDia = input.nextInt();

            ventaTotal = ventaTotal + ventaDia;
        }

        System.out.println("Las ventas totales en la semana fueron de: " + ventaTotal);
    }
}
