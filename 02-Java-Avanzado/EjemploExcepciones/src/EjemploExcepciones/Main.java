package EjemploExcepciones;

import logica.ExcepcionDatoIncorrecto;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ExcepcionDatoIncorrecto {
        int dato = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un dato por teclado. El mismo que sea un número entre 1 y 10");
        dato = teclado.nextInt();
        if(dato<=0 || dato >=10) {
            throw new ExcepcionDatoIncorrecto("Ingreso un valor no válido");
        }
    }
}