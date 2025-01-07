

package com.softek.ejer2clasesanonihotel;

import logica.PrecioReserva;

import logica.Reserva;

public class Ejer2ClasesAnoniHotel {

    public static void main(String[] args) {
        
       Reserva reserva = new Reserva();

        double precioBase = 1500.0;

        // Clase anónima para descuento de 10% para clientes con membresía
        PrecioReserva descuentoMembresia = new PrecioReserva() {
            @Override
            public double calcularPrecio(double precioBase) {
                return precioBase * 0.90; // 10% de descuento
            }
        };

        // Clase anónima para descuento de 20% en temporada baja
        PrecioReserva descuentoTemporadaBaja = new PrecioReserva() {
            @Override
            public double calcularPrecio(double precioBase) {
                return precioBase * 0.80; // 20% de descuento
            }
        };

        // Clase anónima para reservas de última hora (sin descuento, precio fijo)
        PrecioReserva precioFijoUltimaHora = new PrecioReserva() {
            @Override
            public double calcularPrecio(double precioBase) {
                return precioBase; // Sin descuento
            }
        };

        // Calcular y mostrar precios finales para cada escenario
        System.out.println("Precio base de la habitación: " + precioBase);

        System.out.print("Para cliente con membresía: ");
        reserva.realizarReserva(precioBase, descuentoMembresia);

        System.out.print("Para temporada baja: ");
        reserva.realizarReserva(precioBase, descuentoTemporadaBaja);

        System.out.print("Para reserva de última hora no hay descuento: ");
        reserva.realizarReserva(precioBase, precioFijoUltimaHora);
    }
}