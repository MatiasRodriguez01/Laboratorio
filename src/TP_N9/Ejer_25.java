package TP_N9;
import java.util.*;
public class Ejer_25 {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();
        // Agregamos elementos al ArrayList:
        array.add("Zapatilla");
        array.add("Matias");
        array.add("Rockstar");
        array.add("Antagonista");
        array.add("Salvador");
        array.add("Cristiano");
        array.add("Bandoleros");
        // mostraos el arreglo original:
        System.out.println("Array original = " + array);
        // ordenamos el arraylist con el metodo sort():
        Collections.sort(array);
        // mostramos como quedo el arreglo:
        System.out.println("Array ordenado alfabeticamente = " + array);
    }
}
