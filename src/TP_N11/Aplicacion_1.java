package TP_N11;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion_1 {
    ArrayList<Integer> numeros;
    // Inicializador:
    public void inicializacion(ArrayList<Integer> n){ numeros = n ;}

    // Metodos:
    public void agregarNumeros(){
        Scanner sc = new Scanner(System.in);
        int numero;
        for (int i = 0; i < 20; i++){
            System.out.print("Ingrese el numero " + (i+1) + " de la lista: ");
            numero = sc.nextInt();
            numeros.add(numero);
        }
    }

    public int mayor(){
        int mayor = numeros.get(0);
        for (int i : numeros){
            if (i > mayor){
                mayor = i;
            }
        }
        return mayor;
    }

    public int menor(){
        int menor = numeros.get(0);
        for (int i : numeros){
            if (i < menor){
                menor = i;
            }
        }
        return menor;
    }
}
