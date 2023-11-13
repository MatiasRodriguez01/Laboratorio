package TP_N6;

import java.util.Scanner;

public class Ejer_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 5:");
        System.out.println("Ingrese numeros positivos, negativos y ceros:");
        int [] x = new int[10];
        int posi = 0, nega = 0, cero = 0;
        for (int i = 0; i < x.length; i++){
            System.out.print("Ingrese el numero "+(i+1)+" del arreglo: ");
            x[i] = sc.nextInt();
            if (x[i] > 0){
                posi++;
            } else if (x[i]<0){
                nega++;
            } else{
                cero++;
            }
        }
        System.out.println("ARREGLO DEL EJERCICIO 5:");
        for (int i = 0; i < x.length; i++){
            System.out.print("["+x[i]+"]");
        }
        System.out.println(" ");
        System.out.println("Se ingresaron un total "+posi+" de numeros positivos.");
        System.out.println("Se ingresaron un total "+nega+" de numeros negativos.");
        System.out.println("Se ingresaron un total "+cero+" de ceros");
    }
}
