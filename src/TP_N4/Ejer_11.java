package TP_N4;

import java.util.Scanner;

public class Ejer_11 {
    public static void main(String[] args) {
        Scanner leer1 = new Scanner(System.in);

        System.out.println("Ejercicio 11");
        int numero;
        System.out.print("Ingrese el numero, de 5 cifras: ");
        numero = leer1.nextInt();
        System.out.println(numero/10000);
        System.out.println(numero/10000+""+(numero/1000)%10);
        System.out.println(numero/10000+""+(numero/1000)%10+""+(numero/100)%10);
        System.out.println(numero/10000+""+(numero/1000)%10+""+(numero/100)%10+""+(numero/10)%10);
        System.out.println(numero/10000+""+(numero/1000)%10+""+(numero/100)%10+""+(numero/10)%10+""+numero%10);
    }
}
