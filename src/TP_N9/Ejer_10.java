package TP_N9;
import java.util.*;
public class Ejer_10 {
    public static void main(String[] args) {

        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(3);

        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(7);
        array2.add(8);
        array2.add(9);

        ArrayList<Integer> array3 = new ArrayList<>();
        array3.addAll(array1);
        array3.addAll(array2);

        System.out.println("Array 1 = " + array1);
        System.out.println("Array 2 = " + array2);
        System.out.println("Array 3 = " + array3);


        /*
        System.out.println("Array 1:");
        for (Integer i : array1){
            System.out.println(i);
        }
        System.out.println("--");
        System.out.println("Array 2:");
        for (Integer i : array2){
            System.out.println(i);
        }
        System.out.println("--");
        System.out.println("Array 3(funcion del array 1 y 2):");
        for (Integer i : array3){
            System.out.println(i);
        }

         */

    }
}
