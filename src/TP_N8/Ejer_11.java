package TP_N8;

import java.util.Random;

public class Ejer_11 {
    public static void main(String[] args) {

        System.out.println("Ejercicio 11:");
        int [][] matriz = fill_Matrix_int(3);
        System.out.println("Dada esta matriz: ");
        show_matrix_int(matriz);
        odd_or_even(matriz, 3);
    }

    public static int [][] fill_Matrix_int(int x){
        Random aleatorio = new Random();
        int [][] matrix = new int[x][x];
        for (int i = 0; i < x; i++){
            for (int j = 0; j < x; j++){
                matrix[i][j] = aleatorio.nextInt(1, 50);
            }
        }
        return matrix;
    }

    public static void show_matrix_int(int [][] x){
        for(int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++){
                System.out.print("[" + x[i][j] + "]");
            }
            System.out.println(" ");
        }

    }

    public static void odd_or_even(int [][] a, int tamanio){
        int pares = 0, impares = 0;
        for (int i = 0; i < tamanio; i++){
            for (int j = 0; j < tamanio; j++){
                if (a[i][j] % 2 == 0){
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        System.out.println("En la matriz hay:");
        System.out.println(pares + " elementos pares.");
        System.out.println(impares + " elementos impares.");
    }

}