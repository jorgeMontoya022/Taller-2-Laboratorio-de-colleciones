package laboratorio_app.ejercicio13;

import java.util.PriorityQueue;
import java.util.Queue;

public class Hospital {
    Queue<Paciente> pacientes;

    public Hospital() {
        this.pacientes = new PriorityQueue<>();
    }

    public void registrarPacientes(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente registrado: " + paciente.getNombre() + " con prioridad " + paciente.getNivelPrioridad());

    }

    public void atenderTodosLosPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes para atender.");
        } else {
            System.out.println("\n--- Atendiendo a todos los pacientes ---");
            while (!pacientes.isEmpty()) {
                Paciente atendido = pacientes.poll();  // Saca al de mayor prioridad
                System.out.println("Atendiendo a: " + atendido.getNombre() + " con prioridad " + atendido.getNivelPrioridad());
            }
            System.out.println("Todos los pacientes han sido atendidos.");
        }
    }
}
