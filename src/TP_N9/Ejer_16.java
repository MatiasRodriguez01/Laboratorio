package TP_N9;
import java.util.ArrayList;
public class Ejer_16 {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();
        // llenamos el array:
        array.add("hola");
        array.add("mundo");
        array.add("como");
        array.add("estan");
        // mostramos los elementos concatenados:
        System.out.println("La frase = " + concatenar(array));
    }

    public static String concatenar(ArrayList<String> array){
        // creamos una variable para concatenar los elementos
        String conca = "";
        // Concatenamos los elementos del arraylist:
        for (int i = 0; i < array.toArray().length; i++) {
            if (i == 0) {
                // Si la condicion se cumple se concatena la primera palabra.
                conca += array.get(i);
            } else {
                // sino se concatenar un espacio, y luego una palabra.
                conca += " ";
                conca += array.get(i);
            }
        }
        return conca;
    }
}
