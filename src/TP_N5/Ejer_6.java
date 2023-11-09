package TP_N5;

import java.util.Scanner;

public class Ejer_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 6:");
        int n1, n2;
        System.out.print("Ingrese el numero 1: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el numero 2: ");
        n2 = sc.nextInt();
        if ((n1 % 10) == (n2 % 10)) {
            System.out.println("La ultima cifra de los 2 numeros nos iguales");
        } else {
            System.out.println("La ultima cifra de los 2 numeros no nos iguales");
        }
    }
}
