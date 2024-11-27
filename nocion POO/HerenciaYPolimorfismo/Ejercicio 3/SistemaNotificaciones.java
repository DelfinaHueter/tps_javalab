package HerenciaYPolimorfismo;

public class SistemaNotificaciones {
    public static void main(String[] args) {
        Notificaciones notificaciones = new Notificaciones();

        CorreoElectronico correo = new CorreoElectronico(
                "Delfina Hueter", "Bienvenido a nuestro servicio", "delfinahueter@gmail.com");
        MensajeTexto mensajeTexto = new MensajeTexto(
                "Gerónimo Guevara", "Tu código de verificación es 4986", "2390598346");

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
