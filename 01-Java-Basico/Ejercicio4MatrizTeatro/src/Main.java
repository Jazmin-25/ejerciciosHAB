import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Crea un programa en Java que represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:
        Scanner teclado = new Scanner(System.in);
        char[][] asientos = new char[5][5];

        // hacer la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                asientos[i][j] = 'O';
            }
        }

        boolean finalizar = false;

        while (!finalizar) {
            // Mostrar el mapa de asientos
            System.out.println("Mapa de asientos:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(asientos[i][j] + " ");
                }
                System.out.println();
            }

            // elije las filas
            System.out.println("Ingresa el número de fila (1-5):");
            int fila = teclado.nextInt() - 1;

            System.out.println("Ingresa el número de asiento (1-5):");
            int columna = teclado.nextInt() - 1;

            // esta ocupado?
            if (fila < 0 || fila >= 5 || columna < 0 || columna >= 5) {
                System.out.println("Coordenadas fuera de rango. Intenta de nuevo.");
                continue;
            }

            if (asientos[fila][columna] == 'X') {
                System.out.println("El asiento ya está ocupado. Elige otro.");
            } else {
                // ya esta ocupado
                asientos[fila][columna] = 'X';
                System.out.println("Reserva exitosa.");
            }

            // Preguntar si desea continuar
            System.out.println("¿Deseas realizar otra reserva? (s/n):");
            char respuesta = teclado.next().toLowerCase().charAt(0);
            if (respuesta != 's') {
                finalizar = true;
            }
        }
        System.out.println("Gracias por usar el sistema de reservas.");
        teclado.close();
    }
}//cerrar el escaner