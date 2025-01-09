
package com.softek.restaurante.persistencia;

import com.softek.restaurante.logica.Platillo;
import com.softek.restaurante.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {

  
    
    PlatilloJpaController platiJpa = new PlatilloJpaController();
//creamos metodosel crud utilizando platiJpa
    public void crearPlatillo(Platillo plat1) {
    platiJpa.create(plat1);
    }
//lista de plarilloa
    public List<Platillo> traerPlatillos() {
    return platiJpa.findPlatilloEntities();
    }
//eliminar platillo

    public void eliminarPlatillo(int idEliminar) {
        try {
            platiJpa.destroy(idEliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Platillo buscarPlatillo(int idEditar) {
         return platiJpa.findPlatillo(idEditar);
    }
//modificar platillo
    public void editarPlatillo(Platillo platEdit) {
        try {
            platiJpa.edit(platEdit);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    
}
