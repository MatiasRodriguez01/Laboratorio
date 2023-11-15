package TP_N8;

import java.util.Random;

public class Ejer_15 {
    public static void main(String[] args) {
        
        System.out.println("Ejercicio 15:");
        int [][] matriz = fill_Matrix_int(4);
        System.out.println("Dada esta matriz:");
        show_matrix_int(matriz);
        System.out.println("La suma de sus diagonales es = " + diagonals(matriz));

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

    public static int diagonals(int [][] a){
        int diagonal1 = 0, diagonal2 = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                if(i == j){
                    diagonal1 += a[i][j];
                } else if((i+j) == a.length-1){
                    diagonal2 += a[i][j];
                }
            }
        }
        return diagonal1 + diagonal2;
    }
}
