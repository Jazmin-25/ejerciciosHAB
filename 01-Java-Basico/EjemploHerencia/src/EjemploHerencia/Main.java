package EjemploHerencia;

import logica.Gato;
import logica.Perro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Jamaica", 8, "cafe",5);
        Gato gato = new Gato("Benito",2,"siames", 14);

        perro.comer();
        gato.comer();//animal transmitio la habilidad de comer

        perro.ladrar();
        gato.maullar();//metodo propio
    }
}