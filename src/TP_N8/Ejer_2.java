package TP_N8;
import java.util.*;
public class Ejer_2 {
    public static void main(String[] args) {

        System.out.println("Ejercicio 2:");
        int [][] matriz1 = fill_Matrix_int(4);
        int [][] matriz2 = fill_Matrix_int(4);
        ////////////////////////////////
        System.out.println("Matriz 1:");
        show_matrix_int(matriz1);
        System.out.println("Matriz 2:");
        show_matrix_int(matriz2);
        System.out.println("La multiplicacion de las 3 matrices: ");
        int [][] matriz3 = multiply_matrix_int(matriz1, matriz2, 4);
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

    public static void show_matrix_int(int [][] x){
        for(int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++){
                System.out.print("[" + x[i][j] + "]");
            }
            System.out.println(" ");
        }

    }

    public static int [][] multiply_matrix_int(int [][] a, int [][] b, int x){
        int [][] multiply = new int[x][x];
        for (int i = 0; i < x; i++){
            for (int j = 0; j < x; j++){
                multiply[i][j] = a[i][j] * b[i][j];
            }
        }
        return multiply;
    }


}
