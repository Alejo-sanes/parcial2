package sensor;

public class TemperaturaAltaEvento implements Evento {
    @Override
    public String procesar() {
        return "Temperatura alta detectada";
    }
}
