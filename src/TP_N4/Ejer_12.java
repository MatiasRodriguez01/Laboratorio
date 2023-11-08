package TP_N4;

import java.util.Scanner;

public class Ejer_12 {
    public static void main(String[] args) {
        Scanner leer1 = new Scanner(System.in);

        System.out.println("Ejercicio 12");
        int num;
        System.out.print("Ingrese el numero, de 5 cifras: ");
        num = leer1.nextInt();
        System.out.println(num%10);
        System.out.println((num/10)%10+""+num%10);
        System.out.println((num/100)%10+""+(num/10)%10+""+num%10);
        System.out.println((num/1000)%10+""+(num/100)%10+""+(num/10)%10+""+num%10);
        System.out.println(num/10000+""+(num/1000)%10+""+(num/100)%10+""+(num/10)%10+""+num%10);
    }
}
