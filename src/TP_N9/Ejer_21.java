package TP_N9;
import java.util.*;
public class Ejer_21 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        // Llenamos el arraylist:
        array.add(45);
        array.add(23);
        array.add(19);
        array.add(88);
        array.add(31);
        array.add(72);
        array.add(0);
        array.add(57);
        array.add(65);
        // mostraos el promedio de los numeros:
        double promedio = promedio(array);
        System.out.println("ArrayList = " + array);
        System.out.println("El promedio de los numeros del arraylist es = " + promedio);
    }

    public static double promedio(ArrayList<Integer> arreglo){
        // creamos una variable para guarar la suma de los numeros y el tamaño del array
        double suma = 0;
        int tamanio = arreglo.toArray().length;
        // sumamos todos los numeros con un for:
        for (int i = 0; i < tamanio; i++){
            suma += arreglo.get(i);
        }
        //A final devolvemos el resultado de la suma de los numero y la longitud del ArrayList
        return suma/tamanio;
    }
}
