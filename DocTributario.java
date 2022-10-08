import java.util.Date;

public class DocTributario {

    private String numero;
    private String rut;
    private Date fecha;

    public DocTributario(String numero, String rut, Date fecha) {
        this.numero = numero;
        this.rut = rut;
        this.fecha = fecha;
    }

    public DocTributario() {

    }

    @Override
    public String toString() {
        return "Documento Tributario: \n"+"Numero documento: "+this.numero
                +"Rut:"+this.rut+"Fecha: "+this.fecha;
    }
}
