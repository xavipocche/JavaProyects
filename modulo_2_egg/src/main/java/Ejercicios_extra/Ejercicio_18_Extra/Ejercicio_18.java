package Ejercicios_extra.Ejercicio_18_Extra;
import java.util.Scanner;
//Xavier
public class Ejercicio_18 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int largo = leer.nextInt();
        int vector_a[] = new int[largo];
        int vector_b[] = new int[largo];
        rellenar(vector_a,vector_b);
        System.out.println("Los vectores ingresados son:");
        imprimir(vector_a,vector_b);
        comparar(vector_a,vector_b);
    }
public static void rellenar(int[] vector_a, int[] vector_b){
    Scanner leer = new Scanner(System.in);
    for (int i = 0; i < vector_a.length; i++) {
        //vector_a[i] = (int)(Math.random()*10);
        //vector_b[i] = (int)(Math.random()*10);
        vector_a[i] = leer.nextInt();
        vector_b[i] = leer.nextInt();
    }
}
public static void comparar(int[] vector_a, int[] vector_b){
    for (int i = 0; i < vector_a.length; i++) {
        if(vector_a[i] != vector_b[i]){
            System.out.println("Los vectores no son iguales");
            return;
        }
    }
    System.out.println("Los vectores son iguales");
}
public static void imprimir(int[] vector_a, int[] vector_b){
    for (int i = 0; i < vector_a.length; i++) {
        System.out.print("[" + vector_a[i] + "]");
    }
    System.out.println("");
    for (int i = 0; i < vector_b.length; i++) {
        System.out.print("[" + vector_b[i] + "]");
    }
    System.out.println("");
}
}