package com.softek.ejerproductocrud;

import java.util.Scanner;
import logica.Producto;
import persistencia.ControladoraPersistencia;
import persistencia.exceptions.NombreInvalidoException;
import persistencia.exceptions.PrecioInvalidoException;
import persistencia.exceptions.StockInvalidoException;

public class EjerProductoCrud {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Producto prd = new Producto();
        ControladoraPersistencia controlPersi = new ControladoraPersistencia();

        //el id no lo pedimso por teclado ya que se genera en la bd
        System.out.println("------SISTEMA DE ALTA DE PRODUCTOS---------");

        //solicitud y validacion del nombre
        String nombre = null;
        boolean nombreValido = false;

        while (nombreValido != true) {

            try {
                System.err.println("Ingrese el nombre del producto: ");
                nombre = teclado.nextLine();
                //valida si el nombre es correcto
                validarNombre(nombre);
                nombreValido = true;
                //seteo nombre al objeto
                prd.setNombre(nombre);
            } catch (NombreInvalidoException e) {
                System.out.println(e.getMessage());
            }
            //solicitud de precio
            double precio = 0.0;
            boolean precioValido = false;

            while (precioValido != true) {
                try {
                    System.out.println("Ingrese el monto de la compra");
                    precio = Double.parseDouble(teclado.nextLine());
                    //validar si el monto es correcto
                    validarPrecio(precio);
                    precioValido = true;
                    prd.setPrecio(precio);
                } catch (PrecioInvalidoException e) {
                    System.out.println(e.getMessage());
                }
            }
            //solicitud de stock
            int stock = 0;
            boolean stockValido = false;

            while (stockValido != true) {
                try {
                    System.out.println("Ingrese la cantidad de stock");
                    stock = Integer.parseInt(teclado.nextLine());
                    //validar si elstock es correcto
                    validarStock(stock);
                    stockValido = true;
                    prd.setStock(stock);
                } catch (StockInvalidoException e) {
                    System.out.println(e.getMessage());

                }

            }

            //dmaod de alta el producto
            controlPersi.crearProducto(prd);
            System.out.println("Producto creado exitosamente");
        }

    }

    private static void validarNombre(String nombre) throws NombreInvalidoException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
    }

    private static void validarPrecio(double precio) throws PrecioInvalidoException {
        if ((precio <= 0)) {
            throw new PrecioInvalidoException("El precio ingresado es invalido. Debe ser mayor a 0");
        }
    }

    private static void validarStock(int stock) throws StockInvalidoException {
        if (stock < 0) {
            throw new StockInvalidoException("La cantidad ingresada es invalida. Debe ser 0 o más");
        }

    }

}
