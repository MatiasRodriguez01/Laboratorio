package TP_N9;
import java.util.*;
public class Ejer_13 {
    public static void main(String[] args) {

        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();

        //llenamos el array 1:
        array1.add(56);
        array1.add(76);
        array1.add(25);
        array1.add(6);

        //llenamos el array 2:
        array2.add(56);
        array2.add(76);
        array2.add(25);
        array2.add(6);

        if (iguales(array1, array2)) {
            System.out.println("Los arreglo son iguales!!");
        } else {
            System.out.println("Los arreglo NO son iguales!!");
        }

    }

    public static boolean iguales(ArrayList<Integer> n1, ArrayList<Integer> n2){
        int tamanio1 = n1.toArray().length;
        int tamanio2 = n2.toArray().length;
        // decimos que el tamaño de los arraylist son iguales, sino retornara FALSE.
        if (tamanio1 != tamanio2){
            return false;
        }
        //si el tamaño de las 2 arrays son iguales, evaluamos si los elementos son iguales o no
        for (int i = 0; i < tamanio1; i++){
            if (n1.get(i) != n2.get(i)){
                return false;
            }
        }
        return true;
    }
}
