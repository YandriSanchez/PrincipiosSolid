package ec.edu.ups.calculable;

import ec.edu.ups.modelo.ItemCarrito;

import java.util.List;

public class CalculadorTotalBasico implements CalcularTotal {
    @Override
    public double calcularTotal(List<ItemCarrito> items) {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.calcularSubtotal();
        }
        return total;
    }
}

