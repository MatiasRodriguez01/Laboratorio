package TP_N11;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejer_5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Aplicacion_2 aplicacion = new Aplicacion_2();

        aplicacion.agregarNumeros();
        aplicacion.mostrar();
        System.out.println("EL promedio de los numeros de la lista es " + aplicacion.calcularPromedioAritmetico());
        System.out.println("----");
        System.out.println("numero iguales al promedio = " + aplicacion.contarIgualesAlPromedio());
        System.out.println("numero mayores al promedio = " + aplicacion.contarMayoresAlPromedio());
        System.out.println("numero menores al promedio = " + aplicacion.contarMenoresAlPromedio());
    }
}
