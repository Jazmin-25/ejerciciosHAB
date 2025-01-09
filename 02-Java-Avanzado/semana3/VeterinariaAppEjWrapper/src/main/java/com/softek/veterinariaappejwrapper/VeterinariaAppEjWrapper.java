

package com.softek.veterinariaappejwrapper;

import com.softek.veterinariaappejwrapper.logica.Animal;
import java.util.ArrayList;
import java.util.Scanner;


public class VeterinariaAppEjWrapper {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Animal> animales = new ArrayList<>();
        
               
        boolean continuar = true;
        
        System.out.println("Bienvenido al sistema de gesti+on veterinaria");
        while (continuar) {
            //realiza el trycath
            try {
                // Solicitar nombre del animal
                System.out.print("Ingrese el nombre del animal: ");
                String nombre = teclado.nextLine();

                // Solicitar peso del animal
                System.out.print("Ingrese el peso del animal (en kilogramos): ");
                String pesoTexto = teclado.nextLine();

                // Convertir peso de String a Double
                Double peso = Double.valueOf(pesoTexto);

                // Instanciar el objeto Animal y agregarlo a la lista
                animales.add(new Animal(nombre, peso));

                // Preguntar si desea agregar otro animal
                System.out.print("¿Desea agregar otro animal? (s/n): ");
                String respuesta = teclado.nextLine();
                if (!respuesta.equalsIgnoreCase("s")) {
                    continuar = false; // Salir del bucle si el usuario ingresa algo diferente a "s"
                }
            } catch (NumberFormatException e) {
                // Manejar error de conversión
                System.out.println("Error: El peso ingresado no es válido. Por favor, intente nuevamente.");
            }
        }
// Mostrar la información de los animales registrados
        System.out.println("Lista de animales registrados:");
        for (Animal animal : animales) {
            animal.mostrarInfo();
        }
           
        }
    }
