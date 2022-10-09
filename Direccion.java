public class Direccion {

    private String direccion;

    /*La idea de la dirección es asociarla a un cliente y luego dejarla en la boleta,
    por lo tanto tendremos un método get */
    public Direccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

}
