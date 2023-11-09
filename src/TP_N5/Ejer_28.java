package TP_N5;

import java.util.Scanner;

public class Ejer_28 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("EJERCICIO 28:");
        int N1, M1;
        System.out.print("Ingrese el numero, que desea saber sus multiplos: ");
        N1 = sc.nextInt();
        System.out.print("Ingrese un numero grande par saber el limite de numero a imprimir: ");
        M1 = sc.nextInt();
        while (N1 > M1){
            System.out.println("--");
            System.out.println("LOS VALORES FUERON INCORRECTOS!!, el primer numero no debe ser mayor al segundo");
            System.out.print("Ingrese el numero, que desea saber sus multiplos: ");
            N1 = sc.nextInt();
            System.out.print("Ingrese un numero grande par saber el limite de numero a imprimir: ");
            M1 = sc.nextInt();
        }
        for (int i = 1; i <= M1; i++){
            if (i % N1 == 0){
                System.out.println(i + " es multiplo de " + N1);
            }
        }
    }
}
