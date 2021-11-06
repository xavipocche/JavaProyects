package Ejercicios_extra.Ejercicio_13_Extra;
import java.util.Scanner;
//Xavier
public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int familias;
        int suma = 0;
        int contador = 0;
        int edad = 0;
        System.out.println("Ingrese la cantidad de familias:");
        familias = leer.nextInt();
        int vector_hijos [] = new int[familias];
        for (int i = 0; i < familias; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia " + (i+1));
            vector_hijos[i] = leer.nextInt();
        }
        for (int i = 0; i < familias; i++) {
            System.out.println("Ingrese las edades de los hijos de la familia " + (i+1) + " la cantidad de hijos de esta es: " + vector_hijos[i]);
            for (int j = 1; j <= vector_hijos[i]; j++) {
                edad = leer.nextInt();
                suma = suma + edad;
                contador = contador + 1;
            }
        }
        System.out.println("El promedio de edad de los hijos de las familias es: " + suma/contador + " años");
    }
}
