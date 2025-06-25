package sensorDecorator;

public class RegistroDecorator extends EventoDecorator {
    public RegistroDecorator(sensor.Evento eventoDecorado) {
        super(eventoDecorado);
    }

    @Override
    public String procesar() {
        // Aquí podrías agregar lógica de guardado en logs
        return eventoDecorado.procesar() + " -> Registro en log";
    }
}
