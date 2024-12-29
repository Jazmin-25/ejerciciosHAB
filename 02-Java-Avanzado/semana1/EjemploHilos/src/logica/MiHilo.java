package logica;

public class MiHilo  extends Thread{
    //ahora la clase se convierte un hilo
    private String nombre;
//constructor vacio solo con nombre
    public MiHilo(String nombre) {
        this.nombre = nombre;
    }
    //metodo ron
    @Override
    public void run () {
        for (int i=0; i<5; i++){
            System.out.println("Soy el hilo " + nombre + " Estoy en la vuelta " + i);
        }

    }
}
