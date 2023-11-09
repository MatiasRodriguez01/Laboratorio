package TP_N5;

import java.util.Scanner;

public class Ejer_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 15:");
        int H, M, S;
        System.out.println("Ingrese la hora correspodiente");
        System.out.print("Ingrese la hora: ");
        H = sc.nextInt();
        System.out.print("Ingrese los minutos: ");
        M = sc.nextInt();
        System.out.print("Ingrese los segundos: ");
        S = sc.nextInt();
        if ((H >= 0 && H < 24) && (M >= 0 && M < 60) && (S >= 0 && S < 60)) {
            System.out.println("La hora es " + H + "/" + M + "/" + S);
        } else {
            System.out.println("Uno de los valores es incorrecto!!");
        }
    }
}
