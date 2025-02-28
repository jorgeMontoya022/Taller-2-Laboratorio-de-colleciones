package laboratorio_app.ejercicio10;

import java.util.Scanner;

public class Main {
    static Edificio edificio = new Edificio();
    static ControlDeAccesoEdificio controlDeAccesoEdificio = new ControlDeAccesoEdificio();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initDataBinding();
        menuRegistro();
    }

    private static void initDataBinding() {
        edificio.agregarEmpleado(new Empleado(1097, "Juan Luis", "Administrador"));
        edificio.agregarEmpleado(new Empleado(2045, "Ana María", "Recepcionista"));
        edificio.agregarEmpleado(new Empleado(3056, "Carlos Pérez", "Seguridad"));
    }

    private static void menuRegistro() {
        int opcion;
        do {
            System.out.println("\n=== Control de Acceso Edificio ===");
            System.out.println("1. Registrar ingreso");
            System.out.println("2. Reiniciar registros diarios (nuevo día)");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    registrarIngreso();
                    break;
                case 2:
                    reiniciarRegistrosDiarios();
                    break;
                case 3:
                    System.out.println("Saliste del sistema");
                    break;
                default:
                    System.out.println("Ingrese un número del menú");
                   
                    
            }
        }while (opcion!=3);
    }

    private static void registrarIngreso() {
        System.out.println("Ingrese su número de documento (id): ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Empleado empleado = edificio.buscarEmpleado(id);
        if(empleado == null) {
            System.err.println("El número de documento "+ id+" no está en la base de datos");
        } else {
            if(!controlDeAccesoEdificio.hacerRegistroDiario(empleado)) {
                System.err.println("Ya hay un registro del número "+id);
            } else {
                System.out.println("Bienvenido,"+empleado.getNombre()+", te has registrado con éxito");

            }
        }
    }

    private static void reiniciarRegistrosDiarios() {
        controlDeAccesoEdificio.reiniciarRegistro();
    }


}
