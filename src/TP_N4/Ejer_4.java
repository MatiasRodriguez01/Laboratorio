package TP_N4;

import java.util.Scanner;

public class Ejer_4 {
    public static void main(String[] args) {
        Scanner leer1 = new Scanner(System.in);

        System.out.println("Ejercicio 4");
        int C;
        System.out.print("Ingrese a cantidad de grados C°, para pasar a grados F°: ");
        C = leer1.nextInt();
        System.out.println("Grados F° "+ (32 + ( 9 * C / 5)));
    }
}
