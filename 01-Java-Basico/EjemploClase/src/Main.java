import logica.Persona;

import java.time.LocalDate;

public class Main {
    //subir al repositorio
    public static void main(String[] args) {
        Persona perso = new Persona();
        Persona perso2 = new Persona(1, "Ariadna", "Islas",
                LocalDate.of(1996, 11, 15),"Arbolillo 1");
        Persona perso3 = new Persona(2, "Jazmin", "Garcia",
                LocalDate.of(1995,07,04),"Naranjo 289");


        System.out.println("--ANTES");
        System.out.println("El nombre es: " + perso3.getNombre() + " El apellido es: " + perso3.getApellido()
         + " La direccion es " + perso3.getDireccion());


        perso3.setNombre("Claudia");

        System.out.println("--DESPUES");

        System.out.println("El nombre es: " + perso3.getNombre() + " El apellido es: " + perso3.getApellido()
                + " La direccion es " + perso3.getDireccion());
    }
}