import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//clasificacion de un articulo en la tienda
        //subir ejercicio
        System.out.println("Clasificacion de un articulo en una tienda");
        Scanner teclado = new Scanner(System.in);
        double articulo = teclado.nextDouble();
        if (articulo < 50) {
            System.out.println("El articulo es Economico");
        } else {
            if (articulo >= 50 && articulo <= 100) {
                System.out.println("El articulo es Accesible");
            } else {
                if (articulo >= 100 && articulo <= 200) {
                    System.out.println("El articulo es Estandar ");
                } else {
                    System.out.println("El articulo es Premium");
                }
            }
        }
    }
}