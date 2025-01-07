

package com.softek.ejemrefmetodoestatico;

import java.util.function.Function;


public class EjemRefMetodoEstatico {

    public static void main(String[] args) {
        //convertir un numero a letra con lambas
        //(int num) -> String.valueOf(num);
        
        //referencia a metodos
        //String::valueOf;
        //solo declaro la inerface funcionlal
        Function<Integer,String>convertidor = String::valueOf;
        System.out.println("El valor de salida es: " + convertidor.apply(35));
        
        //normal
        String resultado = String.valueOf(35);
        System.out.println("El valor de salirda es: " + resultado);
    }
}
