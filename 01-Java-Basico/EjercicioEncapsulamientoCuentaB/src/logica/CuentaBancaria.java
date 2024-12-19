package logica;

public class CuentaBancaria {

    private String titular; // nombre del titular de la cuenta
    private double saldo; // cantidad de dinero en la cuenta
    private int numeroCuenta; // numero de cuenta
    //implementar los metodos publicos: constructor para inicializar el titulo, el saldo y
    //el numero de cuenta con getters y setters

    // constructor
    public CuentaBancaria(String titular, double saldo, int numeroCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    //getters y setters

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }


}
