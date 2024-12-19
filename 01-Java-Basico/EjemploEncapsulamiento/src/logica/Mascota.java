package logica;

public class Mascota {  //una buena practica es ingresar el private  atributos priavados y metodos publicos, las clases son publicas
    private String nombre;
    private String especie;
    private String color;
    private String raza;
    private double peso;

//Los atributos son privados, las claes son publicas
    //y los metodos, contructores, getters y setters son publicos


    //creamos cosntructores

    public Mascota() {

    }

    public void getNombre() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
