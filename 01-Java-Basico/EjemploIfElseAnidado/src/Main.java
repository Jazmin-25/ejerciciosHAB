import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese la nota del alumno");
        Scanner teclado = new Scanner( System.in);
        double calificacion = teclado.nextDouble();
// quiero saber el rendimiento de las calificaciones de los alumnos con ifelse anidado
        if(calificacion <60) {
            System.out.println("El rendimiento del alumno es insuficiente");
        }
        else {
            if(calificacion >= 60 && calificacion <= 80) {
                System.out.println("El rendimiento del alumno es bueno");
            }
            else {
                if (calificacion >= 81 && calificacion <= 90) {
                    System.out.println("El rendimiento del alumno es notable");
                }
                else {
                    System.out.println("El rendimiento del alumno es excelente");
                }
            }
        }
    }
}