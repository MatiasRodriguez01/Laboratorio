package TP_N9;
import java.util.*;
public class Ejer_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        // Llenamos el arraylist:
        array.add(45);
        array.add(23);
        array.add(19);
        array.add(88);
        array.add(31);
        array.add(72);
        array.add(0);
        array.add(57);
        array.add(65);
        System.out.print("Ingrese un numero, para saber si se encuentra en un arraylist de numeros: ");
        Integer number = sc.nextInt();
        if (encontrar(array, number)){
            System.out.println("El numero " + number + " esta en el ArrayList!!");
        } else {
            System.out.println("El numero no fue encontrado!!");
        }

    }

    public static boolean encontrar(ArrayList<Integer> array, Integer numero){
        //creamos un bucle for, para recorrer todos los numeros del arraylist,hasta encontrar el numero que desea encontrar
        //si lo encuentra  devolvera un True, sino iterara todo el codigo y devolvera False.
        for (int i = 0; i < array.toArray().length; i++){
            if (array.get(i) == numero){
                return true;
            }
        }
        return false;
    }
}
