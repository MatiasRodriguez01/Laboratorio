package TP_N8;

import java.util.Random;

public class Ejer_12 {
    public static void main(String[] args) {

        System.out.println("Ejercicio 12:");
        int [][] matriz = fill_Matrix_int(3);
        System.out.println("Dada esta matriz:");
        show_matrix_int(matriz);
        System.out.println("Mostramos la misma matriz pero rotada a 90 grados en sentido horario:");
        int [][] matriz_invertida = degrees_90(matriz, 3);
        show_matrix_int(matriz_invertida);
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

    public static int [][] degrees_90(int [][] a, int tamanio){
        int aux1 = 0, aux2 = 0;
        int [][] x = new int[tamanio][tamanio];
        for (int i = 0; i < tamanio; i++){
            for (int j = (tamanio-1); j > -1; j--){
                x[aux1][aux2] = a[j][i];
                aux2++;
            }
            aux1++;
            aux2 = 0;
        }
        return x;
    }
}
