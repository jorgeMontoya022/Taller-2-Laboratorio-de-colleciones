package laboratorio_app.ejercicio5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args ){
        Producto producto1 = new Producto("Producto1", 10);
        Producto producto2 = new Producto("Producto2", 15);
        Producto producto3 = new Producto("Producto3", 10);

        Map<Integer, Producto> hashMap = new HashMap<>();

        //Permite claves nulas, al igual que el linkedHashMap, pero la diferencia es que este no
        //ordena los productos por orden de inserción, este se utiliza más para rendimiento
        //pues permite la fácil inserción, eliminación y busqueda de datos
        hashMap.put(2, producto2);
        hashMap.put(1, producto1);
        hashMap.put(3, producto3);

        Map<Integer, Producto> linkedHashMap = new LinkedHashMap<>();
        
        //Tiene carácteristicas del map anterior, con la diferencia de que este mantiene un órden de inserción

        linkedHashMap.put(3, producto3);
        linkedHashMap.put(1, producto1);
        linkedHashMap.put(2, producto2);

        //No permite nulls, ordena por clave
        Map<Integer, Producto> treeMap = new TreeMap<>();

        treeMap.put(2, producto2);
        treeMap.put(3, producto3);
        treeMap.put(1, producto1);

        System.out.println("HashMap " + hashMap);
        //No se espera un orden

        System.out.println("LinkedHashMap " + linkedHashMap);
        //Se espera que imprima 3, 1, 2, en ese orden

        System.out.println("TreeMap " + treeMap);
        //Se espera que imprima 1, 2, 3
    

    }


}
