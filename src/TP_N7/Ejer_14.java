package TP_N7;
import java.util.*;
public class Ejer_14 {
    public static void main(String[] args) {

        System.out.println("EJERCICIO 14:");
        int [] arreglo14 = llenarArreglo_numeros(20);
        ////////////////////////////////////
        System.out.println("Dado el siguiente arreglo: " + Arrays.toString(arreglo14));
        descendiente_ascendiente(arreglo14);
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

    public static void descendiente_ascendiente(int [] a){
        Scanner sc = new Scanner(System.in);
        char option;
        do {
            System.out.println("---------------------------------------------");
            System.out.println("Ingrese una de las siguientes opciones:");
            System.out.println("a) Para ordenar el arreglo ASCENDENTEMENTE: ");
            System.out.println("b) Para ordenar el arreglo DESCENDENTEMENTE: ");
            System.out.print("--> ");
            option = sc.nextLine().charAt(0);
            if (option == 'a'){
                burbuja(a);
                for (int i : a){
                    System.out.println(i);
                }
            } else if ( option == 'b') {
                descendiente_int(a);
                for (int i : a){
                    System.out.println(i);
                }
            }
        } while(option != 'a' && option != 'b');
    }

    public static void descendiente_int(int [] a){
        int aux;
        for (int i = 0; i < a.length; i++){
            for (int j = 1; j < a.length; j++){
                if (a[j] > a[j-1]){
                    aux = a[j];
                    a[j] = a[j-1];
                    a[j-1] = aux;
                }
            }
        }
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
