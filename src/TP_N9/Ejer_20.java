package TP_N9;
import java.util.*;
public class Ejer_20 {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();
        // Llenamos el array con strings:
        array.add("Strings");
        array.add("Comenzamos");
        array.add("Avanzemos");
        array.add("Terminemos");
        array.add("Seleccion");
        array.add("Hamburguesa");
        // aveguemos cual es la palabra mas larga:
        cadena_larga(array);
    }

    public static void cadena_larga(ArrayList<String> arreglo){
        // con esta variable guardamos la longitud de la palabra:
        int longitud = 0;
        // y con esta guardamos la palabra con la longitud mas larga:
        String palabra = "";
        // creamos un for y vemos cual es la palabra mas larga:
        for (int i = 0; i < arreglo.toArray().length; i++){
            if (arreglo.get(i).length() > longitud){
                longitud = arreglo.get(i).length();
                palabra = arreglo.get(i);
            }
        }
        // mostramos cual es la palara las larga y su longitud:
        System.out.println("La palabra mas larga es (" + palabra + "), y su longitud es de " + longitud + " letras.");
    }
}
