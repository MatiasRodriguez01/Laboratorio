package TP_N5;

import java.util.Scanner;

public class Ejer_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 5:");
        int n1, n2;
        System.out.print("Ingrese el numero 1: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el numero 2: ");
        n2 = sc.nextInt();
        if (n1 == n2) {
            System.out.println("Los numero son iguales");
        } else if (n1 > n2) {
            System.out.println("El numero " + n1 + " es el mayor");
        } else {
            System.out.println("El numero " + n2 + " es el mayor");
        }
    }
}
