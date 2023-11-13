package TP_N6;

import java.util.Scanner;

public class Ejer_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 7:");
        int N, media_mayor = 0, media_menor = 0;
        System.out.print("Ingrese la cantidad de personas: ");
        N = sc.nextInt();
        double [] alturas = new double[N];
        double suma = 0, media_altura = 0;
        for (int i = 0; i < alturas.length; i++){
            System.out.print("Ingrese la altura de la persona N°"+ (i+1)+": ");
            alturas[i] = sc.nextDouble();  // ingrese los numeros con coma, en vez de puntos
            suma += alturas[i];
        }
        media_altura = suma / N;
        for (int i = 0; i < alturas.length; i++){
            if (alturas[i] > media_altura){
                media_mayor++;
            } else {
                media_menor++;
            }
        }
        System.out.println("Huvo un total de "+media_mayor+" personas que superaron la media de altura.");
        System.out.println("Huvo un total de "+media_menor+" personas que no alcanzaron la media de altura.");
    }
}
