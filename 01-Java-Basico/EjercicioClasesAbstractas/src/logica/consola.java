package logica;

abstract class Consola {
    protected String codigoConsola;
    protected String nombre;
    protected String empresaDesarrollo;
    protected int anioLanzamiento;
//hacer un constructor vacio
    public Consola() {
    }

    //constructor lleno para que pueda heredar y hacerlo protecd para hacerlo

    protected Consola(String codigoConsola, String nombre, String empresaDesarrollo, int anioLanzamiento) {
        this.codigoConsola = codigoConsola;
        this.nombre = nombre;
        this.empresaDesarrollo = empresaDesarrollo;
        this.anioLanzamiento = anioLanzamiento;
    }
    //crear un método abstracto “cargarJuego” que indique un mensaje por pantalla que
    //diga “Cargando juego. Por favor espere”.

    public abstract void cargarJuego(); // es una opcion
    //}
   // protected abstract void cargarJuego(){//porque solo hereda siempre se pone protected

    }
