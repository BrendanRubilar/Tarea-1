public class Tarjeta extends Pago{

    private String tipo;
    private String numTransaccion;

    public Tarjeta(String tipo, String numTransaccion) {
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }

    public void PagarConTarjeta(float Dinero, OrdenCompra orden){
        if(orden.getDeuda()>= Dinero ){
            orden.setDeuda(orden.getDeuda() - Dinero);
        }else{
            orden.setDeuda(0);
        }
    }
}
