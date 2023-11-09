package TP_N5;

import java.util.Scanner;

public class Ejer_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 24:");
        int N, counter1 = 1, counter2 = 1, counter3;
        System.out.print("Ingrese un numero, para iniciar un contador desde ese numero: ");
        N = sc.nextInt();
        System.out.println("1)Bucle while:");
        while (counter1 <= N){
            System.out.println(counter1);
            counter1++;
        }
        System.out.println("2)Bucle do while:");
        do{
            System.out.println(counter2);
            counter2++;
        }while (counter2 <= N);
        System.out.println("3)Bucle for:");
        for(counter3=1; counter3 <= N; counter3++){
            System.out.println(counter3);
        }
    }
}
