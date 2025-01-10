
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Persona;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {//crear un objeto tipo persona
//llamar los metodos que ya estan implementados
    PersonaJpaController persoJpa = new PersonaJpaController();
    
    
    public void crearPersona(Persona perso) {
        persoJpa.create(perso);
        
    }
    
    public void borrarPersona(int id){
        try {
            persoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Persona traerPersona (int id) { //funcion
        return persoJpa.findPersona(id);
    }
    
    //traer todas las personas
    public List<Persona>traerPersonas (){
        return persoJpa.findPersonaEntities();
        
    }
    
    
    //modificar
    //Persona que llega como parametro es la persona con los datos nuevos a modificar
    public void modificarPersona(Persona pers){
        try {
            persoJpa.edit(pers);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //CRUD
    /*
    CREATE = ALTA
    READ = LECTURA
    UPDATE = MODIFICACION
    DELETE = BAJA
    */
            
}
