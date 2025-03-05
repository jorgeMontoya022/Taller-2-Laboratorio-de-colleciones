package laboratorio_app.ejercicio17;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        AgendadorEvento agendador = new AgendadorEvento();

        agendador.agendarEvento(LocalDate.of(1999,2, 12), "Sale Fortnite");
        agendador.agendarEvento(LocalDate.of(0,12, 25), "Nace Jesus");
        agendador.agendarEvento(LocalDate.of(2025,4, 2), "Switch 2");
        agendador.agendarEvento(LocalDate.of(2015,9, 11), "Sale Mario Maker");
        agendador.agendarEvento(LocalDate.of(2023,10, 30), "Halloween");
        agendador.agendarEvento(LocalDate.of(2023,10, 29), "Pre-Halloween");


        agendador.imprimirPrimerYUltimoEvento();
        agendador.imprimirListaEventos();

    }
}
