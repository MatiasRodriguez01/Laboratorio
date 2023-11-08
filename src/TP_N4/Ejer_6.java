package TP_N4;

import java.util.Scanner;

public class Ejer_6 {
    public static void main(String[] args) {
        Scanner leer1 = new Scanner(System.in);

        System.out.println("Ejercicio 6");
        double km, cm;
        System.out.print("Ingrese la cantidad de km/h recorridos: ");
        km = leer1.nextDouble();
        cm = km / 3.6;
        System.out.println("La cantida de km/h a m/s es de "+cm);
    }
}
