package TP_N8;
import java.util.*;
public class Ejer_4 {
    public static void main(String[] args) {

        System.out.println("Ejercicio 4:");
        //int [][] origin = fill_Matrix_int(3);
        int [][] origin = {{2, 0, 2}, {0, 5, 0}, {2, 0, 2}};
        System.out.println("Matriz original:");
        show_matrix_int(origin);
        System.out.println("Matriz transpuesta:");
        int [][] transposed = transposed_matrix_int(origin, 3);
        show_matrix_int(transposed);
        boolean val = matrices_comparison(origin, transposed, 3);
        System.out.println("Las matrices son simetricas? " + val);
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

    public static boolean matrices_comparison(int [][] a, int [][] b, int x){
        boolean val = true;
        for(int i = 0; i < x; i++){
            for(int j = 0; j < x; j++){
                if (a[i][j] != b[i][j]){
                    val = false;
                    return val;
                }
            }
        }
        return val;
    }
}
