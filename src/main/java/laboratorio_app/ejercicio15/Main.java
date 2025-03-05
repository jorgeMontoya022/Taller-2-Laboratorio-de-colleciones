package laboratorio_app.ejercicio15;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        DirectorioTelefono directorioTelefono = new DirectorioTelefono();

        directorioTelefono.agregarNumero(1, "Pepin");
        directorioTelefono.agregarNumero(2, "Mario");
        directorioTelefono.agregarNumero(3, "El Tilin 3000");
        directorioTelefono.agregarNumero(4, "Pepin (Alterno)");

        System.out.println("Ingrese el número de la persona que desea consultar.");

        do{
            int numero = scanner.nextInt();
            directorioTelefono.consultarPersona(numero);
        } while (true);

    }
}
