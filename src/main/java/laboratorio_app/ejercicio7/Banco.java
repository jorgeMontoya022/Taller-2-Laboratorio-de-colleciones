package laboratorio_app.ejercicio7;

import java.util.LinkedList;

public class Banco {

    private static LinkedList<String> clientes;
    
        public static void agregarCliente (String cliente){
            clientes.add(cliente);
    }

    public static void atenderCliente (){
        if (!clientes.isEmpty()){
            String clienteActual = clientes.removeFirst();
            System.out.println("Cliente " + clienteActual + " está siendo atendido");
        }
        else{
            System.out.println("La cola está vacía");
        }
    }
    public static void agregarClientePrioritario (String cliente){
        clientes.addFirst(cliente);
    }

    public static void mostrarCola (){
        System.out.println(clientes);
    }

}
