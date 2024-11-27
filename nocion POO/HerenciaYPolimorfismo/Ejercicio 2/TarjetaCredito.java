package HerenciaYPolimorfismo;

class TarjetaCredito extends MetodoPago implements Cancelable {
    private String fechaExpiracion;
    private int codigoSeguridad;

    public TarjetaCredito(String titular, int numero, String fechaExpiracion, int codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public void realizarPago() {
        System.out.println("Realizando pago con Tarjeta de Crédito...");
        System.out.println("Pago realizado exitosamente para el titular: " + titular);
    }

    @Override
    public void cancelarPago() {
        System.out.println("Cancelando pago realizado con Tarjeta de Crédito...");
        System.out.println("Pago cancelado exitosamente para el titular: " + titular);
    }

    @Override
    public String toString() {
        return super.toString() + ", TarjetaCredito{" +
                "fechaExpiracion='" + fechaExpiracion + '\'' +
                ", codigoSeguridad=" + codigoSeguridad +
                '}';
    }
}
