package laboratorio_app.ejercicio14;

import java.util.ArrayDeque;

public class Mensajeria {

    private ArrayDeque<String> historialMensajes;
    private static final int LIMITE = 10;

    public Mensajeria(){
        historialMensajes = new ArrayDeque<>();
    }

    public void enviarMensaje(String mensaje){
        if (historialMensajes.size() == LIMITE){
            historialMensajes.pollFirst();

        }

        historialMensajes.add(mensaje);
    }

    public void mostrarMensajes(){
        for (String mensaje: historialMensajes){
            System.out.println("Mensaje" + mensaje);

        }
    }

}
