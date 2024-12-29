package EjercicioHilosConcurrencia;

import logica.Agentes;
import logica.CallCenter;

public class Main {
    public static void main(String[] args) {
        //realizar simulacion de call center con hilos
        //Creo un nuevo "Call Center" para usar como controlador de llamadas
        CallCenter callCenter = new CallCenter();

        // Creo 3 agentes de soporte y hago que los 3 estén en el mismo Call Center
        Agentes ag1 = new Agentes("Agente 1", callCenter);
        Agentes ag2 = new Agentes("Agente 2", callCenter);
        Agentes ag3 = new Agentes("Agente 3", callCenter);

        // Iniciar los hilos de los agentes
        //los agentes quedan a la espera de recibir una llamada
        ag1.start();
        ag2.start();
        ag3.start();

        //Empezamos a simular 10 llamadas con un for llamando al método recibirLlamada del callCenter
        for (int i=0; i<10;i++) {
            callCenter.recibirLlamada();
            try {
                //podemos simular un tiempo aprox entre llamada y llamada para probar
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

        //una vez que termina podemos cerrar el call center para que deje de esperar
        //  callCenter.shutdown();
    }
    
}