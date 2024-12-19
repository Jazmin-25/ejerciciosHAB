package logica;

public class Gato extends Animal {
    int cantidadAranizados;
//agrego construr vacio
    public Gato () {

    }

    public Gato(String nombre, int edad, String color, int cantidadAranizados) {
        super(nombre, edad, color);
        this.cantidadAranizados = cantidadAranizados;
    }
    //getters and setters
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void maullar (){
        System.out.println("Soy un gato y maullo");
    }
}
