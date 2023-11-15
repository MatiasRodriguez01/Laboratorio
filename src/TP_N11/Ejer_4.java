package TP_N11;

import java.util.ArrayList;
public class Ejer_4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Aplicacion_1 aplicacion = new Aplicacion_1();

        aplicacion.inicializacion(numbers);
        System.out.println("LLene la lista con numeros: ");
        aplicacion.agregarNumeros();
        int max = aplicacion.mayor(); int min = aplicacion.menor();
        int diferencia = max - min;
        System.out.println("La diferencia entre el numero mayor y menor: " + diferencia);


    }
}
