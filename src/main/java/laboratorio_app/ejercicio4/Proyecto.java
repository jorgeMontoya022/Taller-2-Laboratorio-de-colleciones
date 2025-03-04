package laboratorio_app.ejercicio4;


import java.util.PriorityQueue;

public class Proyecto {

    private PriorityQueue<Tarea> colaDePrioridad;


    public PriorityQueue<Tarea> getColaDePrioridad() {
        return colaDePrioridad;
    }

    public void setColaDePrioridad(PriorityQueue<Tarea> colaDePrioridad) {
        this.colaDePrioridad = colaDePrioridad;
    }

    public Proyecto(PriorityQueue<Tarea> colaDePrioridad) {
        this.colaDePrioridad = colaDePrioridad;
    }

    public void agregarCola(Tarea tarea){
        colaDePrioridad.add(tarea);
    }

    public void imprimirCola() {
        // Clonar la cola para no modificarla
        PriorityQueue<Tarea> copiaCola = new PriorityQueue<>(colaDePrioridad);
        while (!copiaCola.isEmpty()) {
            System.out.println(copiaCola.poll().getPrioridad()); }

    

}

}
