/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.softek.ejerciciopagos.logica;

/**
 *
 * @author zoro_
 */
public class Pago <T,U> {
    private T moneda; //no se que tipo de moneda
    private double monto;
    private U metodoPago;

    public Pago() {
    }

    public Pago(T moneda, double monto, U metodoPago) {
        this.moneda = moneda;
        this.monto = monto;
        this.metodoPago = metodoPago;
    }

    public T getMoneda() {
        return moneda;
    }

    public void setMoneda(T moneda) {
        this.moneda = moneda;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public U getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(U metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    public void procesarPago(){
        System.out.println("Se proceso el pago de: " + monto + "en moneda: " + moneda.toString() + " en medio de pago: " + metodoPago.toString());
    }
    
    
    
    
    
}
