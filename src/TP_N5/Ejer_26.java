package TP_N5;

import java.util.Scanner;

public class Ejer_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1, number2;
        System.out.println("EJERCICIO 26:");
        System.out.print("Ingrese el numero 1: ");
        number1 = sc.nextInt();
        System.out.print("Ingrese el numero 2: ");
        number2 = sc.nextInt();
        while (number1 == number2){
            System.out.println("LOS NUMEROS NO PUEDEN SER IGUALES!!!!");
            System.out.println("Ingrese los numeros nuevamente");
            System.out.print("Ingrese el numero 1: ");
            number1 = sc.nextInt();
            System.out.print("Ingrese el numero 2: ");
            number2 = sc.nextInt();
        }
        System.out.println("Iniciemos el contador: ");
        int iterador;
        if (number1 < number2){
            for (iterador = number1; iterador <= number2; iterador++){
                System.out.println(iterador);
            }
        } else{
            for (iterador = number2; iterador <= number1; iterador++){
                System.out.println(iterador);
            }
        }
    }
}
