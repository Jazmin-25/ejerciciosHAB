package logica;

public class PlayStation2 extends Consola{
    private String norma;
    private boolean chipeadaONo;
    private int tamanioMemoryCard;

    //constructor
    public PlayStation2(String norma, boolean chipeadaONo, int tamanioMemoryCard) {
        this.norma = norma;
        this.chipeadaONo = chipeadaONo;
        this.tamanioMemoryCard = tamanioMemoryCard;
    }

    public PlayStation2(String codigoConsola, String nombre, String empresaDesarrollo, int anioLanzamiento, String norma, boolean chipeadaONo, int tamanioMemoryCard) {
        super(codigoConsola, nombre, empresaDesarrollo, anioLanzamiento);
        this.norma = norma;
        this.chipeadaONo = chipeadaONo;
        this.tamanioMemoryCard = tamanioMemoryCard;
    }
//lo pongo para que no pida que sea abstracta
    @Override
    public void cargarJuego() {
        System.out.println("Cargando juego en PlayStation2. Por favor espere.");
    }
    //crear metodos método propio “leerDvd”
    //el cual recibirá el nombre de un juego como parámetro e indicará un mensaje
    //por pantalla indicando esta situación. Por ejemplo: “Leyendo DVD Fifa 2009”.
    public void leerDvd(String juego) {
        System.out.println("Leyendo DVD" + juego);
    }

    //implementa un método propio llamado “grabarEnMemory”
    //el cual debe informar al usuario que se ha guardado correctamente un juego en
    //la memory card.
    public void grabarEnMemory() {
        System.out.println("Juego guardado correctamente en la memory card.");
    }
}