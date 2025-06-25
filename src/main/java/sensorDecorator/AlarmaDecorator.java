package sensorDecorator;

public class AlarmaDecorator extends EventoDecorator {
    public AlarmaDecorator(sensor.Evento eventoDecorado) {
        super(eventoDecorado);
    }

    @Override
    public String procesar() {
        return eventoDecorado.procesar() + " -> Alarma activada";
    }
}
