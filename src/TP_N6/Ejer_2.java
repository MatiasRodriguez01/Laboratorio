package TP_N6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 2:");
        int [] n = new int[10];

        for (int i = 0; i < n.length; i++){
            System.out.print("Ingrese el numero "+ (i+1)+ " del arreglo: ");
            n[i] = sc.nextInt();
        }
        System.out.println(" ");

        System.out.println("ARREGLO DEL EJERCICIO 2:");
        for (int i = 0; i < n.length; i++){
            if (i % 2 == 0){
                System.out.print("["+n[i]+"]");
            }
        }
    }
}
