
package com.softek.ekgenericcaja;

import com.softek.ekgenericcaja.logica.Caja;
import com.softek.ekgenericcaja.logica.Legajo;


public class EkGenericCaja {

    public static void main(String[] args) {
        Caja<String> cajaString = new Caja<>();
        cajaString.poner("Texto");
        String contenido = cajaString.sacar();
        
        Caja<Integer> cajaInt = new Caja <>();
        cajaInt.poner(15);
        int num = cajaInt.sacar();
        
        Caja<Legajo> cajaLegajo = new Caja <>();
        cajaLegajo.poner(new Legajo(123, "Legajo de empleado"));
        Legajo legaj = cajaLegajo.sacar();
    }
}
