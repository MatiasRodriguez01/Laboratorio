package TP_N5;

import java.util.Scanner;

public class Ejer_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 22:");
        System.out.println("Iniciando contador(bucle do while) del 100 al 1:");
        int number = 100;
        do {
            System.out.println(number);
            number--;
        } while (number > 0 );
    }
}
