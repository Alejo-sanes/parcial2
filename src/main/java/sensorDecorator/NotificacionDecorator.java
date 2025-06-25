package sensorDecorator;

public class NotificacionDecorator extends EventoDecorator {
    public NotificacionDecorator(sensor.Evento eventoDecorado) {
        super(eventoDecorado);
    }

    @Override
    public String procesar() {
        // Aquí podrías agregar lógica de envío de alerta
        return eventoDecorado.procesar() + " -> Notificación enviada";
    }
}
