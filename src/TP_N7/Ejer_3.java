package TP_N7;
import java.util.*;
public class Ejer_3 {
    public static void main(String[] args) {

        System.out.println("EJERCICIO 3:");
        float[] arreglo3 = llenarArreglo_float(6);
        ////////////////////////////
        System.out.println("Arreglo: " + Arrays.toString(arreglo3));
        ////////////////////////////
        System.out.println("Numeros flotantes ordenador ascendente mente: ");
        Arrays.sort(arreglo3);
        for (float i : arreglo3){
            System.out.println(i);
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
