package TP_N9;

import java.util.ArrayList;

public class Ejer_5 {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();
        // Agregamos elementos al ArrayList:
        array.add("Matias");
        array.add("Rodrigo");
        array.add("Santiago");
        //mostramos los elementos:
        System.out.println("Mostramos el arraylist = " + array);

        //Ahora mostraremos la misma matriz, pero vamos a eliminar un elemento en expecifico:
        array.remove("Matias");
        System.out.println("Mostramos el arraylist = " + array);
    }
}
