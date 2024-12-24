package logica;

public class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHora() {
    }

    public EmpleadoPorHora(String nombre, double salarioBase, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return this.horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return this.tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    public double calcularSalario() {
        return (double)this.horasTrabajadas * this.tarifaPorHora;
    }

    public String getDescripcion() {
        return "El empleado: " + this.nombre + ", trabajo: " + this.horasTrabajadas + ", Tarifa por hora: $" + this.tarifaPorHora + ", en total ganó $" + (double)this.horasTrabajadas * this.tarifaPorHora;
    }
}
