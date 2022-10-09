import java.text.SimpleDateFormat;
import java.util.Date;

public class OrdenCompra {


        private Date fecha;
        private String estado;
        /*Agregamos dos variables extras, esto ya que nuestro método OrdenCompra ira recibiendo multiples DetalleCompra
        en una lista, también usaremos una variable índice para manejar los DetalleCompra dentro de esta lista, usaremos
        una variable cliente dentro de la orden para poder asociarlo a ella, y finalmente usamos una variable deuda ya
        que consideramos importante tener un método capaz de comprobar si la orden debe pagarse o ya esta pagada*/
        private DetalleCompra[] detalles;
        private int indice=0;
        private Cliente cliente;
        private float deuda=0;


    public float calPrecioSinIVA(){

        float total=0;

        for(int i=0; i<detalles.length ; i++){

            if(detalles[i]!=null){
                total = detalles[i].calcPrecioSinIVA() + total;
            }else{
                break;
            }


        }
        return total;

        }

    public float CalcIVA(){

        float total=0;

        for(int i=0; i<detalles.length ; i++){

            if(detalles[i]!=null){
                total = detalles[i].iva() + total;
            }else{
                break;
            }


        }
        return total;

    }


    public float CalcPrecio(){

        float total=0;

        for(int i=0; i<detalles.length ; i++){

            if(detalles[i]!=null){
                total = detalles[i].CalcPrecio() + total;
            }else{
                break;
            }


        }
        return total;

        }

    public float CalcPeso(){

        float total=0;

        for(int i=0; i<detalles.length ; i++){

            if(detalles[i]!=null){
                total = detalles[i].calcPeso() + total;
            }else{
                break;
            }


        }

        return total;

        }


    public OrdenCompra(Cliente cliente, Date fecha, String estado) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.estado = estado;
        this.detalles = new DetalleCompra[20];

    }

    public void addDetalles (DetalleCompra detalle){

        if( indice < detalles.length ) detalles[indice] = detalle;
        indice++;

    }

    public String Estado(){
        if(deuda<=0){
           return estado = "Pagado";
        }else{
            return estado = "No pagado";
        }
    }


    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }

    public float getDeuda() {
        return deuda;
    }

    @Override
    public String toString() {

        return "Orden de Compra de "+this.cliente.getName()+"\nFecha: "+this.fecha+"\nEstado: "
                +this.estado;
    }
}
