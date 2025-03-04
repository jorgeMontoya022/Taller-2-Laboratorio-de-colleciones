package laboratorio_app.ejercicio13;

public class Paciente implements Comparable<Paciente>{

    private String nombre;
    private int nivelPrioridad;

    public Paciente(String nombre, int nivelPrioridad) {
        this.nombre = nombre;
        this.nivelPrioridad = nivelPrioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelPrioridad() {
        return nivelPrioridad;
    }

    public void setNivelPrioridad(int nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }

    @Override
    public int compareTo(Paciente o) {
        return Integer.compare(this.nivelPrioridad, o.nivelPrioridad);

    }
}
