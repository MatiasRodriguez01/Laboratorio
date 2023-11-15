package TP_N7;
import java.util.*;
public class Ejer_5 {
    public static void main(String[] args) {

        System.out.println("EJERCICIO 5:");
        System.out.println("LLENE EL ARREGLO: ");
        String [] arreglo5 = llenarArreglo_String(6);
        ////////////////////////////////////
        System.out.println("Arreglo: " + Arrays.toString(arreglo5));
        ////////////////////////////////////
        System.out.println("------------");
        System.out.println("Palabras ordenadas acsendenteente: ");
        Arrays.sort(arreglo5);
        for(String s : arreglo5){
            System.out.println(s);
        }
    }

    public static String [] llenarArreglo_String(int tamanio){
        Scanner sc = new Scanner(System.in);
        String [] x = new String[tamanio];
        for (int iterador = 0; iterador < x.length; iterador++){
            System.out.print("Ingrese la palabra N°" + (iterador+1) + ": ");
            x[iterador] = sc.nextLine();
        }
        System.out.println(" ");
        return x;
    }
}
