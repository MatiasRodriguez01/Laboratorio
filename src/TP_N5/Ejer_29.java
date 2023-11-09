package TP_N5;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejer_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 29:");
        double millas;
        do{
            System.out.println("----");
            System.out.print("Ingrese la cantidad de millas <<Ingrese 0 para salir>>: ");
            millas = sc.nextDouble();
            DecimalFormat df = new DecimalFormat("#.00");
            System.out.println("EL equivalente de millas a Kilometros es = "+ df.format(millas * 1.6093) + "Km");
        } while(millas != 0);
        System.out.println("Ha salido del bucle!");
    }
}
