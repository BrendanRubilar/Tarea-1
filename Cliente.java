public class Cliente {

    private String name;
    private String rut;

    public Cliente(String name, String rut) {
        this.name = name;
        this.rut = rut;
    }

    public String getName() {
        return name;
    }

    public String getRut() {
        return rut;
    }

    @Override
    public String toString() {
        return "Datos del cliente \n"+"Nombre: "+this.name+"\nRut: "
                +this.rut;
    }
}
