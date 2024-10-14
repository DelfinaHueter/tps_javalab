//Escribe un programa que pida al usuario cuántas horas al día puede estudiar y luego genere un plan de estudio semanal distribuyendo esas horas en diferentes materias.

import java.util.Scanner;

public class PlanDeEstudios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese cuántas horas al día puede estudiar: ");
        double horasDiarias = scanner.nextDouble();

        PlanEstudio(horasDiarias);
    }

    public static void PlanEstudio(double horasDiarias) {
        System.out.println("Plan de estudio semanal para Programación, Administracion, Sistemas Operativos y Matematica:");

        System.out.printf("Lunes: Matemática %.1fhs y Programación %.1fhs\n", horasDiarias * 0.40, horasDiarias * 0.60);
        System.out.printf("Martes: Sistemas Operativos %.1fhs y Administracion %.1fhs\n", horasDiarias * 0.20, horasDiarias * 0.80);
        System.out.printf("Miércoles: Programación %.1fhs y Administracion %.1fhs\n", horasDiarias * 0.90, horasDiarias * 0.10);
        System.out.printf("Jueves: Programacion %.1fhs y Sistemas Operativos %.1fhs\n", horasDiarias * 0.20, horasDiarias * 0.80);
        System.out.printf("Viernes: Matemática %.1fhs y Administracion %.1fhs\n", horasDiarias * 0.50, horasDiarias * 0.50);
        System.out.println("Sábado: Descanso");
        System.out.println("Domingo: Descanso");

        }
    }
