
package logica;


public class Reserva {
     // Método para calcular y mostrar el precio final con el descuento aplicado
    public void realizarReserva(double precioBase, PrecioReserva estrategiaDescuento) {
        double precioFinal = estrategiaDescuento.calcularPrecio(precioBase);
        System.out.println("El precio final después de aplicar el descuento es: " + precioFinal);
    }
}
