package TP_N5;

import java.util.Scanner;

public class Ejer_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 10:");
        String caracter1, caracter2;
        System.out.print("Ingrese un caracter A: ");
        caracter1 = sc.next();
        System.out.print("Ingrese un caracter B: ");
        caracter2 = sc.next();
        if ((caracter1 == caracter1.toLowerCase()) && (caracter2 == caracter2.toLowerCase())) {
            System.out.println("Los 2 caracteres son minusculas.");
        } else {
            System.out.println("Los 2 caracteres no son minusculas");
        }
    }
}
