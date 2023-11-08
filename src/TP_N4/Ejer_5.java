package TP_N4;

import java.util.Scanner;

public class Ejer_5 {
    public static void main(String[] args) {
        Scanner leer1 = new Scanner(System.in);

        System.out.println("Ejercicio 5");
        int radio;
        System.out.print("Ingrese el valor del radio: ");
        radio = leer1.nextInt();
        System.out.println("La longitud de una circunferencia es " + Math.PI * Math.pow(radio, 2));
        System.out.println("El area de una circunferencia es " + Math.PI * 2 * radio);

    }
}
