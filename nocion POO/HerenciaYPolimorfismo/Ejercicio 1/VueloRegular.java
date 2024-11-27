package Actividad1;

// Clase VueloRegular
class VueloRegular extends Vuelo implements Promocionable {
    private int numeroAsientos;
    private double precioBasePorAsiento;

    public VueloRegular(int numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioBasePorAsiento) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioBasePorAsiento = precioBasePorAsiento;
    }

    @Override
    public double calcularPrecio() {
        return numeroAsientos * precioBasePorAsiento;
    }

    @Override
    public void aplicarPromocion(double porcentaje) {
        this.precioBasePorAsiento -= this.precioBasePorAsiento * porcentaje / 100;
    }

    @Override
    public String toString() {
        return super.toString() + ", VueloRegular: " +
                "numeroAsientos: " + numeroAsientos +
                ", precioBasePorAsiento: " + precioBasePorAsiento ;
    }
}

