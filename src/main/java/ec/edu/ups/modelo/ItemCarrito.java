package ec.edu.ups.modelo;

public class ItemCarrito {
    private Producto producto;
    private int cantidad;

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    public String getNombreProducto() {
        return producto.getNombre();
    }

    public int getCantidad() {
        return cantidad;
    }
}



