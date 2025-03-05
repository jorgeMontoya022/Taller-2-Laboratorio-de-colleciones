package laboratorio_app.ejercicio8;

import java.util.Vector;

public class EditorTexto {

    private Vector<String> historial;
    private String textoActual;

    public EditorTexto(){
        historial = new Vector<>();
        textoActual = "";
    }

    public void escribirTexto (String texto){
        historial.add(textoActual);
        textoActual = texto;
    }

    public void revertirCambios(){
        if (!historial.isEmpty()){
            textoActual = historial.remove(historial.size()-1);
            System.out.println("Reversión hecha");
        }
        else{
            System.out.println("No hay cambios en el historial");
        }
    }
    public void mostrarTexto (){
        System.out.println("Texto escrito:" + textoActual);
    }
    

}
