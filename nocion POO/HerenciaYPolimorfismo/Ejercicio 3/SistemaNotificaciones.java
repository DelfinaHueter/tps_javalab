package SistemaNotificacion;

public class SistemaNotificaciones {
    public static void main(String[] args) {
        Notificaciones notificaciones = new Notificaciones();

        CorreoElectronico correo = new CorreoElectronico(
                "Juan Pérez", "Bienvenido a nuestro servicio", "juan.perez@gmail.com");
        MensajeTexto mensajeTexto = new MensajeTexto(
                "María López", "Tu código de verificación es 1234", "1122334455");

        notificaciones.agregarCanal(correo);
        notificaciones.agregarCanal(mensajeTexto);

        System.out.println("canales de notificación\n");
        notificaciones.mostrarCanales();

        System.out.println("\nnotificaciones\n ");
        notificaciones.enviarNotificaciones();

        System.out.println("\nmensajes\n");
        notificaciones.personalizarMensajes("\nmensaje personalizado para todos los usuarios\n");
        notificaciones.mostrarCanales();

        System.out.println("\n notificaciones personalizadas\n");
        notificaciones.enviarNotificaciones();
    }
}