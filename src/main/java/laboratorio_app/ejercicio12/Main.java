package laboratorio_app.ejercicio12;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Universidad universidad = new Universidad("UQ");

        universidad.agregarEstudiante("Mario");
        universidad.agregarEstudiante("Robinson");

        // Se agregó luego, pero su orden natural (alfabéticamente) es primero.
        universidad.agregarEstudiante("Carl");

        // Se agregó luego, pero su orden natural (alfabéticamente) es último.
        universidad.agregarEstudiante("Walter");

        universidad.agregarEstudiante("Mario 2");
        universidad.agregarEstudiante("Pepe");

        universidad.imprimirPrimerYUltimo();




    }
}
