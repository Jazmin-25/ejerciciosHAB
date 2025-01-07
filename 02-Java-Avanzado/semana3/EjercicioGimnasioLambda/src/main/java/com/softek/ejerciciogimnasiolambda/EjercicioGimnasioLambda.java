/* Imagina que eres parte del equipo de desarrollo de una aplicación para un gimnasio. 
En esta aplicación, los entrenadores tienen dos formas de enviar notificaciones a los 
miembros del gimnasio sobre sus horarios de clase: una forma tradicional utilizando clases 
anónimas y otra utilizando expresiones lambda.

*/

package com.softek.ejerciciogimnasiolambda;

import com.softek.ejerciciogimnasiolambda.logica.NotificadorClase;


public class EjercicioGimnasioLambda {

    public static void main(String[] args) {
        //mediante clases anonimas 
        //crea instancias de ambas implementaciones (clásica y lambda) y llama al método enviarRecordatorio para imprimir los mensajes, 
        //pasando diferentes mensajes de recordatorio, como por ejemplo, el recordatorio de la clase de yoga o la clase de pilates.
        NotificadorClase notifi = new NotificadorClase() {
            @Override
            public void enviarRecordatorio(String mensaje) {
                System.out.println("Recuerde que tiene clases de:  " + mensaje);
            }
        };
        notifi.enviarRecordatorio("Zumba");
        //ahora con lambda
        //parámetro + -> + Setencia
        //valor que quiero pasar + función flecha -> + código que quiero que tenga el método
        NotificadorClase notifi2 = (mensaje) -> System.out.println("Recuerde que tiene clases de: " + mensaje);
        notifi2.enviarRecordatorio("Yoga");

    }
}
