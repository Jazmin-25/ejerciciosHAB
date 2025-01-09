
package com.softek.ejersistemavechiculostranspo.logica;


public class Reserva <T,U> {
    private T vehiculo; //auto, moto o bici
    private U tipoReserva; //precencial, oline
    private String cliente; //nombre
    
    //constructor vacio

    public Reserva() {
    }
//constructor atributos

    public Reserva(T vehiculo, U tipoReserva, String cliente) {
        this.vehiculo = vehiculo;
        this.tipoReserva = tipoReserva;
        this.cliente = cliente;
    }
    
    //geter y seter

    public T getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(T vehiculo) {
        this.vehiculo = vehiculo;
    }

    public U getTipoReserva() {
        return tipoReserva;
    }

    public void setTipoReserva(U tipoReserva) {
        this.tipoReserva = tipoReserva;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    //Implementá métodos para registrar la reserva (presencial, online)
    public void muestraReserva(){
        //Sistema de reservas 
        System.out.println("Reserva realizada: " + tipoReserva + 
                " Cliente: " + cliente + " El vehiculo elegido es: " + vehiculo);   
    }
    
}
