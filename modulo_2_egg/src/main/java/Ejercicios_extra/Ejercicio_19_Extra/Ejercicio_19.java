package Ejercicios_extra.Ejercicio_19_Extra;
import java.util.Scanner;
//Xavier
public class Ejercicio_19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int largo = leer.nextInt();
        int vector[] = new int[largo];
        rellenar_vector(vector);
        imprimir(vector);
    }
public static void rellenar_vector(int vector[]){
    for (int i = 0; i < vector.length; i++) {
        vector[i] = (int)(Math.random()*10);
    }
}
public static void imprimir(int vector[]){
    for (int i = 0; i < vector.length; i++) {
        System.out.print("[" + vector[i] + "]");
    }
}
}