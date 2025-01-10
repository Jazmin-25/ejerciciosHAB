
package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity  //esta clase la pasas a la base de datos
public class Persona implements Serializable {
    @Id //creame en la base de datos el id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //escribirlo separado para que importe la libreria //IDENTITY CREARA ids en la base de datos
    private int id;
    private String nombre;
    private int edad;
//constructor vacio
    public Persona() {
    }
//constructor con atributos
    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //geters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
