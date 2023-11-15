package TP_N7;
import java.util.*;
public class Ejer_2 {
    public static void main(String[] args) {

        System.out.println("EJERCICIO 2:");
        Integer [] arreglo2 = llenarArray_integer(6);
        ////////////////////////////
        System.out.println("Arreglo: " + Arrays.toString(arreglo2));
        ////////////////////////////
        System.out.println("Numeros enteros ordenador decendente mente: ");
        Arrays.sort(arreglo2, Collections.reverseOrder());
        for (int n : arreglo2){
            System.out.println(n);
        }
    }

    public static Integer [] llenarArray_integer(int x){
        Random aleatorio = new Random(System. currentTimeMillis());
        int iterador;
        Integer [] array = new Integer[x];
        for (iterador = 0; iterador < array.length; iterador++){
            array[iterador] = aleatorio.nextInt(1, 50);
        }
        return array;
    }
}
