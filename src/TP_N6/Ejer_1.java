package TP_N6;
import java.util.*;
public class Ejer_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 1:");
        System.out.println("Ingrese numeros positivos y negativos:");
        int [] n = new int[10];
        int i, positivos, negativos, contP, contN;
        positivos = 0; negativos = 0; contP = 0; contN = 0;

        for (i = 0; i < n.length; i++){
            System.out.print("Ingrese el numero "+ (i+1) + " del arreglo: ");
            n[i] = sc.nextInt();
            if (n[i] > 0){
                positivos += n[i];
                contP++;
            } else {
                negativos += n[i];
                contN++;
            }
        }
        System.out.println("ARREGLO DEL EJERCICIO 1: " + Arrays.toString(n));
        System.out.println(" ");
        System.out.println("La media de numeros positivos ingresados es = "+positivos/contP);
        System.out.println("La media de numeros negativos ingresados es = "+negativos/contN);
    }
}
