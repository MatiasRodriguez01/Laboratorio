package TP_N4;

import java.util.Scanner;

public class Ejer_8 {
    public static void main(String[] args) {
        Scanner leer1 = new Scanner(System.in);

        System.out.println("Ejercicio 8");
        double r;
        System.out.print("Ingrese el radio, para saber el volumen de una esfera: ");
        r = leer1.nextDouble();
        System.out.print("Volumen = ");
        System.out.println((4.0/3)* Math.PI * Math.pow(r, 3));
    }
}
