package TP_N7;
import java.util.*;
public class Ejer_4 {
    public static void main(String[] args) {

        System.out.println("EJERCICIO 4:");
        float[] arreglo4 = llenarArreglo_float(6);
        ////////////////////////////
        System.out.println("Arreglo: " + Arrays.toString(arreglo4));
        ////////////////////////////
        System.out.println("Numeros flotantes ordenador decendente mente: ");
        descendente_float(arreglo4);
        System.out.println(Arrays.toString(arreglo4));
    }

    public static void descendente_float(float [] a){
        float aux;
        for (int i = 0; i < a.length; i++){
            for (int j = 1; j < a.length; j++){
                if (a[j] > a[j-1]){
                    aux = a[j];
                    a[j] = a[j-1];
                    a[j-1] = aux;
                }
            }
        }
    }

    public static float [] llenarArreglo_float(int tamanio){
        Random random = new Random();

        float [] x = new float[tamanio];
        float numeroAleatorio;
        float numeroRedondeado;
        for (int i = 0; i < x.length; i++) {
            numeroAleatorio = random.nextFloat() * 100;
            numeroRedondeado = Math.round(numeroAleatorio * 100.0f) / 100.0f;
            x[i] = numeroRedondeado;
        }
        return x;
    }
}
