package laboratorio_app.ejercicio4;

import java.util.PriorityQueue;

public class Main {



    


    public static void main (String[] args){
        
        PriorityQueue<Tarea> colaDePrioridad = new PriorityQueue<>();

        Proyecto proyecto = new Proyecto(colaDePrioridad);

        Tarea tarea1 = new Tarea("tarea1", 2);
        Tarea tarea2 = new Tarea("tarea2",5);
        Tarea tarea3 = new Tarea("tarea3", 6);

        colaDePrioridad.add(tarea1);
        colaDePrioridad.add(tarea2);
        colaDePrioridad.add(tarea3);

        proyecto.imprimirCola();

        

        


    }





}
