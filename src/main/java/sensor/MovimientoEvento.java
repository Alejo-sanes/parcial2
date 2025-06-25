package sensor;

public class MovimientoEvento implements Evento {
    @Override
    public String procesar() {
        return "Movimiento detectado";
    }
}
