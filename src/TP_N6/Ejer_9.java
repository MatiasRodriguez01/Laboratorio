package TP_N6;

import java.util.Scanner;
import java.util.*;
public class Ejer_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 9:");
        int tamanio, desde, hasta;
        System.out.print("Ingrese el tamaño del arreglo: ");
        tamanio = sc.nextInt();
        int [] array = new int[tamanio];
        System.out.println("Vamos a asignarle numeros aleatorios al arreglo!");
        System.out.print("Ingrese el numero desde el cual empieza: ");
        desde = sc.nextInt();
        desde = sc.nextInt();
        System.out.print("Ingrese el numero desde el cual termina: ");
        hasta = sc.nextInt();
        llenarArreglo(desde, hasta, array);
        System.out.print("MOSTRAMOS EL ARREGLO: ");
        mostrarArreglo(array);
    }

    public static void llenarArreglo(int i, int f, int[] a){
        Random aleatorio = new Random(System. currentTimeMillis());
        int x;
        for (x = 0; x < a.length; x++){
            a[x] = aleatorio.nextInt(i, f);
        }
    }

    public static void mostrarArreglo(int[] a) {
        int i;
        for (i = 0; i < a.length; i++){
            System.out.print("[" + a[i] + "]");
        }
        System.out.println(" ");
    }
}
