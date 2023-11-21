package TP_N9;
import java.util.*;
public class Ejer_8 {
    public static void main(String[] args) {

        ArrayList<String> arrayOriginal = new ArrayList<>();
        arrayOriginal.add("Metallica");
        arrayOriginal.add("Megadeth");
        arrayOriginal.add("Slayer");
        arrayOriginal.add("Antrhax");

        ArrayList<String> arrayCopia = new ArrayList<>();
        arrayCopia.addAll(arrayOriginal);

        System.out.println("Array original = " + arrayOriginal);
        System.out.println("Array copia = " + arrayCopia);
    }
}
