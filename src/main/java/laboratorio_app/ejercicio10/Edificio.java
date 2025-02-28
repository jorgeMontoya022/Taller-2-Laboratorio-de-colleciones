package laboratorio_app.ejercicio10;

import java.util.HashSet;
import java.util.Set;

public class Edificio {
    Set<Empleado> empleados;

    public Edificio() {
        this.empleados = new HashSet<>();
    }

    public Set<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }

    public boolean agregarEmpleado(Empleado empleado) {
        Empleado empleadoEncontrado = buscarEmpleado(empleado.getId());

        if (empleadoEncontrado == null) {
            empleados.add(empleado);
            return true;
        } else {
            return false;
        }
    }

    public Empleado buscarEmpleado(int id) {
        for (Empleado empleado: empleados) {
            if(empleado.getId() == id){
                return empleado;
            }
        }
        return null;
    }

    public boolean eliminarEmpleado(int id) {
        Empleado empleado = buscarEmpleado(id);
        if (empleado != null) {
            empleados.remove(empleado);
            return true;
        } else {
            return false;
        }
    }

    public void listarEmpleados() {
        for (Empleado empleado: empleados) {
            System.out.println(empleado);
        }
    }
}
