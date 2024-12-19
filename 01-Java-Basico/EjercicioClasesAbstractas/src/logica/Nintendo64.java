package logica;

public class Nintendo64 extends Consola{
    private String norma;
    private boolean leeCartuchosPiratas;

    //constructor

    public Nintendo64(String norma, boolean leeCartuchosPiratas) {
        this.norma = norma;
        this.leeCartuchosPiratas = leeCartuchosPiratas;
    }

    public Nintendo64(String codigoConsola, String nombre, String empresaDesarrollo, int anioLanzamiento, String norma, boolean leeCartuchosPiratas) {
        super(codigoConsola, nombre, empresaDesarrollo, anioLanzamiento);
        this.norma = norma;
        this.leeCartuchosPiratas = leeCartuchosPiratas;
    }

    @Override
    public void cargarJuego() {
        System.out.println(" Cargando juego en Nintendo64. Por favor espere ");
    }
    public void leerCartucho(String juego) {
        System.out.println("Leyendo cartucho " + juego);
    }
}
