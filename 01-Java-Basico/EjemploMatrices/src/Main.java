import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numeros[] = new int [7];
        int cincos =0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numeros a guardar");
        for(int i=0; i<numeros.length; i++) {
            numeros[i] = teclado.nextInt();
            if (numeros[i] == 5) {
                cincos ++;
            }
        }
        if (cincos >0) {
            System.out.println("Hubo " + cincos + " Cincos");
        }
        else {
            System.out.println("No hay Cincos");
        }
    }
}