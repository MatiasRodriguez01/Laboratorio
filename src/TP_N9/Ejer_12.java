package TP_N9;
import java.util.*;
public class Ejer_12 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        // Agregamos numeros al ArrayList:
        array.add(41);
        array.add(86);
        array.add(12);
        array.add(97);
        array.add(45);
        array.add(23);
        array.add(54);
        // Buscamos un elemento y mostramos el indice.
        //inDex
        Integer element = 45;
        Integer index = array.indexOf(element);

        System.out.println("El elemento " + element + ", y se encuentra en el indice " + index);

    }
}
