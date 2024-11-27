package AsociacionYDependencia;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurante {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Plato> mis_platos = new ArrayList<>();

        System.out.println(">> CREACIÓN DE MENÚ <<");
        int continuar;

        do {

            System.out.println("¿Es una bebida?\n1)Si\n2)No");
            int opcion = sc.nextInt();
            sc.nextLine();
            boolean esBebida = (opcion == 1);

            System.out.print("Nombre completo: ");
            String nombre_plato = sc.nextLine();

            System.out.print("Precio $");
            double precio = sc.nextDouble();
            sc.nextLine();

            //Crear objeto PLATO
            Plato mi_plato = new Plato(nombre_plato, precio, esBebida);

            if (!esBebida) {

                System.out.println("Ingredientes: (1 ingrediente como mínimo)");

                do {

                    System.out.print("Nombre completo: ");
                    String nombre_ing = sc.nextLine();

                    System.out.print("Cantidad: ");
                    double cant_ing = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Unidad de medida: ");
                    String unidad_de_medida = sc.nextLine();

                    //Crear objeto INGREDIENTE
                    Ingrediente mis_ingredientes = new Ingrediente(nombre_ing, cant_ing, unidad_de_medida);
                    //Agregar el ingrediente a la LISTA INGREDIENTES
                    mi_plato.agregarIngrediente(mis_ingredientes);

                    System.out.println("¿Continuar con la carga de ingredientes?\n1)Si\n2)No");
                    continuar = sc.nextInt();
                    sc.nextLine();

                } while (continuar == 1);

            }
            //Una vez ingresados los datos del PRIMER/SEGUNDO,etc plato
            //Añadir TODO el objeto (todo el plato) a la
            //lista creada en un principio (mis_platos)
            mis_platos.add(mi_plato);

            System.out.println("¿Agregar otro plato?\n1)Si\n2)No");
            continuar = sc.nextInt();
            sc.nextLine();

        } while (continuar == 1);


        System.out.println("\n------------ MENÚ RESTAURANTE ------------");
        for (Plato mi_plato : mis_platos) {

            System.out.println(mi_plato);
            System.out.println("-----------------------------------------");

        }

        sc.close();

    }

}
