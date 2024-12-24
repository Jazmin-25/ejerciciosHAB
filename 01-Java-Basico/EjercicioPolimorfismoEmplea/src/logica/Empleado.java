package logica;
//clase base
public class Empleado {
    protected String nombre;
   protected double salarioBase;

   //constructor vacio

    public Empleado() {
    }

    //constructor con atributos

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    //getters y seters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //mmetodoCalcularSalario
    public double calcularSalario() {
        System.out.println("Debe elegir el tipo de empleado para calcular salario");
        return (double)0.0F;
    }
    //getDescripcion()
    //devuelve una descripcion basica del puesto
    public String getDescripcion(){
        String descripcion = "El empleado " + this.nombre + " recibe un salario base de: " + this.salarioBase;
        System.out.println(descripcion);
        return descripcion;
    }
}
