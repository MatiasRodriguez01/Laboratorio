package TP_N11;
import java.util.ArrayList;
import java.util.Scanner;

public class EquipoDeFutbol {
    ArrayList<String> team;
/*
        Define una clase EquipoDeFútbol que utiliza un ArrayList para mantener una lista de jugadores. La
clase debe permitir agregar nuevos jugadores, eliminar jugadores y listar la plantilla.
         */

    public void inicializacion(ArrayList<String> t){ team = t ;}

    public void agregar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("LLENE SU EQUIPO DE FUTBOL: ");
        System.out.print("Ingrese el nombre del jugador nuevo(sino quiere agregar nada presione enter): ");
        String jugador = sc.nextLine();
        if (jugador != ""){
            team.add(jugador);
        }
    }
    public void eliminar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre jugador que desea eliminar(sino quiere eliminar nada presione enter): ");
        String jugador = sc.nextLine();
        if (jugador != ""){
            team.remove(jugador);
        }
    }

    public void mostrarDatos(){
        System.out.println("JUGADORES DEL EQUIPO:");
        for (String i : team){
            System.out.println(i);
        }
    }

}
