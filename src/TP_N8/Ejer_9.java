package TP_N8;
import java.util.*;
public class Ejer_9 {
    public static void main(String[] args) {

        System.out.println("Ejercicio 9:");
        //int [][] matriz_diagonal = fill_Matrix_1_and_10 (3);
        int [][] matriz_diagonal = {{2, 0, 0}, {0, 5, 0}, {0, 0, 9}};
        System.out.println("Dada la siguiente matriz:");
        show_matrix_int(matriz_diagonal);
        boolean diagonal =  matrix_diagonal(matriz_diagonal, 3);
        System.out.println("La matriz es diagonal? " + diagonal);

    }

    public static void show_matrix_int(int [][] x){
        for(int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++){
                System.out.print("[" + x[i][j] + "]");
            }
            System.out.println(" ");
        }

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

    static boolean matrix_diagonal(int [][] matriz, int tamanio){
        boolean val = true;
        for (int i = 0; i < tamanio; i++){
            for (int j = 0; j < tamanio; j++){
                if (i != j){
                    if (matriz[i][j] != 0){
                        val = false;
                        return val;
                    }
                }
            }
        }
        return val;
    }
}
