package TP_N5;

import java.util.Scanner;

public class Ejer_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 13: ");
        int year;
        System.out.print("Ingrese un año para saber si es biciesto: ");
        year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("El año " + year + " es biciesto.");
        } else {
            System.out.println("El año " + year + " no es biciesto.");
        }
    }
}
