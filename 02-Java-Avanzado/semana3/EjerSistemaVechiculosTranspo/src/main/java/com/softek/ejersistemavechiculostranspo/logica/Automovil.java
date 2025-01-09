
package com.softek.ejersistemavechiculostranspo.logica;


public class Automovil {
    //un auto tiene capacidad para varios pasajeros,
    private int capacidadPasaj;
    
    //construr vacio

    public Automovil() {
    }
    
    //constructor con atributos

    public Automovil(int capacidadPasaj) {
        this.capacidadPasaj = capacidadPasaj;
       
    }
 
    //geter y seter de pasaje

    public int getCapacidadPasaj() {
        return capacidadPasaj;
    }

    public void setCapacidadPasaj(int capacidadPasaj) {
        this.capacidadPasaj = capacidadPasaj;
    }
    
    //tostring

    @Override
    public String toString() {
        return "Automovil";
    }
    
    
    
    
    
}
