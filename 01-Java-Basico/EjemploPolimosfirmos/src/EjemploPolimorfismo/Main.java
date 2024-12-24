package EjemploPolimorfismo;

import logica.Empleado;
import logica.EmpleadoDependencia;
import logica.EmpleadoPorHora;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado[] listaEmpleados = new Empleado[]{
                new EmpleadoPorHora("Carlos", (double)10.0F, 45, (double)250.0F),
                new EmpleadoDependencia("Juan", (double)10000.0F, (double)1000.0F),
                new EmpleadoPorHora("Ana", (double)0.0F, 40, (double)250.0F),
                new EmpleadoDependencia("Carlos", (double)12000.0F, (double)3000.0F),
                new EmpleadoPorHora("Luisa", (double)0.0F, 30, (double)250.0F)};

        for(int i = 0; i < listaEmpleados.length; ++i) {
            System.out.println("Nombre " + listaEmpleados[i].getNombre());
            System.out.println("Salario $" + listaEmpleados[i].calcularSalario());
            System.out.println("Descripción: " + listaEmpleados[i].getDescripcion());
        }

    }
}