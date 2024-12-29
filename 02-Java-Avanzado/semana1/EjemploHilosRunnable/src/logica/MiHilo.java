package logica;

public class MiHilo implements Runnable {
    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println("Soy el hilo y estoy en la vuelta " + i);
        }
    }


}
