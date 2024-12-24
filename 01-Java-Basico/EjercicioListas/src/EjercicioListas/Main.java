package EjercicioListas;

import logica.Producto;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*Imagina que trabajas en una tienda que vende artículos electrónicos. Se te pide desarrollar un programa en Java para gestionar una lista de productos que permita:
- Ingresar productos: El programa debe permitirle al usuario ingresar una cantidad indeterminada de productos (nombre, marca y precio). El proceso de carga termina cuando se ingresa como nombre del producto la palabra "Fin" (indistintamente de si se escribe con mayúscula o minúscula).
- Búsqueda de producto: Una vez ingresada la lista de productos, el usuario debe poder buscar un producto por su nombre y el programa debe informarle si el producto está en la lista y cuál es su precio.
- Salida: Si el producto no está en la lista, se deberá notificar al usuario que el
producto no se encuentra y preguntarle si desea buscar otro.
 */
        ArrayList<Producto> listaProducto =new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;

        System.out.println("██████╗░██╗███████╗███╗░░██╗██╗░░░██╗███████╗███╗░░██╗██╗██████╗░░█████╗░");
        System.out.println("██╔══██╗██║██╔════╝████╗░██║██║░░░██║██╔════╝████╗░██║██║██╔══██╗██╔══██╗");
        System.out.println("██████╦╝██║█████╗░░██╔██╗██║╚██╗░██╔╝█████╗░░██╔██╗██║██║██║░░██║██║░░██║");
        System.out.println("██╔══██╗██║██╔══╝░░██║╚████║░╚████╔╝░██╔══╝░░██║╚████║██║██║░░██║██║░░██║");
        System.out.println("██████╦╝██║███████╗██║░╚███║░░╚██╔╝░░███████╗██║░╚███║██║██████╔╝╚█████╔╝");
        System.out.println("╚═════╝░╚═╝╚══════╝╚═╝░░╚══╝░░░╚═╝░░░╚══════╝╚═╝░░╚══╝╚═╝╚═════╝░░╚════╝░");

        while (true) {
            System.out.println("   Seleccione la acción que desea realizar: ");
            System.out.println("--------------------------------------------");
            System.out.println("  |  1. Alta                               |");
            System.out.println("--------------------------------------------");
            System.out.println("  |  2. Baja                               |");
            System.out.println("--------------------------------------------");
            System.out.println("  |  3. Consulta                           |");
            System.out.println("--------------------------------------------");
            System.out.println("  |  4. Modificaciones                     |");
            System.out.println("--------------------------------------------");
            System.out.println("  |  5. Salir                               ");
            System.out.println("--------------------------------------------");
            System.out.println("   Seleccione una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del producto");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese la marca del producto");
                    String marca = teclado.nextLine();
                    System.out.println("Ingrese el precio del producto");
                    double precio = teclado.nextDouble();
                    teclado.nextLine();

                    listaProducto.add(new Producto(nombre, marca, precio));
                    System.out.println("Producto agregado correctamente");
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto que desea eliminar");
                    String nombreEliminar = teclado.nextLine();
                    boolean eliminado = false;
                    for (int i = 0; i < listaProducto.size(); i++) {
                        if (listaProducto.get(i).getNombre().equalsIgnoreCase(nombreEliminar)) {
                            listaProducto.remove(i);
                            eliminado = true;
                            System.out.println("Producto eliminado correctamente. ");
                            break;
                        }
                    }
                    if (!eliminado) {
                        System.out.println("Producto no encontrado");
                    }
                    break;

                case 3:
                    if (listaProducto.isEmpty()) {
                        System.out.println("No hay productos en la lista");
                    }
                    else {
                        System.out.println("Lista de productos");
                        for (Producto producto : listaProducto) {
                            System.out.println("Nombre: " + producto.getNombre() + ", Marca: " + producto.getMarca()
                            + ", Precio " + producto.getPrecio());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del precio que desea modificar: ");
                    String nombreModificar = teclado.nextLine();
                    boolean encontrado = false;
                    for (Producto producto : listaProducto) {
                        if (producto.getNombre().equalsIgnoreCase(nombreModificar)) {
                            System.out.println("Producto encontrado. Ingrese los nuevos datos");
                            System.out.println("Nuevo nombre (deje vacio para mantener el actual");
                            String nuevoNombre = teclado.nextLine();
                            if (!nuevoNombre.isEmpty() ) {
                                producto.setNombre(nuevoNombre);
                            }
                            System.out.println("Nueva marca (deje vacio para mantener la actual):");
                            String nuevaMarca = teclado.nextLine();
                            if (!nuevaMarca.isEmpty()) {
                                producto.setMarca(nuevaMarca);
                            }
                            System.out.println("Nuevo precio (ingrese -1 para mantener el actual):");
                            double nuevoPrecio = teclado.nextDouble();
                            teclado.nextLine();
                            if (nuevoPrecio>= 0) {
                                producto.setPrecio(nuevoPrecio);
                            }
                            System.out.println("Productos modificados correctamente. ");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Producto no encontrado. ");
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestro sistema !Hasta pronto!");
                    return;

                default:
                    System.out.println("Opcion no válida. Intentalo de nuevo");
                    break;
            }
        }
    }
}