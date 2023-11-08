package TP_N4;

import java.util.Scanner;

public class Ejer_10 {
    public static void main(String[] args) {
        Scanner leer1 = new Scanner(System.in);

        System.out.println("Ejercicio 10");
        int n;
        System.out.print("Ingrese el numero, de 3 cifras: ");
        n = leer1.nextInt();
        System.out.println("Cifra 1 = "+n/100);
        System.out.println("cifra 2 = "+(n/10)%10);
        System.out.println("cifra 3 = "+n%10);
    }
}
