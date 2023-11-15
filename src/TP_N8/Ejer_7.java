package TP_N8;
import java.util.*;
public class Ejer_7 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 7:");
        int [][] matriz = fill_Matrix_int(3);
        System.out.println("Dada la siguiente matriz: ");
        show_matrix_int(matriz);
        value_max(matriz, 3);
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

    public static void value_max(int [][] matriz, int x){
        int valor = 0, fila = 0, columna = 0;
        for (int i = 0; i < x; i++){
            for (int j = 0; j < x; j++){
                if (matriz[i][j] > valor){
                    valor = matriz[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        System.out.println("El valor maximo de la matriz es " + valor + " y esta en la posicion " + fila + "," + columna + " .");

    }
}
