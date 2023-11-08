package TP_N4;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Ejer_15 {
    public static void main(String[] args) {
        Scanner leer1 = new Scanner(System.in);

        System.out.println("Ejercicio 15");
        int N;
        double M;
        System.out.print("Ingrese un numero: ");
        N = leer1.nextInt();
        System.out.print("Ingrese la cantidad de cifras que quiere quitar: ");
        M = leer1.nextInt();
        M = Math.pow(10, M);
        int M_2 = (int)M;
        System.out.println("EL numero quedo en " + N / M_2);
    }
}
