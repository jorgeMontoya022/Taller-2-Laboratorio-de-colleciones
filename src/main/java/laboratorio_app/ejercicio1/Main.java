package laboratorio_app.ejercicio1;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Empresa empresa = new Empresa("Uniquindio");
    public static void main(String[] args) {


        int opcion;
        do {
            System.out.println("1.Agregar Producto");
            System.out.println("2.Buscar Producto");
            System.out.println("3.Mostrar lista");
            System.out.println("4.salir");
            System.out.print("Elija una opción:");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    buscarProducto();
                    break;
                case 4:
                    System.out.println("Saliste del sistema");
                    break;
                case 3:
                    mostrarLista();
                    break;
                default:
                    System.out.println("Ingrese un número correcto");
            }

        } while (opcion != 4);
    }

    private static void agregarProducto() {
        System.out.print("Ingrese el código del producto: ");
        String codigo = scanner.nextLine();

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        Producto producto = new Producto(nombre, codigo);
        if(empresa.agregarProducto(producto)){
            System.out.println("Producto agregado");
        } else {
            System.out.println("El producto no ha sido agregado");
        }

    }

    private static void buscarProducto() {
        System.out.print("Ingrese el código del producto");
        String codigo = scanner.nextLine();
        Producto producto = empresa.buscarProducto(codigo);
        if (producto == null){
            System.out.println("No existe");
        } else {
            System.out.println(producto);
        }
    }

    private static void mostrarLista() {
        TreeSet<Producto> listaProductos = empresa.getListaProductos();
        if (listaProductos.isEmpty()){
            System.out.println("No hay productos para mostrar");
        } else {
            System.out.println(listaProductos.toString());
        }
    }


}

