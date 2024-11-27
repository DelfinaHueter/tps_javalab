package AsociacionYDependencia;

import java.util.ArrayList;

public class Plato {

    private String nombreCompleto;
    private double precio;
    boolean esBebida;
    private ArrayList<Ingrediente> ingredientes;

    public Plato(String nombreCompleto, double precio, boolean esBebida) {
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
        this.ingredientes = new ArrayList<>();
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isEsBebida() {
        return esBebida;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }



    public void agregarIngrediente(Ingrediente ingrediente) {

        ingredientes.add(ingrediente);

    }



    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(nombreCompleto).append("\n");
        sb.append("Precio: $ ").append(String.format("%.2f", precio)).append("\n");

        if (!esBebida) {

            sb.append("Ingredientes:\n");
            sb.append(String.format("%-15s %-15s %-25s%n", "Nombre", "Cantidad", "Unidad de medida"));

            for (Ingrediente ingrediente : ingredientes) {

                sb.append(ingrediente.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}

