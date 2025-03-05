package laboratorio_app.ejercicio5;

public class Producto {

    private String nombre;
    private int precio;


    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }

    

}
