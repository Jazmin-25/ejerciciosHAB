package logica;

public class Perro extends Animal { //perro es hija de animal porque hereda los atributos
    private  int cantidadMordidas;

    //agrego un constructor vacio
    public Perro() {
    }

    // constructor con atributos
    public Perro(String nombre, int edad, String color, int cantidadMordidas) {
        super(nombre, edad, color); //se utiliza la palabra reservada super para traer los atributos de animal se usa para reutilizar codigo
        this.cantidadMordidas = cantidadMordidas;
    }

    // agregar getters y setters

    public int getCantidadMordidas() {
        return cantidadMordidas;
    }

    public void setCantidadMordidas(int cantidadMordidas) {
        this.cantidadMordidas = cantidadMordidas;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void ladrar () {
        System.out.println("Soy un perro y ladro ");

    }
}
