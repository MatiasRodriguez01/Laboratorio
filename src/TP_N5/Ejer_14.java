package TP_N5;

import java.util.Scanner;

public class Ejer_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 14:");
        int num;
        System.out.print("Ingrese un numero de tres cifra: ");
        num = sc.nextInt();
        if (num > 99 && num < 999) {
            if (num / 100 == num % 10) {
                System.out.println("El numero " + num + " es capicua");
            } else {
                System.out.println("El numero ingresado no es capicua");
            }
        } else {
            System.out.println("El numero ingresado no es de 3 cifras!!");
        }
    }
}
