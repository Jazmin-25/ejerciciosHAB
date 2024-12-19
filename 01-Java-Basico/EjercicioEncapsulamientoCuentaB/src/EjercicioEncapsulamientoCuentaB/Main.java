package EjercicioEncapsulamientoCuentaB;

import logica.CuentaBancaria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //en el main crear un objeto CuentaBancaria. Acceder al metodo get de cada atributo
        // y mostrar los valores por pantalla
        //cambiar el metodo de acceso del metodo getsaldo por private
        //intentar acceder al metodo getSaldo desde el main para mostratlo por pantalla
        //¿Es posible hacerlo, que ocurre? se puede acceder sin problema?


        CuentaBancaria cuenta = new CuentaBancaria("Ariadna Islas", 40.77, 55378);
        System.out.println("El titular es " + cuenta.getTitular()
                + " El saldo es " + cuenta.getSaldo()
                + " La cuenta es " + cuenta.getNumeroCuenta());


    }
}