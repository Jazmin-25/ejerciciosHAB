
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Producto;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    ProductoJpaController prodJpa = new ProductoJpaController();
    
    //crear producto
    public void crearProducto(Producto prod){
        prodJpa.create(prod);
    }
    
    //leer producto
    public List<Producto>traerPersonas(){
        return prodJpa.findProductoEntities();
    }
    
    //actualizar producto
    public void modificarProducto (Producto prod) {
        try {
            prodJpa.edit(prod);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //eliminar producto
    public void eliminarProducto(int id) {
        try {
            prodJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
