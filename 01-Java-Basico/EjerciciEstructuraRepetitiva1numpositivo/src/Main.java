import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0;
        int numero;
        System.out.println("Ingrese un número positivo para sumarlo");
        do {
            numero = teclado.nextInt();
            if (numero >= 0) {
                suma += numero;
            }
        } while (numero >= 0);
        System.out.println("La suma total de los" +
                " numeros positivos es: " + suma);

    }
}