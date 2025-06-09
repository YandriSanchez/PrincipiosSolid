package ec.edu.ups;

import ec.edu.ups.calculable.*;
import ec.edu.ups.modelo.*;

public class Main {
    public static void main(String[] args) {
        CalcularTotal calculador = new CalculadorTotalBasico();
        CarritoCompras carrito = new CarritoCompras(calculador);

        Producto producto1 = new Producto(743, "Audifonos", 25.00);
        Producto producto2 = new Producto(124, "Arroz", 6.00);
        Producto producto3 = new Producto(243, "Desinfectante", 2.00);

        carrito.agregarProducto(producto1, 2);
        carrito.agregarProducto(producto2, 10);
        carrito.agregarProducto(producto3, 4);

        carrito.mostrarCarrito();
    }
}
