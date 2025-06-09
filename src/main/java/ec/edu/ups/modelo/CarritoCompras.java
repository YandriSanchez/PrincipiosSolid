package ec.edu.ups.modelo;

import ec.edu.ups.calculable.*;

import java.util.*;

public class CarritoCompras {
    private List<ItemCarrito> items = new ArrayList<>();
    private CalcularTotal calculadorTotal;

    public CarritoCompras(CalcularTotal calculadorTotal) {
        this.calculadorTotal = calculadorTotal;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        items.add(new ItemCarrito(producto, cantidad));
    }

    public double calcularTotal() {
        return calculadorTotal.calcularTotal(items);
    }

    public void mostrarCarrito() {
        for (ItemCarrito item : items) {
            System.out.println(item.getNombreProducto() + " x" + item.getCantidad() + " - $" + item.calcularSubtotal());
        }
        System.out.println("Total: $" + calcularTotal());
    }
}


