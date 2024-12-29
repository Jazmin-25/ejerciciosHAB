

package EjercicioFabrica;

import logica.Fabrica;
import logica.Trabajador;

public class EjercicioFabrica {

    public static void main(String[] args) {
        //ejercicio igual a callc center solo se sustituye fabrica de call center y de trabajador a agente
        //creo una nueva fabrica para usar como controladora de tareas
        Fabrica fabrica = new Fabrica();
        
        //creo 3 trabajadores y hago que los 3 esten en la misma fabrica
        Trabajador trab1 = new Trabajador("Trabajador 1 ", fabrica);
        Trabajador trab2 = new Trabajador("Trabajador 2", fabrica);
        Trabajador trab3 = new Trabajador("Trabajador 3", fabrica);
        
        //Inicia los hilos de lso trabajadores
        //los trabajadores quedan a la espera de recibir una tarea
        //trabajador star (listo)
        trab1.start();
        trab2.start();
        trab3.start();
        
        
        
        //Realizamos una simulacion de 10 tareas con un for llamando al metodo recibirTarea de la fabrica
        for (int i =0; i<10;i++) {
            fabrica.recibirTarea();
            try {
                //simulamos un tiempo aproximado entre llamadas y llamada para probarlas
                Thread.sleep(1000);
                
            } catch (InterruptedException e){
                e.printStackTrace();
                
                
            }
        }        
    }
}

