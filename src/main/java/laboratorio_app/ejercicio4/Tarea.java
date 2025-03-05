package laboratorio_app.ejercicio4;

public class Tarea implements Comparable<Tarea> {

    private String nombre;
    private Integer prioridad;
    
    public Tarea(String nombre, Integer prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Tarea t2) {
        return t2.getPrioridad() - this.prioridad;
        
    }

    @Override
    public String toString() {
        return prioridad.toString(); // Sobrescribir para imprimir solo la prioridad
    }
    

}
