package TP_N9;
import java.util.*;
public class Ejer_18 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        // Llenamos el arraylist:
        array.add(45);
        array.add(23);
        array.add(79);
        array.add(68);
        array.add(31);
        array.add(79);
        array.add(23);
        array.add(45);
        array.add(68);
        // sumamos todos los elementos del arrayList:
        Integer suma = sumar(array);
        System.out.println("ArrayList = " + array);
        System.out.println("La suma de todos los elementos es = " + suma);
    }

    public static Integer sumar(ArrayList<Integer> array){
        Integer sum = 0;
        // sumamos los elementos en un bucle for:
        for (int i = 0; i < array.toArray().length; i++){
            sum += array.get(i);
        }
        return sum;
    }
}
