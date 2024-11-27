package AsociacionYDependencia;

import HerenciaVideo.Persona;

import java.util.ArrayList;

public class Alumno extends CargaNotas {

    private String nombre;
    private long legajo;
    private ArrayList<Nota> notas;

    //Constructor
    public Alumno(String nombre, long legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.notas = new ArrayList<>(); //Inicializacion de la lista
    }

    //Metodo para agregar una nota al alumno
    public void agregarNota(Nota nota) {
        notas.add(nota);
    }

    //Metodo para calcular el promedio de las notas
    public double calcularPromedio() {

        if (notas.isEmpty()) {
            return 0; //Evita la division por 0
        }

        double suma = 0;
        for (Nota nota : notas) {

            suma += nota.getNotaExamen();

        }
        return suma / notas.size();
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public long getLegajo() {
        return legajo;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + "\nLegajo: " + legajo;
    }

}
