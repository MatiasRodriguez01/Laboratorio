package TP_N9;
import java.util.*;
public class Ejer_11 {
    public static void main(String[] args) {

        //Creamos un arraylist y agregamos elementos:
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        System.out.println("Array original = " + array);
        // Eliminar elementos pares
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
                i--; // Ajustar el índice después de eliminar un elemento
            }
        }
        System.out.println("Array modificada = " + array);

    }
}
