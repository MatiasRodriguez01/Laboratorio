package TP_N9;
import java.util.*;
public class Ejer_17 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        // Llenamos el arraylist:
        array.add(45);
        array.add(23);
        array.add(79);
        array.add(68);
        array.add(31);
        array.add(79);
        array.add(23);
        array.add(45);
        array.add(68);
        // mostramos el arreglo original:
        System.out.println("Arraylist original = " + array);
        System.out.println("---");
        // usamos este metodo para eliminar los elementos duplicados
        duplicados(array);
        // mostramos arreglo correguidos:
        System.out.println("ArrayList correguido = " + array);
    }

    public static void duplicados(ArrayList<Integer> array){
        // creamos una variable contador
        int contador;
        // creamos 2 bucles for, uno para iterar uno a uno los elementos
        for (int i = 0; i < array.toArray().length; i++){
            contador = 0;
            Integer elemento = array.get(i); // este es el elemento del array a comparar.
            for (int j = 0; j < array.toArray().length; j++){
                if (elemento == array.get(j)){
                    // si c
                    if (contador != 0){
                        array.remove(j);
                    }
                    contador += 1;
                }
            }
        }
    }
}
