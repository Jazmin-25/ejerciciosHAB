package EjemploSynchronized;

import logica.MiRunnable;

import java.util.logging.Level;
import java.util.logging.Logger;


public class EjemploSynchronized {
    public static void main(String[] args) {
//e crean dos objetos Thread (hilo1 y hilo2), cada uno ejecutando una instancia
// de la clase MiRunnable, que debe implementar la interfaz Runnable.
        Thread hilo1 = new Thread(new MiRunnable());
        Thread hilo2 = new Thread(new MiRunnable());
//Ambos hilos pueden ejecutarse simultáneamente
        hilo1.start();
        hilo2.start();

//determina que un hilo tiene que terminar para acceder a otro
        //El método join() obliga al hilo principal (que ejecuta main) a esperar a que cada hilo
        // (hilo1 y hilo2) termine su ejecución antes de continuar.
        //Si no se utiliza join(), el hilo principal puede finalizar antes que los hilos secundarios,
        // lo que podría causar problemas
        try {
            hilo1.join();
            hilo2.join();
            //Se captura una posible InterruptedException, que puede ocurrir
            // si el hilo que espera con join() es interrumpido.
        } catch (InterruptedException ex) {
            Logger.getLogger(EjemploSynchronized.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}