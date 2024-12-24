package logica;

public class EmpleadoDependencia extends Empleado {
    private double bono;

    public EmpleadoDependencia() {
    }

    public EmpleadoDependencia(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    public double getBono() {
        return this.bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public double calcularSalario() {
        return this.salarioBase + this.bono;
    }

    public String getDescripcion() {
        System.out.println("Por las actividades realizadas, el empleado " + this.nombre + " recibe un bono de: $ " + this.bono);
        return null;
    }
}
