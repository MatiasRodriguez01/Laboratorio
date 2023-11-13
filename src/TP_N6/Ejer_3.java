package TP_N6;
import java.util.*;
import java.text.DecimalFormat;
public class Ejer_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 3:");
        int cant, porc = 0;

        //definimos el tamaño del arreglo
        System.out.println("Ingrese la cantidad de alumnnos que desea evaluar: ");
        cant = sc.nextInt();
        double [] alumnos = new double[cant];
        double  total = 0, media = 0;
        for (int i = 0; i < alumnos.length; i++){
            // asignamos las notas
            do{
                System.out.print("Ingrese la nota del alumno " + (i+1) + " (entre el 1 y 10): ");
                alumnos[i] = sc.nextDouble();
            } while (alumnos[i] > 10 || alumnos[i] < 0);
            // sumamos el total y el porcentaje para calcular la media
            total += alumnos[i];
            porc++;
        }
        // usamos DecimalFormat para redondedear la media
        DecimalFormat df = new DecimalFormat("#.0");
        media = total / porc;
        System.out.println(" ");
        System.out.println("La media de la nota de los alumnos fue de "+df.format(media)+".");
        for (int i = 0; i < alumnos.length; i++){
            if (alumnos[i] > media){
                System.out.println("EL alumno "+(i+1)+" ha obtenido una nota de "+ alumnos[i]+" superior a la media.");
            }
        }
    }
}
