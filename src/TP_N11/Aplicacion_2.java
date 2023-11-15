package TP_N11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Aplicacion_2 {

    // Atributos:
    ArrayList<Integer> numeros;
    int promedio;

    // Constructor:
    public Aplicacion_2() {
        numeros = new ArrayList<>();
        promedio = 0;
    }

    // Metodos:

    // Método para agregar números aleatorios a la lista
    public void agregarNumeros() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int numero = random.nextInt(101);
            numeros.add(numero);
        }
    }

    // Método para calcular el promedio aritmético
    public int calcularPromedioAritmetico() {
        int suma = 0;
        for (Integer num : numeros) {
            suma += num;
        }
        promedio = suma / numeros.size();
        return promedio;
    }

    // Método para contar cuántos elementos son iguales al promedio
    public int contarIgualesAlPromedio() {
        int iguales = 0;
        for (Integer num : numeros) {
            if (num == promedio) {
                iguales++;
            }
        }
        return iguales;
    }

    // Método para contar cuántos elementos son mayores al promedio
    public int contarMayoresAlPromedio() {
        int mayores = 0;
        for (Integer num : numeros) {
            if (num > promedio) {
                mayores++;
            }
        }
        return mayores;
    }

    // Método para contar cuántos elementos son menores al promedio
    public int contarMenoresAlPromedio() {
        int menores = 0;
        for (Integer num : numeros) {
            if (num < promedio) {
                menores++;
            }
        }
        return menores;
    }

    // Método para mostrar la lista de números
    public void mostrar() {
        System.out.println(Arrays.toString(numeros.toArray()));
    }
}
