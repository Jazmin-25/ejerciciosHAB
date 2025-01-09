

package com.softek.restaurante;

import com.softek.restaurante.logica.Controladora;
import com.softek.restaurante.logica.Platillo;
import java.util.List;


public class Restaurante {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        
        /*PROCESO DE ALTA*/
        System.out.println("--------REALIZANDO LAS ALTAS--------");
        Platillo plat2 = new Platillo(1, "Fideos con salsa", "esta es la receta",16.4);
             
        control.crearPlatillo(plat2);
        
        //otra opcion es 
        control.crearPlatillo(new Platillo(2, "Ensalada de Manzana", "esta es la receta",10.4));
        control.crearPlatillo(new Platillo(3, "Caldo de camaron", "esta es la receta",18.9));    
        control.crearPlatillo(new Platillo(4, "Pechuga de pollo", "esta es la receta",12.9));
        
        /*PROCESO DE ELIMINACION */
        System.out.println("--------ELIMINANDO REGISTRO 2--------");
        int idEliminar = 2;
        control.eliminarPlatillo(idEliminar);
          /*PROCESO DE LECTURA 2 */
       // System.out.println("-----DESPUES DE ELIMINAR ----");
      //  listaPlatillos = control.traerPlatillos();
        //mostrarlo por pantalla
        //for(Platillo plat:listaPlatillos){
          //  System.out.println(plat.toString());
        //}
              
        
        /*PROCESO DE EDICION */
       // System.out.println("--------EDITANDO REGISTRO 5--------");
       // int idEditar = 4;
       // Platillo platEdit = control.buscarPlatillo(idEditar);
       // platEdit.setNombre("Chilaquiles con pollo");
        
        
        //control.editarPlatillo(platEdit);
        
        /*PROCESO DE LECTURA */
        //System.out.println("-----ANTES DE ELIMINAR ----");
        System.out.println("--------LISTA FINAL DE PLATILLOS--------");
        List<Platillo> listaPlatillos = control.traerPlatillos();
        for(Platillo plat:listaPlatillos){
           System.out.println(plat.toString());
        } //recorre todos los platillos en la base de datos mediante el for y los va a pasar a string y los mostrara en pantañña
        
    }
}
