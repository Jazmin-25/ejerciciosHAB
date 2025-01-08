package com.softek.ejer2vehicustreams;

import com.softek.ejer2vehicustreams.logica.Vehiculo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejer2VehicuStreams {

    public static void main(String[] args) {
        List<Vehiculo> carros = new ArrayList<>();
        carros.add(new Vehiculo("Enfocar", "Vado", 1200));
        carros.add(new Vehiculo( "Explorador", "Vado", 2500));
        carros.add(new Vehiculo("Uno", "Fíat", 500));
        carros.add(new Vehiculo( "Cronos", "Fíat", 1000));
        carros.add(new Vehiculo( "Turín", "Fíat", 1250));
        carros.add(new Vehiculo( "Aveo", "Chevrolet", 1250));
        carros.add(new Vehiculo( "Girar", "Chevrolet", 2500));
        carros.add(new Vehiculo( "Corola", "Toyota", 1200));
        carros.add(new Vehiculo( "Fortuna", "Toyota", 3000));
        carros.add(new Vehiculo( "Logan", "Renault", 950));

//Haciendo uso del método sort en la lista de Vehículos con 
//expresiones lambda, obtén una lista de vehículos ordenados por precio 
//de menor a mayor, imprime por pantalla el resultado.
        List<Vehiculo> ordenadosPorCosto = carros.stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getCosto))
                .collect(Collectors.toList());
        System.out.println("Vehículos ordenados por costo de menor a mayor");
        ordenadosPorCosto.forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++1+++++++++++++++++++++++++");

        //De la misma forma anterior imprime una lista ordenada por marca y a su vez por precio.
        List<Vehiculo> ordenadosPorMarcayPrecio = carros.stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getCosto)
                        .thenComparing(Vehiculo::getMarca))
                .collect(Collectors.toList());
        System.out.println("Vehiculos ordenados por marca y precio");
        ordenadosPorMarcayPrecio.forEach(System.out::println);
        System.out.println("++++++++++++++++2++++++++++++++++++++++++++++++++");

        //Se desea extraer una lista de vehículos con precio no mayor a 1000
        List<Vehiculo> vehiMenor1000 = carros.stream()
                .filter(vehimeno -> vehimeno.getCosto() < 1000)
                .collect(Collectors.toList());
        System.out.println("Vehiculos con precio menor a 1000");
        vehiMenor1000.forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++3++++++++++++++++++++++++");

        //con precios mayor o igual 1000
        List<Vehiculo> vehiMayor1000 = carros.stream()
                .filter(vehimayor -> vehimayor.getCosto() >= 1000)
                .collect(Collectors.toList());
        System.out.println("Vehiculos con precio mayor a 1000");
        vehiMayor1000.forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++4+++++++++++++++++++++++");

        // obtén el promedio total de precios de toda la lista de vehículos.
        double promedioCostos = carros.stream()
                .mapToDouble(Vehiculo::getCosto)
                .average()
                .orElse(0);
        System.out.println("El promedio total de precios de toda la lista de vehiculos es: " + promedioCostos);
        System.out.println("+++++++++++++++++++++++++5+++++++++++++++++++++++");

        //Haz un filtro que muestre únicamente los autos de Marca Chevrolet y Fiat.
        List<Vehiculo> chevroletYFiat = carros.stream()
                .filter(vehi -> vehi.getMarca().equals("Chevrolet") || vehi.getMarca().equals("Fíat"))
                .collect(Collectors.toList());
        System.out.println("Vehículos de marca Chevrolet y Fíat:");
        chevroletYFiat.forEach(System.out::println);
        
        System.out.println("+++++++++++++++++++++++++6+++++++++++++++++++++++");

        //Muestra todos los autos cuyo modelo contenga al menos una letra c.
        carros.stream()
                .filter(vehiculo -> vehiculo.getModelo().toLowerCase().contains("c"))
                .forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++7+++++++++++++++++++++++");

    }
}
