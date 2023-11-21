package TP_N9;
import java.util.*;
public class Ejer_14 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        // Llenemos el arraylist:
        array.add(45);
        array.add(-1);
        array.add(13);
        array.add(74);
        array.add(-5);

        // comparamos el menor el menor de ellos:
        Integer menor = menor_array(array);
        System.out.println("ArrayList = " + array);
        System.out.println("El elemento menor del arraylist = " + menor);
    }

    public static Integer menor_array(ArrayList<Integer> n1){
        // Creamos una variable
        Integer min = 100;
        //Comparamos los elementos del arraylist
        for (int i = 0; i < n1.toArray().length; i++){
            if (n1.get(i) < min){
                min = n1.get(i);
            }
        }
        return min;
    }
}
