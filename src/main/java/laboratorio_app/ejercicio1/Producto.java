package laboratorio_app.ejercicio1;


public class Producto implements Comparable<Producto> {
    private String nombreProducto;
    private String codigo;

    public Producto(String nombreProducto, String codigo) {
        this.nombreProducto = nombreProducto;
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "|nombre: "+nombreProducto +" |código: "+codigo;
    }



    @Override
    public int compareTo(Producto otroProducto) {
        return this.codigo.compareTo(otroProducto.codigo);
    }
}
