
package com.softek.ejeexcepciones;


public class EjeExcepciones {

    public static void main(String[] args) {
        //nos dara una excepcion : java.lang.ArithmeticException: / by zero
        try { //intenta
        int resultado = 3/0;
        }
       catch(Exception e){ //sino puedes
           System.out.println("No se puede dividir por cero");
        
    }
        
        int edades [] = {
            12, 15, 23, 30
        }; // excepcion: java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        try {
        System.out.println("La edad de la posicion 4 es: " + edades [4]);
        }
        catch (Exception e) {
            System.out.println("Intentaste acceder a un indice que no existe");
        }
  }
}
