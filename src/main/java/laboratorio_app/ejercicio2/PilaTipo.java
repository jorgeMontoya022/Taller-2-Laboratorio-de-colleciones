package laboratorio_app.ejercicio2;

import java.util.Stack;

public class PilaTipo {
    private Stack<Object> pila = new Stack<>();

    public void agregarPila(Object o){
        // Si está vacía, recibe cualquier tipo de objeto.
        if(pila.empty()){
            pila.push(o);
        } else {
            // Al tener un objeto, los siguientes deben coincidir con la misma clase de este. De lo contrario no se agregan.
            if(o.getClass().equals(pila.peek().getClass())) {
                pila.push(o);
            }
        }
    }

    public void imprimirPila(){
        // Crea una copia para guardar los objetos.
        Stack<Object> pilaCopia = new Stack<>();

        // Si está vacía ya no imprime nada.
        if(pila.empty()){
            return;

        } else {

            // Imprime el elemento superior de la pila.
            System.out.print(pila.peek() + "\n");

            // El elemento superior de la pila se saca con 'pop()' y se le agrega a la copia.
            pilaCopia.push(pila.pop());
            imprimirPila();

            // Se añaden de nuevo los elementos de la copia a la original, para que estén en el mismo orden.
            pila.push(pilaCopia.pop());
            System.out.println(pila.peek());
        }
    }
}
