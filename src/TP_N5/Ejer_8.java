package TP_N5;

import java.util.Scanner;

public class Ejer_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 8:");
        int num;
        System.out.print("Ingrese un numero:");
        num = sc.nextInt();
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("El numero " + num + " es multiplo de 2 y de 3");
        } else {
            System.out.println("El numero " + num + " no es multiplo de 2 y de 3");
        }
    }
}
