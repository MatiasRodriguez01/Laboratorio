package TP_N9;
import java.util.*;
public class Ejer_24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        // Llenamos el arraylist:
        array.add(49);
        array.add(25);
        array.add(19);
        array.add(88);
        array.add(25);
        array.add(19);
        array.add(33);
        array.add(57);
        array.add(65);
        array.add(49);
        array.add(19);
        // Ingresamos por teclado el numero que desea encontrar en el arraylist
        System.out.print("Ingrese el numero que desea encontrar en el array: ");
        Integer number = sc.nextInt();
        // Al final llamamos a la funcion y vemos cuantas veces se vio el numero repetido:
        System.out.println("Arraylist = " + array);
        System.out.println("El numero " + number + " se repite " + repetidos(array, number) + " veces.");
    }

    public static int repetidos(ArrayList<Integer> arreglo, Integer numero){
        // creamos un contador para ver cuantas veces se encontro el numbero en el arraylist
        int contador = 0;
        // usamos un bucle for para ver cuantas veces se encuentra el numero en el arraylist:
        for (int i = 0; i < arreglo.toArray().length; i++){
            if (arreglo.get(i) == numero){
                contador++;
            }
        }
        // retornamos el contador:
        return contador;
    }
}
