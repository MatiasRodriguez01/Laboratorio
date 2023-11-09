package TP_N5;

import java.util.Scanner;

public class Ejer_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 4:");
        int n1, n2;
        System.out.print("Ingrese el numero 1: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el numero 2: ");
        n2 = sc.nextInt();
        if (n1 == n2) {
            System.out.println("Los numero son iguales");
        } else {
            System.out.println("Los numero no son iguales");
        }
    }
}
