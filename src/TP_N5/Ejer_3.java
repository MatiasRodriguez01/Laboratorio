package TP_N5;

import java.util.Scanner;

public class Ejer_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 3:");
        char letra;
        System.out.print("Ingrese una letra: ");
        letra = sc.next().charAt(0);
        if (letra >= 'A' || letra <= 'Z') {
            System.out.println("La letra es mayuscula");
        } else {
            System.out.println("La letra no es mayuscula");
        }
    }
}
