package TP_N5;

import java.util.Scanner;

public class Ejer_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 19:");
        System.out.println("Iniciando contador(bucle do while) del 1 al 100:");
        int num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num < 101);
    }
}
