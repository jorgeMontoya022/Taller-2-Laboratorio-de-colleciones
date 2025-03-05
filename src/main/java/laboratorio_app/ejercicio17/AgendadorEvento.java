package laboratorio_app.ejercicio17;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class AgendadorEvento {
    
    // La fecha es como integer.
    private TreeMap<LocalDate, String> mapEventos = new TreeMap<>();

    public AgendadorEvento() {
    }

    public void agendarEvento(LocalDate fecha, String nombre){
        mapEventos.put(fecha, nombre);
    }

    // Imprime el primer evento en orden cronológico.
    public void imprimirPrimerYUltimoEvento(){
        System.out.println("Primer Evento: " + mapEventos.firstEntry());
        System.out.println("Último Evento: " +  mapEventos.lastEntry() + "\n");
    }

    public void imprimirListaEventos(){
        System.out.println("Lista de eventos agendados: \n");
        if (!mapEventos.isEmpty()) {
            for(Map.Entry<LocalDate,String> entry : mapEventos.entrySet()){
                System.out.println("Fecha: " + entry.getKey() + " - Nombre: " + entry.getValue());
            }
        } else{
            System.out.println("No Hay Eventos.");
        }
    }
    
}
