package laboratorio_app.ejercicio1;

import java.util.TreeSet;

public class Empresa {
    private String nombre;
    private TreeSet<Producto> listaProductos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.listaProductos = new TreeSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TreeSet<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(TreeSet<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public boolean agregarProducto(Producto producto) {
        Producto productoEncontrado = buscarProducto(producto.getCodigo());
        if (productoEncontrado == null) {
            listaProductos.add(producto);
            return true;
        } else {
            return false;
        }
    }

    public Producto buscarProducto(String codigo) {
        for (Producto producto: listaProductos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    public TreeSet<Producto> mostrarProductos(){
        return listaProductos;
    }



}
