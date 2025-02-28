package laboratorio_app.ejercicio2;

public class Main {

    public static void main(String[] args){

        PilaTipo pilaExclusiva = new PilaTipo();

        // Primer Objeto para agregar.
        pilaExclusiva.agregarPila(6);

        pilaExclusiva.agregarPila(true);
        pilaExclusiva.agregarPila(7);
        pilaExclusiva.agregarPila("guason");
        pilaExclusiva.agregarPila("mario");
        pilaExclusiva.agregarPila(9.8);
        pilaExclusiva.agregarPila(false);
        pilaExclusiva.agregarPila(10);
        pilaExclusiva.agregarPila(false);
        pilaExclusiva.agregarPila("para pensar");

        pilaExclusiva.imprimirPila();
        

    }

}
