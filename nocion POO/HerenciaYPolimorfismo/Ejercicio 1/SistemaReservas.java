package Actividad1;

// Clase SistemaReservas (main)
public class SistemaReservas {
    public static void main(String[] args) {
        Reservas reservas = new Reservas();

        VueloRegular vuelo1 = new VueloRegular(1, "Buenos Aires", "Santiago", "2024-12-01", 100, 50);
        VueloCharter vuelo2 = new VueloCharter(2, "Lima", "Bogotá", "2024-12-10", 5000);

        reservas.agregarVuelo(vuelo1);
        reservas.agregarVuelo(vuelo2);

        System.out.println("Vuelos antes de aplicar promociones:");
        reservas.mostrarVuelos();

        System.out.println("Total antes de promociones: $" + reservas.calcularTotalReservas());

        reservas.aplicarPromociones(10); // Aplica un 10% de descuento

        System.out.println("\nVuelos después de aplicar promociones:");
        reservas.mostrarVuelos();

        System.out.println("Total después de promociones: $" + reservas.calcularTotalReservas());
    }
}
