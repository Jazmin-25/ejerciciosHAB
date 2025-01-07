

package com.softek.ejerciciotiendaanonima;

import logica.Descuento;
import logica.Producto;


public class EjercicioTiendaAnonima {
   
    public static void main(String[] args) {
        //precio original
        double precioOriginal = 350;
        //se puede hacer con scanner
        //creo una instancia de la clase producto
        Producto producto = new Producto();

        //clase anonima para el nuevo cliente 5%
        Descuento clienteNuevo = new Descuento() {
            @Override
            public double aplicarDescuento(double precioOriginal) {
            return  precioOriginal - (precioOriginal*0.5);
            //otra opcion es return precio=riginal*0.095;
            }
        };
        //clase anoni para el cliente frecuente 10% 
        Descuento clienteFrecuente = new Descuento() {
            @Override
            public double aplicarDescuento(double precioOriginal) {
            return  precioOriginal - (precioOriginal*0.10);
            //return precioOriginal*0.9.;
        //clase anoni para el cliente vip 20%
        }
   };
        Descuento clienteVip = new Descuento() {
            @Override
            public double aplicarDescuento(double precioOriginal) {
            return  precioOriginal - (precioOriginal*0.20);
    }
};
        producto.mostrarPrecioFinal(precioOriginal, clienteVip);
    }
}