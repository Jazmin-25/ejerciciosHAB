package logica;

public class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado() {
    }

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        System.out.println("Debe elegir el tipo de empleado para calcular salario");
        return (double)0.0F;
    }

    public String getDescripcion() {
        System.out.println("El empleado " + this.nombre + "recibe un salario base de: " + this.salarioBase);
        return null;
    }
}
