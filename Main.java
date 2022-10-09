import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

       // EJEMPLOS DE CLASES
      /*EN LA PRIMERA PARTE DE LOS EJEMPLOS SE USARAN MULTIPLES SOUT PARA AYUDAR A ENTENDER EN LA SALIDA LO QUE SE
        EXPLICA EN CODIGO, LUEGO SOLO SE MUESTRAN EJEMPLOS PEDIDOS PARA LA TAREA. */

        //Creamos una fecha para mantener orden en nuestras compras y boletas
        Date fecha = new Date();

        //Creamos un cliente
        Cliente cliente1 = new Cliente("Elsa Patito", "2121");

        //Crear direccion
        Direccion Cliente1Direccion = new Direccion("Pasaje puente alto");

        //Creando dos articulo
        Articulo MesaDeMadera = new Articulo(20,"Comedor elegante","Mueble de roble", 500);
        Articulo Pelota = new Articulo(1, "Pelota El bicho","Pelota de Futbol", 100);

        //Creando dos detalle de compra
        DetalleCompra Mesas = new DetalleCompra(MesaDeMadera, 2);
        DetalleCompra Pelotas = new DetalleCompra(Pelota, 3);

        //Creando una orden
        /*Para crear una orden se le asigna Fecha y estado, luego con su mÃ©todo addDetalles se le
        puede agregar la cantidad de detalles que se requiera. Finalmente con los mÃ©todos de OrdenCompra podemos
        obtener los precios y el peso.
        Punto para aclarar: Se entiende por OrdenCompra la orden total de articulos contenidos en los Detalles.
        Punto para aclarar: Se entiende por DetalleCompra la cantidad total de un tipo de articulo.
         */
        OrdenCompra Orden1 = new OrdenCompra(cliente1 ,fecha, "No Pagado");
        Orden1.addDetalles(Mesas);
        Orden1.addDetalles(Pelotas);

        //Se imprime por terminal la orden y sus datos de manera ordenada:
        System.out.println(Orden1.toString());
        //Si se quiere mas informacion, se pueden llamar a los metodos
        System.out.println("Precio sin IVA: "+Orden1.calPrecioSinIVA()+"\nIVA Total:" +
                Orden1.CalcIVA()+"\nPrecio total: "+Orden1.CalcPrecio()+"\n");
        System.out.println(Mesas.toString());
        System.out.println(Pelotas.toString());

        /*Ejemplo pago en efectivo, generamos un pago en el que asiganmos por constructor la cantidad total a pagar
        y la cantidad de dinero con la que se pagara, el metodo CalDevolucion devolvera un string con el vuelto
        o la deuda respectivamente, ademas cada orden tiene su propia variable deuda con la cual se verificara el estado
        (Pagado, No pagado). */
        System.out.println("\n--Se realiza un pago en efectivo--\n");
        Efectivo pago1 = new Efectivo(Orden1.CalcPrecio(), 477);
        System.out.println(pago1.CalDevolucion(Orden1));


        //Ejemplo creacion de una boleta, una boleta recibe un numero, el rut de un cliente, la fecha y lo que se pagÃ³.
        Boleta boleta1 = new Boleta("0001",cliente1.getRut(),fecha,477);
        boleta1.addDirrecion(Cliente1Direccion.getDireccion());
        //Se imprime la boleta
        System.out.println("\n--Boleta Orden 1--"+boleta1.toString());

        //Haciendo referencia a lo mencionado anteriormente, si ahora queremos ver la deuda de la Orden y el estado:
        System.out.println("--Se corrobora la deuda y el estado de Orden 1--");
        System.out.println(Orden1.getDeuda());
        System.out.println(Orden1.Estado()+"\n");

        //Si queremos pagar el resto con tarjeta, podemos crear una, asignamos nombre del banco, nÃºmero de tarjeta
        Tarjeta tarjeta1 = new Tarjeta("Debito","454047");
        /*Ahora podemos utilizar la tarjeta para pagar la cantidad que se quiera, por ejemplo haremos dos pagos,
        uno de 1000 y uno de 90, comprobamos la deuda de la orden y su estado despuÃ©s de cada pago y podemos ver
        como cambian */
        //Primer pago con tarjeta
        System.out.println("--Se realiza un pago con tarjeta en Orden 1--");
        tarjeta1.PagarConTarjeta(1000,Orden1);
        System.out.println( Orden1.getDeuda());
        System.out.println(Orden1.Estado());
        //Segundo pago con tarjeta
        System.out.println("--Se realiza un segundo pago con tarjeta en Orden 2--");
        tarjeta1.PagarConTarjeta(90,Orden1);
        System.out.println( Orden1.getDeuda());
        System.out.println(Orden1.Estado());

        /*A continuacion un ejemplo de un cliente que  realiza dos ordenes de compra y las paga con transferencia y
        tarjeta.
        */
        Cliente cliente2 = new Cliente("Armando Casitas", "312341");
        Direccion cliente2Direccion = new Direccion("El dorado");

        Articulo PlaySeriesX = new Articulo(2,"PlaySeriesX","Tostadora", 10000);
        Articulo XboxStation5 = new Articulo(2, "XboxStation5","Refrigerador", 9000);

        DetalleCompra DetalleTostadoras = new DetalleCompra(PlaySeriesX, 1);
        DetalleCompra DetalleRefrigeradores = new DetalleCompra(XboxStation5, 2);

        OrdenCompra Orden2 = new OrdenCompra(cliente2, fecha, "No pagado");
        Orden2.addDetalles(DetalleTostadoras);

        Transferencia transferencia1 = new Transferencia("Riley", "5556321",1000,Orden2);
        Factura factura1 = new Factura("0002","16.543.322-5",fecha,1000);
        factura1.addDirrecion(cliente2Direccion.getDireccion());

        OrdenCompra Orden3 = new OrdenCompra(cliente2, fecha, "No pagado");
        Orden3.addDetalles(DetalleRefrigeradores);

        Tarjeta Tarjeta2 = new Tarjeta("Credito","112321");
        Tarjeta2.PagarConTarjeta(9000,Orden3);
        Boleta boleta2 = new Boleta("0003",cliente2.getRut(),fecha,9000);
        boleta2.addDirrecion(cliente2Direccion.getDireccion());

    }
}
