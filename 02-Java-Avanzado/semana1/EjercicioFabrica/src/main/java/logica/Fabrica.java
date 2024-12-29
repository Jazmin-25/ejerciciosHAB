
package logica;

import java.util.ArrayList;
import java.util.List;


public class Fabrica {
    private List<String> listaTareas; //listo las tareas de la fabrica
    private int numTarea; // identificador de tarea
    private boolean isActive = true; //Es la variable que controla si la fabrica esta activa o no
    
    public Fabrica() {
        listaTareas = new ArrayList<>();
        numTarea = 1; // Inicializa el id de las llamadas
    }
    
    //Metodo sincronizado para recibir tareas
    public synchronized  void recibirTarea() {
        String tarea = "Tarea " + numTarea;
        listaTareas.add(tarea);
        System.out.println("\n" + tarea + " ha sido recibida.");
        numTarea++;
        notifyAll(); // notifica a los trabajadores de que hay una nueva tarea
        
        //Metodo sincronizado para asignar una tarea a un trabajador

    }
    public synchronized String asignarTarea() {
            while (listaTareas.isEmpty()) {
                try {
                    wait(); //Espera si no hay tareas
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return listaTareas.remove(0); //Elimina de la lista la primera tarea y devuelvela
        }
        
        //Metodo para verificar si la fabrica esta activa
        public synchronized  boolean isActive() {
            return isActive;
        }
        
        //metodo para cerrar la fabrica
        public synchronized void shutdown() {
            isActive = false; // cambiar el estado a inactivo
            notifyAll(); //notificar a los hilos en espera para que terminen
        }
                
    }

