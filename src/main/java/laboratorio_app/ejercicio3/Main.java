package laboratorio_app.ejercicio3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    static Set<String> elementos = new HashSet<>();

//Print con iterador

    public static void imprimirIterator (){
        Iterator<String> iterator = elementos.iterator();
        while (iterator.hasNext()){
            String elemento = iterator.next();
            System.out.println(elemento);
        }
    }
    public static void main (String[] args){
        //El resultado esperado contiene solo 1 Juan, ya que los HashSet no permiten duplicados
        String nombre1= "Ana";
        String nombre2= "Mario";
        String nombre3 = "Juan";
        String nombre4 = "Rocio";
        String nombre5 = "Juan";

        elementos.add(nombre1);
        elementos.add(nombre2);
        elementos.add(nombre3);
        elementos.add(nombre4);
        elementos.add(nombre5);

        imprimirIterator();
        }
}
