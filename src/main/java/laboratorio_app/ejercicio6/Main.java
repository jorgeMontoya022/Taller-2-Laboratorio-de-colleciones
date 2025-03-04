package laboratorio_app.ejercicio6;

public class Main {
    static Tienda tienda = new Tienda();

    public static void main(String[] args) {
        agregarArticulo();
        buscarArticulo();
        eliminarArticulosAgotados();
        listarPorOrdenAlfabetico();
        listarPorPrecio();
    }

    private static void agregarArticulo() {
        tienda.agregarArticulo(new Articulo("Panela", 2500, "A001", 5));
        tienda.agregarArticulo(new Articulo("Jabón", 2000, "A002", 0));
        tienda.agregarArticulo(new Articulo("Galletas", 1000, "A003", 7));
        tienda.agregarArticulo(new Articulo("Arroz", 3000, "A004", 0));
        tienda.agregarArticulo(new Articulo("Champú", 4000, "A005", 6));
        tienda.agregarArticulo(new Articulo("Galletas", 1000, "A003", 7));
    }

    private static void buscarArticulo() {
        System.out.println("\n--- Buscando por código (A003) ---");
        Articulo articuloEncontrado = tienda.buscarArticulo("A003");

        if (articuloEncontrado != null) {
            System.out.println(articuloEncontrado);
        } else {
            System.err.println("Articulo no encontrado");
        }
    }

    private static void eliminarArticulosAgotados() {
        System.out.println("\n--- Eliminando productos agotados ---");
        tienda.eliminarAgotados();
        tienda.listarInventario();
    }

    private static void listarPorOrdenAlfabetico() {
        System.out.println("\n--- Listar por nombre ---");
        tienda.listarOrdenAlfabetico();
    }

    private static void listarPorPrecio() {
        System.out.println("\n--- Listar por precio ---");
        tienda.listarPorPrecio();
    }

}
