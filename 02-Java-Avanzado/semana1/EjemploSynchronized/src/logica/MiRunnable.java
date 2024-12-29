package logica;

public class MiRunnable implements Runnable {

    ClaseSincronizada ejemplo = new ClaseSincronizada();
// la lógica para los hilos estará definida en el método run()
    @Override
    public void run () {
        for (int i = 0; i < 5; i++) {
            System.out.println("Soy el hilo y estoy en la vuelta " + i);
            ejemplo.incrementar();

        }
    }
}