import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {

        Scanner A = new Scanner(System.in);
        String[] clientes = {"Exequiel", "Ulises", "Lucho", "Delfina","Renzo"};

        int[] Compras = new int[clientes.length];

        for (int i = 0;i < clientes.length; i++){

            System.out.println("Ingrese cantidad de compras realizadas por "+ clientes[i]);
            Compras[i] = A.nextInt();

        }
        calcularDescuentos(Compras, clientes);
    }
    public static void calcularDescuentos(int[]Compras, String[]Clientes){

        for (int i = 0; i < Clientes.length; i++) {

            if (Compras[i] > 10){

                System.out.println(Clientes[i] + " tiene 10% de descuento" );

            }
        }

    }
}
