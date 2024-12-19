package EjercicioClasesAbstractas;

import logica.PlayStation2;
import logica.XboxOne;
import logica.Nintendo64;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //crear una instancia de cada una de ellas
        Nintendo64 nintendo64 = new Nintendo64("N64-001","nINTENDO 64",
                "Nintendo",1996,"NTSC",true);
        PlayStation2 playStation2 = new PlayStation2("PS2-02","PlayStation 2",
                "Sonny", 2000,"PAL", true,8);
        XboxOne xboxOne = new XboxOne("XBO-003", "Xbox One", "Microsoft", 2013, true, true, true);

        //PlayStation2 XboxOne

        // llamar a sus correspondientes métodos. Tener
        //en cuenta que todas las consolas, al heredar de una clase abstracta, deben
        //implementar el/los método/s de su clase madre utilizando sobreescritura de métodos

        // Llamar a los métodos de cada consola
        nintendo64.cargarJuego();
        nintendo64.leerCartucho("Banjo Kazooie");

        playStation2.cargarJuego();
        playStation2.leerDvd("Fifa 2009");
        playStation2.grabarEnMemory();

        xboxOne.cargarJuego();
        xboxOne.leerJuegoDigital("GTA V");


    }
}