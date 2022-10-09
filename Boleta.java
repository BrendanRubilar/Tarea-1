import java.util.Date;

public class Boleta extends DocTributario{

    public Boleta(String numero, String rut, Date fecha, float pagado) {
        super(numero, rut, fecha, pagado);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
