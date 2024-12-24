package EjemploLinkendList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> listaFrutas = new LinkedList<>();
//java agrega los elementos en el orden que yo especifico
        //lifo last in first put
        //sifo first in first out
        listaFrutas.add("Naranja");
        listaFrutas.add("Manzana");
        listaFrutas.add("Banana");
        listaFrutas.add("Fresa");
        //agrego el melon para que sea mi nueva cabecera (primer lugar)
        listaFrutas.add(0,"Melón");//las posiciones arrancan en 0

        //para ver el tamaño de una lista
        int tamanio = listaFrutas.size(); // size es tamaño que devolvera el tamaño de la lista
        //size es para lista
        System.out.println("El tamaño de la lista es: " + tamanio);

        //para recorrer el linkedlist utilizo el for each que significa por cada.
        for (String fruta: listaFrutas) {
        System.out.println("La fruta guardada es: " + fruta);
            //es decir por cada fruta que tengas guardada en cada string que tengas guardada en esta lista de frutas, hace esto
        }

        System.out.println("--------------------------------Con el remove que asi");
        //quier borrar un elemento por posicion, por ejemplo melon, utilizo el remove
        listaFrutas.remove(0);

        for (String fruta: listaFrutas) {
            System.out.println("La fruta guardada es: " + fruta);
        }

    }
}