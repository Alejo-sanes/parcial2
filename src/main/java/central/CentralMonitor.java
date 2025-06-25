package central;

import sensor.Evento;
import java.util.List;

public class CentralMonitor {
    public void procesarEventos(List<Evento> eventos) {
        for (Evento e : eventos) {
            System.out.println("Procesando evento: " + e.procesar() + ".");
        }
    }
}
