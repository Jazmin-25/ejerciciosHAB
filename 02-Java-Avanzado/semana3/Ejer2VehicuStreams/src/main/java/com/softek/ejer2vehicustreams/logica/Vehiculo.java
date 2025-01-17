
package com.softek.ejer2vehicustreams.logica;


public class Vehiculo {
    private String modelo;
    private String marca;
    private double costo;
    
    //constructor vacio
    public Vehiculo() {
    } 
    
    //constructor con atributos
    public Vehiculo(String modelo, String marca, double costo) {
        this.modelo = modelo;
        this.marca = marca;
        this.costo = costo;
    }
    
    //getters y setters
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }


    //tostring

    @Override
    public String toString() {
        return "Vehiculo{" + "modelo=" + modelo + ", marca=" + marca + ", costo=" + costo + '}';
    }

   
    
    
}
