package Actividad2;

// Clase SistemadePagos (main)
public class SistemadePagos {
    public static void main(String[] args) {
        Pagos pagos = new Pagos();

        TarjetaCredito tarjeta = new TarjetaCredito("Juan Pérez", 123456789, "12/26", 123);
        PayPal paypal = new PayPal("María López", 987654321, "maria.lopez@gmail.com");

        pagos.agregarMetodoPago(tarjeta);
        pagos.agregarMetodoPago(paypal);

        System.out.println("Métodos de pago:");
        pagos.mostrarPagos();

        System.out.println("\nRealizando pagos...");
        pagos.realizarPagos();

        System.out.println("\nCancelando pagos...");
        pagos.cancelarPagos();
    }
}
