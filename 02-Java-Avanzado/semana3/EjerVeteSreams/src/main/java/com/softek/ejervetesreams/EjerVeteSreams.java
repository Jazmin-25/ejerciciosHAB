

package com.softek.ejervetesreams;

import com.softek.ejervetesreams.logica.ServicioVeterinario;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class EjerVeteSreams {

    public static void main(String[] args) {
       List<ServicioVeterinario> servicios = new ArrayList<>();
       servicios.add(new ServicioVeterinario("Consulta general", 500));
       servicios.add(new ServicioVeterinario("Vacunacion", 300));
       servicios.add(new ServicioVeterinario("Desparacitacion", 200));
       servicios.add(new ServicioVeterinario("Cirugia menor", 1500));
       servicios.add(new ServicioVeterinario("Emergencia", 500));
       servicios.add(new ServicioVeterinario("Consulta general", 500));
       servicios.add(new ServicioVeterinario("Esterilizacion", 500));
       servicios.add(new ServicioVeterinario("Consulta general", 500));
       
       //1.- ordenar por costo de menor a mayor
       List<ServicioVeterinario> ordenadosPorCosto = servicios.stream()
               .sorted(Comparator.comparingDouble(ServicioVeterinario::getCosto))
               .collect(Collectors.toList());
        System.out.println("Servicios ordenados por costo de menor a mayor");
        ordenadosPorCosto.forEach(System.out::println);
        System.out.println("-------------------------------1--------------------------------------");  
        
       //2.-Ordenar por tipo de servicio y luego por costo en caso de servicio repetido
       List<ServicioVeterinario> ordenadosPorServicio = servicios.stream()
               .sorted(Comparator.comparing(ServicioVeterinario::getTipo)
                                   .thenComparing(ServicioVeterinario::getCosto))
               .collect(Collectors.toList());
        System.out.println("Servicios ordenados por tipo y costo");
        ordenadosPorServicio.forEach(System.out::println);
               
       System.out.println("------------------------------2---------------------------------------");
       
       //3.- lista de servicios que valen menos de 500
       List<ServicioVeterinario> serviciosMenores500 = servicios.stream()
               .filter(serv->serv.getCosto()<500)
               .collect(Collectors.toList());
       
        System.out.println("Servicios con costo menor a 500");
        serviciosMenores500.forEach(System.out::print);
        System.out.println("");
       System.out.println("------------------------3-----------------------------------------------");
       //4 lista de servicios que valen mas de 500
               List<ServicioVeterinario> serviciosMayores500 = servicios.stream()
               .filter(serv->serv.getCosto()>=500)
               .collect(Collectors.toList());
       
        System.out.println("Servicios con costo mayor a 500");
        serviciosMenores500.forEach(System.out::print);
         System.out.println("");
        System.out.println("-----------------------------4---------------------------------------"); 
       //5 promedio de costos de todos los servicios
       double promedioCostos = servicios.stream()
               .mapToDouble(ServicioVeterinario::getCosto)
               .average()
               .orElse(0);
        System.out.println("El promedio de costos es: " + promedioCostos);
       System.out.println("------------------------------5---------------------------------------");
    }
}
