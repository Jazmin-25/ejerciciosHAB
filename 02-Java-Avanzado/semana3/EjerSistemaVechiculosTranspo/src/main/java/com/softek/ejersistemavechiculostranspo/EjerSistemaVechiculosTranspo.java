package com.softek.ejersistemavechiculostranspo;

import com.softek.ejersistemavechiculostranspo.logica.Automovil;
import com.softek.ejersistemavechiculostranspo.logica.Bicicleta;
import com.softek.ejersistemavechiculostranspo.logica.Motocicleta;
import com.softek.ejersistemavechiculostranspo.logica.Online;
import com.softek.ejersistemavechiculostranspo.logica.Presencial;
import com.softek.ejersistemavechiculostranspo.logica.Reserva;

public class EjerSistemaVechiculosTranspo {

    public static void main(String[] args) {

        Reserva<Automovil, Online> reservaAuto1 = new Reserva<>(new Automovil(3), new Online(), "Carlos Gómez");
        Reserva<Automovil, Presencial> reservaAuto2 = new Reserva<>(new Automovil(6), new Presencial(), "Ariadna Islas");

        Reserva<Motocicleta, Online> reservaMoto1 = new Reserva<>(new Motocicleta(), new Online(), "Luisina de Paola");
        Reserva<Motocicleta, Presencial> reservaMoto2 = new Reserva<>(new Motocicleta(), new Presencial(), "Maria Teresa");

        Reserva<Bicicleta, Online> reservaBici1 = new Reserva<>(new Bicicleta(), new Online(), "Mauricio Vargas");
        Reserva<Bicicleta, Presencial> reservaBici2 = new Reserva<>(new Bicicleta(), new Presencial(), "Benito Bodoque");

        reservaAuto1.muestraReserva();
        reservaAuto2.muestraReserva();
        reservaMoto1.muestraReserva();
        reservaMoto2.muestraReserva();
        reservaBici1.muestraReserva();
        reservaBici2.muestraReserva();

    }
}
