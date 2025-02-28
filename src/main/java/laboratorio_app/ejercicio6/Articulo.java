package laboratorio_app.ejercicio6;

public class Articulo {
    private String nombre;
    private double precio;
    private String codigo;
    private int cantidad;

    public Articulo(String nombre, double precio, String codigo, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "|nombre: "+nombre +" |código: "+codigo + "|precio: "+precio + "|cantidad: "+cantidad;
    }

}
