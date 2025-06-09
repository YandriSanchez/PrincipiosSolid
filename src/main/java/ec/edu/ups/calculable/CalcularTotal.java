package ec.edu.ups.calculable;

import ec.edu.ups.modelo.ItemCarrito;

import java.util.List;

public interface CalcularTotal {
    double calcularTotal(List<ItemCarrito> items);
}

