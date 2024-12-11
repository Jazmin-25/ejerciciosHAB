import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero del 1 al 7 para saber que dia de la semana es ");
        Scanner teclado = new Scanner(System.in);
        int dia = teclado.nextInt();
        //ejercicio de switch con los días de la semana, realizado en clase
//subir ejercicio a git
        switch (dia) {
            case 1:
                System.out.println("El dia es lunes");
                break;
            case 2:
                System.out.println("El dia es martes");
                break;
            case 3:
                System.out.println("El dia es miercoles");
                break;
            case 4:
                System.out.println("El dia es jueves");
                break;
            case 5:
                System.out.println("El dia es viernes");
                break;
            case 6:
                System.out.println("El dia es sabado");
                break;
            case 7:
                System.out.println("El dia es domingo");
                break;
            default:
                System.out.println("Ingreso un número no valido");
                break;
        }
    }
}