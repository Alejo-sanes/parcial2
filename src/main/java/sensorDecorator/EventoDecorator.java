package sensorDecorator;

import sensor.Evento;

public abstract class EventoDecorator implements Evento {
    protected Evento eventoDecorado;

    public EventoDecorator(Evento eventoDecorado) {
        this.eventoDecorado = eventoDecorado;
    }
}
