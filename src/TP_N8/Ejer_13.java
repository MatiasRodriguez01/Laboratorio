package TP_N8;

import java.util.*;

public class Ejer_13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 13:");
        int [][] matriz = fill_matriz_1_and_10(3);
        int number = 0;
        System.out.print("Ingrese un numero entre el 1 al 10, para encontrar ese numero en la matriz: ");
        number = sc.nextInt();
        show_matrix_int(matriz);
        System.out.println("-----");
        encontrar_numero(matriz, 3, number);

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

    public static void encontrar_numero(int [][] a, int tamanio, int numero){
        int contador = 0;
        for (int i = 0; i < tamanio; i++){
            for (int j = 0; j < tamanio; j++){
                if (a[i][j] == numero){
                    contador++;
                }
            }
        }
        if (contador == 0){
            System.out.println("EL numero no se encontro en la matriz.");
        } else {
            System.out.println("EL numero " + numero + " se encontro " + contador + " en la matriz.");
        }

    }

}
