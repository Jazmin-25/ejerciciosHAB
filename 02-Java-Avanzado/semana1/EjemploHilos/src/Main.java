import logica.MiHilo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//crear hilos mediante una clase llamada Thread
        MiHilo hilo = new MiHilo("Hilo 1");
        MiHilo hilo2 = new MiHilo("Hilo 2");
        MiHilo hilo3 = new MiHilo("Hilo 3");
        //primero llamo al star en vez del run
        hilo.start();
        hilo2.start();
        hilo3.start();

    }
}