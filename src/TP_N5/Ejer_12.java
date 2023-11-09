package TP_N5;

import java.util.Scanner;

public class Ejer_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 12:");
        int number1, number2;
        System.out.print("Ingrese el numero 1: ");
        number1 = sc.nextInt();
        System.out.print("Ingrese el numero 2: ");
        number2 = sc.nextInt();
        if (number2 == 0) {
            System.out.println("EL divisor no puede ser 0!");
        } else {
            System.out.println("El resultado de la division es = " + number1 / number2);
        }
    }
}
