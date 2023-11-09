package TP_N5;

import java.util.Scanner;

public class Ejer_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 17:");
        int note;
        System.out.print("Ingrese una nota: ");
        note = sc.nextInt();
        if (note >= 0 && note < 11) {
            if (note >= 0 && note < 5) {
                System.out.println("Insuficiente");
            } else if (note >= 5 && note < 6) {
                System.out.println("Suficiente");
            } else if (note >= 6 && note < 7) {
                System.out.println("Bien");
            } else if (note >= 7 && note < 9) {
                System.out.println("Notable");
            } else {
                System.out.println("Sobresaliente");
            }
        } else {
            System.out.println("EL VALOR INGRESADO ES INVALIDO!!");
        }
    }
}
