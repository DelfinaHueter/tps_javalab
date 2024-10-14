import java.util.Scanner;

public class descuentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la categoría del cliente ((1): Estudiante, (2): Adulto, (3): Jubilado): ");
        int categoria = scanner.nextInt();

        double descuento = 0.0;

        if (categoria == 1) {
            descuento = 0.10;
        } else if (categoria == 2) {
            descuento = 0.05;
        } else if (categoria == 3) {
            descuento = 0.15;
        } else {
            System.out.println("Categoría no válida.");
        }

        double precioFinal = precio - (precio * descuento);

        System.out.println("El precio final con descuento es: $" + precioFinal);

    }
}
