package laboratorio_app.ejercicio9;

import java.util.Stack;

public class SitioWeb {

    private String nombre;
    // El sistio que contiene las páginas como stack.
    private Stack<Pagina> paginas = new Stack<Pagina>();

    public SitioWeb(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void agregarPagina(){
        // Lo del size lo puse para que las páginas sean numeradas por orden de entrada.
        Pagina pag = new Pagina("Página " + (paginas.size() + 1));

        paginas.push(pag);
        System.out.println("Visitando " + paginas.peek().getNombre());
    }

    public void cerrarPagina(){
        if (!paginas.isEmpty()) {
            System.out.println("Se ha cerrado " + paginas.pop().getNombre());
        } else {
            System.out.println("No hay páginas abiertas.");
        }
    }
    
}
