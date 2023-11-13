package TP_N6;

import java.util.Scanner;

public class Ejer_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 8:");
        String [] names = new String[20];
        int employee = 0;
        double [] salaries = new double[20];
        double high_salary = 0;
        for (int i = 0; i < 5; i++){
            System.out.println("-------------------------------------------------------");
            System.out.print("Ingrese el nombre del empleado N°" + (i+1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Ingrese el sueldo del empleado N°" + (i+1) + ": ");
            salaries[i] = sc.nextFloat();
            if (salaries[i] > high_salary){
                high_salary = salaries[i];
                employee = i;
            }
        }
        System.out.println(" ");
        System.out.println("El empleado N°"+ employee + ", "+ names[employee]+", tiene el salario mas alto.");
    }
}
