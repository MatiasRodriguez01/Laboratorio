package TP_N4;

import java.util.Scanner;

public class Ejer_14 {
    public static void main(String[] args) {
        Scanner leer1 = new Scanner(System.in);

        System.out.println("Ejercicio 14");
        double iva, iva_prod;
        int cant, producto;
        System.out.print("Ingrese a cantidad de producto vendidos: ");
        cant = leer1.nextInt();
        System.out.print("Ingrese el precio del producto: ");
        producto = leer1.nextInt();
        System.out.print("Ingrese el procentaje de iva: ");
        iva = leer1.nextInt();
        iva = iva / 100.0;
        iva_prod = producto*iva+producto;
        System.out.println("La cantidad de productos vendidos fue de "+cant+" productos.");
        System.out.println("EL precio del producto es de $"+ iva_prod);
        System.out.println("Se aplico un procentaje de "+iva+"% de iva");
        System.out.println("SE VENDIO UN TOTAL DE $"+cant*iva_prod);
    }
}
