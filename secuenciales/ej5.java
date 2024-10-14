import java.util.Scanner;

public class Viaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la distancia del viaje en kilómetros: ");
        double dist = scanner.nextDouble();

        System.out.println("ingrese el consumo de combustible del vehículo en litros por kilómetro: ");
        double cons = scanner.nextDouble();

        System.out.println("ingrese el precio del combustible por litro: ");
        double precioComb = scanner.nextDouble();


        double costoTotal = dist * cons * precioComb;

        System.out.println("El costo total del viaje es: " + costoTotal + " pesos.");
    }
}
