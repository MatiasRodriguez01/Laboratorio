package TP_N5;

import java.util.Scanner;

public class Ejer_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 16:");
        int month;
        System.out.print("Ingrese el numero del mes correspodiente(1 al 12): ");
        month = sc.nextInt();
        if (month >= 1 && month < 13) {
            if (month == 1 || month == 3 || month == 5 || month == 6 || month == 8 || month == 10 || month == 12) {
                if (month == 1) {
                    System.out.println("Enero");
                } else if (month == 3) {
                    System.out.println("Marzo");
                } else if (month == 5) {
                    System.out.println("Mayo");
                } else if (month == 6) {
                    System.out.println("Junio");
                } else if (month == 8) {
                    System.out.println("Agosto");
                } else if (month == 10) {
                    System.out.println("Octubre");
                } else {
                    System.out.println("Diciembre");
                }
            } else if (month == 4 || month == 7 || month == 9 || month == 11) {
                if (month == 4) {
                    System.out.println("Abril");
                } else if (month == 7) {
                    System.out.println("Julio");
                } else if (month == 9) {
                    System.out.println("Septiembre");
                } else {
                    System.out.println("Noviembre");
                }
            } else {
                System.out.println("Febrero");
            }
        } else {
            System.out.println("EL valor ingresado no es valido!!");
        }
    }
}
