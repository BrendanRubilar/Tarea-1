public class Tarjeta extends Pago {

    /*
     * AL pagar con tarjeta se entiende que se pagara la cantidad exacta del monto o
     * menos,
     * desde esta clase se controla la variable deuda de la orden a la que se
     * pagara.
     */
    private String tipo;
    private String numTransaccion;

    public Tarjeta(String tipo, String numTransaccion) {
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }

    public void PagarConTarjeta(float Dinero, OrdenCompra orden) {
        if (orden.getDeuda() >= Dinero) {
            orden.setDeuda(orden.getDeuda() - Dinero);
        } else {
            orden.setDeuda(0);
        }
    }
}
