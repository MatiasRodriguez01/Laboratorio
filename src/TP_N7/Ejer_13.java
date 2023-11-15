package TP_N7;
import java.util.*;
public class Ejer_13 {
    public static void main(String[] args) {

        System.out.println("EJERCICIO 13:");
        int [] arreglo13 = llenarArreglo_numeros(8);
        ////////////////////////////////////
        System.out.println("Arreglo : " + Arrays.toString(arreglo13));
        mergesort(arreglo13, 0, (arreglo13.length-1));
        System.out.println("Arreglo ordenado usando el metodo ordenamiento por insercion: ");
        // metodo
        for (int z : arreglo13){
            System.out.println(z);
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

    public static void mergesort(int [] A,int izq, int der){
        if (izq < der){
            int m=(izq+der)/2;
            mergesort(A,izq, m);
            mergesort(A,m+1, der);
            merge(A,izq, m, der);
        }
    }

    public static void merge(int [] A,int izq, int m, int der){
        int i, j, k;
        int [] B = new int[A.length]; //array auxiliar
        for (i=izq; i<=der; i++)      //copia ambas mitades en el array auxiliar
            B[i]=A[i];

        i=izq; j=m+1; k=izq;

        while (i<=m && j<=der) //copia el siguiente elemento más grande
            if (B[i]<=B[j])
                A[k++]=B[i++];
            else
                A[k++]=B[j++];

        while (i<=m)         //copia los elementos que quedan de la
            A[k++]=B[i++]; //primera mitad (si los hay)
    }

}
