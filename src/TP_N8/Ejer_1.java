package TP_N8;
import java.util.*;
public class Ejer_1 {
    public static void main(String[] args) {

        System.out.println("--------------");
        System.out.println("Ejercicio 1:");
        int [][] matriz1 = fill_Matrix_int(3);
        int [][] matriz2 = fill_Matrix_int(3);
        ////////////////////////////////////////
        System.out.println("Matriz 1:");
        show_matrix_int(matriz1);
        System.out.println("Matriz 2:");
        show_matrix_int(matriz2);
        System.out.println("La suma de las 2 matrices: ");
        int [][] matriz3 = sum_matrix_int(matriz1, matriz2, 3);
        show_matrix_int(matriz3);
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

    public static int [][] sum_matrix_int(int [][] a, int [][] b, int x){
        int [][] sum = new int[x][x];
        for (int i = 0; i < x; i++){
            for(int j = 0; j < x; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    public static void show_matrix_int(int [][] x){
        for(int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++){
                System.out.print("[" + x[i][j] + "]");
            }
            System.out.println(" ");
        }

    }
}
