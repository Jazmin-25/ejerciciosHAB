package EjemploTryCath;

public class Main {
    public static void main(String[] args) {

        int edades[] = new int[3];
        try {
            edades[5] = 15;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El numero ingresado no corresponde a un número válido");
        }
        catch (NullPointerException e) {
            System.out.println("Ha intentado acceder a una posicion nula");
        }
        finally {
            System.out.println("Hola soy el finally");
        }
    }
}