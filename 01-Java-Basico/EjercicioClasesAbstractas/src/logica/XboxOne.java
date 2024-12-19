package logica;

public class XboxOne extends Consola{
    private boolean conectadaInternet;
    private boolean calidad4K;
    private boolean descargaAutomatica;

    //hago el constructor para que no me marque error en el main
    public XboxOne(String s, String xboxOne, String microsoft, int i, boolean b, boolean b1, boolean b2) {
    }

    //lo pongo para que el foco rojo me deje avanzar y no lo ponga como clase abstracta
    @Override
    public void cargarJuego() {
        System.out.println("Cargando juego en Xbox One. Espere.");
    }

    //implementa un
    //método propio “leerJuegoDigital” el cual recibirá el nombre de un juego como
    //parámetro e indicará un mensaje por pantalla indicando esta situación. Por
    //ejemplo: “Leyendo GTA V desde tienda”.

    public void leerJuegoDigital(String juego) {
        System.out.println("Leyendo " + juego + "  desde tienda");
    }
}
