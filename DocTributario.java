import java.util.Date;

public class DocTributario {

    /* Los documentos tributarios, boleta o factura tendrán los datos del cliente, nombre, rut, dirección, fecha
    de compra y el monto que se pago.
    La dirección se agregará a los documentos con su propio método addDireccion
    (Esto también es posible hacerlo por constructor pero consideramos que era mejor hacerlo de este modo para
    respetar el UML).
     */

    private String numero;
    private String rut;
    private Date fecha;
    private float pagado;
    private String direccion;

    public DocTributario(String numero, String rut, Date fecha, float pagado) {
        this.numero = numero;
        this.rut = rut;
        this.fecha = fecha;
        this.pagado = pagado;
    }

    public void addDirrecion(String d){
        this.direccion = d;
    }

    public DocTributario() {

    }

    @Override
    public String toString() {
        return "\nNumero documento: "+this.numero
                +"\nRut: "+this.rut+"\nFecha: "+this.fecha
                +"\nPagado: "+this.pagado+"\nDireccion: "+
                this.direccion+"\n";
    }
}
                