<<<<<<< HEAD
public class Articulo {

    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;

    public float getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public Articulo(float a, String b, String c, float d) {
        this.peso = a;
        this.nombre = b;
        this.descripcion = c;
        this.precio = d;

    }

    @Override
    public String toString() {
        return "Informacion del Articulo: \n"+"Peso: "+this.peso
                +"kg\n"+"Nombre: "+this.nombre+"\nDescripcion: "
                +this.descripcion+"\nPrecio: "+this.precio;
    }
}
=======
public class Articulo {

    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;

    public float getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public Articulo(float a, String b, String c, float d) {
        this.peso = a;
        this.nombre = b;
        this.descripcion = c;
        this.precio = d;

    }

    @Override
    public String toString() {
        return "Informacion del Articulo: \n"+"Peso: "+this.peso
                +"kg\n"+"Nombre: "+this.nombre+"\nDescripcion: "
                +this.descripcion+"\nPrecio: "+this.precio;
    }
}
>>>>>>> 58c1d2d (Subiendo clase Articulo)
