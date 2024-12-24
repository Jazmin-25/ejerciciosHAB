package logica;
//clase hija
public class EmpleadoPorHora extends Empleado {
    int horasTrabajadas;
    double tarifaPorHora;

    //constructor


    public EmpleadoPorHora(int horasTrabajadas, double tarifaPorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public EmpleadoPorHora(String nombre, double salarioBase, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }


    public double calcularSalario() {
        System.out.println("Las horas laborabas por el empleado son: " + horasTrabajadas + " mientras que la tarifa de horas laboradas es de: " + tarifaPorHora);
        return this.horasTrabajadas * this.tarifaPorHora;
    }
}


