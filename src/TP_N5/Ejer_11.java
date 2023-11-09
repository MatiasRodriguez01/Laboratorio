package TP_N5;

import java.util.Scanner;

public class Ejer_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 11:");
        char letra;
        System.out.print("Ingrese una letra: ");
        letra = sc.next().charAt(0);
        if (letra >= 0 && letra <= 9) {
            System.out.println("La letra se encuentra entre el 0 y el 9");
        } else {
            System.out.println("La letra no se encuentra entre el 0 y el 9");
        }
    }
}
