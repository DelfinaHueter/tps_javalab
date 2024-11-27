package AsociacionYDependencia;

public class Nota extends CargaNotas {

    private String catedra;
    private double notaExamen;

    public Nota(String catedra, double notaExamen) {
        this.catedra = catedra;
        this.notaExamen = notaExamen;
    }

    //GETTERS
    public String getCatedra() {
        return catedra;
    }

    public double getNotaExamen() {
        return notaExamen;
    }

    @Override
    // toString es como el __str__ de python
    public String toString() {
        return "Cátedra: " + catedra + " - Nota Examen: " + notaExamen;
    }

}
