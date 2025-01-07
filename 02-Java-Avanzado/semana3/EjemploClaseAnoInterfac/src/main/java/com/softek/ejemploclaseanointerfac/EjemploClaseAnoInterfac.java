
package com.softek.ejemploclaseanointerfac;

import com.softek.ejemploclaseanointerfac.logica.Saludo;


public class EjemploClaseAnoInterfac {

    public static void main(String[] args) {
        
        Saludo sal = new Saludo () {
            @Override
            public void saludar(){
                System.out.println("Hola saludando desde clase anónima");
            }
            
        };
        sal.saludar();
    }
}
