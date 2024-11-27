package AsociacionYDependencia;

public class Ingrediente {

    private String nombre;
    private double cantidad;
    private String unidad_de_medida;

    public Ingrediente(String nombre, double cantidad, String unidad_de_medida) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad_de_medida = unidad_de_medida;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getUnidad_de_medida() {
        return unidad_de_medida;
    }

    @Override
    public String toString() {

        return String.format("%-15s %-15.2f %-25s", nombre, cantidad, unidad_de_medida);

    }

}

