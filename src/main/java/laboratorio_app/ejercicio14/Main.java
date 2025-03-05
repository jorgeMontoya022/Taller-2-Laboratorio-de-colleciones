package laboratorio_app.ejercicio14;

public class Main {

    public static void main(String[] args) {
        
        Mensajeria mensajeria = new Mensajeria();

        mensajeria.enviarMensaje("1");
        mensajeria.enviarMensaje("2");
        mensajeria.enviarMensaje("3");
        mensajeria.enviarMensaje("4");
        mensajeria.enviarMensaje("5");
        mensajeria.enviarMensaje("6");
        mensajeria.enviarMensaje("7");
        mensajeria.enviarMensaje("8");
        mensajeria.enviarMensaje("9");
        mensajeria.enviarMensaje("10");

        mensajeria.mostrarMensajes();

        mensajeria.enviarMensaje("11");

        mensajeria.mostrarMensajes();


    }
}
