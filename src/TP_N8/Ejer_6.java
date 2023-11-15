package TP_N8;
import java.util.*;
public class Ejer_6 {
    public static void main(String[] args) {

        System.out.println("Ejercicio 6:");
        int [][] matriz = fill_Matrix_int(3);
        System.out.println("Matriz: ");
        show_matrix_int(matriz);
        int suma = sum_matrix(matriz, 3);
        System.out.println("La suma de los elementos de la matriz es = " + suma);

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

    static int sum_matrix(int [][] a, int x){
        int sum = 0;
        for(int i = 0; i < x; i++){
            for(int j = 0; j < x; j++){
                sum += a[i][j];
            }
        }
        return sum;
    }
}
