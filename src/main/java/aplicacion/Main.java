package aplicacion;

import bebida.*;
import bebidaDecorator.*;
import sensor.*;
import sensorDecorator.*;
import central.CentralMonitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // --- Demostración de 6 combinaciones de bebidas ---
        List<Bebida> pedidos = new ArrayList<>();

        pedidos.add(new Leche(new Cafe()));                              // Pedido 1: Café + Leche
        pedidos.add(new Azucar(new Canela(new Te())));                    // Pedido 2: Té + Canela + Azúcar
        pedidos.add(new Azucar(new Leche(new Chocolate())));              // Pedido 3: Chocolate + Leche + Azúcar
        pedidos.add(new Canela(new Cafe()));                              // Pedido 4: Café + Canela
        pedidos.add(new Canela(new Azucar(new Leche(new Te()))));        // Pedido 5: Té + Leche + Azúcar + Canela
        pedidos.add(new Leche(new Canela(new Chocolate())));              // Pedido 6: Chocolate + Canela + Leche

        System.out.println("--- Pedidos de Bebidas ---");
        int idx = 1;
        for (Bebida b : pedidos) {
            System.out.printf("Pedido %d: %s | Costo: $%.2f%n", idx++, b.getDescripcion(), b.getCosto());
        }

        System.out.println("\n--- Sistema de Monitoreo de Sensores (6 combinaciones) ---");

        // --- Demostración de 6 combinaciones de eventos ---
        List<Evento> eventos = new ArrayList<>();

        eventos.add(new AlarmaDecorator(new MovimientoEvento()));                               // Evento 1: Movimiento + Alarma
        eventos.add(new RegistroDecorator(new TemperaturaAltaEvento()));                        // Evento 2: Temperatura alta + Registro
        eventos.add(new NotificacionDecorator(new MovimientoEvento()));                         // Evento 3: Movimiento + Notificación
        eventos.add(new NotificacionDecorator(new AlarmaDecorator(new TemperaturaAltaEvento()))); // Evento 4: Temp alta + Alarma + Notificación
        eventos.add(new NotificacionDecorator(new RegistroDecorator(new MovimientoEvento())));    // Evento 5: Movimiento + Registro + Notificación
        eventos.add(new RegistroDecorator(new AlarmaDecorator(new TemperaturaAltaEvento())));     // Evento 6: Temp alta + Alarma + Registro

        CentralMonitor monitor = new CentralMonitor();
        monitor.procesarEventos(eventos);
    }
}
