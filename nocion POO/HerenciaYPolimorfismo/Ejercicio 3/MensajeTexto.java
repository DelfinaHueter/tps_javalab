package HerenciaYPolimorfismo;

public class MensajeTexto extends CanalNotificacion implements Personalizable {
    private String numeroTelefono;

    public MensajeTexto(String usuario, String mensaje, String numeroTelefono) {
        super(usuario, mensaje);
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando notificación por mensaje de texto...");
        System.out.println(this.toString());
        System.out.println("Mensaje enviado al número: " + numeroTelefono);
    }

    @Override
    public void personalizarMensaje(String nuevoMensaje) {
        this.mensaje = nuevoMensaje;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Método: Mensaje de Texto\n" +
                "Número de Teléfono: " + numeroTelefono;
    }
}
