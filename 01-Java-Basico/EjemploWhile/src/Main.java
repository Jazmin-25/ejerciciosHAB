import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// crear un programa que permita ingresar las edades  de personas  y que pare su ejecucion
//al encontrar una persona mayor a 70 años
        System.out.println("Ingrese su edad");
        Scanner teclado = new Scanner(System.in);

        int edad = teclado.nextInt();
//ejemplo while
        while (edad<=70) {
            System.out.println("Ingrese su edad");
            edad = teclado.nextInt();
        }

        System.out.println("Persona encontrada");

    }
}