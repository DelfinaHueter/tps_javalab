package SistemaNotificacion;

public class CorreoElectronico extends CanalNotificacion implements Personalizable {
    private String direccionCorreo;

    public CorreoElectronico(String usuario, String mensaje, String direccionCorreo) {
        super(usuario, mensaje);
        this.direccionCorreo = direccionCorreo;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando notificación por correo electrónico...");
        System.out.println(this.toString());
        System.out.println("Correo enviado con éxito a: " + direccionCorreo);
    }

    @Override
    public void personalizarMensaje(String nuevoMensaje) {
        this.mensaje = nuevoMensaje;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Método: Correo Electrónico\n" +
                "Dirección de Correo: " + direccionCorreo;
    }
}