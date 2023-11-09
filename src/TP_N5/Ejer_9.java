package TP_N5;

import java.util.Scanner;

public class Ejer_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 9:");
        char a, b;
        System.out.print("Ingrese un caracter A: ");
        a = sc.next().charAt(0);
        System.out.print("Ingrese un caracter B: ");
        b = sc.next().charAt(0);
        if (a == b) {
            System.out.println("Los caracteres son iguales");
        } else {
            System.out.println("Los caracteres no son iguales");
        }
    }
}
