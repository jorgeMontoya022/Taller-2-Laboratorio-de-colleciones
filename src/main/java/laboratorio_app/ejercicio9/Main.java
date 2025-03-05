package laboratorio_app.ejercicio9;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        SitioWeb sitio = new SitioWeb("Googel");

        System.out.println("Bienvenido al sitio web.");
        System.out.println("Ingrese 1 para visitar una página.");
        System.out.println("Ingrese 2 para cerrar la página actual.");

        do{
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    sitio.agregarPagina();
                    break;
                case 2:
                    sitio.cerrarPagina();
                default:
                    break;
            }
        } while (true);
    }
}
