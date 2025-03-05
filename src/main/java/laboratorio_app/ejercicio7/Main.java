package laboratorio_app.ejercicio7;

public class Main {

    public static void main (String[] args){

        Banco banco = new Banco();



        banco.agregarCliente("Pedro");
        banco.agregarCliente("Robinson");
        banco.agregarCliente("Rosa");

        banco.mostrarCola();

        banco.atenderCliente();
        banco.mostrarCola();

        banco.agregarClientePrioritario("Pablo");
        banco.mostrarCola();
        banco.atenderCliente();
        banco.mostrarCola();

    }
}
