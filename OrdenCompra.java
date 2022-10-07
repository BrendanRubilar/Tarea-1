import java.util.Date;

public class OrdenCompra {

        private Date fecha;
        private String estado;

    public void calPrecioSinIVA(){

        }

    public void CalclIVA(){

        }

    public void CalcPrecio(){

        }

    public void CalcPeso(){

        }

    @Override
    public String toString() {
        return "Orden de Compra \n"+"Fecha: "+this.fecha+"\n Estado: "
                +this.estado;
    }
}
