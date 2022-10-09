public class Efectivo extends Pago{

    /* Cada tipo de pago tendrá sus propios métodos para hacer saber al cliente
    cuanto le corresponde de vuelto o cuanta deuda tiene.
    Trabajaremos directamente con una orden y modificaremos su variable deuda desde esta clase.
    */
    private float dinero;
    private float pagar;
    private float deudaLocal;
    public String CalDevolucion(OrdenCompra orden){


        if(dinero>pagar){
            return "Vuelto tras pago:  "+String.valueOf(dinero-pagar) ;
        }else if(dinero<pagar){
            deudaLocal = pagar-dinero;
            orden.setDeuda(deudaLocal);
            return "Deuda tras pago:  "+String.valueOf(pagar-dinero);
        }else{
            return "No hay deuda tras pago";
        }

    }


    public Efectivo(float pagar, float dinero) {
        super(dinero);

        this.dinero=dinero;
        this.pagar = pagar;

    }
}
