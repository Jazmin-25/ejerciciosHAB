package EjercicioPolimorfismoEmplea;

import logica.Empleado;
import logica.EmpleadoPorHora;
import logica.EmpleadoDependencia;

/* Crea un sistema de empleados para una empresa utilizando herencia y polimorfismo.
La clase base sera empleado, y las clases hijas seran empleado dependendencia y empelado por hora
Crea la clase base empleado con los siguientes atributos:
nombre: nombre del empleado (string)
salarioBase: salario base del empleado (double)

En la clase empleado, crea los siguientes metodos publicos:
-constructores,
getters y setters
- metodos calcularsalario() que emita un mensjae "Debe elegir el tipo de empleado para calcular salario"
- getDescripcion(): metodo que devuelva una descripcion basica del puesto del empleado y sus responsabilidades

Crea la clase empleadodependencia que herede de empleado y agrega:
-Un atributo propio privado llamado bono (double)
-Constructores que inicialicen los atributos heredados y propios
- sobreescribe el metodo calcularSarario() para que devuelva el salario base mas el bono
- sobreescribe el metodo getDescripcion() para que ademas de explicar el rol del empleado, muestre el bono
que cobra por ser enpleado en relacion de dependencia
 */
public class Main {
    public static void main(String[] args) {
        Empleado[] listaEmpleados = new Empleado[]{
                new EmpleadoPorHora("Alfredo",(double)35.66,48,(double)250),
                new EmpleadoPorHora("Karla",(double)355.66,40,(double)250),
                new EmpleadoPorHora("Ariadna",(double)450.66,48,(double)550),
                new EmpleadoDependencia("Alfredo",(double)579.5,(double)23.4),
                new EmpleadoDependencia("Gloria",(double)379.5,(double)27.4)
        };
        for(int i = 0; i < listaEmpleados.length; ++i) {
            System.out.println("Nombre " + listaEmpleados[i].getNombre());
            System.out.println("Salario " + listaEmpleados[i].calcularSalario());
            System.out.println("Descripcion " + listaEmpleados[i].getDescripcion());
        }
    }
}