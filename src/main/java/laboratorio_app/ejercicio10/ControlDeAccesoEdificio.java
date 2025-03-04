package laboratorio_app.ejercicio10;

import java.util.HashSet;
import java.util.Set;

public class ControlDeAccesoEdificio {

    Set<Empleado> empleadosRegistrados;

    public ControlDeAccesoEdificio() {
        this.empleadosRegistrados = new HashSet<>();
    }

    public boolean hacerRegistroDiario(Empleado empleado) {
        Empleado empleadoRegistrado = buscarEmpleadoRegistrado(empleado.getId());
        if(empleadoRegistrado != null){
            return false;
        } else {
            empleadosRegistrados.add(empleado);
            return true;
        }
    }

    private Empleado buscarEmpleadoRegistrado(int id) {
        for (Empleado empleado: empleadosRegistrados){
            if(empleado.getId() == id) {
                return empleado;
            }
        }
        return null;
    }

    public void reiniciarRegistro() {
        empleadosRegistrados.clear();
        System.out.println(" Registro diario reiniciado.");
    }

}
