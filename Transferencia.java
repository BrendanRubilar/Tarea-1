public class Transferencia extends Pago{

    /* Al pagar por transferencia se entiende que se pagara la cantidad exacta o menor pero no se excedera
    el total a pagar, desde esta clase se controla la variable deuda de la orden a la que se pagara.
    */
    private String Banco;
    private String NumeroCuenta;

    public Transferencia(String banco, String numeroCuenta,float dinero, OrdenCompra orden) {
        super(dinero);
        Banco = banco;
        NumeroCuenta = numeroCuenta;

        if (orden.getDeuda() >= dinero) {
            orden.setDeuda(orden.getDeuda() - dinero);
        } else {
            orden.setDeuda(0);
        }
    }

}
