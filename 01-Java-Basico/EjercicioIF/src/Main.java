import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//el juego tiene un limite de peso de 100kg
        System.out.println("Ingrese su peso en kg: ");
        Scanner teclado = new Scanner(System.in);
        int peso = teclado.nextInt();
        //ejercicio de if
        if(peso <= 100) {
            System.out.println("Peso correcto, puede acceder al juego");
        }
        else {
            System.out.println("No puede subir al juego, 100kg excede el peso permitido en la atracción");
        }
        }
    }