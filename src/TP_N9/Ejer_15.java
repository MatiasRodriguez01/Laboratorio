package TP_N9;
import java.util.*;

public class Ejer_15 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        // Llenemos el arraylist.
        array.add(32);
        array.add(86);
        array.add(67);
        array.add(15);
        array.add(24);
        array.add(43);
        // sumamos los elementos.
        Integer sum = sumar(array);
        System.out.println("ArrayList = " + array);
        System.out.println("La suma de los elementos = " + sum);
    }

    public static Integer sumar(ArrayList<Integer> array){
        // Creamos una variable suma.
        Integer sum = 0;
        // Sumamos los elementos del arraylist:
        for (int i = 0; i < array.toArray().length; i++){
            sum += array.get(i);
        }
        return sum;
    }
}
