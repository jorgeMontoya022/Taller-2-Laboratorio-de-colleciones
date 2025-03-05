package laboratorio_app.ejercicio15;

import java.util.HashMap;

public class DirectorioTelefono {
    HashMap<Integer, String> mapTelefonos = new HashMap<Integer, String>();

    public void agregarNumero(int numero, String nombreEstudiante){

        if(!mapTelefonos.containsKey(numero)){
            // Java convierte el int en Integer automáticamente al usar el .put()
            mapTelefonos.put(numero, nombreEstudiante); 
        }
        else{
            System.out.println("Este número ya se encuentra registrado.");
        }
    }

    // Método para buscar el nombre de una persona dependiendo del número.
    public void consultarPersona(int numero){
        // Busca si hay una clave con el valor del número para saber si está en el HashMap
        if(mapTelefonos.containsKey(numero)){
            String persona = mapTelefonos.get(numero);
            System.out.println("La persona con el número " + numero + " corresponde a: " + persona);
        } else{
            System.out.println("Ese número no está registrado.");
        }
    }
}
