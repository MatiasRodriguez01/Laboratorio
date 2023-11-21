package TP_N9;
import java.util.*;
public class Ejer_7 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        // Agregamos numeros al ArrayList:
        array.add(41);
        array.add(86);
        array.add(12);
        array.add(97);
        array.add(45);
        /*
        Integer max = 0;
        for (Integer i : array){
            if (i > max){
                max = i;
            }
        }
        System.out.println("El elemento mas grande del ArrayList = " + max);
         */
        //Mostramos el elemento mas grande:
        System.out.println("El elemento mas grande del ArrayList = " + Collections.max(array));
    }
}
