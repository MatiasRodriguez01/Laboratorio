package TP_N9;
import java.util.*;
public class Ejer_9 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        // Agregamos numeros al ArrayList:
        array.add(41);
        array.add(86);
        array.add(12);
        array.add(97);
        array.add(45);
        array.add(13);
        //Aclaramos el primer y ultimo elemento del arraylist:
        int primero = array.get(0);
        int longitud = array.size();
        int ultimo = array.get(longitud - 1);
        // mostramos los elementos:
        System.out.println("Primer elemento: " + primero);
        System.out.println("Ultimo elemento: " + ultimo);

    }
}
