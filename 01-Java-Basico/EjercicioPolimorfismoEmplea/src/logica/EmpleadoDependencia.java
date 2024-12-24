package logica;

//clase hija
public class EmpleadoDependencia extends Empleado {
    double bono;

    //constructor con los elementos heredados y propios

    public EmpleadoDependencia(double bono) {
        this.bono = bono;
    }

    public EmpleadoDependencia(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    //sobrescribe el metodo calcularsalario(copia y pega) para que devuelva el salario base +el bono
    public double calcularSalario() {
        System.out.println("El sueldo del empleado es: " + salarioBase + bono);
        return this.salarioBase + this.bono;

    }

    //sobreescribe el metodo getdescripcion para que ademas de explicar, muestre el bono  que cobra por ser empleado en relacion de dependencia
    public String getDescripcion(){
        String descripcion = "El empleado " + nombre + " realiza el rol de: " + " El bono que cobra es: " + bono;
        System.out.println(descripcion);
        return descripcion;
    }
}