//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // cuentame del 0 al 10 usando do while
        int cont = 0;
        do {
            System.out.println("Estoy en el número: " + cont);
            cont = cont +1;
        }
        while(cont<=10);
        System.out.println("¡Listo! ¿Hay algo más en lo que te pueda ayudar?");
    }
}