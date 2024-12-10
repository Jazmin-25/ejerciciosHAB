import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la Calculadora");
        System.out.println("Por favor ingrese el primer número");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        System.out.println("Por favor ingrese el segundo número");
        Scanner scanner2 = new Scanner(System.in);
        double numero2 = scanner.nextDouble();
        double suma = num + numero2;
        double resta = num - numero2;
        double multiplicacion = num * numero2;
        double division = num / numero2;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la divion es: " + division);
        System.out.println("¿Hay algo más en lo que pueda apoyarte?");
    }
}