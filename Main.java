import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

       //EJEMPLOS DE CLASES
       //CREAMOS UNA FECHA Y SU FORMATO
        Date fecha = new Date();
        SimpleDateFormat format = new SimpleDateFaormat("dd-MM-yyyy");

        //Creamos un cliente
        Cliente cliente1 = new Cliente("Elsa Patito", "2121");

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
        OrdenCompra Orden1 = new OrdenCompra(cliente1 ,fecha, "No Pagado");
        Orden1.addDetalles(Mesas);
        Orden1.addDetalles(Pelotas);
        /*Ejemplo pago en efectivo, generamos un pago en el que asiganmos por constructor la cantidad total a pagar
        y la cantidad de dinero con la que se pagara, el metodo CalDevolucion devolvera un string con el vuelto
        o la deuda respectivamente, ademas cada orden tiene su propia variable deuda con la cual se verificara el estado
        (Pagado, No pagado).
         */
        Efectivo pago1 = new Efectivo(Orden1.CalcPrecio(), 477);
        System.out.println(pago1.CalDevolucion(Orden1));
        //Haciendo referencia a lo mencionado anteriormente, si ahora queremos ver la deuda de la orden y el estado:
        System.out.println(Orden1.getDeuda());
        System.out.println(Orden1.Estado());
        //Si queremos pagar el resto con tarjeta, podemos crear una, asignamos nombre del banco, número de tarjeta
        Tarjeta tarjeta1 = new Tarjeta("Patitos","454047");
        /*Ahora podemos utilizar la tarjeta para pagar la cantidad que se quiera, por ejemplo haremos dos pagos,
        uno de 1000 y uno de 90, comprobamos la deuda de la orden y su estado después de cada pago y podemos ver
        como cambian */
        //Primer pago con tarjeta
        tarjeta1.PagarConTarjeta(1000,Orden1);
        System.out.println( Orden1.getDeuda());
        System.out.println(Orden1.Estado());
        //Segundo pago con tarjeta
        tarjeta1.PagarConTarjeta(90,Orden1);
        System.out.println( Orden1.getDeuda());
        System.out.println(Orden1.Estado());

        //Para el siguiente ejemplo ejemplo pagaremos con transferencia
        Cliente cliente2 = new Cliente("Armando Casitas", "312341");

        Articulo PlaySeriesX = new Articulo(2,"PlaySeriesX","Tostadora", 10000);
        Articulo XboxStation5 = new Articulo(2, "XboxStation5","Refrigerador", 9000);

        DetalleCompra DetalleTostadoras = new DetalleCompra(PlaySeriesX, 1);
        DetalleCompra DetalleRefrigeradores = new DetalleCompra(XboxStation5, 2);

        OrdenCompra Orden2 = new OrdenCompra(cliente2, fecha, "No pagado");




    }
}
