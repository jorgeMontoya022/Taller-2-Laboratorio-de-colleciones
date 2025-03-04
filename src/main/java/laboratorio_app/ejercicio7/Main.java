package laboratorio_app.ejercicio7;

public class Main {

    public void main (String[] args){

        Banco.agregarCliente("Pedro");
        Banco.agregarCliente("Robinson");
        Banco.agregarCliente("Rosa");

        Banco.mostrarCola();

        Banco.atenderCliente();
        Banco.mostrarCola();

        Banco.agregarClientePrioritario("Pablo");
        Banco.mostrarCola();
        Banco.atenderCliente();
        Banco.mostrarCola();

    }
}
