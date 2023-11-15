package TP_N11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> players = new ArrayList<>();
        EquipoDeFutbol team = new EquipoDeFutbol();
        String option; Boolean exit = true;

        team.inicializacion(players);
        while (exit){
            System.out.println("---");
            team.agregar();
            System.out.println("---");
            team.eliminar();
            System.out.println("___");
            System.out.print("Desea salir (si/no): ");
            option = sc.nextLine();
            if (option.equals("si")){
                exit = false;
            }
        }
        System.out.println("---");
        team.mostrarDatos();
    }
}
