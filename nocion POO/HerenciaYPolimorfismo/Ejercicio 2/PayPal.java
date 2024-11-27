package Actividad2;

class PayPal extends MetodoPago implements Cancelable {
    private String correoElectronico;

    public PayPal(String titular, int numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void realizarPago() {
        System.out.println("Realizando pago con PayPal...");
        System.out.println("Pago realizado exitosamente para el correo: " + correoElectronico);
    }

    @Override
    public void cancelarPago() {
        System.out.println("Cancelando pago realizado con PayPal...");
        System.out.println("Pago cancelado exitosamente para el correo: " + correoElectronico);
    }

    @Override
    public String toString() {
        return super.toString() + ", PayPal{" +
                "correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}
