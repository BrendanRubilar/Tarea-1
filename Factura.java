import java.util.Date;

public class Factura extends DocTributario{

    public Factura(String numero, String rut, Date fecha, float pagado) {
        super(numero, rut, fecha, pagado);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
