

package com.hackaboss.ejemplojpa;

import java.util.List;
import logica.Persona;
import persistencia.ControladoraPersistencia;

public class EjemploJPA {

    public static void main(String[] args) {//hacer una instancia controladora de persistencia
       
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
       //creo 3 personas en la BD
        controlPersis.crearPersona(new Persona(1,"Ariadna", 29));
        controlPersis.crearPersona(new Persona(2,"Luisina", 33));
        controlPersis.crearPersona(new Persona(3,"Alfredo", 15));
        
        //obtengo todas las persona
        //una lista, no se puede hacer un arraylist, sino saldra error
        List<Persona> listaPersonas = controlPersis.traerPersonas();
        for (Persona per: listaPersonas) {
            System.out.println("Persona: " + per.getNombre());
        }
        
        //borramos una persona
        controlPersis.borrarPersona(2);
        
        //Editar o modificar una persona
        controlPersis.modificarPersona(new Persona(3,"Alfredo",30));
    }
}
