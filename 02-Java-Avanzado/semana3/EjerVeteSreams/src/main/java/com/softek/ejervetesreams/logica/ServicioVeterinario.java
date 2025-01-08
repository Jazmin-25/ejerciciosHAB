/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.softek.ejervetesreams.logica;

/**
 *
 * @author zoro_
 */
public class ServicioVeterinario {
    private String tipo;
    private double costo;

    public ServicioVeterinario() {
    }

    public ServicioVeterinario(String tipo, double costo) {
        this.tipo = tipo;
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "ServicioVeterinario{" + "tipo=" + tipo + ", costo=" + costo + '}';
    }

    
   
    }
    
    
    
