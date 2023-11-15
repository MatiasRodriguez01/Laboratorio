package TP_N8;
import java.util.*;
public class Ejer_3 {
    public static void main(String[] args) {

        System.out.println("Ejercicio 3:");
        int [][] origin_matriz = fill_Matrix_int(3);
        System.out.println("Matriz original:");
        show_matrix_int(origin_matriz);
        System.out.println("Matriz transpuesta:");
        int [][] matriz_transposed = transposed_matrix_int(origin_matriz, 3);
        show_matrix_int(matriz_transposed);
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

    public static int [][] transposed_matrix_int(int [][] x, int tamanio){
        int [][] matriz = new int[tamanio][tamanio];
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++) {
                matriz[i][j] = x[j][i];
            }
        }
        return matriz;
    }
}
