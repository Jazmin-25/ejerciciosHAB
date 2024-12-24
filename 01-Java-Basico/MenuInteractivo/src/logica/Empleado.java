package logica;

import java.time.LocalDate;

public class Empleado {
    //ingreso los atributos del requerimiento
    // private long id;
     private String nombre;
     private String apellido;
     private String cargo;
     private double salario;
     private String fechaInicio;  // uso string en vez de localdate para mayor comodidad, aunque puedo poner una excepcion

    //agrego constructor vacio
    public Empleado() {
    }

    //agrego constructor con atributos

    public Empleado(/*long id,*/ String nombre, String apellido, String cargo, double salario, String fechaInicio) {
        //this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
    }


    //agregar getters y setters


   // public long getId() {
      //  return id;
   // }

    //public void setId(long id) {
      //  this.id = id;
    //}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
