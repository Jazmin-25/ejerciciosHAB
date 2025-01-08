/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.softek.ejegenericmetodo;

import com.softek.ejegenericmetodo.logica.Utilidades;

/**
 *
 * @author zoro_
 */
public class EjeGenericMetodo {

    public static void main(String[] args) {
        String [] nombres = {
            "Luisina", "Ariadna", "Pablo"
        };
        Utilidades.mostrarArray(nombres);
        
        Integer[]numeros = {
            34, 42, 57
        };
        Utilidades.mostrarArray(numeros);
    }
}
