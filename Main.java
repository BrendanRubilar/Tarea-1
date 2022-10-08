import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

   //EJEMPLOS DE CLASES
   //CREAMOS UNA FECHA Y SU FORMATO
    Date fecha = new Date();
    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

    //Creamos un cliente
    Cliente cliente1 = new Cliente("Juan", "2121");

    //Creando dos articulo
    Articulo MesaDeMadera = new Articulo(20,"Comedor elegante","Mueble de roble", 500);
    Articulo Pelota = new Articulo(1, "Pelota El bicho","Pelota de Futbol", 100);

    //Creando dos detalle de compra
    DetalleCompra Mesas = new DetalleCompra(MesaDeMadera, 2);
    DetalleCompra Pelotas = new DetalleCompra(Pelota, 3);

    //Creando una orden
    /*Para crear una orden se le asigna Fecha y estado, luego con su metodo addDetalles se le
    puede agregar la cantidad de detalles que se requiera. Finalmente con los metodos de OrdenCompra podemos
    obtener los precios y el peso.

     */
    OrdenCompra Orden1 = new OrdenCompra(fecha, "Procesando compra");
    Orden1.addDetalles(Mesas);
    Orden1.addDetalles(Pelotas);
    System.out.println( Orden1.calPrecioSinIVA());
    System.out.println( Orden1.CalcIVA());
    System.out.println(Orden1.CalcPrecio());
    System.out.println(Orden1.CalcPeso() );




    }
}
