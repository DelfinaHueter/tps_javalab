package HerenciaYPolimorfismo;

abstract class MetodoPago {
    protected String titular;
    protected int numero;

    public MetodoPago(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public abstract void realizarPago();

    @Override
    public String toString() {
        return "MetodoPago{" +
                "titular='" + titular + '\'' +
                ", numero=" + numero +
                '}';
    }
}
