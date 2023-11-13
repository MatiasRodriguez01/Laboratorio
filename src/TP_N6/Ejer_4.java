package TP_N6;

public class Ejer_4 {
    public static void main(String[] args) {


        System.out.println("EJERCICIO 4:");
        int contador = 0;
        int [] pares = new int[20];
        for (int i = 0; i < pares.length; i++){
            while (contador % 2 != 0){
                contador++;
            }
            pares[i] = contador;
            contador++;
        }
        for (int i = 0; i < pares.length; i++){
            System.out.print("["+pares[i]+"]");
        }
    }
}
