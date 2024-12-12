import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numeros[] = new int[5];
        System.out.println("Ingrese números a guardar");
        Scanner teclado = new Scanner(System.in);
        for (int i=0;i<=4;i++) {
            numeros[i] = teclado.nextInt();
        }
        //recorrido del vector
        for(int i=0;i<=4;i++){
            System.out.println("El valor guardado en la posicion: " + i + " es: " + numeros[i]);
        }
    }
}