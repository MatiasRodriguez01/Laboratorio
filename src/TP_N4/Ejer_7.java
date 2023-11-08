package TP_N4;

import java.util.Scanner;

public class Ejer_7 {

    public static void main(String[] args) {
        Scanner leer1 = new Scanner(System.in);

        System.out.println("Ejercicio 7");
        int A, B;
        double c;
        System.out.print("Ingrese el cateto A: ");
        A = leer1.nextInt();
        System.out.print("Ingrese el cateto B: ");
        B = leer1.nextInt();
        c = Math.pow(A, 2) + Math.pow(B, 2);
        System.out.println("La longitud del triangulo rectangulo es "+ c);
    }
}
