package Ejercicio_24;
import java.util.Scanner;
//Xavier
public class Ejercicio_24 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int largo;
        System.out.println("Ingrese una longitud para el vector:");
        largo = leer.nextInt();
        int vector [] = new int[largo];
        rellenar_vector(vector);
        imprimir_vector(vector);
        contador_digitos(vector);
    }
public static void rellenar_vector(int vector[]){
    for(int i=0; i<=vector.length-1; i++){
        vector[i] = (int)(Math.random()*100000); //Generador de números enteros aleatorios
    }
}
public static void imprimir_vector(int vector[]){
    for(int i=0; i<=vector.length-1; i++){
        System.out.print("[" + vector[i] + "]");
    }
    System.out.println("");
}
public static void contador_digitos(int vector[]){
    String x;
    int longitud;
    int contador_1;
    int contador_2;
    int contador_3;
    int contador_4;
    int contador_5;
    contador_1 = 0;
    contador_2 = 0;
    contador_3 = 0;
    contador_4 = 0;
    contador_5 = 0;
    for(int i=0; i<=vector.length-1; i++){
        x = Integer.toString(vector[i]);
        longitud = x.length();
        switch(longitud){
            case 1:
                contador_1 = contador_1 + 1;
                break;
            case 2:
                contador_2 = contador_2 + 1;
                break;
            case 3:
                contador_3 = contador_3 + 1;
                break;
            case 4:
                contador_4 = contador_4 + 1;
                break;
            case 5:
                contador_5 = contador_5 + 1;
                break;
        }
    }
    System.out.println("Hay " + contador_1 + " números de 1 dígito");
    System.out.println("Hay " + contador_2 + " números de 2 dígitos");
    System.out.println("Hay " + contador_3 + " números de 3 dígitos");
    System.out.println("Hay " + contador_4 + " números de 4 dígitos");
    System.out.println("Hay " + contador_5 + " números de 5 dígitos");
}
}