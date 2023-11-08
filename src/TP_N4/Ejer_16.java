package TP_N4;

import java.util.Scanner;

public class Ejer_16 {
    public static void main(String[] args) {
        Scanner leer1 = new Scanner(System.in);

        System.out.println("Ejercicio 16");
        double grados_C;
        System.out.print("Ingrese la cantidad de grados C° que desea: ");
        grados_C = leer1.nextInt();
        System.out.println("Los grados C° a grados F° son "+grados_C*0.8);
        System.out.println("Los grados C° a grados Kelvin son "+grados_C+273.15);

    }
}
