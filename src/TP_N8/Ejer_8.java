package TP_N8;
import java.util.*;
public class Ejer_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 8:");
        int [][] matriz = fill_Matrix_int(4);
        int row;
        System.out.println("Dada la siguiente matriz: ");
        show_matrix_int(matriz);
        System.out.println("Ingrese una de las " + 4 + " filas de la matriz: ");
        do{
            System.out.print("Fila -> ");
            row = sc.nextInt();
        } while (row < 1 || row > 4);
        System.out.println("La suma de los elementos de la fila " + row + " es = " + row_sum_matriz(matriz, row, 4));
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

    static int row_sum_matriz(int [][] a, int fila, int tamanio){
        int suma = 0;
        for (int i = 0; i < tamanio; i++){
            suma += a[(fila-1)][i];
        }
        return suma;
    }
}
