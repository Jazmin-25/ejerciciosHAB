
package com.softek.restaurante.logica;

import com.softek.restaurante.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {

    
    ControladoraPersistencia controlPersi = new ControladoraPersistencia();

    public void crearPlatillo(Platillo plat1) {
    controlPersi.crearPlatillo(plat1);    
    }
//lista que llama desde el main
    public List<Platillo> traerPlatillos() {
      return controlPersi.traerPlatillos();    
    }
    //eliminar platillo
   
    
    
    //eliminar platillo

    public void eliminarPlatillo(int idEliminar) {
    controlPersi.eliminarPlatillo(idEliminar);   
    }

    public Platillo buscarPlatillo(int idEditar) {
     return controlPersi.buscarPlatillo(idEditar);    
    }
//modificar platillo
    public void editarPlatillo(Platillo platEdit) {
    controlPersi.editarPlatillo(platEdit);   
    }
    
       
    
}
