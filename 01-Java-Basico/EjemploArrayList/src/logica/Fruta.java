package logica;

public class Fruta {
    private String nombre;
    private String color;
    private String temporada;

    //constructor vacio
    public Fruta() {
    }
    //constructor por parametros

    public Fruta(String nombre, String color, String temporada) {
        this.nombre = nombre;
        this.color = color;
        this.temporada = temporada;
    }


    //getters y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
}