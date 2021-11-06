package Ejercicio_23;
import java.util.Scanner;
//Xavier
public class Ejercicio_23 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int largo;
        int n;
        System.out.println("Ingrese una longitud para el vector:");
        largo = leer.nextInt();
        int vector [] = new int[largo];
        rellenar_vector(vector);
        imprimir_vector(vector);
        System.out.println("Ingrese un número para buscarlo:");
        n = leer.nextInt();
        buscar_n(vector,n);
    }
public static void rellenar_vector(int vector[]){
    for(int i=0; i<=vector.length-1; i++){
        vector[i] = (int)(Math.random()*100); //Generador de números enteros aleatorios desde 0 a 99
    }
}
public static void imprimir_vector(int vector[]){
    for(int i=0; i<=vector.length-1; i++){
        System.out.print("[" + vector[i] + "]");
    }
    System.out.println("");
}
public static void buscar_n(int vector[], int n){
    int contador;
    contador = 0;
    for(int i=0; i<=vector.length-1; i++){
        if(vector[i] == n){
            contador = contador + 1;
            System.out.println("El número buscado se encuentra en la posición: " + i);
        }
    }
    System.out.println("El número buscado se encuentra: " + contador + " veces");
}
}