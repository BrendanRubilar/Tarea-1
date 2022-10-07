public class Cliente {

    private String name;
    private String rut;

    public Cliente(String name, String rut) {
        this.name = name;
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Datos del cliente \n"+"Nombre: "+this.name+"\nRut: "
                +this.rut;
    }
}
