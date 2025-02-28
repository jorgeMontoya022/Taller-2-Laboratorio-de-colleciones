package laboratorio_app.ejercicio6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Tienda {
    List<Articulo> inventario;

    public Tienda() {
        this.inventario = new ArrayList<>();
    }

    public List<Articulo> getInventario() {
        return inventario;
    }

    public void setInventario(List<Articulo> inventario) {
        this.inventario = inventario;
    }

    public void listarInventario() {
        System.out.println("Inventario completo:");
        for (Articulo articulo : inventario) {
            System.out.println(articulo);
        }
    }

    public void agregarArticulo(Articulo articulo) {
        Articulo articuloEncontrado = buscarArticulo(articulo.getCodigo());
        if (articuloEncontrado == null) {
            inventario.add(articulo);
        } else {
            articuloEncontrado.setCantidad(articuloEncontrado.getCantidad() + articulo.getCantidad());
            System.out.println("El producto " + articulo.getNombre() + " ya existe. Se sumó la cantidad.");
        }

    }

    public Articulo buscarArticulo(String codigo) {
        for (Articulo articulo : inventario) {
            if (articulo.getCodigo().equals(codigo)) {
                return articulo;
            }
        }
        return null;
    }

    public void eliminarAgotados() {
        ListIterator<Articulo> articuloListIterator = inventario.listIterator();
        while (articuloListIterator.hasNext()) {
            Articulo articulo = articuloListIterator.next();
            if (articulo.getCantidad() == 0) {
                articuloListIterator.remove();
            }
        }
    }

    public void listarOrdenAlfabetico() {
        inventario.sort(new Comparator<Articulo>() {
            @Override
            public int compare(Articulo o1, Articulo o2) {
                return (o1.getNombre().compareTo(o2.getNombre()));
            }
        });
        System.out.println("Inventario (orden alfabético):");
        for (Articulo articulo : inventario) {
            System.out.println(articulo);
        }
    }

    public void listarPorPrecio() {
        inventario.sort(new Comparator<Articulo>() {
            @Override
            public int compare(Articulo o1, Articulo o2) {
                return Double.compare(o1.getPrecio(), o2.getPrecio());
            }
        });

        System.out.println("Inventario (orden por precio):");
        for (Articulo articulo : inventario) {
            System.out.println(articulo);
        }
    }
}
