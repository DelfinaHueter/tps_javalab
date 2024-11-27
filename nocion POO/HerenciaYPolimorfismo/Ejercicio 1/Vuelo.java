package Actividad1;

// Clase abstracta Vuelo
abstract class Vuelo {
    protected int numeroVuelo;
    protected String origen;
    protected String destino;
    protected String fecha;

    public Vuelo(int numeroVuelo, String origen, String destino, String fecha) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    public abstract double calcularPrecio();

    public String toString() {
        return "Vuelo: " +
                "numeroVuelo: " + numeroVuelo +
                ", origen: " + origen + '\'' +
                ", destino: " + destino + '\'' +
                ", fecha: " + fecha + '\'';
    }
}
