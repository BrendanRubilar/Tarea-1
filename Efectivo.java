public class Efectivo extends Pago{

    private float dinero;
    private float pagar;
    private float deudaLocal;
    public String CalDevolucion(OrdenCompra orden){


        if(dinero>pagar){
            return "Vuelto:  "+String.valueOf(dinero-pagar) ;
        }else if(dinero<pagar){
            deudaLocal = pagar-dinero;
            orden.setDeuda(deudaLocal);
            return "Deuda:  "+String.valueOf(pagar-dinero);
        }else{
            return "No hay deuda";
        }

    }

    public Efectivo(float pagar, float dinero) {
        this.dinero=dinero;
        this.pagar = pagar;
    }
}
