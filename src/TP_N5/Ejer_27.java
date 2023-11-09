package TP_N5;

import java.util.Scanner;

public class Ejer_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 27:");
        int A, B;
        System.out.print("Ingrese el primer numero: ");
        A = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        B = sc.nextInt();
        if (A < B){
            for (int iterador = A; iterador <= B; iterador++){
                if (iterador % 2 == 0){
                    System.out.println(iterador + " es un numero PAR");
                }
            }
        } else {
            System.out.println("EL primer numero no puede ser mayor al segundo!!");
        }
    }
}
