

package com.softek.ejemrefmetodoarbitrario;

import com.softek.ejemrefmetodoarbitrario.logica.Persona;
import java.util.ArrayList;
import java.util.List;


public class EjemRefMetodoArbitrario {

    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Carlos"));
        listaPersonas.add(new Persona("Ariadna"));
        listaPersonas.add(new Persona("alfredo"));
        listaPersonas.add(new Persona("Manuel"));
        
        //uso referencia de metodos de intancia de un objeto arbitrario
        listaPersonas.forEach(Persona::saludar);
        
        //codigo normal
        for (Persona per : listaPersonas) {
            per.saludar();
            
        }
        }
    }
