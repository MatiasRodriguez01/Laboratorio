package TP_N7;
import java.util.*;
public class Ejer_9 {
    public static void main(String[] args) {

        System.out.println("EJERCICIO 9:");
        int [] arreglo9 = llenarArreglo_numeros(6);
        ////////////////////////////////////
        System.out.println("Arreglo: " + Arrays.toString(arreglo9));
        ////////////////////////////////////
        System.out.println("Arreglo ordenado usando el metodo ordenamineto por burbuja: ");
        burbuja(arreglo9);
        for (int x : arreglo9){
            System.out.println(x);
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

    public static void burbuja(int [] A){
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }
}
