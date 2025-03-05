package laboratorio_app.ejercicio7;

import java.util.LinkedList;

public class Banco {

    public Banco() {
        Banco.clientes = new LinkedList<>();
    }

    private static LinkedList<String> clientes;
    
        public void agregarCliente (String cliente){
            clientes.add(cliente);
    }

    

    public void atenderCliente (){
        if (!clientes.isEmpty()){
            String clienteActual = clientes.removeFirst();
            System.out.println("Cliente " + clienteActual + " está siendo atendido");
        }
        else{
            System.out.println("La cola está vacía");
        }
    }
    public void agregarClientePrioritario (String cliente){
        clientes.addFirst(cliente);
    }

    public void mostrarCola (){
        System.out.println(clientes);
    }

    

}
