package TP_N8;

import java.util.Random;

public class Ejer_14 {
    public static void main(String[] args) {
        
        System.out.println("Ejercicio 14:");
        int [][] matriz = fill_matriz_1_and_10(5);
        System.out.println("Dada esta matriz: ");
        show_matrix_int(matriz);
        System.out.println("Tenemos la misma matriz con las lineas intercambiadas: ");
        change_rows(matriz, 5);

    }

    public static int [][] fill_matriz_1_and_10(int tamanio){
        Random sc = new Random();
        int [][] matrix = new int[tamanio][tamanio];
        for (int i = 0; i < tamanio; i++){
            for (int j = 0; j < tamanio; j++){
                matrix[i][j] = sc.nextInt(0, 9);
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

    public static void change_rows(int [][] a, int tamanio){
        int[][] matriz = new int[tamanio][tamanio];
        int filas = 0;
        for (int i = (tamanio-1); i > -1; i--){
            for (int j = 0; j < tamanio; j++){
                matriz[filas][j] = a[i][j];
            }
            filas++;
        }
        show_matrix_int(matriz);
    }
}
