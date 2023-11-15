package TP_N8;

import java.util.Random;

public class Ejer_10 {
    public static void main(String[] args) {

        System.out.println("Ejercicio 10:");
        //matriz = fill_matriz_1_and_10(3);
        int [][] matriz = new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        System.out.println("Dada la siguiente matriz:");
        show_matrix_int(matriz);
        boolean valor =  matrix_unitary(matriz, 3);
        System.out.println("La matriz es unitaria? " + valor);
    }

    public static void show_matrix_int(int [][] x){
        for(int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++){
                System.out.print("[" + x[i][j] + "]");
            }
            System.out.println(" ");
        }

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

    static boolean matrix_unitary(int [][] matriz, int tamanio){
        boolean val = true;
        for (int i = 0; i < tamanio; i++){
            for (int j = 0; j < tamanio; j++){
                if (i == j){
                    if (matriz[i][j] != 1){
                        val = false;
                        return val;
                    }
                }
            }
        }
        return val;
    }
}
