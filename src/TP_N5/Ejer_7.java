package TP_N5;

import java.util.Scanner;

public class Ejer_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 7:");
        int num;
        System.out.print("Ingrese un numero:");
        num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("El numero " + num + " es multiplo de 3 y de 5");
        } else {
            System.out.println("El numero " + num + " no es multiplo de 3 y de 5");
        }
    }
}
