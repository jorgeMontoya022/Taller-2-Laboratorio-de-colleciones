package laboratorio_app.ejercicio12;

import java.util.TreeSet;

public class Universidad {
    private String nombre;
    private TreeSet<String> estudiantes = new TreeSet<String>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void imprimirPrimerYUltimo(){
        if(!estudiantes.isEmpty()){
            System.out.println("Alfabéticamente");

            // Están ordenados de manera natural automáticamente.
            System.out.println("Primer Nombre de la lista: " + estudiantes.first());
            System.out.println("Último Nombre de la lista: " + estudiantes.last());
        } else {
            System.out.println("No hay estudiantes en la lista.");
        }
    }

    public void agregarEstudiante(String estud){
        estudiantes.add(estud);
    }

}
