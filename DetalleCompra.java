public class DetalleCompra {

    private int cantidad;
    // Agregamos una variable Articulo b para hacer referencia al tipo de articulo
    // que se agregarÃ¡ y sus datos.
    private Articulo b;

    public float CalcPrecio() {
        return (b.getPrecio() * 1.19f) * cantidad;
    }

    public float calcPrecioSinIVA() {
        return b.getPrecio() * cantidad;
    }

    public float calcPeso() {
        return b.getPeso() * cantidad;
    }

    public float iva() {
        return (b.getPrecio() * 0.19f) * cantidad;
    }

    public DetalleCompra(Articulo a, int cantidad) {

        this.b = a;
        this.cantidad = cantidad;

    }

    // Se puede pedir el nombre del articulo del detalle y la cantidad de ellos
    @Override
    public String toString() {
        return "Producto: " + b.getNombre() + "\nCantidad: " + this.cantidad;
    }
}
