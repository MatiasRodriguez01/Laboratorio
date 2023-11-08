package TP_N4;

import java.util.Scanner;

public class Ejer_9 {
    public static void main(String[] args) {
        Scanner leer1 = new Scanner(System.in);

        System.out.println("Ejercicio 9");
        double lado1, lado2, lado3, p, area;
        System.out.print("Ingrese el lado 1: ");
        lado1 = leer1.nextDouble();
        System.out.print("Ingrese el lado 2: ");
        lado2 = leer1.nextDouble();
        System.out.print("Ingrese el lado 3: ");
        lado3 = leer1.nextDouble();
        p = (lado1+ lado2+ lado3)/2;
        area = Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));
        System.out.println("El area del triangulo es "+area);
    }
}
