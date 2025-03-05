package laboratorio_app.ejercicio8;

public class Main {

    public static void main(String[]args){

        EditorTexto editor = new EditorTexto();

        editor.escribirTexto("Tengo sueño");
        editor.mostrarTexto();

        editor.escribirTexto("Mentira, no tengo sueño");
        editor.mostrarTexto();

        editor.revertirCambios();
        editor.mostrarTexto();

        editor.revertirCambios();
        editor.mostrarTexto();

        editor.revertirCambios();
        editor.mostrarTexto();
    }
}
