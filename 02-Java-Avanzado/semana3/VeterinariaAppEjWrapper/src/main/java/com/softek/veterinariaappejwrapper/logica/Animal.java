
package com.softek.veterinariaappejwrapper.logica;


public class Animal {
    private String nombre;
private Double peso; //utilizando la clase wrapper

//constructor vacio

    public Animal() {
    }
//constructor con atributos

    public Animal(String nombre, Double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }
    
//geters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

//n método mostrarInfo() que imprima el nombre y el peso del animal.
    public void mostrarInfo(){
        System.out.println("El nombre del animal es: " + nombre + " El peso es: " + peso + " kg");
    }
}
