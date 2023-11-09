package TP_N5;

import java.util.Scanner;

public class Ejer_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 2:");
        int num;
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();
        if (num % 10 == 0) {
            System.out.println("El numero es multiplo de 10");
        } else {
            System.out.println("El numero no es multiplo de 10");
        }
    }
}
