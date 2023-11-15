package TP_N7;
import java.util.*;
public class Ejer_10 {
    public static void main(String[] args) {

        System.out.println("EJERCICIO 10:");
        int [] arreglo10 = {3, 98, 31, 17, 81, 23, 77};
        ////////////////////////////////////
        System.out.println("Arreglo: " + Arrays.toString(arreglo10));
        ////////////////////////////////////
        System.out.println("Arreglo ordenado usando el metodo ordenamiento por seleccion: ");
        seleccion(arreglo10);
        for (int x : arreglo10){
            System.out.println(x);
        }
    }

    public static void seleccion(int [] A) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) {
            menor = A[i];
            pos = i;
            for (j = i + 1; j < A.length; j++){
                if (A[j] < menor) {
                    menor = A[j];
                    pos = j;
                }
            }
            if (pos != i){
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }
}
