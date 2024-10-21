/*
Una tienda necesita revisar el inventario de sus productos y determinar si algún artículo tiene menos
de 5 unidades disponibles para realizar un pedido.
Instrucciones:
Pide al usuario ingresar el número de productos.
Usa un bucle para ingresar la cantidad disponible de cada producto.
Si algún producto tiene menos de 5 unidades, muestra un mensaje indicando que es necesario realizar un pedido.

 */

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos: ");
        int contador = 0;
        int cantidadProductos = input.nextInt();

        while (contador < cantidadProductos){

            contador = contador + 1;

            System.out.println("Stock del producto "+ contador);
            int producto = input.nextInt();
            

            if (producto < 5){

                System.out.println("Es necesario realizar un pedido");

            }
        }
    }
}
