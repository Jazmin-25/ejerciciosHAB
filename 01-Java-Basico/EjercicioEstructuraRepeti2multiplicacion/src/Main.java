import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //tabla de multiplicar solo si el número es positivo.
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa un número para mostrar la tabla de multiplicación:");
        numero = teclado.nextInt();
        if (numero >= 0) {
            for (int cont = 1; cont <= 10; cont++) {
                System.out.println(numero + " x " + cont + " = " + (numero * cont));
            }
        } else {
            System.out.println("El número debe ser positivo para generar la tabla de multiplicación.");

        }
        }
}