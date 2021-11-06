package Ejercicios_extra.Ejercicio_17_Extra;
import java.util.Scanner;
//Xavier
public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int suma = 0;
        int largo = leer.nextInt();
        int [] vector = new int[largo];
        System.out.println("Ingrese los números a ingresar en el vector");
        for (int i = 0; i < largo; i++) {
            vector[i] = leer.nextInt();
            suma = suma + vector[i];
        }
        for (int i = 0; i < largo; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        System.out.println("La suma de los elementos del vector es: " + suma);
    }
}