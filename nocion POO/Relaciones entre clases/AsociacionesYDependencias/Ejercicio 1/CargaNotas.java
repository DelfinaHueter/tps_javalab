package AsociacionYDependencia;

import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {

    public static void main(String[] args) {

        ArrayList<Alumno> alumnos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de alumnos a cargar:");
        int cantidadAlumnos = scanner.nextInt();
        scanner.nextLine(); //Consumir la linea pendiente

        for (int i = 0; i < cantidadAlumnos; i++) {

            System.out.println("\nNombre completo:");
            String nombre = scanner.nextLine();

            System.out.println("Legajo:");
            long legajo = scanner.nextLong();

            Alumno alumno = new Alumno(nombre, legajo);

            System.out.println("\nCantidad de notas:");
            int cantidadNotas = scanner.nextInt();
            scanner.nextLine();

            //Validar que se ingrese al menos una nota
            while (cantidadNotas <= 0) {

                System.out.println("Ingrese al menos 1 nota.");
                cantidadNotas = scanner.nextInt();
                scanner.nextLine();
            }

            for (int j = 0; j < cantidadNotas; j++){

                System.out.println("\nCátedra:");
                String catedra = scanner.nextLine();

                System.out.println("Nota:");
                double notaExamen = scanner.nextDouble();
                scanner.nextLine();

                Nota nota = new Nota(catedra, notaExamen);
                alumno.agregarNota(nota);
            }

            alumnos.add(alumno);

        }

        //Mostrar info cargada
        System.out.println("\n>> NOTAS EXÁMENES <<");

        // Es como el ** for alumno in alumnos ** en python
        for (Alumno alumno : alumnos) {

            System.out.println(alumno);
            System.out.println("\nNotas:");

            for (Nota nota : alumno.getNotas()){

                System.out.println(" " + nota);

            }

            System.out.printf("Promedio de notas: %.2f%n", alumno.calcularPromedio());
            System.out.println();

        }

        scanner.close();

    }

}
