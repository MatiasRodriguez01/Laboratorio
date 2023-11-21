package TP_N9;
import java.util.*;
public class Ejer_22 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        //Llenar el arreglo:
        array.add(234);
        array.add(349);
        array.add(143);
        array.add(24);
        array.add(7);
        array.add(432);
        // mostraos el arreglo original:
        System.out.println("Array original = " + array);
        // ordenamos el arraylist con el metodo sort():
        Collections.sort(array);
        // mostramos como quedo el arreglo:
        System.out.println("Array ordenado ascendentemente = " + array);
    }
}
