
package com.softek.ejemmetodoinstancia;

import com.softek.ejemmetodoinstancia.logica.Persona;


public class EjemMetodoInstancia {

    public static void main(String[] args) {
        Persona pers = new Persona();
       pers.setNombre("Ariadna");
       
       //usar la referencia a metodos
       //necesito una interfaz funcional
       Runnable saludo = pers::saludar; //crea una instancia de saludo y asigna una asociacion al metodo saludar
       
       
       //forma normal 
       pers.saludar();
    }
}
