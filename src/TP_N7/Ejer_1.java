package TP_N7;
import java.util.*;
public class Ejer_1 {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 1:");
        int [] arreglo1 = llenarArreglo_numeros(6);
        ////////////////////////////
        System.out.println("Arreglo: " + Arrays.toString(arreglo1));
        ////////////////////////////
        System.out.println("Numeros enteros ordenador ascendente mente: ");
        Arrays.sort(arreglo1);
        for (int n : arreglo1){
            System.out.println(n);
        }
    }

    public static int [] llenarArreglo_numeros(int x){
        Random aleatorio = new Random(System. currentTimeMillis());
        int iterador;
        int [] array = new int [x];
        for (iterador = 0; iterador < array.length; iterador++){
            array[iterador] = aleatorio.nextInt(1, 50);
        }
        return array;
    }
}
