package TP_N8;
import java.util.*;
public class Ejer_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 5:");
        int [] vector = fill_vector_int(6);
        int number;
        System.out.println("Vector: " + Arrays.toString(vector));
        System.out.print("Ingrese el numero que desee multiplicar los valores del vector: ");
        number = sc.nextInt();
        int [] products_vector = scalar_product(vector, number);
        System.out.println("Vector multiplicado: " + Arrays.toString(products_vector));;
    }

    public static int [] fill_vector_int(int tamanio){
        Random aleatorio = new Random();
        int [] vector = new int[tamanio];
        for (int i = 0; i < vector.length; i++){
            vector[i] = aleatorio.nextInt(1, 20);
        }
        return vector;
    }
    public static int [] scalar_product(int [] a, int numero){
        int [] productos = new int[a.length];
        for (int i = 0; i < a.length; i++){
            productos[i] = numero * a[i];
        }
        return productos;
    }
}
