package TP_N9;
import java.util.*;
public class Ejer_23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        // Llenamos el arraylist:
        array.add(495);
        array.add(258);
        array.add(195);
        array.add(883);
        array.add(315);
        array.add(128);
        array.add(33);
        array.add(57);
        array.add(65);
        array.add(568);
        array.add(109);
        // Ingrese el numero el cual eliminar los elementos del arreglo, menores a este:
        System.out.print("Ingrese un numero: ");
        Integer number = sc.nextInt();
        // creamos un arreglo nuevo, en base al metodo que creamos:
        ArrayList<Integer> new_array = nuevo_array(array, number);

        // y mostramos el arreglo original y el nuevo:
        System.out.println("Array original = " + array);
        System.out.println("Array nuevo = " + new_array);
    }
    // creamos un metodo ue reciba el arraylist y un numero
    // y devolvera un arraylist numero con todos los elemento menores a ese numero
    public static ArrayList<Integer> nuevo_array(ArrayList<Integer> arreglo, Integer numero){
        // creamos un arraylist:
        ArrayList<Integer> nuevo = new ArrayList<>();
        Integer elemento = 0;
        // recorreremos el arreglo y averiguaremos cuales numeros, son menor al numero:
        for (int i = 0; i < arreglo.toArray().length; i++){
            elemento = arreglo.get(i);
            if (elemento > numero){
                nuevo.add(elemento);
            }
        }
        // retornara el nuevo arraylist:
        return nuevo;
    }
}
