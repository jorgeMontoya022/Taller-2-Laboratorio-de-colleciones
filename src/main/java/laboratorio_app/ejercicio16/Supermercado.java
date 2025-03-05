package laboratorio_app.ejercicio16;

import java.util.LinkedHashMap;
import java.util.Map;

public class Supermercado {
    // Puse el nombre del producto como clave, ya que los nombres no se repiten pero si se pueden repetir los precios.
    LinkedHashMap<String, Integer> mapFactura = new LinkedHashMap<String, Integer>();

    public Supermercado() {
    }

    public void agregarProducto(String nombre, int precio){

        if(!mapFactura.containsKey(nombre)){
            // Java convierte el int en Integer automáticamente al usar el .put()
            mapFactura.put(nombre, precio); 
        }
        else{
            System.out.println("Este producto ya se encuentra registrado.");
        }
    }

    public int calcularFactura(){
        int valorTotal = 0;
        // Va sumando los valores en el campo de precio, los cuales son 'int'.
        for(Map.Entry<String,Integer> entry : mapFactura.entrySet()){
            valorTotal += entry.getValue();
        }
        return valorTotal;
    }

    public void imprimirFactura(){
        System.out.println("Factura:\n");
        // Imprime cada producto y precio en orden.
        for(Map.Entry<String,Integer> entry : mapFactura.entrySet()){
            System.out.println("Nombre: " + entry.getKey() + " - Precio: " + entry.getValue());
        }
        System.out.println("\n" + "Valor total: " + calcularFactura());
    }
}
