
package logica;

//la clase extiende hilo
public class Trabajador extends Thread{
    //atributos
    private String nombre;
    private Fabrica fabrica;
    
    //añado constructor

    public Trabajador(String nombre, Fabrica fabrica) {
        this.nombre = nombre;
        this.fabrica = fabrica;
    }
    
    //tostring

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", fabrica=" + fabrica + '}';
    }

    public Trabajador() {
    }
    
//metodo run 
public void run () {
    while(fabrica.isActive()) {
        String tarea = fabrica.asignarTarea(); //asigno la tarea
        
        System.out.println("\n" + nombre + " está atendiendo " + tarea);
        System.out.println("ensamblando productos");
        System.out.println("controlando productos");
        System.out.println("embalando productos");
        
        try {
            Thread.sleep(2000); //simula el tiempo de las tareas
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nombre + " ha resuelto " + tarea);
    }
}    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
        public Fabrica getFabrica() {
            return fabrica;
        }
        
        public void setFabrica(Fabrica fabrica) {
            this.fabrica = fabrica;
        }
    }