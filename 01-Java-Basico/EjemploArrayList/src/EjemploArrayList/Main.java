package EjemploArrayList;
import java.util.ArrayList;
import logica.Fruta;

public class Main {
    public static void main(String[] args) {

        ArrayList<Fruta> listaFrutas = new ArrayList<>();
        //2 formas para agregar frutas
        Fruta fruta = new Fruta("Manzana", "Rojo", "Todo el año");
        listaFrutas.add(fruta);
        //para ingresar de forma manual
        listaFrutas.add(new Fruta("Naranja", "Anaranjado", "Todo el año"));
        listaFrutas.add(new Fruta("Banana", "Amarilla", "Todo el año"));
        listaFrutas.add(new Fruta("Sandia", "Verde", "Verano"));

        //traer elemento de un idnice en particular
        Fruta frut = listaFrutas.get(3);

        //Eliminar un elemento
        listaFrutas.remove(4);

        //obtener tamaño
        int tamanio = listaFrutas.size();

        //recorrer mediante indices
        for (int i=0; i< listaFrutas.size();i++) {
            System.out.println("Fruta: " + listaFrutas.get(i).getNombre());
            //ventajas si quiero recorrer de 2 en 2 lo puedo hacer con el for
        }
//de esta forma estamos anidando metodos

        //recorrer con el for each
        for (Fruta fruts:listaFrutas) {
            System.out.println("Fruta: " + fruts.getNombre());
            //linkedlist el recorrido es mas lento, porque las porciones de memoria estan dispersas por todos lados, pero la ventaja
            //es que todo esta ordenado.
            //ventaja de arrayslit las busquedas son mas rapidas,

        }

    }
}