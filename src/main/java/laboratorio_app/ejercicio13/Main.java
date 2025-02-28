package laboratorio_app.ejercicio13;

public class Main {
   static Hospital hospital = new Hospital();

    public static void main(String[] args) {
        registrarPacientes();
        atenderPacientes();
    }


    private static void registrarPacientes() {
        hospital.registrarPacientes(new Paciente("Juan", 2));
        hospital.registrarPacientes(new Paciente("Marcos", 2));
        hospital.registrarPacientes(new Paciente("Luisa", 3));
        hospital.registrarPacientes(new Paciente("Ana", 1));
    }

    private static void atenderPacientes() {
        hospital.atenderTodosLosPacientes();

    }

}
