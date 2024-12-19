package logica;

public class Animal {
    //modificador de acceso protecd se usa con herencia
    protected String nombre;
    protected int edad;
    protected  String color;

    public Animal() {
        //creamos constructor vacio
    }
    //constructor con parametros


    public Animal(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    //getters y setters


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

    public void comer (){ //creamos un nuevo metodo
        System.out.println(nombre + " esta comiendo ");
    }
//ahora en el paquete logica voy a crear las clases hijas

}
