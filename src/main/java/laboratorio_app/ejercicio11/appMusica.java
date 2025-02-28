package laboratorio_app.ejercicio11;

import java.util.LinkedHashSet;
import java.util.Set;

public class appMusica {

    public static void main(String[] args) {
        Set<String> cancionesFavoritas = new LinkedHashSet<>();

        cancionesFavoritas.add("La Camisa Negra");
        cancionesFavoritas.add("Lamento Boliviano");
        cancionesFavoritas.add("De musica ligera");
        cancionesFavoritas.add("Besame mucho");
        cancionesFavoritas.add("De musica ligera");

        System.out.println("\n----------CANCIONES FAVORITAS----------");
        for (String cancion: cancionesFavoritas) {
            System.out.println(cancion);
        }
    }




}
