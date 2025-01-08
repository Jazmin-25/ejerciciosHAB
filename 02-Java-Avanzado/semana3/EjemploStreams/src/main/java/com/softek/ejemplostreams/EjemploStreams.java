

package com.softek.ejemplostreams;

import java.util.Arrays;
import java.util.List;

public class EjemploStreams {

    public static void main(String[] args) {
        //lista de paises
        List<String> paises = Arrays.asList(
        "España", "México", "Argentina", "Francia", "Italia",
                "Alemania", "Portugal", "Chile", "Colombia", "Peru");
                
        //filtrar por los paises que tengan una letra "a"
        paises.stream()
                .filter(pais-> pais.toLowerCase().contains("e"))
                .forEach(System.out::println);
    }
}
