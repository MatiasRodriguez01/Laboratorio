package TP_N5;
import java.util.*;
public class Ejer_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 1:");
        int num;
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("EL numero " + num + " es par.");
        } else {
            System.out.println("EL numero " + num + " es impar.");
        }
    }
}
