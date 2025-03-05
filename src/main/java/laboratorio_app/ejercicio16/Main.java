package laboratorio_app.ejercicio16;

public class Main {

    public static void main(String[] args) {

        Supermercado supermarket = new Supermercado();

        supermarket.agregarProducto("Coca cola 2L", 5000);
        supermarket.agregarProducto("Mentas", 600);
        supermarket.agregarProducto("Cuchillo de cocina", 15000);
        supermarket.agregarProducto("hola", 50);
        supermarket.agregarProducto("Galletas", 1000);

        // Se imprimen en orden de registro.

        supermarket.imprimirFactura();

    }
}
