

package com.softek.ejerciciopagos;

import com.softek.ejerciciopagos.logica.Cripto;
import com.softek.ejerciciopagos.logica.Dollar;

import com.softek.ejerciciopagos.logica.Euro;
import com.softek.ejerciciopagos.logica.Pago;
import com.softek.ejerciciopagos.logica.PayPal;
import com.softek.ejerciciopagos.logica.Tarjeta;
import com.softek.ejerciciopagos.logica.Transferencia;

//ARREGLAR LA TRANSFERENCIA
public class EjercicioPagos {

    public static void main(String[] args) {
        
       
        Pago <Dollar, Transferencia> pagoDolares = new Pago<>(new Dollar(), 500.0, new Transferencia());
        Pago <Euro, PayPal> pagoEuro = new Pago<>(new Euro(), 350.0, new PayPal());
        Pago <Cripto, Tarjeta> pagoCripto = new Pago<>(new Cripto(), 500.50, new Tarjeta());
        
        
        pagoDolares.procesarPago();
        pagoEuro.procesarPago();
        pagoCripto.procesarPago();

        
        
        
    }
}
