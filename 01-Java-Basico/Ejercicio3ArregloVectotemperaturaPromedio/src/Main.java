import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana, calcule la temperatura máxima promedio que hubo.
        Scanner teclado = new Scanner(System.in);
        double[] temperaturas = new double[7];
        double suma = 0;

        // Solicitar las temperat1uras máximas de los últimos 7 días
        //for
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingresa la temperatura máxima del día " + (i + 1) + ":");
            temperaturas[i] = teclado.nextDouble();
            suma += temperaturas[i];
        }
        // Calcular el promedio de las temperaturas
        double promedio = suma / temperaturas.length;

        // Mostrar el resultado
        System.out.printf("La temperatura máxima promedio de la última semana es: %.2f°C%n", promedio);

        teclado.close();
         }
    }