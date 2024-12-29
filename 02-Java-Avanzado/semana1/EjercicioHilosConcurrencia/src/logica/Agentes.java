package logica;

//agentes extiende hilo
public class Agentes extends Thread {
    private String nombre;
    private CallCenter callCenter;

    public Agentes(String nombre, CallCenter callCenter) {
        this.nombre = nombre;
        this.callCenter = callCenter;
    }

    @Override
    public void run() {
        while (callCenter.isActive()) {
            String llamada = callCenter.asignarLlamada(); // Asigna una llamada

            System.out.println("\n" + nombre + " está atendiendo " + llamada);
            try {
                Thread.sleep(2000); // Simula el tiempo de atención
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(nombre + " ha resuelto " + llamada);
        }
    }

}
