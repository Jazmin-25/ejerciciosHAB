/*
 Imagina que eres parte del equipo de desarrollo de una aplicación para una biblioteca. 
En esta aplicación, los bibliotecarios tienen dos formas de enviar notificaciones 
a los usuarios sobre la disponibilidad de libros: una forma tradicional utilizando clases 
anónimas y otra utilizando expresiones lambda.
 */

package com.softek.ejercic4librolambda;

import com.softek.ejercic4librolambda.logica.NotificadorLibro;


public class Ejercic4LibroLambda {

    public static void main(String[] args) {
        //clase anonima
        NotificadorLibro notiLibro = new NotificadorLibro(){
            @Override
            public void enviarNotificacion(String libro) {
                System.out.println("Se olvido el libro: " + libro);
            }
        };
        //en lambda
        NotificadorLibro lamNotificadorLibro = (libro) -> {
            System.out.println("Se olvido el libro " + libro);
        };
        //probando los 2 metodos
        notiLibro.enviarNotificacion("Java para principiantes");
        lamNotificadorLibro.enviarNotificacion("Spring Boot");
    }
}
