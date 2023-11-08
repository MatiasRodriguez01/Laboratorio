package TP_N4;

import java.util.Scanner;

public class Ejer_13 {
    public static void main(String[] args) {
        Scanner leer1 = new Scanner(System.in);

        System.out.println("Ejercicio 13");
        int dia, mes, anio, suma, magico;
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.print("Ingrese el dia: ");
        dia = leer1.nextInt();
        System.out.print("Ingrese el mes: ");
        mes = leer1.nextInt();
        System.out.print("Ingrese el año: ");
        anio = leer1.nextInt();
        suma = dia+mes+anio;
        magico = (suma/1000)+((suma/100)%10)+((suma/10)%10)+(suma%10);
        System.out.println("Su fecha de nacimiento es el "+dia+"/"+mes+"/"+anio);
        System.out.println("Suma = "+suma);
        System.out.println("Su numero magico es "+magico);

    }
}
