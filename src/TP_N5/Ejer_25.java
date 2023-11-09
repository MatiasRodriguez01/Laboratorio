package TP_N5;

import java.util.Scanner;

public class Ejer_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 25:");
        int inicio;
        System.out.print("Ingrese un numero, para iniciar un contador desde ese numero: ");
        inicio = sc.nextInt();
        int c1 = inicio, c2 = inicio, c3;
        System.out.println("1)Bucle while:");
        while (c1 >= 1){
            System.out.println(c1);
            c1--;
        }
        System.out.println("2)Bucle do while:");
        do{
            System.out.println(c2);
            c2--;
        }while (c2 >= 1);
        System.out.println("3)Bucle for:");
        for(c3=inicio; c3 >= 1; c3--){
            System.out.println(c3);
        }
    }
}
