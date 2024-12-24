package MenuInteractivo;

import logica.Empleado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado> listaEmpleado = new ArrayList<>(); //en la base de datos no utilizo arrays, solo prueba
        Scanner teclado = new Scanner(System.in);

        //en combinación con estructuras como un switch o un while, podría controlar la ejecución de diferentes
        // acciones dependiendo de la opción seleccionada.
        int opcion = 0;


        //imprimir el menu de opciones de forma atractiva
        System.out.println("              ██████╗ ██╗███████╗███╗   ██╗██╗   ██╗███████╗███╗   ██╗██╗██████╗  ██████╗ ");
        System.out.println("              ██╔══██╗██║██╔════╝████╗  ██║██║   ██║██╔════╝████╗  ██║██║██╔══██╗██╔═══██╗");
        System.out.println("              ██████╔╝██║█████╗  ██╔██╗ ██║██║   ██║█████╗  ██╔██╗ ██║██║██║  ██║██║   ██║");
        System.out.println("              ██╔══██╗██║██╔══╝  ██║╚██╗██║╚██╗ ██╔╝██╔══╝  ██║╚██╗██║██║██║  ██║██║   ██║");
        System.out.println("              ██████╔╝██║███████╗██║ ╚████║ ╚████╔╝ ███████╗██║ ╚████║██║██████╔╝╚██████╔╝");
        System.out.println("              ╚═════╝ ╚═╝╚══════╝╚═╝  ╚═══╝  ╚═══╝  ╚══════╝╚═╝  ╚═══╝╚═╝╚═════╝  ╚═════╝");

// lo pongo aqui porque Solo el menú interactivo debe repetirse en el bucle, no el bienvenido
        while (true) {
            System.out.println("╔════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║            ░█▀▄▀█ ░█▀▀▀ ░█▄─░█ ░█─░█ 　 ░█▀▀█ ░█▀▀█ ▀█▀ ░█▄─░█ ░█▀▀█ ▀█▀ ░█▀▀█ ─█▀▀█ ░█───         ║");
            System.out.println("║            ░█░█░█ ░█▀▀▀ ░█░█░█ ░█─░█ 　 ░█▄▄█ ░█▄▄▀ ░█─ ░█░█░█ ░█─── ░█─ ░█▄▄█ ░█▄▄█ ░█───         ║");
            System.out.println("║            ░█──░█ ░█▄▄▄ ░█──▀█ ─▀▄▄▀ 　 ░█─── ░█─░█ ▄█▄ ░█──▀█ ░█▄▄█ ▄█▄ ░█─── ░█─░█ ░█▄▄█         ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║   ▄█─ ▀▄ 　 ─█▀▀█ ░█─── ▀▀█▀▀ ─█▀▀█                                                                ║");
            System.out.println("║   ─█─ ─█ 　 ░█▄▄█ ░█─── ─░█── ░█▄▄█                                                                ║");
            System.out.println("║   ▄█▄ ▄▀ 　 ░█─░█ ░█▄▄█ ─░█── ░█─░█                                                                ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║   █▀█ ▀▄ 　 ░█▀▀█ ─█▀▀█ ───░█ ─█▀▀█                                                                ║");
            System.out.println("║   ─▄▀ ─█ 　 ░█▀▀▄ ░█▄▄█ ─▄─░█ ░█▄▄█                                                                ║");
            System.out.println("║   █▄▄ ▄▀ 　 ░█▄▄█ ░█─░█ ░█▄▄█ ░█─░█                                                                ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║   █▀▀█ ▀▄ 　 ░█▀▀█ ░█▀▀▀█ ░█▄─░█ ░█▀▀▀█ ░█─░█ ░█─── ▀▀█▀▀ ─█▀▀█                                    ║");
            System.out.println("║   ──▀▄ ─█ 　 ░█─── ░█──░█ ░█░█░█ ─▀▀▀▄▄ ░█─░█ ░█─── ─░█── ░█▄▄█                                    ║");
            System.out.println("║   █▄▄█ ▄▀ 　 ░█▄▄█ ░█▄▄▄█ ░█──▀█ ░█▄▄▄█ ─▀▄▄▀ ░█▄▄█ ─░█── ░█─░█                                    ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║   ─█▀█─ ▀▄ 　 ░█▀▄▀█ ░█▀▀▀█ ░█▀▀▄ ▀█▀ ░█▀▀▀ ▀█▀ ░█▀▀█ ─█▀▀█ ░█▀▀█ ▀█▀ ░█▀▀▀█ ░█▄─░█ ░█▀▀▀ ░█▀▀▀█   ║");
            System.out.println("║   █▄▄█▄ ─█ 　 ░█░█░█ ░█──░█ ░█─░█ ░█─ ░█▀▀▀ ░█─ ░█─── ░█▄▄█ ░█─── ░█─ ░█──░█ ░█░█░█ ░█▀▀▀ ─▀▀▀▄▄   ║");
            System.out.println("║   ───█─ ▄▀ 　 ░█──░█ ░█▄▄▄█ ░█▄▄▀ ▄█▄ ░█─── ▄█▄ ░█▄▄█ ░█─░█ ░█▄▄█ ▄█▄ ░█▄▄▄█ ░█──▀█ ░█▄▄▄ ░█▄▄▄█   ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║   █▀▀ ▀▄ 　 ░█▀▀▀█ ─█▀▀█ ░█─── ▀█▀ ░█▀▀█                                                           ║");
            System.out.println("║   ▀▀▄ ─█ 　 ─▀▀▀▄▄ ░█▄▄█ ░█─── ░█─ ░█▄▄▀                                                           ║");
            System.out.println("║   ▄▄▀ ▄▀ 　 ░█▄▄▄█ ░█─░█ ░█▄▄█ ▄█▄ ░█─░█                                                           ║");
            System.out.println("╚════════════════════════════════════════════════════════════════════════════════════════════════════╝");

            System.out.println("   Seleccione una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();


            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los datos del empleado para darlo de alta en el sistema");
                    System.out.println("Ingrese el nombre del empleado");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el apellido del empleado");
                    String apellido = teclado.nextLine();
                    System.out.println("Ingrese el cargo del empleado");
                    String cargo = teclado.nextLine();
                    System.out.println("Ingrese el salario del empleado");
                    double salario = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println("Ingrese la fecha de inicio del empleado (formato dd-mm-yyyy");
                    String fechaIni = teclado.nextLine();
                    //muestrame al empleado agregadp en la lista
                    listaEmpleado.add(new Empleado(nombre, apellido, cargo, salario, fechaIni));
                    System.out.println("Empleado agregado correctamente");
                    break;
                case 2:
                    System.out.println("Ingrese los datos del empleado para eliminarlo el sistema");
                    System.out.println("Ingrese el nombre del empleado que desea eliminar");
                    String nombreElimina = teclado.nextLine();
                    boolean eliminadi = false; //bandera para saber si se elimino el producto
                    for (int i = 0; i < listaEmpleado.size(); i++) {
                        if (listaEmpleado.get(i).getNombre().equalsIgnoreCase(nombreElimina)) {
                            listaEmpleado.remove(i);
                            eliminadi = true;
                            System.out.println("Empleado eliminado correctamente");
                            break;
                        }
                    }
                    if (!eliminadi) {
                        System.out.println("Empleado no encontrado");
                    }
                    break;
                case 3:
                    if (listaEmpleado.isEmpty()) {
                        System.out.println("No hay empleados en la lista");
                    }
                    else {
                        System.out.println("Lista de empleados");
                        for (Empleado empleado : listaEmpleado) {
                            System.out.println("Nombre: " + empleado.getNombre() + " Apellido: " + empleado.getApellido()
                            + " Cargo: " + empleado.getCargo() + " Salario: " + empleado.getSalario() + " Fecha de inicio: " +
                                    empleado.getFechaInicio());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingrese los datos del empleado que desea modificar: ");
                    System.out.println("Ingrese el nombre del empleado que desea modifica");
                    String nombreModificar = teclado.nextLine();
                    System.out.println("Ingrese el apellido del empleado que  desea modificar");
                    boolean encontrado = false;
                    for (Empleado empleado : listaEmpleado) {
                        if (empleado.getNombre().equalsIgnoreCase(nombreModificar)) {
                            System.out.println("Empleado encontrado. Ingrese los nuevos datos");
                            System.out.println("Nuevo nombre del empleado (deje vacio para mantener la actual): ");
                            String nuevoNombre = teclado.nextLine();
                            if (!nuevoNombre.isEmpty()) {
                                empleado.setNombre(nuevoNombre);
                            }
                            System.out.println("Nuevo apellido (deje vacio para mantener la actual): ");
                            String nuevoApellido = teclado.nextLine();
                            if (!nuevoApellido.isEmpty()) {
                                empleado.setApellido(nuevoApellido);
                            }
                            System.out.println("Nuevo cargo (deje vacio para mantener la actual): ");
                            String nuevoCargo = teclado.nextLine();
                            if (!nuevoCargo.isEmpty()) {
                                empleado.setCargo(nuevoCargo);
                            }
                            System.out.println("Nuevo Salario ingrese -1 para mantener el actual): ");
                            double nuevoSalario = teclado.nextDouble();
                            teclado.nextLine();
                            if (nuevoSalario>0) {
                                empleado.setSalario(nuevoSalario);
                            }
                            System.out.println("Nueva fecha de ingreso (deje vacio para mantener la actual): ");
                            String nuevaFechaIni = teclado.nextLine();
                            if (!nuevaFechaIni.isEmpty()){
                                empleado.setFechaInicio(nuevaFechaIni);
                            }
                            System.out.println("Informacion del empleado modificada correctamente");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Empleado no encontrado");
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar la aplicación de gestion de empleados. ¡Hasta pronto!");
                    return;

                default:
                    System.out.println("Opcion no valida. Ingresa datos correctos");
                    break;
            }
          
        }
    }
}